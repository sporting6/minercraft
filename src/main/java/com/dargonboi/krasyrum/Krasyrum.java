package com.dargonboi.krasyrum;

import com.dargonboi.krasyrum.block.ModBlocks;
import com.dargonboi.krasyrum.block.ModOres;
import com.dargonboi.krasyrum.block.entity.ModBlockEntities;
import com.dargonboi.krasyrum.item.*;
import com.dargonboi.krasyrum.screen.*;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Krasyrum.MODID)
public class Krasyrum {
	public static final String MODID = "krasyrum";

	public Krasyrum() {

		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		ModIngots.Register(bus);
		ModTools.Register(bus);
		ModArmor.Register(bus);

		ModFoods.Register(bus);

		ModBlocks.Register(bus);
		ModOres.Register(bus);

		ModPotions.register(bus);

		ModBlockEntities.register(bus);
		ModMenuTypes.register(bus);


		bus.addListener(this::clientSetup);
	}

	private void clientSetup(final FMLClientSetupEvent event) {
//		ItemBlockRenderTypes.setRenderLayer(ModBlocks.INFUSION_CHAMBER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(ModBlocks.CONDENSER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(ModBlocks.STRAINER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(ModBlocks.FORGE.get(), RenderType.cutout());


//		MenuScreens.register(ModMenuTypes.INFUSION_CHAMBER_MENU.get(), InfusionChamberScreen::new);
//		MenuScreens.register(ModMenuTypes.CONDENSER_MENU.get(), CondenserScreen::new);
//		MenuScreens.register(ModMenuTypes.STRAINER_MENU.get(), StrainerScreen::new);
//		MenuScreens.register(ModMenuTypes.FORGE_MENU.get(), ForgeScreen::new);
	}
}
