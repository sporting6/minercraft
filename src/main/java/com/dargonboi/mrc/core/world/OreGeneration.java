package com.dargonboi.mrc.core.world;

import java.util.ArrayList;
import java.util.List;

import com.dargonboi.mrc.core.init.ModBlocks;

import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

public class OreGeneration {

	public static final RuleTest END_TEST = new BlockMatchTest(Blocks.END_STONE);

	public static final List<PlacedFeature> OVERWORLD_ORES = new ArrayList<>();
	public static final List<PlacedFeature> NETHER_ORES = new ArrayList<>();
	public static final List<PlacedFeature> END_ORES = new ArrayList<>();

	public static void registerOres() {


		// Overworld Ores
		final ConfiguredFeature<?, ?> blueNanitariumOre = FeatureUtils.register("blue_nanitarium_ore",
				Feature.ORE.configured(
						new OreConfiguration(List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
								ModBlocks.BLUE_NANITARIUM_ORE.get().defaultBlockState())), 3)));

		final PlacedFeature placedBlueNanitariumOre = PlacementUtils.register("blue_nanitarium_ore",
				blueNanitariumOre.placed(OrePlacements.commonOrePlacement(1,
						HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(32)))));
		OVERWORLD_ORES.add(placedBlueNanitariumOre);

		final ConfiguredFeature<?, ?> titaniumOre = FeatureUtils.register("titanium_ore",
				Feature.ORE.configured(new OreConfiguration(List.of(

						OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,
								ModBlocks.TITANIUM_ORE.get().defaultBlockState()),
						OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
								ModBlocks.DEEPSLATE_TITANIUM_ORE.get().defaultBlockState())),
						7)));

		final PlacedFeature placedTitaniumOre = PlacementUtils.register("titanium_ore",
				titaniumOre.placed(OrePlacements.commonOrePlacement(8, HeightRangePlacement
						.triangle(VerticalAnchor.aboveBottom(16), VerticalAnchor.aboveBottom(128)))));
		OVERWORLD_ORES.add(placedTitaniumOre);

		final PlacedFeature placedSmallTitaniumOre = PlacementUtils.register("small_titanium_ore",
				titaniumOre.placed(OrePlacements.commonOrePlacement(6, HeightRangePlacement
						.triangle(VerticalAnchor.aboveBottom(192), VerticalAnchor.aboveBottom(384)))));
		OVERWORLD_ORES.add(placedSmallTitaniumOre);

		final ConfiguredFeature<?, ?> rubyOre = FeatureUtils.register("ruby_ore",
				Feature.ORE.configured(new OreConfiguration(List.of(

						OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,
								ModBlocks.RUBY_ORE.get().defaultBlockState()),
						OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
								ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState())),
						3)));

		final PlacedFeature placedRubyOre = PlacementUtils.register("ruby_ore",
				rubyOre.placed(OrePlacements.commonOrePlacement(5, HeightRangePlacement
						.triangle(VerticalAnchor.aboveBottom(16), VerticalAnchor.aboveBottom(100)))));
		OVERWORLD_ORES.add(placedRubyOre);

		// Nether Ores
		final ConfiguredFeature<?, ?> redNanitariumOre = FeatureUtils.register("red_nanitarium_ore",
				Feature.ORE.configured(new OreConfiguration(
						List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,
								ModBlocks.RED_NANITARIUM_ORE.get().defaultBlockState())),

						3)));

		final ConfiguredFeature<?, ?> smallRedNanitariumOre = FeatureUtils.register("small_red_nanitarium_ore",
				Feature.ORE.configured(new OreConfiguration(
						List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,
								ModBlocks.RED_NANITARIUM_ORE.get().defaultBlockState())),

						2)));

		final PlacedFeature placedRedNanitariumOre = PlacementUtils.register("red_nanitarium_ore",
				redNanitariumOre.placed(OrePlacements.commonOrePlacement(1,
						HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(32)))));
		NETHER_ORES.add(placedRedNanitariumOre);

		final PlacedFeature placedSmallRedNanitariumOre = PlacementUtils.register("small_red_nanitarium_ore",
				smallRedNanitariumOre.placed(OrePlacements.commonOrePlacement(1,
						HeightRangePlacement.triangle(VerticalAnchor.absolute(32), VerticalAnchor.aboveBottom(64)))));
		NETHER_ORES.add(placedSmallRedNanitariumOre);

		// End Ores
		final ConfiguredFeature<?, ?> veraniumOre = FeatureUtils.register("veranium_ore",
				Feature.ORE.configured(new OreConfiguration(
						List.of(OreConfiguration.target(END_TEST, ModBlocks.VERANIUM_ORE.get().defaultBlockState())),
						3)));
		final PlacedFeature placedVeraniumOre = PlacementUtils.register("veranium_ore",
				veraniumOre.placed(OrePlacements.commonOrePlacement(3,
						HeightRangePlacement.triangle(VerticalAnchor.absolute(32), VerticalAnchor.aboveBottom(170)))));
		END_ORES.add(placedVeraniumOre);

		final ConfiguredFeature<?, ?> theriumOre = FeatureUtils.register("therium_ore",
				Feature.ORE.configured(new OreConfiguration(
						List.of(OreConfiguration.target(END_TEST, ModBlocks.THERIUM_ORE.get().defaultBlockState())),
						1)));
		final PlacedFeature placedTheriumOre = PlacementUtils.register("therium_ore",
				theriumOre.placed(OrePlacements.commonOrePlacement(3,
						HeightRangePlacement.triangle(VerticalAnchor.absolute(32), VerticalAnchor.aboveBottom(180)))));
		END_ORES.add(placedTheriumOre);

		END_ORES.forEach(ore -> System.out.println("==> TPM registerOres: " + ore));

	}

}
