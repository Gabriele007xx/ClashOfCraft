// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelscattershotleveloneftnew<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "scattershotleveloneftnew"), "main");
	private final ModelPart bb_main;

	public Modelscattershotleveloneftnew(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 50)
						.addBox(-18.0F, -4.0F, -17.0F, 36.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(28, 118)
						.addBox(-18.0F, -5.0F, -19.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 100)
						.addBox(18.0F, -5.0F, -20.0F, 2.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(25, 108)
						.addBox(-20.0F, -5.0F, -19.0F, 2.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 107)
						.addBox(-12.0F, -5.0F, -11.0F, 20.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 97)
						.addBox(-12.0F, -8.0F, -12.0F, 6.0F, 3.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(0, 97)
						.addBox(2.0F, -8.0F, -12.0F, 6.0F, 3.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -8.0F, -6.0F, 8.0F, 3.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -8.0F, 16.0F, 12.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(23, 52)
						.addBox(-8.0F, -9.0F, 30.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -9.0F, 16.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, -9.0F, 18.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -9.0F, 18.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(107, 7)
						.addBox(-4.0F, -12.0F, 21.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 100)
						.addBox(18.0F, -5.0F, 13.0F, 2.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 100)
						.addBox(-20.0F, -5.0F, 13.0F, 2.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(28, 118)
						.addBox(-18.0F, -5.0F, 19.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 118)
						.addBox(12.0F, -5.0F, 19.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 118)
						.addBox(12.0F, -5.0F, -20.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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