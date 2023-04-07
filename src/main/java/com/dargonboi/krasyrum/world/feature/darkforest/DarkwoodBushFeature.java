package com.dargonboi.krasyrum.world.feature.darkforest;

import com.dargonboi.krasyrum.Krasyrum;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class DarkwoodBushFeature extends Feature<NoneFeatureConfiguration> {

    private WorldGenLevel level;


    public DarkwoodBushFeature(Codec<NoneFeatureConfiguration> pCodec) {
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

        level.setBlock(origin, Krasyrum.BLOCKMAP.get("darkwood_log").get().defaultBlockState(), 2);

        leaves(origin);

        int randLeaves = randomsource.nextInt(5)+2;
        for(int i = 0; i < randLeaves; i++){
            int dir = randomsource.nextInt(4);
            BlockPos nextPos = origin;
            int dist = randomsource.nextInt(2)+1;
            switch (dir) {
                case 0:
                    nextPos = origin.above(dist/2).north(dist);
                    break;
                case 1:
                    nextPos = origin.above(dist/2).east(dist);
                    break;
                case 2:
                    nextPos = origin.above(dist/2).south(dist);
                    break;
                case 3:
                    nextPos = origin.above(dist/2).west(dist);
                    break;
                default:
                    break;
            }
            placeLeaf(nextPos ,Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
        }

        return true;
    }


    public void leaves(BlockPos pos) {
        placeLeaf(pos, Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
        placeLeaf(pos.below(1), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
        placeLeaf(pos.above(1), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);

        placeLeaf(pos.below(1).north(1), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
        placeLeaf(pos.below(1).east(1), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
        placeLeaf(pos.below(1).south(1), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
        placeLeaf(pos.below(1).west(1), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);

        placeLeaf(pos.north(1), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
        placeLeaf(pos.east(1), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
        placeLeaf(pos.south(1), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
        placeLeaf(pos.west(1), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
    }

    private boolean placeLeaf(BlockPos pos, BlockState state, int flag) {
        if (level.getBlockState(pos) == Blocks.AIR.defaultBlockState() || level.getBlockState(pos) == Blocks.CAVE_AIR.defaultBlockState()) {
            level.setBlock(pos, state, flag);
            return true;
        } else return false;
    }
}
