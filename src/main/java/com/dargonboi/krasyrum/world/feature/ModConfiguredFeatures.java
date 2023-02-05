package com.dargonboi.krasyrum.world.feature;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.block.ModOres;
import com.google.common.base.Suppliers;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {

    public static final RuleTest ENDSTONE_ORE_REPLACEABLES = new BlockMatchTest(Blocks.END_STONE);

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Krasyrum.MODID);


    //Overworld Ores-------------------------------------------------------------------------------------------------------------------------------------------------------------

    //  Blue Nanitarium
    public static final Supplier<List<OreConfiguration.TargetBlockState>> BLUE_NANITARIUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModOres.BLUE_NANITARIUM_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> BLUE_NANITARIUM_ORE = CONFIGURED_FEATURES.register("blue_nanitarium_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(BLUE_NANITARIUM_ORES.get(),3))); // p_161014_ = Vien Size

    //  Titanium
    public static final Supplier<List<OreConfiguration.TargetBlockState>> TITANIUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModOres.TITANIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModOres.DEEPSLATE_TITANIUM_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> TITANIUM_ORE = CONFIGURED_FEATURES.register("titanium_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(TITANIUM_ORES.get(),6))); // p_161014_ = Vien Size

    //  Ruby
    public static final Supplier<List<OreConfiguration.TargetBlockState>> RUBY_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModOres.RUBY_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModOres.DEEPSLATE_RUBY_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> RUBY_ORE = CONFIGURED_FEATURES.register("ruby_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(RUBY_ORES.get(),3))); // p_161014_ = Vien Size


    //Nether Ores-------------------------------------------------------------------------------------------------------------------------------------------------------------
    //  Red Nanitarium
    public static final Supplier<List<OreConfiguration.TargetBlockState>> RED_NANITARIUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModOres.RED_NANITARIUM_ORE.get().defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> RED_NANITARIUM_ORE = CONFIGURED_FEATURES.register("red_nanitarium_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(RED_NANITARIUM_ORES.get(),3))); // p_161014_ = Vien Size

    //End Ores-------------------------------------------------------------------------------------------------------------------------------------------------------------
    //  Veranium
    public static final Supplier<List<OreConfiguration.TargetBlockState>> VERANIUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(ENDSTONE_ORE_REPLACEABLES, ModOres.VERANIUM_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> VERANIUM_ORE = CONFIGURED_FEATURES.register("veranium_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(VERANIUM_ORES.get(),3))); // p_161014_ = Vien Size
    //  Therium
    public static final Supplier<List<OreConfiguration.TargetBlockState>> THERIUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(ENDSTONE_ORE_REPLACEABLES, ModOres.THERIUM_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> THERIUM_ORE = CONFIGURED_FEATURES.register("therium_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(THERIUM_ORES.get(),3))); // p_161014_ = Vien Size

    //Tree -------------------------------------------------------------------------------------------------------------------------------------------------------------



    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
