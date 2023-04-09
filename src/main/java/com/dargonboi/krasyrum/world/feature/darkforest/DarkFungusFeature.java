package com.dargonboi.krasyrum.world.feature.darkforest;

import com.dargonboi.krasyrum.Krasyrum;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class DarkFungusFeature extends Feature<NoneFeatureConfiguration> {
    public DarkFungusFeature(Codec<NoneFeatureConfiguration> pCodec) {
        super(pCodec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> pContext) {

        BlockPos origin = pContext.origin();
        WorldGenLevel level = pContext.level();
        RandomSource randomsource = pContext.random();

        if (level.getBlockState(origin.below()) != Krasyrum.BLOCKMAP.get("overgrown_krasyrum_stone").get().defaultBlockState()) {
//            System.out.println("Incrorrect Block Below\n" + level.getBlockState(origin.below()) + " != " + Krasyrum.BLOCKMAP.get("overgrown_krasyrum_stone").get().defaultBlockState());
            return false;
        }
        if (level.getBlockState(origin) != Blocks.AIR.defaultBlockState() && level.getBlockState(origin.above()) != Blocks.CAVE_AIR.defaultBlockState()) {
//            System.out.println("Incrorrect Block Above\n" + level.getBlockState(origin) + " != air");
            return false;
        }

        level.setBlock(origin, Krasyrum.BLOCKMAP.get("dark_fungus_clump").get().defaultBlockState(), 2);

        int extra = randomsource.nextInt(5);

        for (int i = 0; i < extra; i++){
            int x = randomsource.nextInt(10)-5;
            int y = randomsource.nextInt(10)-5;


            if (level.getBlockState(origin.below().north(y).east(x)) != Krasyrum.BLOCKMAP.get("overgrown_krasyrum_stone").get().defaultBlockState()) {
                continue;
            }
            if (level.getBlockState(origin.north(y).east(x)) != Blocks.AIR.defaultBlockState() && level.getBlockState(origin.above()) != Blocks.CAVE_AIR.defaultBlockState()) {
                continue;
            }
            if(randomsource.nextInt(2) == 0)
                level.setBlock(origin.north(y).east(x), Krasyrum.BLOCKMAP.get("dark_fungus_clump").get().defaultBlockState(), 2);
            else level.setBlock(origin.north(y).east(x), Krasyrum.BLOCKMAP.get("dark_fungus").get().defaultBlockState(), 2);

        }


        return false;
    }
}
