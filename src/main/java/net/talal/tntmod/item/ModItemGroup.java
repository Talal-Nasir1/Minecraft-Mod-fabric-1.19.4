package net.talal.tntmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.talal.tntmod.TntMod;

public class ModItemGroup {
    public static final ItemGroup TNTMOD = FabricItemGroup.builder(
            new Identifier(TntMod.MOD_ID,"superpowder"))
            .displayName(Text.literal("GO KABOOM!"))
            .icon(() -> new ItemStack(ModItems.superpowder))
            .build();
}
