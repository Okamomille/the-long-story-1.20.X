package net.okamiz.thelongstory.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.okamiz.thelongstory.TheLongStory;
import net.okamiz.thelongstory.block.ModBlocks;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> THESTONE_ORE_PLACED_KEY = registerKey("thestone_ore_placed");
    public static final RegistryKey<PlacedFeature> IMPURE_ZAROSITE_ORE_PLACED_KEY = registerKey("impure_zarosite_ore_placed");
    public static final RegistryKey<PlacedFeature> PANDAZITE_ORE_PLACED_KEY = registerKey("pandazite_ore_placed");
    public static final RegistryKey<PlacedFeature> ODMENTIUM_ORE_PLACED_KEY = registerKey("odmentium_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEP_ICE_ZAROSITE_ORE_PLACED_KEY = registerKey("deep_ice_zarosite_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEP_ICE_FLUORITE_ORE_PLACED_KEY = registerKey("deep_ice_fluorite_ore_placed");


    public static final RegistryKey<PlacedFeature> EGRORIC_PLACED_KEY = registerKey("egroric_placed");
    public static final RegistryKey<PlacedFeature> OAST_PLACED_KEY = registerKey("oast_placed");
    public static final RegistryKey<PlacedFeature> SEPHIN_PLACED_KEY = registerKey("sephin_placed");
    public static final RegistryKey<PlacedFeature> KIWI_PLACED_KEY = registerKey("kiwi_placed");
    public static final RegistryKey<PlacedFeature> BINARY_PLACED_KEY = registerKey("binary_placed");



    public static final RegistryKey<PlacedFeature> FADED_CACTUS_PLACED_KEY = registerKey("faded_cactus_placed");
    public static final RegistryKey<PlacedFeature> BULBO_FLOWER_PLACED_KEY = registerKey("bulbo_flower_placed");
    public static final RegistryKey<PlacedFeature> TORN_BUSH_PLACED_KEY = registerKey("torn_bush_placed");
    public static final RegistryKey<PlacedFeature> TORN_FLOWER_PLACED_KEY = registerKey("torn_flower_placed");
    public static final RegistryKey<PlacedFeature> PINK_PHYGELUS_PLACED_KEY = registerKey("pink_phygelus_placed");
    public static final RegistryKey<PlacedFeature> YELLOW_PHYGELUS_PLACED_KEY = registerKey("yellow_phygelus_placed");
    public static final RegistryKey<PlacedFeature> BLUE_OSPET_PLACED_KEY = registerKey("blue_ospet_placed");
    public static final RegistryKey<PlacedFeature> BINARY_GRASS_PLACED_KEY = registerKey("binary_grass_placed");
    public static final RegistryKey<PlacedFeature> BINARY_TALL_GRASS_PLACED_KEY = registerKey("binary_tall_grass_placed");






    public static final RegistryKey<PlacedFeature> NOTE_BLOCK_PATCH_PLACED = registerKey("note_block_patch_placed");





    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, THESTONE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.THESTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(9, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(30))));

        register(context, IMPURE_ZAROSITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.IMPURE_ZAROSITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(3, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(8))));

        register(context, DEEP_ICE_ZAROSITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEP_ICE_ZAROSITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(8))));

        register(context, DEEP_ICE_FLUORITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEP_ICE_FLUORITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(150))));

        register(context, PANDAZITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PANDAZITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.getTop())));

        register(context, ODMENTIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ODMENTIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.getTop())));


        register(context, FADED_CACTUS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FADED_CACTUS_KEY),
                ModPlantsPlacement.modifiersWithCount(1));

        register(context, BULBO_FLOWER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BULBO_FLOWER_KEY),
                ModPlantsPlacement.modifiersWithCount(1));


        register(context, BINARY_TALL_GRASS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BINARY_TALL_GRASS_KEY),
                ModPlantsPlacement.modifiersWithCount(1));

        register(context, BINARY_GRASS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BINARY_GRASS_KEY),
                ModPlantsPlacement.modifiersWithCount(18));


        register(context, TORN_BUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TORN_BUSH_KEY),
                ModPlantsPlacement.modifiersWithCount(2));

        register(context, TORN_FLOWER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TORN_FLOWER_KEY),
                ModPlantsPlacement.modifiersWithCount(3));

        register(context, PINK_PHYGELUS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINK_PHYGELUS_KEY),
                ModPlantsPlacement.modifiersWithCount(32));

        register(context, YELLOW_PHYGELUS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.YELLOW_PHYGELUS_KEY),
                ModPlantsPlacement.modifiersWithCount(24));

        register(context, BLUE_OSPET_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLUE_OSPET_KEY),
                ModPlantsPlacement.modifiersWithCount(1));



        register(context, NOTE_BLOCK_PATCH_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NOTE_BLOCK_PATCH_KEY),
                ModPlantsPlacement.modifiersWithCount(1));

 


        register(context, EGRORIC_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.EGRORIC_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(5,0.1f, 2),
                        ModBlocks.EGRORIC_SAPLING));

        register(context, OAST_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.OAST_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(4,0.1f, 2),
                        ModBlocks.OAST_SAPLING));

        register(context, SEPHIN_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SEPHIN_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(6,0.1f, 2),
                        ModBlocks.SEPHIN_SAPLING));

        register(context, KIWI_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.KIWI_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(8,0.1f, 2),
                        ModBlocks.KIWI_SAPLING));

        register(context, BINARY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BINARY_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(8,0.1f, 2),
                        ModBlocks.BINARY_SAPLING));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TheLongStory.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

}
