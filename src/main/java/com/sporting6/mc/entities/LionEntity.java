package com.sporting6.mc.entities;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.World;

public class LionEntity extends AnimalEntity{

	public LionEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
		super(type, worldIn);
		// TODO Auto-generated constructor stub
	}
	
	
	public static AttributeModifierMap.MutableAttribute setCustomAttributes(){
		
		return MobEntity.func_233666_p_()
				.createMutableAttribute(Attributes.MAX_HEALTH, 40.0D)
				.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.75D);
	}
	
	@Override
	protected void registerGoals(){
		super.registerGoals();
		this.goalSelector.addGoal(3, new SwimGoal(this));
	}
	
	
	@Override
	public AgeableEntity createChild(AgeableEntity ageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
