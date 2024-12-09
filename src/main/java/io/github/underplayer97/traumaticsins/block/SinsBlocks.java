package io.github.underplayer97.traumaticsins.block;

import io.github.underplayer97.traumaticsins.SinsMain;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class SinsBlocks {

    public static final Block TUNGSTEN_ORE = registerBlock("tungsten_ore", new Block(AbstractBlock.Settings.create().strength(4.0f).requiresTool().requiresTool()));
    public static final Block DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore", new Block(AbstractBlock.Settings.create().strength(4.0f).requiresTool()));
    public static final Block TUNGSTEN_BLOCK = registerBlock("tungsten_block", new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.NETHERITE).strength(4.0f).requiresTool()));
    public static final Block TUNGSTEN_FURNACE = registerBlock("tungsten_furnace", new TungstenFurnaceBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.NETHERITE).strength(2.0f).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SinsMain.MOD_ID, name), block);
    }

    private static BlockItem registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SinsMain.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerSinsBlocks() {

    }

}
