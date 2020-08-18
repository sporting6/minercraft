package com.sporting6.mc.entities;

import com.sporting6.mc.init.ModEntityType;

import net.minecraft.block.BlockState;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.BreedGoal;
import net.minecraft.entity.ai.goal.FollowParentGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WhiteTigerEntity extends AnimalEntity {
	
	public static final Ingredient TEMTATION_ITEMS = 
			Ingredient.fromItems(Items.BEEF, Items.CHICKEN,Items.PORKCHOP,Items.MUTTON,Items.RABBIT);

	public WhiteTigerEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
		super(type, worldIn);
		// TODO Auto-generated constructor stub
	}
	
	
	public static AttributeModifierMap.MutableAttribute setCustomAttributes(){
		
		return MobEntity.func_233666_p_()
				.createMutableAttribute(Attributes.MAX_HEALTH, 50.0D)
				.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.35D);
	}
	
	@Override
	protected void registerGoals(){
		super.registerGoals();
		this.goalSelector.addGoal(0, new TemptGoal(this, 1.25D, TEMTATION_ITEMS, false));
		this.goalSelector.addGoal(1, new BreedGoal(this, 1.0D ));
		this.goalSelector.addGoal(2, new SwimGoal(this));
		this.goalSelector.addGoal(3, new FollowParentGoal(this, 1.25D ));
		this.goalSelector.addGoal(4, new PanicGoal(this, 1.75D));
		this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 1.0D ));
		this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 9.0f));
		this.goalSelector.addGoal(7, new LookRandomlyGoal(this));
	}
	@Override
	protected int getExperiencePoints(PlayerEntity player) {
		return 3 + this.world.rand.nextInt(7);
	}
	
	@Override
	protected SoundEvent getAmbientSound() {
		return null;
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_POLAR_BEAR_DEATH;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourseIn) {
		return SoundEvents.ENTITY_POLAR_BEAR_HURT;
	}
	
	@Override
	protected void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(SoundEvents.ENTITY_POLAR_BEAR_STEP, 0.0f, 0.0f);
	}
	
	@Override
	public AgeableEntity createChild(AgeableEntity ageable) {
		return ModEntityType.WHITE_TIGER.get().create(this.world );
	}

}
