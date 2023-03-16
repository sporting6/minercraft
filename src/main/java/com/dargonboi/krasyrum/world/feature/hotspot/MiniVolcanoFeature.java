package com.dargonboi.krasyrum.world.feature.hotspot;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.block.ModBlocks;
import com.dargonboi.krasyrum.util.world.feature.FeatureHelper;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class MiniVolcanoFeature extends Feature<NoneFeatureConfiguration> {

    public MiniVolcanoFeature(Codec<NoneFeatureConfiguration> pCodec) {
        super(pCodec);
    }

    public static void placeSpike(RandomSource randomsource, BlockPos origin, WorldGenLevel worldgenlevel, int hight) {
        int radius;

        int m = randomsource.nextInt(2) + 2;
        for (int h = -1; h <= hight; h++) {
            radius = Math.abs(h / m - hight / m);

            FeatureHelper.filledEllipse(origin.above(h), Krasyrum.BLOCKMAP.get("krasyrum_stone").get(), radius, radius, worldgenlevel);
            System.out.println("Layer #" + h + ", m = " + m + ", b = " + hight + ", radius = " + radius);
        }
    }

    public static void placeVent(RandomSource randomsource, BlockPos origin, WorldGenLevel worldgenlevel, int hight) {
        for (int i = 1; i <= hight / 3; i++) {
            worldgenlevel.setBlock(origin.above(i), Blocks.LAVA.defaultBlockState(), 2);
            worldgenlevel.setBlock(origin.below(i), Blocks.LAVA.defaultBlockState(), 2);
        }

        for (int i = 1; i <= (2 * hight) / 3 + 3; i++)
            worldgenlevel.setBlock(origin.above(hight / 3 + i), Blocks.AIR.defaultBlockState(), 2);

        worldgenlevel.setBlock(origin, Krasyrum.BLOCKMAP.get("krasyrum_magma").get().defaultBlockState(), 2);
    }

    public static void placeVolcano(RandomSource randomsource, BlockPos origin, WorldGenLevel worldgenlevel, int hight) {
        placeSpike(randomsource, origin, worldgenlevel, hight);
        placeVent(randomsource, origin, worldgenlevel, hight);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> pContext) {

        System.out.println(Krasyrum.BLOCKMAP.get("krasyrum_stone"));


        BlockPos origin = pContext.origin().below();
        WorldGenLevel worldgenlevel = pContext.level();
        RandomSource randomsource = pContext.random();
        if (worldgenlevel.getBlockState(origin.below()) == ModBlocks.BOILING_WATER_BLOCK.get().defaultBlockState()) {
            return false;
        }
        if (worldgenlevel.getBlockState(origin.above()) != Blocks.AIR.defaultBlockState()) {
            return false;
        }

        if (FeatureHelper.blockCheck(origin, worldgenlevel, 2, Blocks.AIR.defaultBlockState()))
            return false;
        if (FeatureHelper.blockCheck(origin, worldgenlevel, 2, Blocks.CAVE_AIR.defaultBlockState()))
            return false;


        placeVolcano(randomsource, origin, worldgenlevel, randomsource.nextInt(3) + 4);

        for (int i = 0; i < randomsource.nextInt(4) + 1; i++) {
            int xOff = randomsource.nextInt(12) - 6;
            int yOff = randomsource.nextInt(12) - 6;

            int hight = randomsource.nextInt(3) + 2;

            placeSpike(randomsource, origin.west(xOff).north(yOff), worldgenlevel, hight);
            if (randomsource.nextInt(10) < 4) {
                placeVent(randomsource, origin.west(xOff).north(yOff), worldgenlevel, hight);
            }
        }


        System.out.println("===================> Volcano Registration Success");
        return true;
    }
}
