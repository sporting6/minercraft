package com.dargonboi.krasyrum.world.feature.ore;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.block.ModBlocks;
import com.dargonboi.krasyrum.util.world.feature.FeatureHelper;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.AirBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

import java.security.Key;

public class LavaPoolFeature extends Feature<NoneFeatureConfiguration> {


    private int poolMaxRadius;

    public LavaPoolFeature(Codec<NoneFeatureConfiguration> pCodec, int poolMaxRadius) {
        super(pCodec);
        this.poolMaxRadius = poolMaxRadius;
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> pContext) {
        BlockPos origin = pContext.origin().below();
        WorldGenLevel worldgenlevel = pContext.level();
        RandomSource randomsource = pContext.random();
        if(worldgenlevel.getBlockState(origin.below()) == ModBlocks.BOILING_WATER_BLOCK.get().defaultBlockState()){
            return false;
        }
        if(worldgenlevel.getBlockState(origin.above()) != Blocks.AIR.defaultBlockState()){
            return false;
        }

        if(FeatureHelper.blockCheck(origin, worldgenlevel, 2, Blocks.AIR.defaultBlockState()))
            return false;
        if(FeatureHelper.blockCheck(origin, worldgenlevel, 2, Blocks.CAVE_AIR.defaultBlockState()))
            return false;


        int w = randomsource.nextInt(6);
        int h = randomsource.nextInt(6);
        FeatureHelper.filledNoOverhangEllipse(origin, Blocks.LAVA, w, h, worldgenlevel);
        int poolCount = randomsource.nextInt(3);
        for(int i = 0; i <= poolCount; i++) {

            int north = randomsource.nextInt(12) - 6;
            int west = randomsource.nextInt(12) - 6;

            if(north < 2 && north > -2)
                north = north + 3;
            if(west < 2 && west > -2)
                west = west + 3;

            int a = randomsource.nextInt(4) + 2;
            int b = randomsource.nextInt(4) + 2;

            FeatureHelper.filledNoOverhangEllipse(origin.north(north).west(west), Blocks.LAVA, randomsource.nextInt(6), randomsource.nextInt(6), worldgenlevel);
        }




        System.out.println("===================> Lava Pool Registration Success");
        return true;
    }

}

