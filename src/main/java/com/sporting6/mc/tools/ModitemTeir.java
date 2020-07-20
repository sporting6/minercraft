package com.sporting6.mc.tools;

import java.util.function.Supplier;

import com.sporting6.mc.util.RegistryHandler;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum ModitemTeir implements IItemTier{
	
	
	BLUE_NANITARIUM(5, 2000, 10.0f, 4.0f, 15, () -> {
		return Ingredient.fromItems(RegistryHandler.BLUE_NANITARIUM_INGOT.get());}),
	RED_NANITARIUM(5, 2000, 10.0f, 4.0f, 15, () -> {
		return Ingredient.fromItems(RegistryHandler.RED_NANITARIUM_INGOT.get());});
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final Supplier<Ingredient> rapairMaterial;
	
	
	ModitemTeir(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability,Supplier<Ingredient> rapairMaterial) 
	{
		
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.rapairMaterial = rapairMaterial;

		
	}
	

	@Override
	public int getMaxUses() {
		// TODO Auto-generated method stub
		return maxUses;
	}

	@Override
	public float getEfficiency() {
		// TODO Auto-generated method stub
		return efficiency;
	}

	@Override
	public float getAttackDamage() {
		// TODO Auto-generated method stub
		return attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		// TODO Auto-generated method stub
		return harvestLevel;
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		// TODO Auto-generated method stub
		return rapairMaterial.get();
	}
	
	

}
