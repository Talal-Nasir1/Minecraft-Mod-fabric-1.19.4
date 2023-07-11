package net.talal.tntmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.talal.tntmod.TntMod;
import net.talal.tntmod.item.ModItemGroup;

public class ModBlocks {

    public static final Block SUPER_TNT = registerBlock("super_tnt",
            new Block(FabricBlockSettings.of(Material.TNT).strength(1.0f)), ModItemGroup.TNTMOD);
    public static final Block DE_ATOMIZER = registerBlock("de_atomizer",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5.0f).requiresTool()),ModItemGroup.TNTMOD);
    public static final Block SUPER_ORE = registerBlock("super_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5.0f).requiresTool()),ModItemGroup.TNTMOD);
    public static final Block SUPER_BLOCK = registerBlock("super_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5.0f).requiresTool()),ModItemGroup.TNTMOD);

    public static Block registerBlock(String name, Block block, ItemGroup group){
        registerModItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(TntMod.MOD_ID,name),block);
    }
    public static Item registerModItem(String name, Block block, ItemGroup group){
        Item item = Registry.register(Registries.ITEM, new Identifier(TntMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    public static void registerModBlocks() {
        TntMod.LOGGER.debug("Registering ModBlocks for " + TntMod.MOD_ID);
    }
}
