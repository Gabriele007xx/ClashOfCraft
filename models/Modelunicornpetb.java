// Made with Blockbench 4.0.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelunicornpetb extends EntityModel<Entity> {
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;

	public Modelunicornpetb() {
		textureWidth = 128;
		textureHeight = 128;

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(0.0F, 24.0F, -8.0F);
		leftarm.setTextureOffset(0, 22).addBox(4.0F, -17.0F, -7.0F, 3.0F, 17.0F, 3.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(0.0F, 24.0F, 0.0F);
		rightarm.setTextureOffset(0, 25).addBox(-7.0F, -17.0F, -15.0F, 3.0F, 17.0F, 3.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(0.0F, 24.0F, 0.0F);
		leftleg.setTextureOffset(0, 30).addBox(4.0F, -17.0F, 12.0F, 3.0F, 17.0F, 3.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(0.0F, 24.0F, 0.0F);
		rightleg.setTextureOffset(0, 27).addBox(-7.0F, -17.0F, 12.0F, 3.0F, 17.0F, 3.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 20).addBox(-8.0F, -31.0F, -16.0F, 16.0F, 16.0F, 32.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-4.0F, -43.0F, -29.0F, 8.0F, 7.0F, 11.0F, 0.0F, false);
		bb_main.setTextureOffset(94, 0).addBox(-3.0F, -41.0F, -36.0F, 6.0F, 4.0F, 7.0F, 0.0F, false);
		bb_main.setTextureOffset(54, 82).addBox(-4.0F, -46.0F, -19.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(2.0F, -46.0F, -19.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(75, 62).addBox(-1.0F, -48.0F, -27.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, -8.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.6109F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 113).addBox(-1.0F, -39.0F, 14.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(2, 25).addBox(-2.0F, -38.0F, 10.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 109).addBox(-2.0F, -11.0F, 33.0F, 4.0F, 15.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}