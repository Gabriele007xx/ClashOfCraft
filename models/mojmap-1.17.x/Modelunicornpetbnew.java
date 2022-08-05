// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelunicornpetbnew<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "unicornpetbnew"), "main");
	private final ModelPart leftarm;
	private final ModelPart rightarm;
	private final ModelPart leftleg;
	private final ModelPart rightleg;
	private final ModelPart bb_main;

	public Modelunicornpetbnew(ModelPart root) {
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
		this.leftleg = root.getChild("leftleg");
		this.rightleg = root.getChild("rightleg");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(0, 22)
				.addBox(4.0F, -17.0F, -7.0F, 3.0F, 17.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, -8.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(0, 25)
				.addBox(-7.0F, -17.0F, -15.0F, 3.0F, 17.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(0, 30)
				.addBox(4.0F, -17.0F, 12.0F, 3.0F, 17.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(0, 27)
				.addBox(-7.0F, -17.0F, 12.0F, 3.0F, 17.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 20)
						.addBox(-8.0F, -31.0F, -16.0F, 16.0F, 16.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -43.0F, -29.0F, 8.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(94, 0)
						.addBox(-3.0F, -41.0F, -36.0F, 6.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(54, 82)
						.addBox(-4.0F, -46.0F, -19.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, -46.0F, -19.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(75, 62)
						.addBox(-1.0F, -48.0F, -27.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 113)
						.addBox(-1.0F, -39.0F, 14.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 25)
						.addBox(-2.0F, -38.0F, 10.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 109)
						.addBox(-2.0F, -11.0F, 33.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		leftarm.render(poseStack, buffer, packedLight, packedOverlay);
		rightarm.render(poseStack, buffer, packedLight, packedOverlay);
		leftleg.render(poseStack, buffer, packedLight, packedOverlay);
		rightleg.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}