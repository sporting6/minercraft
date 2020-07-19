package com.sporting6.mc.armor;

import java.util.function.Supplier;

import com.sporting6.mc.Minercraft;
import com.sporting6.mc.util.RegistryHandler;


import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.SoundEvent;


public enum ModArmorMaterial implements IArmorMaterial {
	
	NANITARIUM(Minercraft.MOD_ID + ":nanitarium", 40, new int[] { 3, 6, 8, 3 }, 20, 
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.5F, () -> { return Ingredient.fromItems
					(RegistryHandler.NANITARIUM_INGOT.get()); });

	private static final int[] MAX_DAMAGE_ARRAY = new int[] {11,16, 15, 13};
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantabilaty;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final Supplier<Ingredient> rapairMaterial;
	
	ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantabilaty,
			SoundEvent soundEvent, float toughness, Supplier<Ingredient> rapairMaterial ){
		this.name = name;
		this.maxDamageFactor = maxDamageFactor;
		this.damageReductionAmountArray = damageReductionAmountArray;
		this.enchantabilaty = enchantabilaty;
		this.soundEvent = soundEvent;
		this.toughness = toughness;
		this.rapairMaterial = rapairMaterial;
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
		return 0;
	}

	@Override
	public SoundEvent getSoundEvent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ingredient getRepairMaterial() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getToughness() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
