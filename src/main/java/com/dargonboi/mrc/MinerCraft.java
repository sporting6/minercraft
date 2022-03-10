package com.dargonboi.mrc;

import com.dargonboi.mrc.core.init.ModBlocks;
import com.dargonboi.mrc.core.init.ModContainers;
import com.dargonboi.mrc.core.init.ModItems;
import com.dargonboi.mrc.core.init.ModTileEntitys;

import net.minecraft.core.Direction;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MinerCraft.MODID)
public class MinerCraft {
	public static final String MODID = "mrc";

	public MinerCraft() {

		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		ModBlocks.BLOCKS.register(bus);
		ModItems.ITEMS.register(bus);
		ModTileEntitys.TILE_ENTITIES.register(bus);
		ModContainers.CONTAINERS.register(bus);


	}

	public static final CreativeModeTab MINERCRAFT_MATERIALS = new CreativeModeTab("minercraft_materials") {

		@Override
		public ItemStack makeIcon() {
			return ModItems.BLUE_NANITARIUM_INGOT.get().getDefaultInstance();
		}

	};
	public static final CreativeModeTab MINERCRAFT_TOOLS_ARMOR = new CreativeModeTab("minercraft_tools_armor") {

		@Override
		public ItemStack makeIcon() {
			return ModItems.BLUE_NANITARIUM_PICKAXE.get().getDefaultInstance();
		}

	};

	public static VoxelShape calculateShapes(Direction to, VoxelShape shape) {
		final VoxelShape[] buffer = { shape, Shapes.empty() };

		final int times = (to.get2DDataValue() - Direction.NORTH.get2DDataValue() + 4) % 4;
		for (int i = 0; i < times; i++) {
			buffer[0].forAllBoxes((minX, minY, minZ, maxX, maxY, maxZ) -> buffer[1] = Shapes.or(buffer[1],
					Shapes.create(1 - maxZ, minY, minX, 1 - minZ, maxY, maxX)));
			buffer[0] = buffer[1];
			buffer[1] = Shapes.empty();
		}

		return buffer[0];
	}
}
