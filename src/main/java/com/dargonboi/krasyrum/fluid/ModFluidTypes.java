package com.dargonboi.krasyrum.fluid;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.util.fluid.BaseFluidType;
import com.mojang.math.Vector3f;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation BOILING_OVERLAY_RL = new ResourceLocation(Krasyrum.MODID, "misc/in_boiling_water");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, Krasyrum.MODID);

    public static final RegistryObject<FluidType> BOILING_WATER_FLUID_TYPE = register("boiling_water_fluid",
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).temperature(2).supportsBoating(true).canHydrate(true).canExtinguish(false));


    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, BOILING_OVERLAY_RL,
                0xA11d79db, new Vector3f(29f / 255f, 121f / 255f, 219f / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}