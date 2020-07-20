package com.sporting6.mc.armor;

import java.util.function.Supplier;

import com.sporting6.mc.Minercraft;
import com.sporting6.mc.util.RegistryHandler;


import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.SoundEvent;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public enum ModArmorMaterial implements IArmorMaterial {

	RED_NANITARIUM(Minercraft.MOD_ID + ":red_nanitarium", 40, new int[] { 3, 6, 8, 3 }, 20, 
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.5F, () -> Ingredient.fromItems
					(RegistryHandler.RED_NANITARIUM_INGOT.get())),	
	BLUE_NANITARIUM(Minercraft.MOD_ID + ":blue_nanitarium", 40, new int[] { 3, 6, 8, 3 }, 20, 
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.5F, () -> Ingredient.fromItems
					(RegistryHandler.BLUE_NANITARIUM_INGOT.get()));


	private static final int[] MAX_DAMAGE_ARRAY = new int[] {11,16, 15, 13};
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantabilaty;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final Supplier<Ingredient> repairMaterial;
	
	ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantabilaty,
			SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial ){
		this.name = name;
		this.maxDamageFactor = maxDamageFactor;
		this.damageReductionAmountArray = damageReductionAmountArray;
		this.enchantabilaty = enchantabilaty;
		this.soundEvent = soundEvent;
		this.toughness = toughness;
		this.repairMaterial = repairMaterial;
	}
	

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		// TODO Auto-generated method stub
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		// TODO Auto-generated method stub
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return this.enchantabilaty;
	}

	@Override
	public SoundEvent getSoundEvent() {
		// TODO Auto-generated method stub
		return this.soundEvent;
	}

	@Override
	public Ingredient getRepairMaterial() {
		// TODO Auto-generated method stub
		return this.repairMaterial.get();
	}
	
	@OnlyIn(Dist.CLIENT)
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public float getToughness() {
		// TODO Auto-generated method stub
		return this.toughness;
	}
	
	

}
