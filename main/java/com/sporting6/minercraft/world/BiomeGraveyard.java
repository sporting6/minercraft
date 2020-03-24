package com.sporting6.minercraft.world;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomeGraveyard extends Biome {
	
	public BiomeGraveyard() {
		
		super(new BiomeProperties("graveyard").setRainfall(0.5f).setWaterColor(060017));
		
		topBlock =  Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.COBBLESTONE.getDefaultState();
		
		this.decorator.treesPerChunk = 1;
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		
	}

}
