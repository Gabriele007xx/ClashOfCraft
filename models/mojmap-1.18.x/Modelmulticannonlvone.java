// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmulticannonlvone<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "multicannonlvone"), "main");
	private final ModelPart bb_main;

	public Modelmulticannonlvone(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(20, 22)
						.addBox(-5.0F, -13.0F, -6.0F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(0.0F, -13.0F, -6.0F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(20, 22)
						.addBox(-5.0F, -18.0F, -6.0F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(0.0F, -18.0F, -6.0F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(-9.0F, -4.0F, 5.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(-9.0F, -4.0F, -9.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(5.0F, -4.0F, -9.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(5.0F, -4.0F, 5.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -1.0F, -8.0F, 16.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(24, 40)
						.addBox(-5.0F, -8.0F, -6.0F, 10.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(40, 60)
						.addBox(-5.0F, -20.0F, -4.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 60)
						.addBox(-5.0F, -20.0F, 0.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 27)
						.addBox(-7.0F, -20.0F, 0.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 27)
						.addBox(-7.0F, -20.0F, -4.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 27)
						.addBox(5.0F, -20.0F, -4.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 27)
						.addBox(5.0F, -20.0F, 0.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}