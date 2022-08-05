// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelwallwrecker<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "wallwrecker"), "main");
	private final ModelPart bb_main;

	public Modelwallwrecker(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 107)
						.addBox(12.0F, -4.0F, -16.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 107)
						.addBox(-13.0F, -4.0F, -16.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 93)
						.addBox(12.0F, -7.0F, 12.0F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 93)
						.addBox(-13.0F, -7.0F, 12.0F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 115)
						.addBox(-4.0F, -25.0F, -41.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 85)
						.addBox(-35.0F, -23.0F, -2.0F, 64.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-20.0F, -33.0F, -12.0F, 40.0F, 30.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}