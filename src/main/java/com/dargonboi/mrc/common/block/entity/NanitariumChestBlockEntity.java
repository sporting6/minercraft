package com.dargonboi.mrc.common.block.entity;

import com.dargonboi.mrc.MinerCraft;
import com.dargonboi.mrc.core.init.ModTileEntitys;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class NanitariumChestBlockEntity extends InventoryBlockEntity {
	
	public Level level;
	public BlockPos pos;

	public static final Component TITLE = new TranslatableComponent("container." + MinerCraft.MODID + ".nanitarium_chest");

	public NanitariumChestBlockEntity(BlockPos pos, BlockState state) {
		super(ModTileEntitys.NANITARIUM_CHEST.get(), pos, state, 104);
	}

}
