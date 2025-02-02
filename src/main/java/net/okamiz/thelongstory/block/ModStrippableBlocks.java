package net.okamiz.thelongstory.block;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.okamiz.thelongstory.TheLongStory;

public class ModStrippableBlocks {

    public static void registerStrippableBlocks(){

        TheLongStory.LOGGER.info("Registering Strippable Blocks for " + TheLongStory.MOD_ID);

        StrippableBlockRegistry.register(ModBlocks.EGRORIC_LOG, ModBlocks.STRIPPED_EGRORIC_LOG);
        StrippableBlockRegistry.register(ModBlocks.EGRORIC_WOOD, ModBlocks.STRIPPED_EGRORIC_WOOD);

        StrippableBlockRegistry.register(ModBlocks.OAST_LOG, ModBlocks.STRIPPED_OAST_LOG);
        StrippableBlockRegistry.register(ModBlocks.OAST_WOOD, ModBlocks.STRIPPED_OAST_WOOD);

        StrippableBlockRegistry.register(ModBlocks.SEPHIN_LOG, ModBlocks.STRIPPED_SEPHIN_LOG);
        StrippableBlockRegistry.register(ModBlocks.SEPHIN_WOOD, ModBlocks.STRIPPED_SEPHIN_WOOD);

        StrippableBlockRegistry.register(ModBlocks.KIWI_LOG, ModBlocks.STRIPPED_KIWI_LOG);
        StrippableBlockRegistry.register(ModBlocks.KIWI_WOOD, ModBlocks.STRIPPED_KIWI_WOOD);

        StrippableBlockRegistry.register(ModBlocks.BINARY_LOG, ModBlocks.STRIPPED_BINARY_LOG);
        StrippableBlockRegistry.register(ModBlocks.BINARY_WOOD, ModBlocks.STRIPPED_BINARY_WOOD);
    }
}
