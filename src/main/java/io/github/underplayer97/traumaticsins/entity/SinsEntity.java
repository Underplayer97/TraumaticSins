package io.github.underplayer97.traumaticsins.entity;

import io.github.underplayer97.traumaticsins.SinsMain;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SinsEntity {

    public static final EntityType<SphereEntity> SPHERE_ENTITY = Registry.register(Registries.ENTITY_TYPE, Identifier.of(SinsMain.MOD_ID, "sphere"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SphereEntity::new).dimensions(EntityDimensions.fixed(1.0f, 0.5f)).build());

}
