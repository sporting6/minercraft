package com.dargonboi.krasyrum;

import com.dargonboi.krasyrum.block.ModBlocks;
import com.dargonboi.krasyrum.block.ModOres;
import com.dargonboi.krasyrum.item.*;
import com.dargonboi.krasyrum.util.Material;
import com.dargonboi.krasyrum.util.item.ModCreativeTab;
import com.dargonboi.krasyrum.util.item.ModRaritys;
import com.dargonboi.krasyrum.util.item.ModTags;
import com.dargonboi.krasyrum.util.item.ModToolMaterials;
import com.dargonboi.krasyrum.world.dimension.ModDimensions;
import com.dargonboi.krasyrum.world.feature.ModConfiguredFeatures;
import com.dargonboi.krasyrum.world.feature.ModPlacedFeatures;
import io.netty.util.collection.ByteCollections;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.List;

@Mod(Krasyrum.MODID)
public class Krasyrum {
	public static final String MODID = "krasyrum";


	// Hashmaps
	public static final HashMap<String, RegistryObject<Item>> ITEMMAP = new HashMap<String, RegistryObject<Item>>();
	public static final HashMap<String, RegistryObject<ArmorItem>> ARMORMAP =  new HashMap<String, RegistryObject<ArmorItem>>();
	public static final HashMap<String, RegistryObject<?>> TOOLMAP =  new HashMap<String, RegistryObject<?>>();

	public static final HashMap<String, RegistryObject<Item>> OREITEMMAP = new HashMap<String, RegistryObject<Item>>();
	public static final HashMap<String, RegistryObject<Block>> OREBLOCKMAP = new HashMap<String, RegistryObject<Block>>();
	public static final HashMap<String, RegistryObject<Block>> BLOCKMAP = new HashMap<String, RegistryObject<Block>>();
	public static final HashMap<String, RegistryObject<ConfiguredFeature<?, ?>>> OREMAP = new HashMap<String, RegistryObject<ConfiguredFeature<?, ?>>>();

	// Defferred Registers
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

	// Materials
	public static final Material KYRANIUM = new Material("kyranium", ModCreativeTab.KRASYRUM_MATERIALS, ModRaritys.INSANE)
			.fireResistant()
			.ingot()
			.armor(22, 3000, new int[]{6, 12, 10, 4}, .4f, 4, SoundEvents.ARMOR_EQUIP_NETHERITE)
			.tools(6, 4200, 18f, 20, .4f, 22,
					ModTags.KYRANIUM_TAG, List.of(), List.of());

	public static final Material BLUE_NANITARIUM = new Material("blue_nanitarium").fireResistant().ingot().raw().crushable()
			.materialBlock(MaterialColor.COLOR_BLUE, 8f, 600f, true)
			.armor(24, 2600, new int[]{3, 7, 6, 2}, .2f, 2, SoundEvents.ARMOR_EQUIP_NETHERITE)
			.tools(5, 2976, 14f, 16f, .2f, 18,
					ModTags.BLUE_NANITARIUM_TAG, List.of(), List.of())
			.deepslateOre(12f, 20f, 3, 1, -64, -32);
	public static final Material RED_NANITARIUM = new Material("red_nanitarium").fireResistant().ingot().raw().crushable()
			.materialBlock(MaterialColor.COLOR_BLUE, 8f, 600f, true)
			.armor(28, 2900, new int[]{5,9, 7, 3}, .3f, 3, SoundEvents.ARMOR_EQUIP_NETHERITE)
			.tools(5, 2600, 10f, 14f, 0f, 12,
					ModTags.RED_NANITARIUM_TAG, List.of(Tiers.NETHERITE), List.of())
			.netherOre(11f, 20f, 3, 1, 100, 127);

	public Krasyrum() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();


		ModIngots.Register(bus);
		ModTools.Register(bus);
		ModArmor.Register(bus);

		ModFoods.Register(bus);

		ModBlocks.Register(bus);
		ModOres.Register(bus);

		ModPotions.register(bus);

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
