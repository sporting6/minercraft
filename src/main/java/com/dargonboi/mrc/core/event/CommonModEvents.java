package com.dargonboi.mrc.core.event;

import com.dargonboi.mrc.MinerCraft;
import com.dargonboi.mrc.core.world.OreGeneration;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = MinerCraft.MODID, bus = Bus.MOD)
public class CommonModEvents {
	
	 @SubscribeEvent
	    public static void commonSetup(FMLCommonSetupEvent event) {
	        event.enqueueWork(() -> {
	            OreGeneration.registerOres();
	        });
	        
	 }

}


