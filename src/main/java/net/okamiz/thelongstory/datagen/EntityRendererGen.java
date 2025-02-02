package net.okamiz.thelongstory.datagen;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.okamiz.thelongstory.TheLongStory;
import net.okamiz.thelongstory.entity.ModEntities;
import net.okamiz.thelongstory.entity.client.*;

public class EntityRendererGen {

    public static void registerEntityRenderer(){
        TheLongStory.LOGGER.info("Registering EntityRenderer for " + TheLongStory.MOD_ID);

        EntityRendererRegistry.register(ModEntities.TREPASSEUR, TrepasseurRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.TREPASSEUR, TrepasseurModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.TICKELER, TickelerRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.TICKELER, TickelerModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.CRAWLER, CrawlerRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.CRAWLER, CrawlerModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.TOOKI, TookiRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.TOOKI, TookiModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.RATH, RathRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.RATH, RathModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.BUMBO, BumboRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.BUMBO, BumboModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.COWSMIC, CowsmicRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.COWSMIC, CowsmicModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.BREEDY, BreedyRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.BREEDY, BreedyModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.AMETHYST_GOLEM, AmethystGolemRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.AMETHYST_GOLEM, AmethystGolemModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.AMETHYST_MINION, AmethystMinionRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.AMETHYST_MINION, AmethystMinionModel::getTexturedModelData);
    }
}
