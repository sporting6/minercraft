package com.dargonboi.krasyrum.world.feature;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.world.feature.ore.ModOrePlacement;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;

public class ModPlacedFeatures {


    public static void placeOres(String name, HashMap<String, RegistryObject<ConfiguredFeature<?, ?>>> map, int veinsPerChunk, int minY, int maxY) {
        final RegistryObject<ConfiguredFeature<?, ?>> CONFIGURED_ORE = map.get(name);

        final RegistryObject<PlacedFeature> ORE_PLACED = Krasyrum.PLACED_FEATURES.register(name + "_placed",
                () -> new PlacedFeature(CONFIGURED_ORE.getHolder().get(), ModOrePlacement.commonOrePlacement(veinsPerChunk,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(minY), VerticalAnchor.absolute(maxY)))));

        Krasyrum.PLACEDOREMAP.put(name, ORE_PLACED);
    }
}
