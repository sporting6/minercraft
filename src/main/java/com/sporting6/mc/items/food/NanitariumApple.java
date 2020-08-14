package com.sporting6.mc.items.food;

import com.sporting6.mc.Minercraft;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class NanitariumApple extends Item{

	public NanitariumApple() {
		super(new Item.Properties()
		.group(Minercraft.TAB)
		.food(new Food.Builder()
				.hunger(2)
				.saturation(1.2f)
				.effect(new EffectInstance(Effects.RESISTANCE, 12000, 4),0.99f)
				.effect(new EffectInstance(Effects.FIRE_RESISTANCE, 12000, 1),0.99f)
				.effect(new EffectInstance(Effects.REGENERATION, 1200, 10),0.99f)
				.effect(new EffectInstance(Effects.ABSORPTION, 2400, 4),0.99f)
				.effect(new EffectInstance(Effects.HASTE, 600, 5),0.99f)
				.effect(new EffectInstance(Effects.STRENGTH, 600, 5),0.99f)
				.effect(new EffectInstance(Effects.INVISIBILITY, 300, 4),0.99f)
				.effect(new EffectInstance(Effects.JUMP_BOOST, 600, 2),0.99f)
				.effect(new EffectInstance(Effects.SPEED, 600, 3),0.99f)
				.effect(new EffectInstance(Effects.NIGHT_VISION, 12000, 1),0.99f)
				.effect(new EffectInstance(Effects.WATER_BREATHING, 2400, 4),0.99f)
				.fastToEat()
				.setAlwaysEdible()
				.build())
		
		
		
		
		);
	}
	
	

}
