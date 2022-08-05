// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelfirespirit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "firespirit"), "main");
	private final ModelPart Leftleg;
	private final ModelPart main;
	private final ModelPart RightLeg;

	public Modelfirespirit(ModelPart root) {
		this.Leftleg = root.getChild("Leftleg");
		this.main = root.getChild("main");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Leftleg = partdefinition.addOrReplaceChild("Leftleg", CubeListBuilder.create().texOffs(8, 21)
				.addBox(1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = partdefinition.addOrReplaceChild("main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -12.0F, -4.0F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(14, 18)
						.addBox(-4.0F, -15.0F, -4.0F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 15)
						.addBox(-4.0F, -15.0F, 3.0F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(4.0F, -15.0F, -4.0F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-4.0F, -15.0F, -4.0F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 21)
				.addBox(-3.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Leftleg.render(poseStack, buffer, packedLight, packedOverlay);
		main.render(poseStack, buffer, packedLight, packedOverlay);
		RightLeg.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}