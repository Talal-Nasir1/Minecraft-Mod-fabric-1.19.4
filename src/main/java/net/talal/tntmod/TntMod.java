package net.talal.tntmod;

import net.fabricmc.api.ModInitializer;
import net.talal.tntmod.block.ModBlocks;
import net.talal.tntmod.item.ModItems;
import net.talal.tntmod.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TntMod implements ModInitializer {
    public static final String MOD_ID = "tntmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModWorldGeneration.generateModWorldGen();
    }
}
