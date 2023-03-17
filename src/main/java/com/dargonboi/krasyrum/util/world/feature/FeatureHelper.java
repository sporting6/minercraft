package com.dargonboi.krasyrum.util.world.feature;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class FeatureHelper {


    public static void circle(BlockPos origin, Block block, int radius, WorldGenLevel level) {
        ellipse(origin, block, radius, radius, level);
    }

    public static void filledEllipse(BlockPos origin, Block block, double a, double b, WorldGenLevel level) {
        level.setBlock(origin, block.defaultBlockState(), 2);
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                ellipse(origin, block, i, j, level);
            }
        }
    }

    public static void filledNoOverhangEllipse(BlockPos origin, Block block, double a, double b, WorldGenLevel level) {
        BlockState originalBlock = level.getBlockState(origin);
        if (!blockCheck(origin, level, 1, Blocks.AIR.defaultBlockState())
                && !blockCheck(origin, level, 1, Blocks.CAVE_AIR.defaultBlockState())
                && !blockCheck(origin, level, 1, Blocks.WATER.defaultBlockState())
                && !blockCheck(origin, level, 1, ModBlocks.BOILING_WATER_BLOCK.get().defaultBlockState())) {
            level.setBlock(origin, block.defaultBlockState(), 2);
        }
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                noOverhangEllipse(origin, block, i, j, level);
            }
        }
        noOverhangEllipse(origin, originalBlock.getBlock(), a + 1, b + 1, level);
    }


    public static void noOverhangEllipse(BlockPos origin, Block block, double a, double b, WorldGenLevel level) {
        for (double x = 0 - a; x <= a; x = x + 0.25) {
            double y = (b / a) * Math.sqrt((a * a) - (x * x));

            BlockPos pos = origin.east((int) x).north((int) y);
            if (!blockCheck(pos, level, 1, Blocks.AIR.defaultBlockState())
                    && !blockCheck(pos, level, 1, Blocks.CAVE_AIR.defaultBlockState())
                    && !blockCheck(pos, level, 1, Blocks.WATER.defaultBlockState())
                    && !blockCheck(pos, level, 1, ModBlocks.BOILING_WATER_BLOCK.get().defaultBlockState())) {
                level.setBlock(pos, block.defaultBlockState(), 2);
            }

            pos = origin.west((int) x).south((int) y);
            if (!blockCheck(pos, level, 1, Blocks.AIR.defaultBlockState())
                    && !blockCheck(pos, level, 1, Blocks.CAVE_AIR.defaultBlockState())
                    && !blockCheck(pos, level, 1, Blocks.WATER.defaultBlockState())
                    && !blockCheck(pos, level, 1, ModBlocks.BOILING_WATER_BLOCK.get().defaultBlockState())) {
                level.setBlock(pos, block.defaultBlockState(), 2);
            }
        }
    }

    public static void blockCheckEllipse(BlockPos origin, Block block, double a, double b, WorldGenLevel level, Block blockToCheck) {
        BlockState originalBlock = level.getBlockState(origin);
        for (double x = 0 - a; x <= a; x = x + 0.25) {
            double y = (b / a) * Math.sqrt((a * a) - (x * x));
            if(level.getBlockState(origin.east((int) x).north((int) y)) == block.defaultBlockState())
                level.setBlock(origin.east((int) x).north((int) y), block.defaultBlockState(), 2);
            if(level.getBlockState(origin.east((int) x).north((int) y)) == block.defaultBlockState())
                level.setBlock(origin.west((int) x).south((int) y), block.defaultBlockState(), 2);
        }
        level.setBlock(origin.west((int) a), originalBlock, 2);
        level.setBlock(origin.east((int) a), originalBlock, 2);
        level.setBlock(origin.north((int) b), originalBlock, 2);
        level.setBlock(origin.south((int) b), originalBlock, 2);
    }

    public static void blockCheckFilledEllipse(BlockPos origin, Block block, double a, double b, WorldGenLevel level, Block blockToCheck){
        BlockState originalBlock = level.getBlockState(origin);
        level.setBlock(origin, block.defaultBlockState(), 2);
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                blockCheckEllipse(origin, block, i, j, level, blockToCheck);
            }
        }
        blockCheckEllipse(origin, originalBlock.getBlock(), a + 1, b + 1, level, blockToCheck);
    }

    public static void ellipse(BlockPos origin, Block block, double a, double b, WorldGenLevel level) {
        BlockState originalBlock = level.getBlockState(origin);
        for (double x = 0 - a; x <= a; x = x + 0.25) {
            double y = (b / a) * Math.sqrt((a * a) - (x * x));
//            System.out.println("X = " + x + ", Y = " + y);
            level.setBlock(origin.east((int) x).north((int) y), block.defaultBlockState(), 2);
            level.setBlock(origin.west((int) x).south((int) y), block.defaultBlockState(), 2);
        }
        level.setBlock(origin.west((int) a), originalBlock, 2);
        level.setBlock(origin.east((int) a), originalBlock, 2);
        level.setBlock(origin.north((int) b), originalBlock, 2);
        level.setBlock(origin.south((int) b), originalBlock, 2);
    }

    public static boolean blockCheck(BlockPos pos, WorldGenLevel level, int radius, BlockState blockState) {
        BlockPos origin = pos.west(radius).north(radius);
        ;
//        System.out.println("Checking For " + blockState + " In a Radius of " + radius);
        for (int i = 0; i <= radius * 2; i++) {
            for (int j = 0; j <= radius * 2; j++) {
                if (level.getBlockState(origin.south(i).east(j)) == blockState) {
                    return true;
                }
            }
        }
        return false;
    }
}