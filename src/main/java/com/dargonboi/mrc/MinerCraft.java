package com.dargonboi.mrc;

import com.dargonboi.mrc.core.init.ModBlocks;
import com.dargonboi.mrc.core.init.ModItems;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
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
		
		
	}
	
	public static final CreativeModeTab MINERCRAFT_MATERIALS = new CreativeModeTab("minercraft_materials") {
		
		@Override
		public ItemStack makeIcon() {
			return ModItems.BLUE_NANITARIUM_INGOT.get().getDefaultInstance();
		}
	};
}
