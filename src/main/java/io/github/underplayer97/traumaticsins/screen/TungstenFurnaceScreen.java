package io.github.underplayer97.traumaticsins.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

//public class TungstenFurnaceScreen extends HandledScreen<TungstenFurnaceScreenHandler> {
//
//    private static final Identifier TEXTURE = new Identifier("textures/gui/container/furnace.png");
//
//    public TungstenFurnaceScreen(TungstenFurnaceScreenHandler handler, PlayerInventory inventory, Text title) {
//        super(handler, inventory, title);
//    }
//
//    @Override
//    protected void init() {
//        super.init();
//        this.titleX = (this.backgroundWidth - this.textRenderer.getWidth(this.title)) / 2;
//    }
//
//    @Override
//    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
//        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
//        RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
//        RenderSystem.setShaderTexture(0, TEXTURE);
//        int x = (width - backgroundWidth) / 2;
//        int y = (height - backgroundHeight) / 2;
//
//        context.drawTexture(TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight);
//
//    }
//}
