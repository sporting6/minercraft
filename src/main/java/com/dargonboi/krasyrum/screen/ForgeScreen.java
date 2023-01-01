package com.dargonboi.krasyrum.screen;

import com.dargonboi.krasyrum.Krasyrum;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Inventory;

public class ForgeScreen extends AbstractContainerScreen<ForgeMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Krasyrum.MODID, "textures/gui/forge.png");
    private static final ResourceLocation BUTTON_TEXTURE = new ResourceLocation(Krasyrum.MODID, "textures/gui/button/forge_button.png");
    private static int[] scores = {17, 16, 15, 14, 13, 12, 11, 10, 10, 9, 9, 8, 8, 8, 8, 7, 7, 6, 6, 5, 5, 4, 4, 3, 3, 2, 2, 1, 1, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -1, -5, -5, -5, -5, -5, -5, -5, -5, -5, -20};

    public ForgeScreen(ForgeMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
        inventoryLabelY = 102;
        titleLabelY = 8;
        imageHeight = 196;
        imageWidth = 176;
    }

    @Override
    protected void renderBg(PoseStack pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        this.blit(pPoseStack, x, y, 0, 0, imageWidth, imageHeight);

        if (menu.isCrafting()) {
            blit(pPoseStack, x + 69, y + 38, 176, 14, menu.getScaledProgress(), 17);
        }
    }

    @Override
    public void render(PoseStack pPoseStack, int mouseX, int mouseY, float delta) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, mouseX, mouseY, delta);
        renderTooltip(pPoseStack, mouseX, mouseY);
    }


}
