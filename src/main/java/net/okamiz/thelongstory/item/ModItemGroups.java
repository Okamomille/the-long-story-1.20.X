package net.okamiz.thelongstory.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.okamiz.thelongstory.TheLongStory;
import net.okamiz.thelongstory.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheLongStory.MOD_ID, "modgroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.modgroup"))
                    .icon(() -> new ItemStack(ModItems.BONE_FRAGMENTS)).entries((displayContext, entries) -> {

                        entries.add(ModItems.INFESTED_FLESH);
                        entries.add(ModItems.BONE_FRAGMENTS);
                        entries.add(ModItems.CRUSHED_BONES);

                        entries.add(ModItems.RADAR);


                        entries.add(ModBlocks.CRUSHED_BONES_BLOCK);
                        entries.add(ModBlocks.MOLD_BLOCK);
                        entries.add(ModBlocks.PINK_GREFFED_COMMAND_SYSTEM);

                    }).build());

    public static final ItemGroup FOOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheLongStory.MOD_ID, "foodgroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.foodgroup"))
                    .icon(() -> new ItemStack(ModItems.REDSTONE_APPLE)).entries((displayContext, entries) -> {

                        entries.add(ModItems.EMERALD_APPLE);
                        entries.add(ModItems.IRON_APPLE);
                        entries.add(ModItems.DIAMOND_APPLE);
                        entries.add(ModItems.LAPIS_APPLE);
                        entries.add(ModItems.REDSTONE_APPLE);
                        entries.add(ModItems.AMETHYST_APPLE);


                    }).build());

    public static void registerItemGroups(){
        TheLongStory.LOGGER.info("Registering Item Groups for " + TheLongStory.MOD_ID);
    }

}
