package io.github.underplayer97.traumaticsins.client.render.entity;

import io.github.underplayer97.traumaticsins.SinsMain;
import io.github.underplayer97.traumaticsins.entity.SphereEntity;
import net.minecraft.client.render.*;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import team.lodestar.lodestone.systems.rendering.LodestoneRenderType;
import team.lodestar.lodestone.systems.rendering.VFXBuilders;
import team.lodestar.lodestone.systems.rendering.rendeertype.RenderTypeToken;

import static net.minecraft.client.render.VertexFormat.DrawMode.TRIANGLES;
import static team.lodestar.lodestone.registry.client.LodestoneRenderTypeRegistry.*;

public class SphereEntityRenderer extends EntityRenderer<SphereEntity> {

    public static final LodestoneRenderType renderType = TEXTURE.applyWithModifier(RenderTypeToken.createToken(Identifier.of(SinsMain.MOD_ID, "textures/entity/uv_test.png")), b -> b.replaceVertexFormat(TRIANGLES));

    public SphereEntityRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager);
    }

    @Override
    public Identifier getTexture(SphereEntity entity) {
        return Identifier.of(SinsMain.MOD_ID, "textures/entity/uv_test.png");
    }

    @Override
    public void render(SphereEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {

        new VFXBuilders.WorldVFXBuilder()
                .setRenderType(renderType)
                .setAlpha(0.5F)
                //.setColor(0, 255, 0)
                .setUV(0, 0, 1, 1)
                .renderSphere(poseStack, 0.5f, 25, 25);
    }

}
