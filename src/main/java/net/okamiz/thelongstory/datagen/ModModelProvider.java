package net.okamiz.thelongstory.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.okamiz.thelongstory.block.ModBlocks;
import net.okamiz.thelongstory.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.THESTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_THESTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPIDER_SILK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOLD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_COAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GREFFED_COMMAND_SYSTEM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRUSHED_BONES_BLOCK);

        BlockStateModelGenerator.BlockTexturePool egroricPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EGRORIC_PLANKS);

        egroricPool.stairs(ModBlocks.EGRORIC_STAIRS);
        egroricPool.slab(ModBlocks.EGRORIC_SLAB);
        egroricPool.button(ModBlocks.EGRORIC_BUTTON);
        egroricPool.pressurePlate(ModBlocks.EGRORIC_PRESSURE_PLATE);
        egroricPool.fence(ModBlocks.EGRORIC_FENCE);
        egroricPool.fenceGate(ModBlocks.EGRORIC_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.EGRORIC_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.EGRORIC_TRAPDOOR);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.THESTONE_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.THESTONE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.THESTONE_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.GREEN_SHARD, Models.GENERATED);

        itemModelGenerator.register(ModItems.EMERALD_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETHYST_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LAPIS_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.REDSTONE_APPLE, Models.GENERATED);

        itemModelGenerator.register(ModItems.RED_COAL, Models.GENERATED);

        itemModelGenerator.register(ModItems.BONE_FRAGMENTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRUSHED_BONES, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLOOD_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPIDER_SILK, Models.GENERATED);
        itemModelGenerator.register(ModItems.INFESTED_FLESH, Models.GENERATED);

        itemModelGenerator.register(ModItems.RADAR, Models.GENERATED);



        itemModelGenerator.register(ModItems.THESTONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.THESTONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.THESTONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.THESTONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.THESTONE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.GREEN_SHARD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GREEN_SHARD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GREEN_SHARD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GREEN_SHARD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GREEN_SHARD_HOE, Models.HANDHELD);


        
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.THESTONE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.THESTONE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.THESTONE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.THESTONE_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GREEN_SHARD_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GREEN_SHARD_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GREEN_SHARD_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GREEN_SHARD_BOOTS));


    }
}