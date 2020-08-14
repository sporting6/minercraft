package com.sporting6.mc.items.food;

import com.sporting6.mc.Minercraft;

import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class CookedLion extends Item{

	public CookedLion() {
		super(new Item.Properties()
		.group(Minercraft.TAB)
		.food(new Food.Builder()
				.hunger(7)
				.saturation(2.0f)
				.build()));
				}

}
