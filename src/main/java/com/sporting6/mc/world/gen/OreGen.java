package com.sporting6.mc.world.gen;

import java.rmi.registry.RegistryHandler;

import com.sporting6.mc.Minercraft;
import com.sporting6.mc.init.ModBlocks;

import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Minercraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OreGen {
	
	@SubscribeEvent 
	public static void generateOres(FMLLoadCompleteEvent event) {
		
		for (Biome biome : ForgeRegistries.BIOMES) {
			//Nether
			if (biome.getCategory() == Biome.Category.NETHER) {
				
				genOre(biome, 20, 0, 5, 35, OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.RED_NANITARIUM_ORE.get().getDefaultState(), 4);

			}else if (biome.getCategory() == Biome.Category.THEEND) {
				
				
			}else {
				
				genOre(biome, 4, 0, 5, 13, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.BLUE_NANITARIUM_ORE.get().getDefaultState(), 3);
				genOre(biome, 10, 8, 5, 40, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.RUBY_ORE.get().getDefaultState(), 6);
				genOre(biome, 13, 8, 5, 75, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.COPPER_ORE.get().getDefaultState(), 7);
				genOre(biome, 13, 0, 5, 80, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.TIN_ORE.get().getDefaultState(), 7);
				genOre(biome, 8, 0, 5, 35, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.TITANIUM_ORE.get().getDefaultState(), 6);
				genOre(biome, 7, 0, 5, 35, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.TUNGSTEN_ORE.get().getDefaultState(), 5);
				genOre(biome, 15, 0, 5, 100, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.POLISHED_MARBLE.get().getDefaultState(), 15);
				genOre(biome, 7, 0, 5, 24, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.THERIUM_ORE .get().getDefaultState(), 5);

			}
				
				
			
			
		}
		
		
	}
	
	private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max,
			OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockstate, int size) {
		
		CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
		OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockstate, size);
		ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
		biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
		
	}

}
