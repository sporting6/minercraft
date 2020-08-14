package com.sporting6.mc.items.food;

import com.sporting6.mc.Minercraft;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class SlimeApple extends Item{

	public SlimeApple() {
		super(new Item.Properties()
		.group(Minercraft.TAB)
		.food(new Food.Builder()
		.hunger(2)
		.saturation(1.2f)
		.effect(new EffectInstance(Effects.JUMP_BOOST, 1200, 9),0.99f)
		.effect(new EffectInstance(Effects.SPEED, 1200, 4),0.99f)
		.fastToEat()
		.setAlwaysEdible()
		.build())
		
		
		
		
		);
	}
	
	

}
