package com.dargonboi.krasyrum.fluid;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.block.ModBlocks;
import com.dargonboi.krasyrum.item.ModIngots;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, Krasyrum.MODID);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }    public static final RegistryObject<FlowingFluid> SOURCE_BOILING_WATER = FLUIDS.register("boiling_water_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.BOILING_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_BOILING_WATER = FLUIDS.register("flowing_boiling_water",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.BOILING_WATER_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties BOILING_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.BOILING_WATER_FLUID_TYPE, SOURCE_BOILING_WATER, FLOWING_BOILING_WATER)
            .slopeFindDistance(4)
            .levelDecreasePerBlock(1)
            .block(ModBlocks.BOILING_WATER_BLOCK)
            .bucket(ModIngots.BOILING_WATER_BUCKET)
            .explosionResistance(200f);



}