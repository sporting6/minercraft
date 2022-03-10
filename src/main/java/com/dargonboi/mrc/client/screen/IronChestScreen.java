package com.dargonboi.mrc.client.screen;

import com.dargonboi.mrc.MinerCraft;
import com.dargonboi.mrc.common.container.IronChestContainer;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class IronChestScreen extends AbstractContainerScreen<IronChestContainer> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(MinerCraft.MODID,
			"textures/gui/iron_chest.png");

	public IronChestScreen(IronChestContainer container, Inventory playerInv, Component title) {
		super(container, playerInv, title);
		this.leftPos = 0;
		this.topPos = 0;
		this.imageWidth = 176;
		this.imageHeight = 222;
	}

	@Override
	protected void renderBg(PoseStack stack, float mouseX, int mouseY, int partialTicks) {
        renderBackground(stack); 
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
		RenderSystem.setShaderTexture(0, TEXTURE);
		blit(stack, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight);
	}

	@Override
	public void render(PoseStack stack, int mouseX, int mouseY, float partialTicks) {
		super.render(stack, mouseX, mouseY, partialTicks);
		this.font.draw(stack, this.title, this.leftPos + 8, this.topPos + 6, 0x404040);
		this.font.draw(stack, this.playerInventoryTitle, this.leftPos + 8, this.topPos + 128, 0x404040);
	}
	
	@Override
	protected void renderLabels(PoseStack p_97808_, int p_97809_, int p_97810_) {
	}
}
