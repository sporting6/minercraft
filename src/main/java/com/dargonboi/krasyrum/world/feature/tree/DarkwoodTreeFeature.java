package com.dargonboi.krasyrum.world.feature.tree;

import com.dargonboi.krasyrum.Krasyrum;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Rotations;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.RotatedBlockProvider;

public class DarkwoodTreeFeature extends Feature<NoneFeatureConfiguration> {
    WorldGenLevel level;

    public DarkwoodTreeFeature(Codec<NoneFeatureConfiguration> pCodec) {
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
        int maxHight = randomsource.nextInt(5) + 3;


        for (int hight = 0; hight < maxHight; hight++) {
            level.setBlock(origin.above(hight), Krasyrum.BLOCKMAP.get("darkwood_log").get().defaultBlockState(), 2);
        }


        int lastDir = 0;

        for (int i = 1; i <= maxHight; i++) {
            int dir = randomsource.nextInt(4);
            if (dir == lastDir) {
                lastDir = dir;
                continue;
            }

            lastDir = dir;


            if (randomsource.nextInt(4) < 3)
                branch(origin.above(i), randomsource, dir);
        }

        leaves(origin.above(maxHight+1));
        return true;
    }


    private void branch(BlockPos pos, RandomSource randomSource, int dir) {

        int height = randomSource.nextInt(5) + 1;
        int length = randomSource.nextInt(3) + 3;

        System.out.println("Hight = " + height + ", Length = " + length + ", Direction = " + dir);

        BlockState log = Krasyrum.BLOCKMAP.get("darkwood_log").get().defaultBlockState();


        BlockPos nextPos = pos;
        for (int branchLength = 0; branchLength < length; branchLength++) {
            switch (dir) {
                case 0:
                    nextPos = pos.above(branchLength).north(branchLength);
                    break;
                case 1:
                    nextPos = pos.above(branchLength).east(branchLength);
                    break;
                case 2:
                    nextPos = pos.above(branchLength).south(branchLength);
                    break;
                case 3:
                    nextPos = pos.above(branchLength).west(branchLength);
                    break;
                default:
                    break;
            }
            if(randomSource.nextInt(3) == 0)
                extraLimb(nextPos, log, randomSource, dir, 0);


            if (branchLength == length) {
                leaves(nextPos);
            }
        }
    }


    public void extraLimb(BlockPos nextPos, BlockState log, RandomSource randomSource, int dir, int length) {
        level.setBlock(nextPos, log, 2);
        int offDir = randomSource.nextInt(1);
        offDir = offDir == 0 ? -1 : 1;
        switch ((offDir + dir) % 3) {
            case 0:
                nextPos = nextPos.north();
                break;
            case 1:
                nextPos = nextPos.east();
                break;
            case 2:
                nextPos = nextPos.south();
                break;
            case 3:
                nextPos = nextPos.west();
                break;
            default:
                break;
        }
        level.setBlock(nextPos, log, 2);
        if (length < 3 && randomSource.nextInt(2) == 0)
            extraLimb(nextPos, log, randomSource, dir, length + 1);
        else leaves(nextPos);
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

        placeLeaf(pos.north(2), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
        placeLeaf(pos.east(2), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
        placeLeaf(pos.south(2), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
        placeLeaf(pos.west(2), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);

        placeLeaf(pos.north(1).east(), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
        placeLeaf(pos.north(1).west(), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
        placeLeaf(pos.south(1).east(), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
        placeLeaf(pos.south(1).west(), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);

        placeLeaf(pos.above(1).north(1), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
        placeLeaf(pos.above(1).east(1), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
        placeLeaf(pos.above(1).south(1), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
        placeLeaf(pos.above(1).west(1), Krasyrum.BLOCKMAP.get("darkwood_leaves").get().defaultBlockState(), 2);
    }


    private boolean placeLeaf(BlockPos pos, BlockState state, int flag) {
        if (level.getBlockState(pos) != Krasyrum.BLOCKMAP.get("darkwood_log").get().defaultBlockState()) {
            level.setBlock(pos, state, flag);
            return true;
        } else return false;
    }
}
