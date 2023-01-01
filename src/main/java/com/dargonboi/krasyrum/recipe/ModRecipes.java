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

    public static final RegistryObject<RecipeSerializer<InfusionChamberRecipe>> INFUSING_SERIALIZER =
            SERIALIZERS.register("infusing", () -> InfusionChamberRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<CondenserRecipe>> CONDENSING_SERIALIZER =
            SERIALIZERS.register("condensing", () -> CondenserRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<StrainerRecipe>> STRAINER_SERIALIZER =
            SERIALIZERS.register("straining", () -> StrainerRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<ForgeRecipe>> FORGE_SERIALIZER =
            SERIALIZERS.register("forging", () -> ForgeRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
