package io.github.underplayer97.traumaticsins;

import io.github.underplayer97.traumaticsins.client.render.entity.SphereEntityRenderer;
import io.github.underplayer97.traumaticsins.entity.SinsEntity;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class SinsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(SinsEntity.SPHERE_ENTITY, SphereEntityRenderer::new);

    }
}
