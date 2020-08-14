package com.sporting6.mc.items.food;

import com.sporting6.mc.Minercraft;

import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class RawLion extends Item{

	public RawLion() {
		super(new Item.Properties()
		.group(Minercraft.TAB)
		.food(new Food.Builder()
				.hunger(2)
				.saturation(1.0f)
				.build()));
	}

}
