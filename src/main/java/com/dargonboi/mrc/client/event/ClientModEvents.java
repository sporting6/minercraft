package com.dargonboi.mrc.client.event;

import com.dargonboi.mrc.MinerCraft;
import com.dargonboi.mrc.client.screen.DiamondChestScreen;
import com.dargonboi.mrc.client.screen.IronChestScreen;
import com.dargonboi.mrc.core.init.ModContainers;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MinerCraft.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
	
	private ClientModEvents() {
	}
	
	@SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
		 MenuScreens.register(ModContainers.IRON_CHEST.get(), IronChestScreen::new);
		 MenuScreens.register(ModContainers.DIAMOND_CHEST.get(), DiamondChestScreen::new);

	}
	

}
