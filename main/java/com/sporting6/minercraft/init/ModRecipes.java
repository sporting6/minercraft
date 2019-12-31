 package com.sporting6.minercraft.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
 
public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.TUNGSTEN_ORE, new ItemStack(ModItems.TUNGSTEN_INGOT, 1), 1.5f);
	}

}
