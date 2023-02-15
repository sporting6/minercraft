package com.dargonboi.krasyrum.world.feature.ore;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class LavaPoolFeature extends Feature<NoneFeatureConfiguration> {


    private int poolMaxRadius;

    public LavaPoolFeature(Codec<NoneFeatureConfiguration> pCodec, int poolMaxRadius) {
        super(pCodec);
        this.poolMaxRadius = poolMaxRadius;
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> pContext) {
        BlockPos pos = pContext.origin();
        WorldGenLevel worldgenlevel = pContext.level();
        RandomSource randomsource = pContext.random();
        if(!worldgenlevel.isEmptyBlock(pos) && !worldgenlevel.isEmptyBlock(pos.below(1))){
            worldgenlevel.setBlock(pos, Blocks.LAVA.defaultBlockState(), 2);

            int northMax = randomsource.nextInt(poolMaxRadius + 1);
            int southMax = randomsource.nextInt(poolMaxRadius + 1);
            int eastMax = randomsource.nextInt(poolMaxRadius + 1);
            int westMax = randomsource.nextInt(poolMaxRadius + 1);


            for(int i = -southMax; i < northMax; i++){
                for(int j = -westMax; i < eastMax; j++){
                    if(i < 0 && j < 0){
                        worldgenlevel.setBlock(pos.south(Math.abs(i)).east(Math.abs(j)), Blocks.LAVA.defaultBlockState(), 2);
                    }
                    if(i < 0 && j > 0){
                        worldgenlevel.setBlock(pos.south(Math.abs(i)).west(Math.abs(j)), Blocks.LAVA.defaultBlockState(), 2);
                    }
                    if(i > 0 && j < 0){
                        worldgenlevel.setBlock(pos.north(Math.abs(i)).east(Math.abs(j)), Blocks.LAVA.defaultBlockState(), 2);
                    }
                    if(i > 0 && j > 0){
                        worldgenlevel.setBlock(pos.north(Math.abs(i)).west(Math.abs(j)), Blocks.LAVA.defaultBlockState(), 2);
                    }
                }
            }
            System.out.println(northMax);
            System.out.println(southMax);
            System.out.println(eastMax);
            System.out.println(westMax);

            return true;
        }

        System.out.println("===================> Lava Pool Registration Failed");
        return false;
    }

}

