package com.dargonboi.mrc.core.init;

import java.util.List;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;




public final class ModToolMaterials {
	
	//For MultiTools
	//public static final Tag.Named<Block> MY_TOOL_TAG = BlockTags.createOptional(new ResourceLocation("tag_based_tool_types:minable/my_tool"));
    
	
	public static final Tag.Named<Block> BLUE_NANITARIUM_TAG = BlockTags.createOptional(new ResourceLocation("mrc:needs_blue_nanitarium_tool"));
	public static final Tier BLUE_NANITARIUM = TierSortingRegistry.registerTier(
			new ForgeTier(6 ,3420, 16f, 0, 16, BLUE_NANITARIUM_TAG,() -> Ingredient.of(ModItems.BLUE_NANITARIUM_INGOT.get())),
			new ResourceLocation("mrc:blue_nanitarium"),
			List.of(Tiers.NETHERITE), List.of());
	

    
	private ModToolMaterials() {
		
	}
	
	
	

}
