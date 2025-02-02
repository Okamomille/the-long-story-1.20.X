package net.okamiz.thelongstory.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.okamiz.thelongstory.block.ModBlocks;
import net.okamiz.thelongstory.block.crops.SweetPearCropBlock;
import net.okamiz.thelongstory.block.crops.TornCarrotCropBlock;
import net.okamiz.thelongstory.block.crops.TornPotatoCropBlock;
import net.okamiz.thelongstory.block.crops.VitalyCropBlock;
import net.okamiz.thelongstory.item.ModItems;


public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.SIMULATION_TELEPORTER);
        addDrop(ModBlocks.GREFFED_COMMAND_SYSTEM);
        addDrop(ModBlocks.BROKEN_GREFFED_COMMAND_SYSTEM);
        addDrop(ModBlocks.BROKEN_SIMULATION_TELEPORTER);
        addDrop(ModBlocks.MATERIAL_PROCESSOR);
        addDrop(ModBlocks.AMETHYST_PROCESSOR);
        addDrop(ModBlocks.RED_COAL_GENERATOR);
        addDrop(ModBlocks.DRONIUM_BLOCK);
        addDrop(ModBlocks.PANDAZITE_BLOCK);
        addDrop(ModBlocks.ODMENTIUM_BLOCK);


        addDrop(ModBlocks.COLD_STONED_MAGMA_BLOCK);
        addDrop(ModBlocks.STONED_MAGMA_BLOCK);


        addDrop(ModBlocks.BINARY_DIRT);
        addDrop(ModBlocks.BINARY_STONE);
        addDrop(ModBlocks.BINARY_STONE_STAIRS);
        addDrop(ModBlocks.BINARY_STONE_WALL);
        slabDrops(ModBlocks.BINARY_STONE_SLAB);




        addDrop(ModBlocks.TORCH_STONE);
        addDrop(ModBlocks.TORCH_SAND);
        addDrop(ModBlocks.TORCH_PINK_SAND);
        addDrop(ModBlocks.RED_COAL_BLOCK);
        addDrop(ModBlocks.SPIDER_SILK_BLOCK);
        addDrop(ModBlocks.DEEP_ICE);
        addDrop(ModBlocks.IMPURE_GLITCHED_BLOCK);
        addDrop(ModBlocks.PURE_GLITCHED_BLOCK);


        addDrop(ModBlocks.CARBON_BLOCK);
        addDrop(ModBlocks.CHISELED_CARBON_BLOCK);
        addDrop(ModBlocks.CARBON_BRICKS);
        addDrop(ModBlocks.CARBON_TILES);


        addDrop(ModBlocks.FLUORITE_PILLAR);
        addDrop(ModBlocks.FLUORITE_BRICKS);
        addDrop(ModBlocks.FLUORITE_BRICKS_STAIRS);
        addDrop(ModBlocks.FLUORITE_BRICKS_SLAB, slabDrops(ModBlocks.FLUORITE_BRICKS_SLAB));
        addDrop(ModBlocks.FLUORITE_BRICKS_WALL);

        addDrop(ModBlocks.FLUORITE_BLOCK);
        addDrop(ModBlocks.FLUORITE_BLOCK_STAIRS);
        addDrop(ModBlocks.FLUORITE_BLOCK_SLAB, slabDrops(ModBlocks.FLUORITE_BLOCK_SLAB));
        addDrop(ModBlocks.FLUORITE_BLOCK_WALL);

        addDrop(ModBlocks.CHISELED_FLUORITE_BLOCK);
        addDrop(ModBlocks.CHISELED_FLUORITE_BLOCK_STAIRS);
        addDrop(ModBlocks.CHISELED_FLUORITE_BLOCK_SLAB, slabDrops(ModBlocks.CHISELED_FLUORITE_BLOCK_SLAB));
        addDrop(ModBlocks.CHISELED_FLUORITE_BLOCK_WALL);


        addDrop(ModBlocks.TORCH_BRICKS);
        addDrop(ModBlocks.TORCH_BRICKS_STAIRS);
        addDrop(ModBlocks.TORCH_BRICKS_SLAB, slabDrops(ModBlocks.TORCH_BRICKS_SLAB));
        addDrop(ModBlocks.TORCH_BRICKS_WALL);

        addDrop(ModBlocks.TORCH_STONE_BRICKS);
        addDrop(ModBlocks.TORCH_STONE_BRICKS_STAIRS);
        addDrop(ModBlocks.TORCH_STONE_BRICKS_SLAB, slabDrops(ModBlocks.TORCH_STONE_BRICKS_SLAB));
        addDrop(ModBlocks.TORCH_STONE_BRICKS_WALL);

        addDrop(ModBlocks.TORCH_STONE);
        addDrop(ModBlocks.TORCH_STONE_STAIRS);
        addDrop(ModBlocks.TORCH_STONE_SLAB, slabDrops(ModBlocks.TORCH_STONE_SLAB));
        addDrop(ModBlocks.TORCH_STONE_WALL);

        addDrop(ModBlocks.TORCH_STONE_PILLAR);

        addDrop(ModBlocks.ICED_COBBLESTONE);
        addDrop(ModBlocks.ICED_CHISELED_STONE_BRICKS);
        addDrop(ModBlocks.ICED_CHISELED_STONE_BRICKS_STAIRS);
        addDrop(ModBlocks.ICED_CHISELED_STONE_BRICKS_SLAB, slabDrops(ModBlocks.ICED_CHISELED_STONE_BRICKS_SLAB));
        addDrop(ModBlocks.ICED_CHISELED_STONE_BRICKS_WALL);

        addDrop(ModBlocks.ICED_STONE);
        addDrop(ModBlocks.ICED_STONE_STAIRS);
        addDrop(ModBlocks.ICED_STONE_SLAB, slabDrops(ModBlocks.ICED_STONE_SLAB));
        addDrop(ModBlocks.ICED_STONE_WALL);

        addDrop(ModBlocks.ICED_CRACKED_STONE_BRICKS);
        addDrop(ModBlocks.ICED_CRACKED_STONE_BRICKS_STAIRS);
        addDrop(ModBlocks.ICED_CRACKED_STONE_BRICKS_SLAB, slabDrops(ModBlocks.ICED_CRACKED_STONE_BRICKS_SLAB));
        addDrop(ModBlocks.ICED_CRACKED_STONE_BRICKS_WALL);

        addDrop(ModBlocks.ICED_STONE_BRICKS);
        addDrop(ModBlocks.ICED_STONE_BRICKS_STAIRS);
        addDrop(ModBlocks.ICED_STONE_BRICKS_SLAB, slabDrops(ModBlocks.ICED_STONE_BRICKS_SLAB));
        addDrop(ModBlocks.ICED_STONE_BRICKS_WALL);
        addDrop(ModBlocks.IMPURE_ZAROSITE_BLOCK);
        addDrop(ModBlocks.ZAROSITE_BLOCK);

        addDrop(ModBlocks.LAB_TILES);
        addDrop(ModBlocks.LAB_TILES_STAIRS);
        addDrop(ModBlocks.LAB_TILES_SLAB, slabDrops(ModBlocks.LAB_TILES_SLAB));
        addDrop(ModBlocks.LAB_TILES_WALL);

        addDrop(ModBlocks.CORRUPTED_LAB_TILES);
        addDrop(ModBlocks.CORRUPTED_LAB_TILES_STAIRS);
        addDrop(ModBlocks.CORRUPTED_LAB_TILES_SLAB, slabDrops(ModBlocks.CORRUPTED_LAB_TILES_SLAB));
        addDrop(ModBlocks.CORRUPTED_LAB_TILES_WALL);


        addDrop(ModBlocks.FADED_CACTUS_PLANKS);
        addDrop(ModBlocks.FADED_CACTUS_STAIRS);
        addDrop(ModBlocks.FADED_CACTUS_DOOR, doorDrops(ModBlocks.FADED_CACTUS_DOOR));
        addDrop(ModBlocks.FADED_CACTUS_SLAB, slabDrops(ModBlocks.FADED_CACTUS_SLAB));
        addDrop(ModBlocks.FADED_CACTUS_TRAPDOOR);


        //EGRORIC LOOTS ------------------------------------
        addDrop(ModBlocks.EGRORIC_LEAVES, leavesDrops(ModBlocks.EGRORIC_LEAVES, ModBlocks.EGRORIC_SAPLING, 0.025f));
        addDrop(ModBlocks.EGRORIC_SAPLING);
        addDrop(ModBlocks.EGRORIC_LOG);
        addDrop(ModBlocks.STRIPPED_EGRORIC_LOG);
        addDrop(ModBlocks.EGRORIC_WOOD);
        addDrop(ModBlocks.STRIPPED_EGRORIC_WOOD);
        addDrop(ModBlocks.EGRORIC_PLANKS);
        addDrop(ModBlocks.EGRORIC_STAIRS);
        addDrop(ModBlocks.EGRORIC_TRAPDOOR);
        addDrop(ModBlocks.EGRORIC_PRESSURE_PLATE);
        addDrop(ModBlocks.EGRORIC_BUTTON);
        addDrop(ModBlocks.EGRORIC_FENCE_GATE);
        addDrop(ModBlocks.EGRORIC_FENCE);
        addDrop(ModBlocks.EGRORIC_DOOR, doorDrops(ModBlocks.EGRORIC_DOOR));
        addDrop(ModBlocks.EGRORIC_SLAB, slabDrops(ModBlocks.EGRORIC_SLAB));

        //OAST LOOTS ------------------------------------
        addDrop(ModBlocks.OAST_LEAVES, leavesDrops(ModBlocks.OAST_LEAVES, ModBlocks.OAST_SAPLING, 0.025f));
        addDrop(ModBlocks.OAST_SAPLING);
        addDrop(ModBlocks.OAST_LOG);
        addDrop(ModBlocks.STRIPPED_OAST_LOG);
        addDrop(ModBlocks.OAST_WOOD);
        addDrop(ModBlocks.STRIPPED_OAST_WOOD);
        addDrop(ModBlocks.OAST_PLANKS);
        addDrop(ModBlocks.OAST_STAIRS);
        addDrop(ModBlocks.OAST_PRESSURE_PLATE);
        addDrop(ModBlocks.OAST_BUTTON);
        addDrop(ModBlocks.OAST_FENCE_GATE);
        addDrop(ModBlocks.OAST_FENCE);
        addDrop(ModBlocks.OAST_SLAB, slabDrops(ModBlocks.OAST_SLAB));
        addDrop(ModBlocks.OAST_DOOR, doorDrops(ModBlocks.OAST_DOOR));
        addDrop(ModBlocks.OAST_TRAPDOOR);

        //SEPHIN LOOTS ------------------------------------
        addDrop(ModBlocks.SEPHIN_LEAVES, leavesDrops(ModBlocks.SEPHIN_LEAVES, ModBlocks.SEPHIN_SAPLING, 0.025f));
        addDrop(ModBlocks.SEPHIN_SAPLING);
        addDrop(ModBlocks.SEPHIN_LOG);
        addDrop(ModBlocks.STRIPPED_SEPHIN_LOG);
        addDrop(ModBlocks.SEPHIN_WOOD);
        addDrop(ModBlocks.STRIPPED_SEPHIN_WOOD);
        addDrop(ModBlocks.SEPHIN_PLANKS);
        addDrop(ModBlocks.SEPHIN_STAIRS);
        addDrop(ModBlocks.SEPHIN_PRESSURE_PLATE);
        addDrop(ModBlocks.SEPHIN_BUTTON);
        addDrop(ModBlocks.SEPHIN_FENCE_GATE);
        addDrop(ModBlocks.SEPHIN_FENCE);
        addDrop(ModBlocks.SEPHIN_SLAB, slabDrops(ModBlocks.SEPHIN_SLAB));
        addDrop(ModBlocks.SEPHIN_DOOR, doorDrops(ModBlocks.SEPHIN_DOOR));
        addDrop(ModBlocks.SEPHIN_TRAPDOOR);

        //KIWI LOOTS ------------------------------------
        addDrop(ModBlocks.KIWI_LEAVES, leavesDrops(ModBlocks.KIWI_LEAVES, ModBlocks.KIWI_SAPLING, 0.025f));
        addDrop(ModBlocks.KIWI_SAPLING);
        addDrop(ModBlocks.KIWI_LOG);
        addDrop(ModBlocks.STRIPPED_KIWI_LOG);
        addDrop(ModBlocks.KIWI_WOOD);
        addDrop(ModBlocks.STRIPPED_KIWI_WOOD);
        addDrop(ModBlocks.KIWI_PLANKS);
        addDrop(ModBlocks.KIWI_STAIRS);
        addDrop(ModBlocks.KIWI_PRESSURE_PLATE);
        addDrop(ModBlocks.KIWI_BUTTON);
        addDrop(ModBlocks.KIWI_FENCE_GATE);
        addDrop(ModBlocks.KIWI_FENCE);
        addDrop(ModBlocks.KIWI_SLAB, slabDrops(ModBlocks.KIWI_SLAB));
        addDrop(ModBlocks.KIWI_DOOR, doorDrops(ModBlocks.KIWI_DOOR));
        addDrop(ModBlocks.KIWI_TRAPDOOR);

        //BINARY LOOTS ------------------------------------
        addDrop(ModBlocks.BINARY_LEAVES, leavesDrops(ModBlocks.BINARY_LEAVES, ModBlocks.BINARY_SAPLING, 0.025f));
        addDrop(ModBlocks.BINARY_SAPLING);
        addDrop(ModBlocks.BINARY_LOG);
        addDrop(ModBlocks.STRIPPED_BINARY_LOG);
        addDrop(ModBlocks.BINARY_WOOD);
        addDrop(ModBlocks.STRIPPED_BINARY_WOOD);
        addDrop(ModBlocks.BINARY_PLANKS);
        addDrop(ModBlocks.BINARY_STAIRS);
        addDrop(ModBlocks.BINARY_PRESSURE_PLATE);
        addDrop(ModBlocks.BINARY_BUTTON);
        addDrop(ModBlocks.BINARY_FENCE_GATE);
        addDrop(ModBlocks.BINARY_FENCE);
        addDrop(ModBlocks.BINARY_SLAB, slabDrops(ModBlocks.BINARY_SLAB));
        addDrop(ModBlocks.BINARY_DOOR, doorDrops(ModBlocks.BINARY_DOOR));
        addDrop(ModBlocks.BINARY_TRAPDOOR);






        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.VITALY_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(VitalyCropBlock.AGE, 6));
        this.addDrop(ModBlocks.VITALY_CROP, this.cropDrops(ModBlocks.VITALY_CROP, ModItems.VITALY_FRUIT, ModItems.VITALY_SEEDS, builder2));

        BlockStatePropertyLootCondition.Builder carrotBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.TORN_CARROT_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(TornCarrotCropBlock.AGE, 6));
        this.addDrop(ModBlocks.TORN_CARROT_CROP, this.cropDrops(ModBlocks.TORN_CARROT_CROP, ModItems.TORN_CARROT, ModItems.TORN_CARROT, carrotBuilder));

        BlockStatePropertyLootCondition.Builder potatoBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.TORN_POTATO_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(TornPotatoCropBlock.AGE, 6));
        this.addDrop(ModBlocks.TORN_POTATO_CROP, this.cropDrops(ModBlocks.TORN_POTATO_CROP, ModItems.TORN_POTATO, ModItems.TORN_POTATO, potatoBuilder));

        BlockStatePropertyLootCondition.Builder sweetPearBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.SWEET_PEAR_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(SweetPearCropBlock.AGE, 6));
        this.addDrop(ModBlocks.SWEET_PEAR_CROP, this.cropDrops(ModBlocks.SWEET_PEAR_CROP, ModItems.SWEET_PEAR, ModItems.SWEET_PEAR_SEEDS, sweetPearBuilder));






        addDrop(ModBlocks.FADED_CACTUS);

        addDrop(ModBlocks.TORN_FLOWER);
        addDropWithSilkTouch(ModBlocks.TORN_BUSH);


        addDrop(ModBlocks.PINK_PHYGELUS);
        addDrop(ModBlocks.YELLOW_PHYGELUS);

        addDrop(ModBlocks.RED_OSPET);
        addDrop(ModBlocks.BLUE_OSPET);
        addDrop(ModBlocks.GREEN_OSPET);
        addDrop(ModBlocks.YELLOW_OSPET);

        addPottedPlantDrops(ModBlocks.POTTED_RED_OSPET);
        addPottedPlantDrops(ModBlocks.POTTED_BLUE_OSPET);
        addPottedPlantDrops(ModBlocks.POTTED_GREEN_OSPET);
        addPottedPlantDrops(ModBlocks.POTTED_YELLOW_OSPET);

        addDrop(ModBlocks.THESTONE_ORE, copperLikeOreDrops(ModBlocks.THESTONE_ORE, ModItems.THESTONE_DUST));
        addDrop(ModBlocks.DEEPSLATE_THESTONE_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_THESTONE_ORE, ModItems.THESTONE_DUST));
        addDrop(ModBlocks.RED_SANDSTONE_THESTONE_ORE, copperLikeOreDrops(ModBlocks.RED_SANDSTONE_THESTONE_ORE, ModItems.THESTONE_DUST));
        addDrop(ModBlocks.TORCH_STONE_THESTONE_ORE, copperLikeOreDrops(ModBlocks.TORCH_STONE_THESTONE_ORE, ModItems.THESTONE_DUST));

        addDrop(ModBlocks.IMPURE_ZAROSITE_ORE, oreDrops(ModBlocks.IMPURE_ZAROSITE_ORE, ModItems.RAW_IMPURE_ZAROSITE));
        addDrop(ModBlocks.DEEPSLATE_IMPURE_ZAROSITE_ORE, oreDrops(ModBlocks.DEEPSLATE_IMPURE_ZAROSITE_ORE, ModItems.RAW_IMPURE_ZAROSITE));

        addDrop(ModBlocks.PANDAZITE_ORE, oreDrops(ModBlocks.PANDAZITE_ORE, ModItems.RAW_PANDAZITE));
        addDrop(ModBlocks.DEEPSLATE_PANDAZITE_ORE, oreDrops(ModBlocks.DEEPSLATE_PANDAZITE_ORE, ModItems.RAW_PANDAZITE));
        addDrop(ModBlocks.TORCH_STONE_PANDAZITE_ORE, oreDrops(ModBlocks.TORCH_STONE_PANDAZITE_ORE, ModItems.RAW_PANDAZITE));
        addDrop(ModBlocks.RED_SANDSTONE_PANDAZITE_ORE, oreDrops(ModBlocks.RED_SANDSTONE_PANDAZITE_ORE, ModItems.RAW_PANDAZITE));
        addDrop(ModBlocks.DEEP_ICE_FLUORITE_ORE, fluoriteOreDrops(ModBlocks.DEEP_ICE_FLUORITE_ORE, ModItems.FLUORITE));

        addDrop(ModBlocks.ODMENTIUM_ORE, oreDrops(ModBlocks.ODMENTIUM_ORE, ModItems.RAW_ODMENTIUM));
        addDrop(ModBlocks.RED_SANDSTONE_ODMENTIUM_ORE, oreDrops(ModBlocks.RED_SANDSTONE_ODMENTIUM_ORE, ModItems.RAW_ODMENTIUM));

        addDrop(ModBlocks.DEEP_ICE_ZAROSITE_ORE, copperLikeOreDrops(ModBlocks.DEEP_ICE_ZAROSITE_ORE, ModItems.ZAROSITE_SHARD));
    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item){
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(1.0f,5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }

    public LootTable.Builder fluoriteOreDrops(Block drop, Item item){
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(1.0f,4.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }


}
