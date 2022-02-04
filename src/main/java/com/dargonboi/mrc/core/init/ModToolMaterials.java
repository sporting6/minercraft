package com.dargonboi.mrc.core.init;

import com.dargonboi.mrc.core.BaseToolMaterial;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public final class ModToolMaterials {
	
	
	protected static final Tier BLUE_NANITARIUM = new BaseToolMaterial
			(0f, 13, 6, 14f, 3420, () -> Ingredient.of(ModItems.BLUE_NANITARIUM_INGOT.get()));
	
	private ModToolMaterials() {
		
	}
	
	
	

}
