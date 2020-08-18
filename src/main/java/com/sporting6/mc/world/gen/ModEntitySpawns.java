package com.sporting6.mc.world.gen;

import com.sporting6.mc.Minercraft;
import com.sporting6.mc.init.ModEntityType;

import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Minercraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntitySpawns {
	
	@SubscribeEvent
	public static void SpawnMobs(FMLLoadCompleteEvent event) {
		for(Biome biome : ForgeRegistries.BIOMES) {
			//Nether Mobs
			if(biome.getCategory() == Biome.Category.NETHER) {}
			//End Mobs
			else if(biome.getCategory() == Biome.Category.THEEND) {}
			//Savanna Mobs
			else if(biome.getCategory() == Biome.Category.SAVANNA) {
				biome.getSpawns(EntityClassification.CREATURE)
				.add(new Biome.SpawnListEntry(ModEntityType.LION.get(), 11 , 3, 7))
				;}
			else if(biome.getCategory() == Biome.Category.JUNGLE) {
				biome.getSpawns(EntityClassification.CREATURE)
				.add(new Biome.SpawnListEntry(ModEntityType.WHITE_TIGER.get(), 1 , 1, 3));
				biome.getSpawns(EntityClassification.CREATURE)
				.add(new Biome.SpawnListEntry(ModEntityType.TIGER.get(), 10 , 1, 3));
				
			}
			else {}

			
			
		}
	}

}