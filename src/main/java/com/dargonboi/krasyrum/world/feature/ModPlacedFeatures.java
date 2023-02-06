package com.dargonboi.krasyrum.world.feature;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.world.feature.ore.ModOrePlacement;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;

public class ModPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Krasyrum.MODID);

    public static final HashMap<String, RegistryObject<PlacedFeature>> PLACEDOREMAP  = new HashMap<String, RegistryObject<PlacedFeature>>();
            
    private static void placeOres(String name, HashMap map, int veinsPerChunk, int minY, int maxY){
        final RegistryObject<ConfiguredFeature<?, ?>> CONFIGURED_ORE = ModConfiguredFeatures.OREMAP.get(name);

        final RegistryObject<PlacedFeature> ORE_PLACED = PLACED_FEATURES.register(name + "_placed",
                () -> new PlacedFeature(CONFIGURED_ORE.getHolder().get(), ModOrePlacement.rareOrePlacement(veinsPerChunk,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(minY), VerticalAnchor.absolute(maxY)))));

        System.out.println("=====================================> Registering " + name);

        PLACEDOREMAP.put(name, ORE_PLACED);
    }
            

    //Overworld Ores-------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<PlacedFeature> BLUE_NANITARIUM_ORE_PLACED = PLACED_FEATURES.register("blue_nanitarium_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.BLUE_NANITARIUM_ORE.getHolder().get(), ModOrePlacement.rareOrePlacement(1, //    Veins Per Chunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(32)))));

//    public static final RegistryObject<PlacedFeature> TITANIUM_ORE_PLACED = PLACED_FEATURES.register("titanium_ore_placed",
//            () -> new PlacedFeature(ModConfiguredFeatures.OREMAP.get("titanium_ore").getHolder().get(),
//                    ModOrePlacement.commonOrePlacement(14, //    Veins Per Chunk
//                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(72)))));

    public static final RegistryObject<PlacedFeature> RUBY_ORE_PLACED = PLACED_FEATURES.register("ruby_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.RUBY_ORE.getHolder().get(), ModOrePlacement.commonOrePlacement(12, //    Veins Per Chunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(72)))));
    //Nether Ores-------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static final RegistryObject<PlacedFeature> NETHER_RED_NANITARIUM_ORE_PLACED = PLACED_FEATURES.register("nether_red_nanitarium_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.RED_NANITARIUM_ORE.getHolder().get(), ModOrePlacement.commonOrePlacement(1, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(90), VerticalAnchor.top()))));
    //End Ores-------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<PlacedFeature> THERIUM_ORE_PLACED = PLACED_FEATURES.register("veranium_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.THERIUM_ORE.getHolder().get(), ModOrePlacement.rareOrePlacement(7, //    Veins Per Chunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(100)))));

    public static final RegistryObject<PlacedFeature> VERANIUM_ORE_PLACED = PLACED_FEATURES.register("therium_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.VERANIUM_ORE.getHolder().get(), ModOrePlacement.rareOrePlacement(5, //    Veins Per Chunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(75)))));

    public static void register(IEventBus eventBus) {
        placeOres("titanium_ore", ModConfiguredFeatures.OREMAP, 14, -64, 16);

        PLACED_FEATURES.register(eventBus);
    }

}
