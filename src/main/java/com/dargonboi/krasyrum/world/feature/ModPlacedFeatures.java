package com.dargonboi.krasyrum.world.feature;

import com.dargonboi.krasyrum.world.feature.ore.ModOrePlacement;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {

    //Overworld Ores-------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static final Holder<PlacedFeature> BLUE_NANITARIUM_ORE_PLACED = PlacementUtils.register("blue_nanitarium_ore_placed",
            ModConfiguredFeatures.BLUE_NANITARIUM_ORE, ModOrePlacement.rareOrePlacement(1, //    Viens Per Chunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(32))));

    public static final Holder<PlacedFeature> TITANIUM_ORE_PLACED = PlacementUtils.register("titanium_ore_placed",
            ModConfiguredFeatures.TITANIUM_ORE, ModOrePlacement.commonOrePlacement(14, //    Viens Per Chunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(72))));

    public static final Holder<PlacedFeature> RUBY_ORE_PLACED = PlacementUtils.register("ruby_ore_placed",
            ModConfiguredFeatures.RUBY_ORE, ModOrePlacement.commonOrePlacement(12, //    Viens Per Chunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(72))));
    //Nether Ores-------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static final Holder<PlacedFeature> NETHER_RED_NANITARIUM_ORE_PLACED = PlacementUtils.register("nether_red_nanitarium_ore_placed",
            ModConfiguredFeatures.RED_NANITARIUM_ORE, ModOrePlacement.commonOrePlacement(1, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(90), VerticalAnchor.top())));
    //End Ores-------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static final Holder<PlacedFeature> THERIUM_ORE_PLACED = PlacementUtils.register("veranium_ore_placed",
            ModConfiguredFeatures.THERIUM_ORE, ModOrePlacement.rareOrePlacement(7, //    Viens Per Chunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(100))));

    public static final Holder<PlacedFeature> VERANIUM_ORE_PLACED = PlacementUtils.register("therium_ore_placed",
            ModConfiguredFeatures.VERANIUM_ORE, ModOrePlacement.rareOrePlacement(5, //    Viens Per Chunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(75))));


    public static final Holder<PlacedFeature> LEMON_PLACED = PlacementUtils.register("lemon_placed",
            ModConfiguredFeatures.LEMON_SPAWN, RarityFilter.onAverageOnceEvery(300), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());


}
