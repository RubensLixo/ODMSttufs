package net.mcreator.odmsttuf.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelsteampunk_glasses<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("odmsttuf", "modelsteampunk_glasses"), "main");
	public final ModelPart Glases;
	public final ModelPart Lentes;
	public final ModelPart LenteRight;
	public final ModelPart LenteLeft;
	public final ModelPart Ala;

	public Modelsteampunk_glasses(ModelPart root) {
		this.Glases = root.getChild("Glases");
		this.Lentes = this.Glases.getChild("Lentes");
		this.LenteRight = this.Lentes.getChild("LenteRight");
		this.LenteLeft = this.Lentes.getChild("LenteLeft");
		this.Ala = this.Glases.getChild("Ala");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Glases = partdefinition.addOrReplaceChild("Glases", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Lentes = Glases.addOrReplaceChild("Lentes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LenteRight = Lentes.addOrReplaceChild("LenteRight", CubeListBuilder.create().texOffs(32, 32).addBox(-5.0F, -8.0F, -5.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LenteLeft = Lentes.addOrReplaceChild("LenteLeft", CubeListBuilder.create().texOffs(32, 38).addBox(2.0F, -8.0F, -5.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Ala = Glases.addOrReplaceChild("Ala",
				CubeListBuilder.create().texOffs(40, 16).addBox(-2.0F, -8.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 20).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 29)
						.addBox(4.0F, -6.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 23).addBox(-5.0F, -5.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 44)
						.addBox(4.0F, -5.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 26).addBox(-5.0F, -4.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 35)
						.addBox(-4.0F, -4.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 18).addBox(-2.0F, -3.0F, 4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 37)
						.addBox(2.0F, -4.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 32).addBox(4.0F, -4.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Glases.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
