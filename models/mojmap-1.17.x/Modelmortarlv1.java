// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmortarlv1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mortarlv1"), "main");
	private final ModelPart bb_main;

	public Modelmortarlv1(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 109)
						.addBox(-8.0F, -5.0F, -7.0F, 2.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(100, 114)
						.addBox(-8.0F, -7.0F, -6.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(100, 114)
						.addBox(6.0F, -7.0F, -6.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 109)
						.addBox(6.0F, -5.0F, -7.0F, 2.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -3.0F, -6.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(102, 0)
						.addBox(-6.0F, -19.0F, 5.0F, 12.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(102, 0)
						.addBox(-6.0F, -19.0F, -6.0F, 12.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(106, 0)
						.addBox(-6.0F, -19.0F, -5.0F, 1.0F, 16.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(106, 0)
						.addBox(5.0F, -19.0F, -5.0F, 1.0F, 16.0F, 10.0F, new CubeDeformation(0.0F)),
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