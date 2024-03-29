package com.dargonboi.krasyrum;

import com.dargonboi.krasyrum.block.ModBlocks;
import com.dargonboi.krasyrum.fluid.ModFluidTypes;
import com.dargonboi.krasyrum.fluid.ModFluids;
import com.dargonboi.krasyrum.item.ModFoods;
import com.dargonboi.krasyrum.item.ModIngots;
import com.dargonboi.krasyrum.item.ModPotions;
import com.dargonboi.krasyrum.util.Material;
import com.dargonboi.krasyrum.util.item.ModCreativeTab;
import com.dargonboi.krasyrum.util.world.feature.Tree;
import com.dargonboi.krasyrum.world.dimension.ModDimensions;
import com.dargonboi.krasyrum.world.feature.darkforest.DarkFungusFeature;
import com.dargonboi.krasyrum.world.feature.darkforest.DarkwoodBushFeature;
import com.dargonboi.krasyrum.world.feature.darkforest.FallenDarkwoodTree;
import com.dargonboi.krasyrum.world.feature.hotspot.LavaPoolFeature;
import com.dargonboi.krasyrum.world.feature.hotspot.MagmaFeature;
import com.dargonboi.krasyrum.world.feature.hotspot.MiniVolcanoFeature;
import com.dargonboi.krasyrum.world.feature.darkforest.DarkwoodTreeFeature;
import net.minecraft.ChatFormatting;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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
    public static final HashMap<String, RegistryObject<ArmorItem>> ARMORMAP = new HashMap<String, RegistryObject<ArmorItem>>();
    public static final HashMap<String, RegistryObject<?>> TOOLMAP = new HashMap<String, RegistryObject<?>>();
    public static final HashMap<String, Tier> TIERMAP = new HashMap<String, Tier>();
    public static final HashMap<String, ArmorMaterial> ARMORMATERIALMAP = new HashMap<String, ArmorMaterial>();
    public static final HashMap<String, RegistryObject<Item>> OREITEMMAP = new HashMap<String, RegistryObject<Item>>();
    public static final HashMap<String, RegistryObject<Block>> OREBLOCKMAP = new HashMap<String, RegistryObject<Block>>();
    public static final HashMap<String, RegistryObject<? extends Block>> BLOCKMAP = new HashMap<String, RegistryObject<? extends Block>>();
    public static final HashMap<String, RegistryObject<ConfiguredFeature<?, ?>>> CONFIGUREDOREMAP = new HashMap<String, RegistryObject<ConfiguredFeature<?, ?>>>();
    public static final HashMap<String, RegistryObject<PlacedFeature>> PLACEDOREMAP = new HashMap<String, RegistryObject<PlacedFeature>>();


    public Krasyrum() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModIngots.Register(bus);

        ModFoods.Register(bus);

        ModBlocks.register();
        BLOCKS.register(bus);

        ModPotions.register(bus);

        ModDimensions.register();

        CONFIGURED_FEATURES.register(bus);
        PLACED_FEATURES.register(bus);

        ModFluids.register(bus);
        ModFluidTypes.register(bus);

        FEATURES.register(bus);


        bus.addListener(this::clientSetup);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_BOILING_WATER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_BOILING_WATER.get(), RenderType.translucent());
        }
    }

    // Block Tags
    private static final TagKey<Block> DARKWOOD_LOGS = BlockTags.create(new ResourceLocation("darkwood_logs"));

    // Raritys
    public static final Rarity RARITY_INSANE = Rarity.create("insane", ChatFormatting.GOLD);

    // Defferred Registers
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Krasyrum.MODID);
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Krasyrum.MODID);
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Krasyrum.MODID);
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, Krasyrum.MODID);

    // Features
    private static final RegistryObject<LavaPoolFeature> LAVA_POOL = FEATURES.register("lava_pool",
            () -> new LavaPoolFeature(NoneFeatureConfiguration.CODEC, 5));

    private static final RegistryObject<MiniVolcanoFeature> MINI_VOLCANO = FEATURES.register("mini_volcano",
            () -> new MiniVolcanoFeature(NoneFeatureConfiguration.CODEC));

    private static final RegistryObject<MagmaFeature> MAGMA = FEATURES.register("magma",
            () -> new MagmaFeature(NoneFeatureConfiguration.CODEC));

    private static final Tree DARKWOOD = new Tree("darkwood");
    private static final RegistryObject<DarkwoodTreeFeature> DARKWOOD_TREE = FEATURES.register("darkwood_tree",
            () -> new DarkwoodTreeFeature(NoneFeatureConfiguration.CODEC));

    private static final RegistryObject<DarkwoodBushFeature> DARKWOOD_BUSH = FEATURES.register("darkwood_bush",
            () -> new DarkwoodBushFeature(NoneFeatureConfiguration.CODEC));
    private static final RegistryObject<FallenDarkwoodTree> DARKWOOD_TREE_FALLEN = FEATURES.register("darkwood_tree_fallen",
            () -> new FallenDarkwoodTree(NoneFeatureConfiguration.CODEC));

    private static final RegistryObject<DarkFungusFeature> DARK_FUNGUS = FEATURES.register("dark_fungus",
            () -> new DarkFungusFeature(NoneFeatureConfiguration.CODEC));



    // Materials
    private static final Material KYRANIUM = new Material("kyranium", ModCreativeTab.KRASYRUM_MATERIALS, RARITY_INSANE).fireResistant().ingot()
            .materialBlock(MaterialColor.COLOR_MAGENTA, 14f, 600f, false)
            .armor(22, 3000, new int[]{6, 12, 10, 4}, .4f, 4, SoundEvents.ARMOR_EQUIP_NETHERITE)
            .tools(6, 4200, 18f, 20, .4f, 22,
                    List.of(), List.of());
    private static final Material BLUE_NANITARIUM = new Material("blue_nanitarium").fireResistant().ingot().raw().crushable()
            .materialBlock(MaterialColor.COLOR_BLUE, 8f, 600f, true)
            .armor(24, 2600, new int[]{3, 7, 6, 2}, .2f, 2, SoundEvents.ARMOR_EQUIP_NETHERITE)
            .tools(5, 2976, 14f, 16f, .2f, 18,
                    List.of(), List.of())
            .deepslateOre(12f, 20f, 3, 1, -64, -32);
    private static final Material RED_NANITARIUM = new Material("red_nanitarium").fireResistant().ingot().raw().crushable()
            .materialBlock(MaterialColor.COLOR_RED, 8f, 600f, true)
            .armor(28, 2900, new int[]{5, 9, 7, 3}, .3f, 3, SoundEvents.ARMOR_EQUIP_NETHERITE)
            .tools(3, 2600, 10f, 14f, 0f, 12,
                    List.of(Tiers.NETHERITE), List.of())
            .netherOre(11f, 20f, 3, 1, 100, 127);
    private static final Material TITANIUM = new Material("titanium").ingot().raw().crushable()
            .materialBlock(MaterialColor.COLOR_LIGHT_GRAY, 4f, 30f, true)
            .armor(14, 600, new int[]{2, 5, 4, 2}, .0f, 0, SoundEvents.ARMOR_EQUIP_IRON)
            .tools(2, 500, 7.5f, 4.5f, 0f, 12,
                    List.of(Tiers.IRON), List.of(Tiers.DIAMOND))
            .stoneDeepslateOre(4f, 6f, 8, 12, -48, 24);
    private static final Material RUBY = new Material("ruby").gem()
            .materialBlock(MaterialColor.COLOR_RED, 3f, 15, false)
            .armor(18, 450, new int[]{2, 4, 4, 2}, .0f, 0, SoundEvents.ARMOR_EQUIP_DIAMOND)
            .tools(3, 300, 10.5f, 4f, 0.1f, 18,
                    List.of(Tiers.IRON), List.of(Tiers.DIAMOND))
            .stoneDeepslateOre(5f, 6f, 3, 7, -32, 32);
    private static final Material VERANIUM = new Material("veranium").ingot().raw().crushable()
            .materialBlock(MaterialColor.COLOR_LIGHT_GRAY, 4f, 30f, true)
            .tools(2, 500, 100f, 2.5f, 1f, 6,
                    List.of(Tiers.IRON), List.of(Tiers.DIAMOND))
            .endOre(4f, 6f, 6, 4, 0, 72);
    private static final Material THERIUM = new Material("therium").ingot().raw().crushable()
            .endOre(4f, 6f, 6, 4, 0, 72);



}
