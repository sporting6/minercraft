package com.sporting6.mc.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.sporting6.mc.entities.LionEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class LionModel<T extends LionEntity> extends EntityModel<T> {
	
	private final ModelRenderer legRightBack;
	private final ModelRenderer legLeftBack;
	private final ModelRenderer legRightFront;
	private final ModelRenderer legLeftFront;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer tail;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;


	public LionModel() {
		textureWidth = 256;
		textureHeight = 256;

		legRightBack = new ModelRenderer(this);
		legRightBack.setRotationPoint(2.0F, 11.0F, -2.0F);
		legRightBack.setTextureOffset(0, 83).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		legLeftBack = new ModelRenderer(this);
		legLeftBack.setRotationPoint(-11.0F, 11.0F, -2.0F);
		legLeftBack.setTextureOffset(16, 83).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		legRightFront = new ModelRenderer(this);
		legRightFront.setRotationPoint(2.0F, 11.0F, 29.0F);
		legRightFront.setTextureOffset(44, 96).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		legLeftFront = new ModelRenderer(this);
		legLeftFront.setRotationPoint(-11.0F, 11.0F, 29.0F);
		legLeftFront.setTextureOffset(32, 83).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(-5.0F, 4.5F, 13.5F);
		body.setTextureOffset(0, 0).addBox(-10.0F, -6.5F, -21.5F, 20.0F, 13.0F, 43.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(-5.0F, -1.0F, -2.0F);
		head.setTextureOffset(53, 68).addBox(-8.0F, -7.0F, -21.0F, 16.0F, 13.0F, 15.0F, 0.0F, false);
		head.setTextureOffset(22, 22).addBox(-4.0F, 0.0F, -23.0F, 8.0F, 5.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(83, 0).addBox(-9.0F, -9.0F, -15.0F, 18.0F, 15.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 56).addBox(-11.0F, -9.0F, -12.0F, 22.0F, 15.0F, 12.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-5.0F, 8.0F, -15.0F, 10.0F, 3.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(108, 64).addBox(-9.0F, 6.0F, -15.0F, 18.0F, 2.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(0, 21).addBox(-2.0F, 1.0F, -24.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(-5.0F, 6.0F, 34.0F);
		setRotationAngle(tail, -0.0436F, 0.0F, 0.0F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(4.0F, 0.0F, -1.0F);
		tail.addChild(bone);
		setRotationAngle(bone, -0.1745F, 0.0F, 0.0F);
		bone.setTextureOffset(0, 21).addBox(-6.0F, -3.0F, 0.0F, 4.0F, 3.0F, 14.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(4.0F, 2.0F, 13.0F);
		tail.addChild(bone2);
		setRotationAngle(bone2, 0.3054F, 0.0F, 0.0F);
		bone2.setTextureOffset(56, 56).addBox(-6.0F, -3.0F, 0.0F, 4.0F, 3.0F, 9.0F, 0.0F, false);
	}

	

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		legRightBack.render(matrixStack, buffer, packedLight, packedOverlay);
		legLeftBack.render(matrixStack, buffer, packedLight, packedOverlay);
		legRightFront.render(matrixStack, buffer, packedLight, packedOverlay);
		legLeftFront.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		  this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
	      this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
	      this.body.rotateAngleY = ((float)Math.PI / 1F);
	      this.legRightBack.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	      this.legLeftBack.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	      this.legRightFront.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	      this.legLeftFront.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount; 
	}
	

	
}


