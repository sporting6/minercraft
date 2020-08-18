package com.sporting6.mc.client.render;

import com.sporting6.mc.Minercraft;
import com.sporting6.mc.client.model.TigerModel;
import com.sporting6.mc.entities.TigerEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class TigerRenderer extends MobRenderer<TigerEntity, TigerModel<TigerEntity>>{
	
	protected static final ResourceLocation TEXTURE = new ResourceLocation(Minercraft.MOD_ID, "textures/entity/tiger.png");

	public TigerRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new TigerModel<>(), 1.2f);
	}

	@Override
	public ResourceLocation getEntityTexture(TigerEntity entity) {
		return TEXTURE;
	}
	
	
	
}
