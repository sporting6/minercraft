package com.dargonboi.krasyrum.screen;

import com.dargonboi.krasyrum.MinerCraft;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class InfusionChamberScreen extends AbstractContainerScreen<InfusionChamberMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(MinerCraft.MODID, "textures/gui/infusion_chamber.png");

    public InfusionChamberScreen(InfusionChamberMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
        inventoryLabelY = 102;
        titleLabelY = 8;
        imageHeight = 196; imageWidth = 176;
    }

    @Override
    protected void renderBg(PoseStack pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        this.blit(pPoseStack, x, y, 0, 0, imageWidth, imageHeight);

        if(menu.isCrafting()){
            blit(pPoseStack, x + 58, y + 61, 176, 0, menu.getScaledProgress(), 11 );
            blit(pPoseStack,x+79,y+72, 176, 11, 15, 14);
        }
    }

    @Override
    public void render(PoseStack pPoseStack, int mouseX, int mouseY, float delta) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, mouseX, mouseY, delta);
        renderTooltip(pPoseStack, mouseX, mouseY);
    }
}
