package com.dargonboi.mrc.common.block.entity;

import com.dargonboi.mrc.MinerCraft;
import com.dargonboi.mrc.core.init.ModTileEntitys;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.block.state.BlockState;

public class NetheriteChestBlockEntity extends InventoryBlockEntity {

	public static final Component TITLE = new TranslatableComponent("container." + MinerCraft.MODID + ".netherite_chest");

	public NetheriteChestBlockEntity(BlockPos pos, BlockState state) {
		super(ModTileEntitys.NETHERITE_CHEST.get(), pos, state, 88);
	}

}
