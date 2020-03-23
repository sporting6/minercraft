package com.sporting6.minercraft.world;

import java.util.Random;

import com.sporting6.minercraft.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator{
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimension() == 0) {
			generateOverworld  (random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateOre(ModBlocks.TUNGSTEN_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 9, 35, random.nextInt(6)+2, 7);
		generateOre(ModBlocks.COPPER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 20, 64, random.nextInt(10)+2, 16);
		generateOre(ModBlocks.TIN_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 20, 64, random.nextInt(10)+2, 16);
		generateOre(ModBlocks.RUBY_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 9, 44, random.nextInt(8)+2, 10);
		generateOre(ModBlocks.TITANIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 9, 35, random.nextInt(6)+2, 8);
		generateOre(ModBlocks.NANITERIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 5, 17, random.nextInt(4)+1, 3);
		generateOre(ModBlocks.MARBLE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 20, 64, random.nextInt(20)+8, 20);

	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		
		int deltaY = maxY - minY;
				
		for (int i = 0; i< chances; i++) {
			
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}

}
