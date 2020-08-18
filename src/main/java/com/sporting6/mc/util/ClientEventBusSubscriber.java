package com.sporting6.mc.util;

import com.sporting6.mc.Minercraft;
import com.sporting6.mc.client.render.LionRenderer;
import com.sporting6.mc.client.render.TigerRenderer;
import com.sporting6.mc.client.render.WhiteTigerRenderer;
import com.sporting6.mc.init.ModEntityType;
import com.sporting6.mc.items.ModSpawnEggItem;

import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Minercraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
	
	@SubscribeEvent
	public static void onClientSetup(FMLClientSetupEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(ModEntityType.LION.get(), LionRenderer::new );
		RenderingRegistry.registerEntityRenderingHandler(ModEntityType.TIGER.get(), TigerRenderer::new );
		RenderingRegistry.registerEntityRenderingHandler(ModEntityType.WHITE_TIGER.get(), WhiteTigerRenderer::new );

			
		
	}
	@SubscribeEvent
	public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
		ModSpawnEggItem.initSpawnEggs();
		
	}

}
