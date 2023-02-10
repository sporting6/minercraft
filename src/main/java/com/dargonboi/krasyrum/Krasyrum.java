package com.dargonboi.krasyrum;

import com.dargonboi.krasyrum.block.ModBlocks;
import com.dargonboi.krasyrum.block.ModOres;
import com.dargonboi.krasyrum.item.*;
import com.dargonboi.krasyrum.world.dimension.ModDimensions;
import com.dargonboi.krasyrum.world.feature.ModConfiguredFeatures;
import com.dargonboi.krasyrum.world.feature.ModPlacedFeatures;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;

@Mod(Krasyrum.MODID)
public class Krasyrum {
	public static final String MODID = "krasyrum";


	// Hashmaps
	public static final HashMap<String, RegistryObject<Item>> ITEMMAP = new HashMap<String, RegistryObject<Item>>();
	public static final HashMap<String, RegistryObject<Item>> OREITEMMAP = new HashMap<String, RegistryObject<Item>>();
	public static final HashMap<String, RegistryObject<Block>> OREBLOCKMAP = new HashMap<String, RegistryObject<Block>>();
	public static final HashMap<String, RegistryObject<Block>> BLOCKMAP = new HashMap<String, RegistryObject<Block>>();
	public static final HashMap<String, RegistryObject<ConfiguredFeature<?, ?>>> OREMAP = new HashMap<String, RegistryObject<ConfiguredFeature<?, ?>>>();

	// Defferred Registers
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);


	public Krasyrum() {

		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		ModIngots.Register(bus);
		ModTools.Register(bus);
		ModArmor.Register(bus);

		ModFoods.Register(bus);

		ModBlocks.Register(bus);
		ModOres.Register(bus);

		ModPotions.register(bus);

//		ModBlockEntities.register(bus);
//		ModMenuTypes.register(bus);

		ModDimensions.register();

		ModConfiguredFeatures.register(bus);
		ModPlacedFeatures.register(bus);


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
