package io.github.underplayer97.traumaticsins.item;

import io.github.underplayer97.traumaticsins.SinsMain;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SinsItems {

    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten", new Item(new FabricItemSettings()));
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot", new Item(new FabricItemSettings()));
    public static final Item OBSIDIAN_ROD = registerItem("obsidian_rod", new Item(new FabricItemSettings()));
    public static final Item TUNGSTEN_SWORD = registerItem("tungsten_sword", new SwordItem(SinsToolMaterial.TUNGSTEN, 3, -2.4F, (new FabricItemSettings()).fireproof()));
    public static final Item TUNGSTEN_PICKAXE = registerItem("tungsten_pickaxe", new PickaxeItem(SinsToolMaterial.TUNGSTEN, 1, -2.8F, (new FabricItemSettings()).fireproof()));
    public static final Item TUNGSTEN_AXE = registerItem("tungsten_axe", new AxeItem(SinsToolMaterial.TUNGSTEN, 5.0F, -3.0F, (new FabricItemSettings()).fireproof()));
    public static final Item TUNGSTEN_SHOVEL = registerItem("tungsten_shovel", new AxeItem(SinsToolMaterial.TUNGSTEN, 1.5F, -3.0F, (new FabricItemSettings()).fireproof()));
    public static final Item TUNGSTEN_HOE = registerItem("tungsten_hoe", new AxeItem(SinsToolMaterial.TUNGSTEN, -4, 0.0F, (new FabricItemSettings()).fireproof()));
    public static final Item TUNGSTEN_HELMET = registerItem("tungsten_helmet", new ArmorItem(SinsArmorMaterial.TUNGSTEN, ArmorItem.Type.HELMET, (new FabricItemSettings()).fireproof()));
    public static final Item TUNGSTEN_CHESTPLATE = registerItem("tungsten_chestplate", new ArmorItem(SinsArmorMaterial.TUNGSTEN, ArmorItem.Type.CHESTPLATE, (new FabricItemSettings()).fireproof()));
    public static final Item TUNGSTEN_LEGGINGS = registerItem("tungsten_leggings", new ArmorItem(SinsArmorMaterial.TUNGSTEN, ArmorItem.Type.LEGGINGS, (new FabricItemSettings()).fireproof()));
    public static final Item TUNGSTEN_BOOTS = registerItem("tungsten_boots", new ArmorItem(SinsArmorMaterial.TUNGSTEN, ArmorItem.Type.BOOTS, (new FabricItemSettings()).fireproof()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SinsMain.MOD_ID, name), item);
    }

    public static void registerSinsItems() {

    }

}
