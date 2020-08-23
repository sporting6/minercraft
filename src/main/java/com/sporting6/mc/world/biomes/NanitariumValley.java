package com.sporting6.mc.world.biomes;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.BlockBlobConfig;
import net.minecraft.world.gen.feature.BlockStateFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;

public class NanitariumValley extends Biome{

	public NanitariumValley(Builder biomeBuilder) {
		super(biomeBuilder);
		
	    this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CAVE, new ProbabilityConfig(0.14285715F)));
	    this.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.FOSSIL.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
	    		.withPlacement(Placement.CHANCE_PASSTHROUGH.configure(new ChanceConfig(128))));
	    this.addFeature(GenerationStage.Decoration.LAKES, Feature.LAKE.withConfiguration(new BlockStateFeatureConfig(Blocks.WATER.getDefaultState()))
	    		.withPlacement(Placement.WATER_LAKE.configure(new ChanceConfig(4))));
	    this.addFeature(GenerationStage.Decoration.LAKES, Feature.LAKE.withConfiguration(new BlockStateFeatureConfig(Blocks.LAVA.getDefaultState()))
	    		.withPlacement(Placement.LAVA_LAKE.configure(new ChanceConfig(80))));
	    this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(DefaultBiomeFeatures.DEAD_BUSH_CONFIG)
	    		.withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(20))));
	    this.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.FOREST_ROCK.withConfiguration(new BlockBlobConfig(ModBiomeFeatures.METIOR_SCRAP , 0))
	    		.withPlacement(Placement.FOREST_ROCK.configure(new FrequencyConfig(3))));

	    DefaultBiomeFeatures.addOres(this);
	}
	
	

}
