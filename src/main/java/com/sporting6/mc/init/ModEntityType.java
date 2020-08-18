package com.sporting6.mc.init;

import com.sporting6.mc.Minercraft;
import com.sporting6.mc.entities.LionEntity;
import com.sporting6.mc.entities.TigerEntity;
import com.sporting6.mc.entities.WhiteTigerEntity;

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
			.size(2.5f, 2.5f)
			.build(new ResourceLocation(Minercraft.MOD_ID, "lion").toString())
			);
	
	public static final RegistryObject<EntityType<TigerEntity>> TIGER = ENTITY_TYPES.register("tiger", 
			() -> EntityType.Builder.create(TigerEntity::new, EntityClassification.CREATURE)
			.size(2.0f, 3.0f)
			.build(new ResourceLocation(Minercraft.MOD_ID, "tiger").toString())
			);
	public static final RegistryObject<EntityType<WhiteTigerEntity>> WHITE_TIGER = ENTITY_TYPES.register("w_tiger", 
			() -> EntityType.Builder.create(WhiteTigerEntity::new, EntityClassification.CREATURE)
			.size(2.0f, 3.0f)
			.build(new ResourceLocation(Minercraft.MOD_ID, "w_tiger").toString())
			);
				

}
