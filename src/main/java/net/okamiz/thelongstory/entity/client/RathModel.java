// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.okamiz.thelongstory.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import net.okamiz.thelongstory.entity.animation.ModAnimations;
import net.okamiz.thelongstory.entity.custom.RathEntity;

public class RathModel<T extends RathEntity> extends SinglePartEntityModel<T> {
	private final ModelPart base;
	private final ModelPart head;

	public RathModel(ModelPart root) {
		this.base = root.getChild("base");
		this.head = root.getChild("base").getChild("body").getChild("nose");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData base = modelPartData.addChild("base", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData leg1 = base.addChild("leg1", ModelPartBuilder.create().uv(44, 44).cuboid(-2.0F, -1.0F, -2.0F, 3.0F, 7.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.5F, -6.0F, 6.0F));

		ModelPartData leg2 = base.addChild("leg2", ModelPartBuilder.create().uv(44, 34).cuboid(-1.0F, -1.0F, -2.0F, 3.0F, 7.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.5F, -6.0F, 6.0F));

		ModelPartData leg3 = base.addChild("leg3", ModelPartBuilder.create().uv(34, 0).cuboid(-2.0F, -1.0F, -1.0F, 3.0F, 7.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.5F, -6.0F, -5.0F));

		ModelPartData leg4 = base.addChild("leg4", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -1.0F, -1.0F, 3.0F, 7.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.5F, -6.0F, -5.0F));

		ModelPartData body = base.addChild("body", ModelPartBuilder.create().uv(1, 1).cuboid(-4.0F, -5.0F, -7.0F, 9.0F, 9.0F, 15.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.5F, -9.0F, 0.0F));

		ModelPartData nose = body.addChild("nose", ModelPartBuilder.create().uv(40, 17).cuboid(-3.0F, -5.3927F, -7.7544F, 5.0F, 7.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -5.0F, -7.0F, 0.9599F, 0.0F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 13).cuboid(-3.7071F, -0.2929F, 0.0F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.2F, -7.9F, -9.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData head2 = head.addChild("head2", ModelPartBuilder.create().uv(8, 13).cuboid(-3.0F, -1.0F, 0.0F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.6929F, -1.4929F, 0.0F, 0.0F, 0.0F, 1.4399F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		base.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return base;
	}

	@Override
	public void setAngles(RathEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		//this.setHeadAngles(headYaw,headPitch);

		this.animateMovement(ModAnimations.RATH_WALK, limbAngle, limbDistance, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.RATH_IDLE, animationProgress, 1f);
	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}

}