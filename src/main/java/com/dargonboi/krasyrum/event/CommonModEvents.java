package com.dargonboi.krasyrum.event;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.recipe.CondenserRecipe;
import com.dargonboi.krasyrum.recipe.ForgeRecipe;
import com.dargonboi.krasyrum.recipe.InfusionChamberRecipe;
import com.dargonboi.krasyrum.recipe.StrainerRecipe;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Krasyrum.MODID, bus = Bus.MOD)
public class CommonModEvents {


	 @SubscribeEvent
	public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event){
		 Registry.register(Registry.RECIPE_TYPE, InfusionChamberRecipe.Type.ID, InfusionChamberRecipe.Type.INSTANCE);
		 Registry.register(Registry.RECIPE_TYPE, CondenserRecipe.Type.ID, CondenserRecipe.Type.INSTANCE);
		 Registry.register(Registry.RECIPE_TYPE, StrainerRecipe.Type.ID, StrainerRecipe.Type.INSTANCE);
		 Registry.register(Registry.RECIPE_TYPE, ForgeRecipe.Type.ID, ForgeRecipe.Type.INSTANCE);


	 }

}


