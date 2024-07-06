package net.okamiz.thelongstory.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.okamiz.thelongstory.TheLongStory;
import net.okamiz.thelongstory.entity.custom.RathEntity;

public class RathRenderer extends MobEntityRenderer<RathEntity, RathModel<RathEntity>> {

    private static final Identifier TEXTURE = new Identifier(TheLongStory.MOD_ID, "textures/entity/rath.png");

    public RathRenderer(EntityRendererFactory.Context context) {
        super(context, new RathModel(context.getPart(ModModelLayers.RATH)), 0.6f);
        this.shadowRadius = 0.25f;
    }

    @Override
    public Identifier getTexture(RathEntity entity) {
        return TEXTURE;
    }



    @Override
    public void render(RathEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {

        if(mobEntity.isBaby()){
            matrixStack.scale(0.5f,0.5f,0.5f);
            }else{
            matrixStack.scale(1f,1f,1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
