package com.sporting6.mc.init;

import com.sporting6.mc.Minercraft;
import com.sporting6.mc.entities.LionEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityType {
	
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,Minercraft.MOD_ID);
	
	//Entity Types
	
	public static final RegistryObject<EntityType<LionEntity>> LION = ENTITY_TYPES.register("lion", 
			() -> EntityType.Builder.create(LionEntity::new, EntityClassification.CREATURE)
			.size(2.0f, 2.0f)
			.build(new ResourceLocation(Minercraft.MOD_ID, "lion").toString())
			);
				

}
