package io.github.underplayer97.traumaticsins.block.entity;

import io.github.underplayer97.traumaticsins.SinsMain;
import io.github.underplayer97.traumaticsins.block.SinsBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SinsBlockEntity {

    public static final BlockEntityType<TungstenFurnaceBlockEntity> TUNGSTEN_FURNACE_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            new Identifier(SinsMain.MOD_ID, "tungsten_furnace_block_entity"), FabricBlockEntityTypeBuilder.create(TungstenFurnaceBlockEntity::new,
                    SinsBlocks.TUNGSTEN_FURNACE).build());

    public static void registerBlockEntity() {

    }

}
