package com.sporting6.minercraft.init;

import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import com.sporting6.minercraft.world.BiomeGraveyard;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type ;
import net.minecraftforge.common.BiomeManager;

public class ModBiomes {
	
	public static final Biome GRAVEYARD = new BiomeGraveyard();
	
	 public static void RegesterBiomes() {
		 
		initBiome(GRAVEYARD, "graveyard", BiomeType.COOL, Type.SPOOKY, Type.FOREST, Type.WASTELAND, Type.DENSE, Type.WET); 
	 }
	 
	 private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types) {
		 biome.setRegistryName(name);
		 ForgeRegistries.BIOMES.register(biome);
		 System.out.println("Biome Regestered");
		 BiomeDictionary.addTypes(biome, types);
		 BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 5));
		 BiomeManager.addSpawnBiome(biome);
		 System.out.println("Biome Added");

		 return biome;
	 }
} 
