package com.dargonboi.krasyrum.world.feature.hotspot;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.util.world.feature.FeatureHelper;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class MagmaFeature extends Feature<NoneFeatureConfiguration> {

    public MagmaFeature(Codec<NoneFeatureConfiguration> pCodec) {
        super(pCodec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> pContext) {
        BlockPos origin = pContext.origin().below();
        WorldGenLevel worldgenlevel = pContext.level();
        RandomSource randomsource = pContext.random();

        placeSphere(origin, worldgenlevel, randomsource, randomsource.nextInt(3)+4);
        if(randomsource.nextInt(10) <= 3)
            placeSphere(origin.north(randomsource.nextInt(6) - 12).west(randomsource.nextInt(6) - 12), worldgenlevel, randomsource,  randomsource.nextInt(3)+4);

        if(randomsource.nextInt(10) <= 3)
            placeSphere(origin.north(randomsource.nextInt(6) - 12).west(randomsource.nextInt(6) - 12), worldgenlevel, randomsource,  randomsource.nextInt(3)+4);

        if(randomsource.nextInt(10) <= 3)
            placeSphere(origin.north(randomsource.nextInt(6) - 12).west(randomsource.nextInt(6) - 12), worldgenlevel, randomsource, randomsource.nextInt(3)+4);

        if(randomsource.nextInt(10) <= 3)
            placeSphere(origin.north(randomsource.nextInt(6) - 12).west(randomsource.nextInt(6) - 12), worldgenlevel, randomsource, randomsource.nextInt(3)+4);

        if(randomsource.nextInt(10) <= 3)
            placeSphere(origin.north(randomsource.nextInt(6) - 12).west(randomsource.nextInt(6) - 12), worldgenlevel, randomsource, randomsource.nextInt(3)+4);




        return true;
    }

    public static boolean placeSphere(BlockPos origin, WorldGenLevel worldgenlevel, RandomSource randomSource, int r){
        for (double x = 0; x <= r; x = x + 0.25) {
            double y = Math.sqrt((r * r) - (x * x));
            FeatureHelper.filledNoOverhangEllipse(origin.above((int) y), Krasyrum.BLOCKMAP.get("krasyrum_magma").get(), x + randomSource.nextInt(3), x + randomSource.nextInt(3), worldgenlevel);
            FeatureHelper.filledNoOverhangEllipse(origin.below((int) y), Krasyrum.BLOCKMAP.get("krasyrum_magma").get(), x + randomSource.nextInt(3), x + randomSource.nextInt(3), worldgenlevel);
        }
        return true;
    }

}


