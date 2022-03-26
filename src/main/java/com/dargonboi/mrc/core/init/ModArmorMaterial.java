package com.dargonboi.mrc.core.init;

import com.dargonboi.mrc.MinerCraft;
import com.dargonboi.mrc.core.BaseArmorMaterial;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public final class ModArmorMaterial {
	
	
	public static final ArmorMaterial KYRANIUM = new BaseArmorMaterial(27, new int[] {3300, 3700, 4000, 3500}, 
			new int[] {8, 12, 14, 7}, 0.5f, 7.0F, MinerCraft.MODID + ":kyranium", 
			SoundEvents.ARMOR_EQUIP_NETHERITE,() -> Ingredient.of(ModItems.KYRANIUM_INGOT.get()));
	
	public static final ArmorMaterial BLUE_NANITARIUM = new BaseArmorMaterial(17, new int[] {1900, 2300, 2600, 2000}, 
			new int[] {3, 7, 8, 4}, 0.1f, 2.0F, MinerCraft.MODID + ":blue_nanitarium", 
			SoundEvents.ARMOR_EQUIP_NETHERITE,() -> Ingredient.of(ModItems.BLUE_NANITARIUM_INGOT.get()));
	
	public static final ArmorMaterial RED_NANITARIUM = new BaseArmorMaterial(24, new int[] {2200, 2600, 2950, 2300}, 
			new int[] {4, 8, 9, 5}, 0.2f, 4.0F, MinerCraft.MODID + ":red_nanitarium", 
			SoundEvents.ARMOR_EQUIP_NETHERITE,() -> Ingredient.of(ModItems.RED_NANITARIUM_INGOT.get()));
	
	public static final ArmorMaterial TITANIUM = new BaseArmorMaterial(12, new int[] {512, 512, 512, 512}, 
			new int[] {3, 7, 5, 2}, 0.0f, 0.0F, MinerCraft.MODID + ":titanium", 
			SoundEvents.ARMOR_EQUIP_IRON,() -> Ingredient.of(ModItems.TITANIUM_INGOT.get()));
	
	public static final ArmorMaterial RUBY = new BaseArmorMaterial(18, new int[] {700, 700, 700, 700}, 
			new int[] {3, 7, 6, 2}, 0.0f, 0.0F, MinerCraft.MODID + ":ruby", 
			SoundEvents.ARMOR_EQUIP_IRON,() -> Ingredient.of(ModItems.RUBY.get()));
	
	private ModArmorMaterial() {
		
	}
	
	
	

}
