package com.sporting6.mc.init;

import com.sporting6.mc.Minercraft;
import com.sporting6.mc.world.biomes.NanitariumValley;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.RainType;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiome {
	
	public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES,Minercraft.MOD_ID);
	
	public static final RegistryObject<Biome> NANITARIUM_VALLEY = BIOMES.register("nanitarium_valley", () -> new NanitariumValley
			(new Biome.Builder()
					.precipitation(RainType.SNOW)
					.scale(0.7f)
					.temperature(0.4f)
					.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig
					(Blocks.GRAVEL.getDefaultState(), Blocks.COBBLESTONE.getDefaultState(), Blocks.STONE.getDefaultState()))
					.category(Category.NONE)
					.downfall(0.5f)
					.depth(0.185f)
					.parent(null)));
	public static void registerBiomes() {
		registerBiome(NANITARIUM_VALLEY.get(), Type.COLD, Type.DRY, Type.OVERWORLD, Type.DEAD);
	}
	
	public static void registerBiome(Biome biome, Type... types) {
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
		
	}
	
}
