package com.dargonboi.mrc.common.block.entity;

import com.dargonboi.mrc.MinerCraft;
import com.dargonboi.mrc.core.init.ModTileEntitys;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class IronChestBlockEntity extends InventoryBlockEntity {

	public static final Component TITLE = new TranslatableComponent("container." + MinerCraft.MODID + ".iron_chest");

	public IronChestBlockEntity(BlockPos pos, BlockState state) {
		super(ModTileEntitys.IRON_CHEST.get(), pos, state, 54);
	}

}
