package com.dargonboi.mrc.core.init;

import com.dargonboi.mrc.MinerCraft;
import com.dargonboi.mrc.core.BaseArmorMaterial;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public final class ModArmorMaterial {
	
	public static final ArmorMaterial BLUE_NANITARIUM = new BaseArmorMaterial(17, new int[] {2700, 3100, 3600, 2900}, 
			new int[] {5, 8, 10, 4}, 0.3f, 5.0F, MinerCraft.MODID + ":blue_nanitarium", 
			SoundEvents.ARMOR_EQUIP_NETHERITE,() -> Ingredient.of(ModItems.BLUE_NANITARIUM_INGOT.get()));
	
	private ModArmorMaterial() {
		
	}
	
	
	

}
