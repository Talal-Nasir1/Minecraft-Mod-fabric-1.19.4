package net.talal.tntmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.talal.tntmod.TntMod;


public class ModItems {

    public static final Item superpowder = registerItem("superpowder",
            new Item(new Item.Settings()), ModItemGroup.TNTMOD);
    public static final Item super_ingot = registerItem("super_ingot",
            new Item(new Item.Settings()), ModItemGroup.TNTMOD);
    public static final Item PURE_IRON = registerItem("pure_iron",
            new Item(new Item.Settings()), ModItemGroup.TNTMOD);
    public static final Item CARBON = registerItem("carbon",
            new Item(new Item.Settings()), ModItemGroup.TNTMOD);
    public static final Item THROW_BOTTLE_CARBON_DIOXIDE = registerItem("throw_bottle_of_carbon_dioxide",
            new Item(new Item.Settings()), ModItemGroup.TNTMOD);
    public static final Item STEEL = registerItem("steel",
            new Item(new Item.Settings()), ModItemGroup.TNTMOD);
    public static final Item LITHIUM = registerItem("lithium",
            new Item(new Item.Settings()), ModItemGroup.TNTMOD);

    private static Item registerItem(String name, Item item, ItemGroup group){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(TntMod.MOD_ID,name),item);
    }

    public static void registerModItems(){
        TntMod.LOGGER.debug("Registering Mod Items for " + TntMod.MOD_ID);
    }
}
