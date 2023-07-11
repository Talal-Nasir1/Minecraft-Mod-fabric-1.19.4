package net.talal.tntmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.talal.tntmod.block.ModBlocks;
import net.talal.tntmod.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.superpowder), RecipeCategory.MISC, ModItems.super_ingot,
                3f,300,"Super");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SUPER_BLOCK)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.super_ingot)
                .criterion((FabricRecipeProvider.hasItem(ModItems.super_ingot)),
                        FabricRecipeProvider.conditionsFromItem(ModItems.super_ingot))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName((ModBlocks.SUPER_BLOCK))));
    }
}
