package com.dargonboi.krasyrum.world.feature.darkforest;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.util.world.feature.FeatureHelper;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class FallenDarkwoodTree extends Feature<NoneFeatureConfiguration> {

    private WorldGenLevel level;

    public FallenDarkwoodTree(Codec<NoneFeatureConfiguration> pCodec) {
        super(pCodec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> pContext) {
        BlockPos origin = pContext.origin();
        level = pContext.level();
        RandomSource randomsource = pContext.random();

        if (level.getBlockState(origin.below()) != Krasyrum.BLOCKMAP.get("overgrown_krasyrum_stone").get().defaultBlockState()) {
//            System.out.println("Incrorrect Block Below\n" + level.getBlockState(origin.below()) + " != " + Krasyrum.BLOCKMAP.get("overgrown_krasyrum_stone").get().defaultBlockState());
            return false;
        }
        if (level.getBlockState(origin) != Blocks.AIR.defaultBlockState() && level.getBlockState(origin.above()) != Blocks.CAVE_AIR.defaultBlockState()) {
//            System.out.println("Incrorrect Block Above\n" + level.getBlockState(origin) + " != air");
            return false;
        }
        if(randomsource.nextInt(3) == 0){
            return false;
        }

        int trunkLength = randomsource.nextInt(4)+3;
        int dir = randomsource.nextInt(4);


        for(int i = 0; i < trunkLength; i ++){
            BlockPos nextPos = origin;
            BlockState log = Krasyrum.BLOCKMAP.get("darkwood_log").get().defaultBlockState();
            switch (dir) {
                case 0:
                    nextPos = origin.north(i);
                    log = log.setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z);
                    break;
                case 1:
                    nextPos = origin.east(i);
                    log = log.setValue(RotatedPillarBlock.AXIS, Direction.Axis.X);
                    break;
                case 2:
                    nextPos = origin.south(i);
                    log = log.setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z);
                    break;
                case 3:
                    nextPos = origin.west(i);
                    log = log.setValue(RotatedPillarBlock.AXIS, Direction.Axis.X);
                    break;
                default:
                    break;
            }

            if(FeatureHelper.airTest(nextPos, level) && level.getBlockState(nextPos.below()) == Krasyrum.BLOCKMAP.get("overgrown_krasyrum_stone").get().defaultBlockState()){
                level.setBlock(nextPos, log, 2);
            } else break;

            if(randomsource.nextInt(5) == 0){
                switch (randomsource.nextInt(1)){
                    case 0:
                        if(FeatureHelper.airTest(nextPos.west(), level))
                            level.setBlock(nextPos.west(), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
                        else if(FeatureHelper.airTest(nextPos.north(), level))
                            level.setBlock(nextPos.north(), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
                        break;
                    default:
                        if(FeatureHelper.airTest(nextPos.east(), level))
                            level.setBlock(nextPos.east(), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
                        else if(FeatureHelper.airTest(nextPos.south(), level))
                            level.setBlock(nextPos.south(), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
                        break;
                }
            }
        }

        return true;
    }
}
