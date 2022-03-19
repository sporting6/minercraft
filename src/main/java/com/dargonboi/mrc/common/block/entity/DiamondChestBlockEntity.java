package com.dargonboi.mrc.common.block.entity;

import com.dargonboi.mrc.MinerCraft;
import com.dargonboi.mrc.core.init.ModTileEntitys;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.block.state.BlockState;

public class DiamondChestBlockEntity extends InventoryBlockEntity {

	public static final Component TITLE = new TranslatableComponent("container." + MinerCraft.MODID + ".diamond_chest");

	public DiamondChestBlockEntity(BlockPos pos, BlockState state) {
		super(ModTileEntitys.DIAMOND_CHEST.get(), pos, state, 70);
	}

}
