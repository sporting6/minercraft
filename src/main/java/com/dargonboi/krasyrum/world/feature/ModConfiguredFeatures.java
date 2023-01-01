package com.dargonboi.krasyrum.world.feature;

import com.dargonboi.krasyrum.block.ModBlocks;
import com.dargonboi.krasyrum.block.ModOres;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.BendingTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RuleTest ENDSTONE_ORE_REPLACEABLES = new BlockMatchTest(Blocks.END_STONE);


    //Overworld Ores-------------------------------------------------------------------------------------------------------------------------------------------------------------

    //  Blue Nanitarium
    public static final List<OreConfiguration.TargetBlockState> BLUE_NANITARIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModOres.BLUE_NANITARIUM_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BLUE_NANITARIUM_ORE = FeatureUtils.register("blue_nanitarium_ore",
            Feature.ORE, new OreConfiguration(BLUE_NANITARIUM_ORES, 3)); // p_161014_ = Vien Size


    //  Titanium
    public static final List<OreConfiguration.TargetBlockState> TITANIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModOres.TITANIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModOres.DEEPSLATE_TITANIUM_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TITANIUM_ORE = FeatureUtils.register("titanium_ore",
            Feature.ORE, new OreConfiguration(TITANIUM_ORES, 7)); // p_161014_ = Vien Size

    //  Ruby
    public static final List<OreConfiguration.TargetBlockState> RUBY_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModOres.RUBY_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModOres.DEEPSLATE_RUBY_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> RUBY_ORE = FeatureUtils.register("ruby_ore",
            Feature.ORE, new OreConfiguration(RUBY_ORES, 4)); // p_161014_ = Vien Size


    //Nether Ores-------------------------------------------------------------------------------------------------------------------------------------------------------------
    //  Red Nanitarium
    public static final List<OreConfiguration.TargetBlockState> RED_NANITARIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModOres.RED_NANITARIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> RED_NANITARIUM_ORE = FeatureUtils.register("red_nanitarium_ore",
            Feature.ORE, new OreConfiguration(RED_NANITARIUM_ORES, 9));

    //End Ores-------------------------------------------------------------------------------------------------------------------------------------------------------------
    //  Veranium
    public static final List<OreConfiguration.TargetBlockState> VERANIUM_ORES = List.of(
            OreConfiguration.target(ENDSTONE_ORE_REPLACEABLES, ModOres.VERANIUM_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> VERANIUM_ORE = FeatureUtils.register("veranium_ore",
            Feature.ORE, new OreConfiguration(VERANIUM_ORES, 3)); // p_161014_ = Vien Size
    //  Therium
    public static final List<OreConfiguration.TargetBlockState> THERIUM_ORES = List.of(
            OreConfiguration.target(ENDSTONE_ORE_REPLACEABLES, ModOres.THERIUM_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> THERIUM_ORE = FeatureUtils.register("therium_ore",
            Feature.ORE, new OreConfiguration(THERIUM_ORES, 3)); // p_161014_ = Vien Size

    //Tree -------------------------------------------------------------------------------------------------------------------------------------------------------------

}
