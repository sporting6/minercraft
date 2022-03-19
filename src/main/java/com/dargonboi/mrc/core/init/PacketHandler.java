package com.dargonboi.mrc.core.init;

import com.dargonboi.mrc.MinerCraft;
import com.dargonboi.mrc.core.network.ServerboundChestPageUpdatePacket;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

public class PacketHandler {
	
    private static final String PROTOCOL_VERSION = "1";


	
	private PacketHandler() {
    }
	
	 public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(
		        new ResourceLocation(MinerCraft.MODID, "main"), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals,
		        PROTOCOL_VERSION::equals);
	
	public static void init() {
		int index = 0;
		//INSTANCE.messageBuilder(ServerboundChestPageUpdatePacket.class, index++, NetworkDirection.PLAY_TO_SERVER).add();
		
	}
}
