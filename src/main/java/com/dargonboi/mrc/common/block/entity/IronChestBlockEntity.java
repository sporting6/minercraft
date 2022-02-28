package com.dargonboi.mrc.common.block.entity;

import com.dargonboi.mrc.core.init.ModTileEntitys;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class IronChestBlockEntity extends BlockEntity {

	public IronChestBlockEntity(BlockPos pos, BlockState state) {
		super(ModTileEntitys.IRON_CHEST.get(), pos, state);
	}

	// public void tick() {}

	@Override
	public CompoundTag getUpdateTag() {
		return serializeNBT();
	}

	@Override
	public void handleUpdateTag(CompoundTag tag) {
		load(tag);
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt) {
		load(pkt.getTag());
	}
}
