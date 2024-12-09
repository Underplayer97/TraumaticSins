package io.github.underplayer97.traumaticsins.item;

import io.github.underplayer97.traumaticsins.SinsMain;
import io.github.underplayer97.traumaticsins.block.SinsBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class SinsItemGroups {

    public static final RegistryKey<ItemGroup> BLOCK_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), new Identifier(SinsMain.MOD_ID, "block_group"));
    public static final RegistryKey<ItemGroup> ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), new Identifier(SinsMain.MOD_ID, "item_group"));

    public static final ItemGroup BLOCK_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(SinsBlocks.TUNGSTEN_BLOCK))
            .displayName(Text.translatable("itemGroup.traumaticsins.block_group"))
            .build();

    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(SinsItems.TUNGSTEN_INGOT))
            .displayName(Text.translatable("itemGroup.traumaticsins.item_group"))
            .build();

    public static void registerSinsBlockGroups() {
        Registry.register(Registries.ITEM_GROUP, BLOCK_GROUP_KEY, BLOCK_GROUP);
        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP_KEY, ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(BLOCK_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(SinsBlocks.TUNGSTEN_BLOCK);
            itemGroup.add(SinsBlocks.TUNGSTEN_ORE);
            itemGroup.add(SinsBlocks.DEEPSLATE_TUNGSTEN_ORE);
            itemGroup.add(SinsBlocks.TUNGSTEN_FURNACE);
        });

        ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(SinsItems.RAW_TUNGSTEN);
            itemGroup.add(SinsItems.TUNGSTEN_INGOT);
            itemGroup.add(SinsItems.TUNGSTEN_SWORD);
            itemGroup.add(SinsItems.TUNGSTEN_PICKAXE);
            itemGroup.add(SinsItems.TUNGSTEN_AXE);
            itemGroup.add(SinsItems.TUNGSTEN_SHOVEL);
            itemGroup.add(SinsItems.TUNGSTEN_HOE);
            itemGroup.add(SinsItems.TUNGSTEN_HELMET);
            itemGroup.add(SinsItems.TUNGSTEN_CHESTPLATE);
            itemGroup.add(SinsItems.TUNGSTEN_LEGGINGS);
            itemGroup.add(SinsItems.TUNGSTEN_BOOTS);
            itemGroup.add(SinsItems.OBSIDIAN_ROD);
        });

    }

}
