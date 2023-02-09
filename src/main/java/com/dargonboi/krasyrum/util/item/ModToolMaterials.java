package com.dargonboi.krasyrum.util.item;

import com.dargonboi.krasyrum.item.ModIngots;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;


public final class ModToolMaterials {
	
	//For MultiTools

	
	public static final Tier BLUE_NANITARIUM = TierSortingRegistry.registerTier(
			new ForgeTier(5 ,2670, 10f, 0, 16, ModTags.BLUE_NANITARIUM_TAG,() -> Ingredient.of(ModIngots.INGOTMAP.get("kyranium_ingot").get())),
			new ResourceLocation("krasyrum:blue_nanitarium"),
			List.of(Tiers.NETHERITE), List.of());
	
	public static final Tier KYRANIUM = TierSortingRegistry.registerTier(
			new ForgeTier(6 ,4200, 33f, 4, 26, ModTags.KYRANIUM_TAG,() -> Ingredient.of(ModIngots.INGOTMAP.get("blue_nanitarium_ingot").get())),
			new ResourceLocation("krasyrum:kyranium"),
			List.of(BLUE_NANITARIUM), List.of());
	
	
	public static final Tier RED_NANITARIUM = TierSortingRegistry.registerTier(
			new ForgeTier(5 ,2100, 8f, 0, 19, ModTags.RED_NANITARIUM_TAG,() -> Ingredient.of(ModIngots.INGOTMAP.get("red_nanitarium_ingot").get())),
			new ResourceLocation("krasyrum:red_nanitarium"),
			List.of(Tiers.NETHERITE), List.of(BLUE_NANITARIUM));
	
	
	public static final Tier VERANIUM = TierSortingRegistry.registerTier(
			new ForgeTier(3 ,1869, 100f, 0, 27, ModTags.VERANIUM_TAG,() -> Ingredient.of(ModIngots.INGOTMAP.get("veranium_ingot").get())),
			new ResourceLocation("krasyrum:veranium"),
			List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
	
	public static final Tier TITANIUM = TierSortingRegistry.registerTier(
			new ForgeTier(2 ,500, 7.5f, 0, 12,ModTags.TITANIUM_TAG,() -> Ingredient.of(ModIngots.INGOTMAP.get("titanium_ingot").get())),
			new ResourceLocation("krasyrum:titanium"),
			List.of(Tiers.IRON), List.of(VERANIUM));
	
	public static final Tier RUBY = TierSortingRegistry.registerTier(
			new ForgeTier(2 ,700, 10f, 0, 18,ModTags.RUBY_TAG,() -> Ingredient.of(ModIngots.INGOTMAP.get("ruby").get())),
			new ResourceLocation("krasyrum:ruby"),
			List.of(Tiers.IRON), List.of(TITANIUM));
	
	
	
	


    
	public ModToolMaterials() {
		
	}
	
	
	

}
