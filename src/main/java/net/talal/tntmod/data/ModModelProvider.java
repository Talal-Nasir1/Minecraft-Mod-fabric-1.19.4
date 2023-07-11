package net.talal.tntmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;
import net.talal.tntmod.block.ModBlocks;
import net.talal.tntmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPER_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPER_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUPER_TNT);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DE_ATOMIZER);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.superpowder, Models.GENERATED);
        itemModelGenerator.register(ModItems.super_ingot, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURE_IRON, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARBON, Models.GENERATED);
        itemModelGenerator.register(ModItems.THROW_BOTTLE_CARBON_DIOXIDE , Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL , Models.GENERATED);
        itemModelGenerator.register(ModItems.LITHIUM , Models.GENERATED);
    }
}
