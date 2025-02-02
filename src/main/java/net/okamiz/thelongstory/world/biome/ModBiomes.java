package net.okamiz.thelongstory.world.biome;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.okamiz.thelongstory.TheLongStory;
import net.okamiz.thelongstory.entity.ModEntities;
import net.okamiz.thelongstory.world.ModPlacedFeatures;

public class ModBiomes {





    public static final RegistryKey<Biome> SNOW_FOREST = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(TheLongStory.MOD_ID, "snow_forest"));

    public static final RegistryKey<Biome> GOLDEN_LANDS = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(TheLongStory.MOD_ID, "golden_lands"));

    public static final RegistryKey<Biome> TEARS_VALLEY = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(TheLongStory.MOD_ID, "tears_valley"));

    public static final RegistryKey<Biome> FOREST_OF_MELODY = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(TheLongStory.MOD_ID, "forest_of_melody"));

    public static final RegistryKey<Biome> TORCH_DESERT = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(TheLongStory.MOD_ID, "torch_desert"));
    public static final RegistryKey<Biome> TORCH_PINK_DESERT = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(TheLongStory.MOD_ID, "torch_pink_desert"));

    public static final RegistryKey<Biome> CODE_FOREST = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(TheLongStory.MOD_ID, "code_forest"));



    public static void boostrap(Registerable<Biome> context) {
        context.register(SNOW_FOREST, snowForest(context));
        context.register(GOLDEN_LANDS, goldenLands(context));
        context.register(TEARS_VALLEY, tearsValley(context));
        context.register(FOREST_OF_MELODY, forestOfMelody(context));
        context.register(TORCH_DESERT, torchDesert(context));
        context.register(TORCH_PINK_DESERT, torchPinkDesert(context));
        context.register(CODE_FOREST, codeForest(context));
    }

    /*
    public static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder) {
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addMineables(builder);
        DefaultBiomeFeatures.addSprings(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);
    }
    */


    public static Biome snowForest(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
       // spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(ModEntities.TREPASSEUR, 80, 1, 4));

        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.FOX, 8, 2, 4));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 10, 2, 4));

        DefaultBiomeFeatures.addSnowyMobs(spawnBuilder);
        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        //globalOverworldGeneration(biomeBuilder);
        //DefaultBiomeFeatures.addMossyRocks(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        DefaultBiomeFeatures.addExtraGoldOre(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SEPHIN_PLACED_KEY);
        //biomeBuilder.feature(GenerationStep.Feature.TOP_LAYER_MODIFICATION, );
        //DefaultBiomeFeatures.addForestFlowers(biomeBuilder);
        DefaultBiomeFeatures.addFrozenTopLayer(biomeBuilder);


        //DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
        //DefaultBiomeFeatures.addDefaultVegetation(biomeBuilder);

        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.5f)
                .temperature(0f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(3750089)
                        .waterFogColor(329011)
                        .skyColor(13759743)
                        .grassColor(2723393)
                        .foliageColor(2723393)
                        .fogColor(15069183)
                        .build())
                .build();
    }

    public static Biome goldenLands(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        //spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(ModEntities.TICKELER, 80, 1, 4));

        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.ALLAY, 8, 1, 7));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(ModEntities.BREEDY, 15, 1, 8));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(ModEntities.COWSMIC, 8, 2, 4));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(ModEntities.BUMBO, 12, 2, 3));

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        //globalOverworldGeneration(biomeBuilder);
        //DefaultBiomeFeatures.addMossyRocks(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        DefaultBiomeFeatures.addExtraGoldOre(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.OAST_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BULBO_FLOWER_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PINK_PHYGELUS_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.FLOWER_CHERRY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.FOREST_FLOWERS);
        //biomeBuilder.feature(GenerationStep.Feature.TOP_LAYER_MODIFICATION, );
        DefaultBiomeFeatures.addForestGrass(biomeBuilder);
        //DefaultBiomeFeatures.addLargeFerns(biomeBuilder);


        //DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
        //DefaultBiomeFeatures.addDefaultVegetation(biomeBuilder);

        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.6f)
                .temperature(0.6f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(4159204)
                        .waterFogColor(329011)
                        .skyColor(OverworldBiomeCreator.getSkyColor(0.7f))
                        .grassColor(11983713)
                        .foliageColor(11983713)
                        .fogColor(12638463)
                        .build())
                .build();
    }

    public static Biome tearsValley(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(ModEntities.TOOKI, 15, 1, 5));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(ModEntities.RATH, 12, 2, 3));

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        //globalOverworldGeneration(biomeBuilder);
        //DefaultBiomeFeatures.addMossyRocks(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        DefaultBiomeFeatures.addExtraGoldOre(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.EGRORIC_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TORN_BUSH_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TORN_FLOWER_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLUE_OSPET_PLACED_KEY);
        //biomeBuilder.feature(GenerationStep.Feature.TOP_LAYER_MODIFICATION, );
        DefaultBiomeFeatures.addPlainsTallGrass(biomeBuilder);
        DefaultBiomeFeatures.addJungleGrass(biomeBuilder);
        DefaultBiomeFeatures.addLargeFerns(biomeBuilder);


        //DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
        //DefaultBiomeFeatures.addDefaultVegetation(biomeBuilder);

        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.8f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(4159204)
                        .waterFogColor(329011)
                        .skyColor(7444166)
                        .grassColor(10372548)
                        .foliageColor(10372548)
                        .fogColor(4940970)
                        .build())
                .build();
    }

    public static Biome forestOfMelody(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        //spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(ModEntities.TICKELER, 80, 1, 4));

        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.PARROT, 12, 1, 4));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(ModEntities.BREEDY, 17, 1, 4));

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        //globalOverworldGeneration(biomeBuilder);
        //DefaultBiomeFeatures.addMossyRocks(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        DefaultBiomeFeatures.addExtraGoldOre(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.KIWI_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.YELLOW_PHYGELUS_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.SURFACE_STRUCTURES, ModPlacedFeatures.NOTE_BLOCK_PATCH_PLACED);
        //biomeBuilder.feature(GenerationStep.Feature.TOP_LAYER_MODIFICATION, );
        DefaultBiomeFeatures.addForestGrass(biomeBuilder);
        //DefaultBiomeFeatures.addLargeFerns(biomeBuilder);


        //DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
        //DefaultBiomeFeatures.addDefaultVegetation(biomeBuilder);

        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.6f)
                .temperature(0.5f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(4159204)
                        .waterFogColor(329011)
                        .skyColor(OverworldBiomeCreator.getSkyColor(0.7f))
                        .grassColor(11983713)
                        .foliageColor(11983713)
                        .fogColor(12638463)
                        .build())
                .build();
    }

    public static Biome torchDesert(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(ModEntities.BUMBO, 13, 2, 3));

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.FADED_CACTUS_PLACED_KEY);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        DefaultBiomeFeatures.addExtraGoldOre(biomeBuilder);

        DefaultBiomeFeatures.addDesertDeadBushes(biomeBuilder);
        DefaultBiomeFeatures.addDesertFeatures(biomeBuilder);
        DefaultBiomeFeatures.addDesertVegetation(biomeBuilder);

        return new Biome.Builder()
                .precipitation(false)
                .downfall(0f)
                .temperature(0.9f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(5167808)
                        .waterFogColor(958596)
                        .skyColor(OverworldBiomeCreator.getSkyColor(0.9f))
                        .grassColor(5738240)
                        .foliageColor(5738240)
                        .fogColor(12638463)
                        .build())
                .build();
    }

    public static Biome torchPinkDesert(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(ModEntities.BUMBO, 13, 2, 3));

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.FADED_CACTUS_PLACED_KEY);

        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        DefaultBiomeFeatures.addExtraGoldOre(biomeBuilder);

        DefaultBiomeFeatures.addDesertDeadBushes(biomeBuilder);
        DefaultBiomeFeatures.addDesertFeatures(biomeBuilder);
        DefaultBiomeFeatures.addDesertVegetation(biomeBuilder);

        return new Biome.Builder()
                .precipitation(false)
                .downfall(0f)
                .temperature(0.9f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(5167808)
                        .waterFogColor(958596)
                        .skyColor(OverworldBiomeCreator.getSkyColor(0.9f))
                        .grassColor(5738240)
                        .foliageColor(5738240)
                        .fogColor(12638463)
                        .build())
                .build();
    }

    public static Biome codeForest(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        //spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(ModEntities.TICKELER, 80, 1, 4));

        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.PARROT, 12, 1, 4));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(ModEntities.BREEDY, 17, 1, 4));

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        //globalOverworldGeneration(biomeBuilder);
        //DefaultBiomeFeatures.addMossyRocks(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        DefaultBiomeFeatures.addExtraGoldOre(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BINARY_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BINARY_GRASS_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BINARY_TALL_GRASS_PLACED_KEY);
        //biomeBuilder.feature(GenerationStep.Feature.TOP_LAYER_MODIFICATION, );
        DefaultBiomeFeatures.addForestGrass(biomeBuilder);
        //DefaultBiomeFeatures.addLargeFerns(biomeBuilder);


        //DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
        //DefaultBiomeFeatures.addDefaultVegetation(biomeBuilder);

        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.6f)
                .temperature(0.5f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(4159204)
                        .waterFogColor(329011)
                        .skyColor(OverworldBiomeCreator.getSkyColor(0.6f))
                        .grassColor(11983713)
                        .foliageColor(11983713)
                        .fogColor(12638463)
                        .build())
                .build();
    }


}
