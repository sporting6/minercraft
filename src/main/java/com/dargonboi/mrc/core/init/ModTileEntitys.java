package com.dargonboi.mrc.core.init;

import com.dargonboi.mrc.MinerCraft;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModTileEntitys {
	
	private ModTileEntitys() {}
	
	public static final DeferredRegister<BlockEntityType<?>> TILE_ENTITIES = DeferredRegister.create(
			ForgeRegistries.BLOCK_ENTITIES, MinerCraft.MODID); 
	
	//public static final RegistryObject<BlockEntityType<IronChestBlockEntity>> IRON_CHEST = TILE_ENTITIES.register(
	//		"iron_chest", () -> BlockEntityType.Builder.of(IronChestBlockEntity::new, ModBlocks.IRON_CHEST.get()));
}
