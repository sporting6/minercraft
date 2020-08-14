package com.sporting6.mc.client.render;

import com.sporting6.mc.Minercraft;
import com.sporting6.mc.client.model.LionModel;
import com.sporting6.mc.entities.LionEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class LionRenderer extends MobRenderer<LionEntity, LionModel<LionEntity>>{
	
	protected static final ResourceLocation TEXTURE = new ResourceLocation(Minercraft.MOD_ID, "textures/entity/lion.png");

	public LionRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new LionModel<>(), 1.2f);
	}

	@Override
	public ResourceLocation getEntityTexture(LionEntity entity) {
		return TEXTURE;
	}
	
	
	
}
