package com.sporting6.mc.client.render;

import com.sporting6.mc.Minercraft;
import com.sporting6.mc.client.model.WhiteTigerModel;
import com.sporting6.mc.entities.WhiteTigerEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class WhiteTigerRenderer extends MobRenderer<WhiteTigerEntity, WhiteTigerModel<WhiteTigerEntity>>{
	
	protected static final ResourceLocation TEXTURE = new ResourceLocation(Minercraft.MOD_ID, "textures/entity/w_tiger.png");

	public WhiteTigerRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new WhiteTigerModel<>(), 1.2f);
	}

	@Override
	public ResourceLocation getEntityTexture(WhiteTigerEntity entity) {
		return TEXTURE;
	}
	
	
	
}
