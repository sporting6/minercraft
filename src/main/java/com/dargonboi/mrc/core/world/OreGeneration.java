package com.dargonboi.mrc.core.world;

import java.util.ArrayList;
import java.util.List;

import com.dargonboi.mrc.core.init.ModBlocks;

import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class OreGeneration {
	
	
	public static final List<PlacedFeature> OVERWORLD_ORES = new ArrayList<>();
	public static final List<PlacedFeature> NETHER_ORES = new ArrayList<>();
	public static final List<PlacedFeature> END_ORES = new ArrayList<>(); 
	
	public static void registerOres() {
		
		final ConfiguredFeature<?, ?> blueNanitariumOre = FeatureUtils.register("blue_nanitarium_ore",
                Feature.ORE.configured(new OreConfiguration(List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                ModBlocks.BLUE_NANITARIUM_ORE.get().defaultBlockState())),
                		
                		3)));
		
		final PlacedFeature placedBlueNanitariumOre = PlacementUtils.register("blue_nanitarium_ore",
                blueNanitariumOre.placed(OrePlacements.commonOrePlacement(1, HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(16)))));
        OVERWORLD_ORES.add(placedBlueNanitariumOre);
        
        
        final ConfiguredFeature<?, ?> redNanitariumOre = FeatureUtils.register("red_nanitarium_ore",
                Feature.ORE.configured(new OreConfiguration(List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,
                ModBlocks.RED_NANITARIUM_ORE.get().defaultBlockState())),
                		
                		3)));
		
		final PlacedFeature placedRedNanitariumOre = PlacementUtils.register("red_nanitarium_ore",
                redNanitariumOre.placed(OrePlacements.commonOrePlacement(100, HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(32)))));
        NETHER_ORES.add(placedRedNanitariumOre);
        
        final PlacedFeature placedSmallRedNanitariumOre = PlacementUtils.register("red_nanitarium_ore",
                redNanitariumOre.placed(OrePlacements.commonOrePlacement(100, HeightRangePlacement.triangle(VerticalAnchor.absolute(32), VerticalAnchor.aboveBottom(64)))));
        NETHER_ORES.add(placedSmallRedNanitariumOre);
        
        //OVERWORLD_ORES.forEach(ore -> System.out.println("==> TPM registerOres: " + ore));
		
	}
	
	

 
}
