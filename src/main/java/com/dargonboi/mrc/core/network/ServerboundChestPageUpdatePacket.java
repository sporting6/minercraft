package com.dargonboi.mrc.core.network;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

import com.dargonboi.mrc.common.block.entity.NanitariumChestBlockEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.network.NetworkEvent;

public class ServerboundChestPageUpdatePacket {
	
	/*public final BlockPos chestPos;
	
	public ServerboundChestPageUpdatePacket(BlockPos pos) {
		this.chestPos = pos;
	}
	
	public ServerboundChestPageUpdatePacket(FriendlyByteBuf buffer) {
		this(buffer.readBlockPos());
	}
	
	public void encode(FriendlyByteBuf buffer) {
		buffer.writeBlockPos(chestPos);
	}
	
	public boolean handle(Supplier<NetworkEvent.Context> ctx) {
		final var success = new AtomicBoolean(false);
		ctx.get().enqueueWork(() -> {
			
			 final BlockEntity blockEntity = ctx.get().getSender().level.getBlockEntity(this.chestPos);
	            if (blockEntity instanceof final NanitariumChestBlockEntity chest) {
	            	
	            	
	            	
	            }
			
		});
	}
	*/
	

}
