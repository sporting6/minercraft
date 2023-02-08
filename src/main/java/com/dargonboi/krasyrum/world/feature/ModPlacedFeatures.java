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
                () -> new PlacedFeature(CONFIGURED_ORE.getHolder().get(), ModOrePlacement.commonOrePlacement(veinsPerChunk,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(minY), VerticalAnchor.absolute(maxY)))));

        System.out.println("=====================================> Registering " + name);

        PLACEDOREMAP.put(name, ORE_PLACED);
    }
    
    public static void register(IEventBus eventBus) {
        placeOres("titanium_ore", ModConfiguredFeatures.OREMAP, 14, -64, 16);
        placeOres("blue_nanitarium_ore", ModConfiguredFeatures.OREMAP, 1, -64, -32);
        placeOres("red_nanitarium_ore", ModConfiguredFeatures.OREMAP, 2, 90, 125);
        placeOres("ruby_ore", ModConfiguredFeatures.OREMAP, 12, -64, 16);
        placeOres("veranium_ore", ModConfiguredFeatures.OREMAP, 4, 0, 75);
        placeOres("therium_ore", ModConfiguredFeatures.OREMAP, 4, 0, 75);
        
        PLACED_FEATURES.register(eventBus);
    }

}
