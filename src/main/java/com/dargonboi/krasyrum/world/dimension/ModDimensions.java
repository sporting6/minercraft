package com.dargonboi.krasyrum.world.dimension;

import com.dargonboi.krasyrum.Krasyrum;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class ModDimensions {
    public static final ResourceKey<Level> KRASYRUM_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(Krasyrum.MODID, "krasyrum"));
    public static final ResourceKey<DimensionType> KRASYRUM_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, KRASYRUM_KEY.getRegistryName());

    public static void register() {
        System.out.println("Registering ModDimensions for " + Krasyrum.MODID);
    }
}
