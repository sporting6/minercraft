package com.dargonboi.krasyrum.recipe;

import com.dargonboi.krasyrum.Krasyrum;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {


    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Krasyrum.MODID);

    public static final RegistryObject<RecipeSerializer<InfusionChamberRecipe>> INFUSION_CHAMBER_SERIALIZER =
            SERIALIZERS.register("infusing", () -> InfusionChamberRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
