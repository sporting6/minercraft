package com.dargonboi.krasyrum.event;

import com.dargonboi.krasyrum.MinerCraft;
import com.dargonboi.krasyrum.recipe.InfusionChamberRecipe;
import com.dargonboi.krasyrum.screen.InfusionChamberMenu;
import com.dargonboi.krasyrum.world.OreGeneration;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = MinerCraft.MODID, bus = Bus.MOD)
public class CommonModEvents {
	
	 @SubscribeEvent
	    public static void commonSetup(FMLCommonSetupEvent event) {
	        event.enqueueWork(() -> {
	            OreGeneration.registerOres();
	        });
	        
	 }

	 @SubscribeEvent
	public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event){
		 Registry.register(Registry.RECIPE_TYPE, InfusionChamberRecipe.Type.ID, InfusionChamberRecipe.Type.INSTANCE);
	 }

}


