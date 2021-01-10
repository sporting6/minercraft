package com.sporting6.mc.util.enums;

import java.util.function.Supplier;

import com.sporting6.mc.Minercraft;
import com.sporting6.mc.init.ModItems;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public enum ModArmorMaterial implements IArmorMaterial {

	RED_NANITARIUM(Minercraft.MOD_ID + ":red_nanitarium", 45, new int[] { 3, 6, 8, 3 }, 21, 
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.5F, 2.0f,() -> Ingredient.fromItems
					(ModItems.RED_NANITARIUM_INGOT.get())),	
	RUBY(Minercraft.MOD_ID + ":ruby", 45, new int[] { 2, 4, 6, 2 }, 21, 
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f,0.0f, () -> Ingredient.fromItems
					(ModItems.RUBY.get())),	
	COPPER(Minercraft.MOD_ID + ":copper", 20, new int[] { 2, 3, 6, 2 }, 25, 
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f,0.0f, () -> Ingredient.fromItems
					(ModItems.COPPER_INGOT.get())),	
	TIN(Minercraft.MOD_ID + ":tin", 15, new int[] { 2, 3, 5, 1 }, 18, 
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f,0.0f, () -> Ingredient.fromItems
					(ModItems.TIN_INGOT.get())),	
	BRONZE(Minercraft.MOD_ID + ":bronze", 17, new int[] { 3, 4, 6, 2 }, 23, 
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f,0.0f, () -> Ingredient.fromItems
					(ModItems.BRONZE_INGOT.get())),	
	TUNGSTEN(Minercraft.MOD_ID + ":tungsten", 25, new int[] { 3, 5, 6, 2 }, 21, 
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5f,0.0f, () -> Ingredient.fromItems
					(ModItems.TUNGSTEN_INGOT.get())),	
	TITANIUM(Minercraft.MOD_ID + ":titanium", 30, new int[] { 3, 4, 6, 2 }, 22, 
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5f,0.0f, () -> Ingredient.fromItems
					(ModItems.TITANIUM_INGOT.get())),	
	OBSIDIAN(Minercraft.MOD_ID + ":obsidian", 35, new int[] { 2, 4, 5, 2 }, 22, 
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1.0f, 1.0f,() -> Ingredient.fromItems
					(ModItems.OBSIDIAN_INGOT.get())),	
	BLUE_NANITARIUM(Minercraft.MOD_ID + ":blue_nanitarium", 40, new int[] { 3, 6, 8, 3 }, 22, 
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.5F, 1.0f,() -> Ingredient.fromItems
					(ModItems.BLUE_NANITARIUM_INGOT.get()));


	private static final int[] MAX_DAMAGE_ARRAY = new int[] {11, 17, 16, 13};
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantabilaty;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final Supplier<Ingredient> repairMaterial;
	private final float knockbackResistance;
	
	ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantabilaty,
			SoundEvent soundEvent, float toughness, float knockbackResistance,Supplier<Ingredient> repairMaterial ){
		this.name = name;
		this.maxDamageFactor = maxDamageFactor;
		this.damageReductionAmountArray = damageReductionAmountArray;
		this.enchantabilaty = enchantabilaty;
		this.soundEvent = soundEvent;
		this.toughness = toughness;
		this.repairMaterial = repairMaterial;
		this.knockbackResistance = knockbackResistance;
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


	@Override
	public  float getKnockbackResistance(){
		return this.knockbackResistance;
	}
	
	

}
