 package com.sporting6.minercraft.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
 
public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModItems.TUNGSTEN_INGOT, new ItemStack(ModBlocks.TUNGSTEN_BLOCK, 1), 1.5f);
	}

}
