 package com.sporting6.minercraft.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
 
public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.TUNGSTEN_ORE, new ItemStack(ModItems.TUNGSTEN_INGOT, 1), 2.0f);
		GameRegistry.addSmelting(ModBlocks.COPPER_ORE, new ItemStack(ModItems.COPPER_INGOT, 1), 1.0f);
		GameRegistry.addSmelting(Blocks.OBSIDIAN , new ItemStack(ModItems.OBSIDIAN_SHARD, 2), 2.5f);
		GameRegistry.addSmelting(ModBlocks.TIN_ORE, new ItemStack(ModItems.TIN_INGOT, 1), 1.0f);
		GameRegistry.addSmelting(ModBlocks.RUBY_ORE, new ItemStack(ModItems.RUBY, 1), 2.0f);
		GameRegistry.addSmelting(ModBlocks.TITANIUM_ORE, new ItemStack(ModItems.TITANIUM_INGOT, 1), 2.0f);
		GameRegistry.addSmelting(ModBlocks.NANITERIUM_ORE, new ItemStack(ModItems.NANITERIUM_INGOT, 1), 3.5f);





		
	}

}
