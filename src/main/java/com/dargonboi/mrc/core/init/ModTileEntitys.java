package com.dargonboi.mrc.core.init;

import com.dargonboi.mrc.MinerCraft;
import com.dargonboi.mrc.common.block.entity.DiamondChestBlockEntity;
import com.dargonboi.mrc.common.block.entity.IronChestBlockEntity;
import com.dargonboi.mrc.common.block.entity.NetheriteChestBlockEntity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModTileEntitys {

	private ModTileEntitys() {
	}

	public static final DeferredRegister<BlockEntityType<?>> TILE_ENTITIES = DeferredRegister
			.create(ForgeRegistries.BLOCK_ENTITIES, MinerCraft.MODID);

	public static final RegistryObject<BlockEntityType<IronChestBlockEntity>> IRON_CHEST = TILE_ENTITIES.register(
			"iron_chest",
			() -> BlockEntityType.Builder.of(IronChestBlockEntity::new, ModBlocks.IRON_CHEST.get()).build(null));

	public static final RegistryObject<BlockEntityType<DiamondChestBlockEntity>> DIAMOND_CHEST = TILE_ENTITIES.register(
			"diamond_chest",
			() -> BlockEntityType.Builder.of(DiamondChestBlockEntity::new, ModBlocks.DIAMOND_CHEST.get()).build(null));
	
	public static final RegistryObject<BlockEntityType<NetheriteChestBlockEntity>> NETHERITE_CHEST = TILE_ENTITIES.register(
			"netherite_chest",
			() -> BlockEntityType.Builder.of(NetheriteChestBlockEntity::new, ModBlocks.NETHERITE_CHEST.get()).build(null));
}
