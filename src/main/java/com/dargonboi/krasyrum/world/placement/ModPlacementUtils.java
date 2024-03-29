package com.dargonboi.krasyrum.world.placement;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacementContext;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;

import java.util.stream.Stream;

public class ModPlacementUtils extends PlacementModifier {
    public static int RarePlacementFactor = 0;

    public ModPlacementUtils() {

    }

    public static PlacementModifier rarePlacement(int int1, float int2, int int3) {
        RarePlacementFactor++;
        if (RarePlacementFactor == 50) {
            RarePlacementFactor = 0;
            return new InSquarePlacement();
        } else return null;
    }

    @Override
    public Stream<BlockPos> getPositions(PlacementContext pContext, RandomSource pRandom, BlockPos pPos) {
        return null;
    }

    @Override
    public PlacementModifierType<?> type() {
        return null;
    }
}
