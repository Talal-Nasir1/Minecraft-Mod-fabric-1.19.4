package net.talal.tntmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.talal.tntmod.block.ModBlocks;
import net.talal.tntmod.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public LootTable.Builder superOreDrops(Block drop) {
        return dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop, ItemEntry.builder(ModItems.superpowder).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0F, 9.0F))).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SUPER_BLOCK);

        addDrop(ModBlocks.SUPER_ORE,superOreDrops(ModBlocks.SUPER_ORE));
    }
}
