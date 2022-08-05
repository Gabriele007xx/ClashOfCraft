// Made with Blockbench 4.0.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelhogrider extends EntityModel<Entity> {
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;

	public Modelhogrider() {
		textureWidth = 128;
		textureHeight = 64;

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(0.0F, 24.0F, 0.0F);
		leftarm.setTextureOffset(0, 16).addBox(-1.0F, -6.0F, -9.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(0.0F, 24.0F, 0.0F);
		rightarm.setTextureOffset(0, 16).addBox(-7.0F, -6.0F, -9.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(0.0F, 24.0F, 0.0F);
		leftleg.setTextureOffset(0, 16).addBox(-1.0F, -6.0F, 3.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(0.0F, 24.0F, 0.0F);
		rightleg.setTextureOffset(0, 16).addBox(-7.0F, -6.0F, 3.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-6.0F, -14.0F, -17.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 32).addBox(-6.0F, -34.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(16, 48).addBox(-6.0F, -26.0F, -3.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(78, 48).addBox(-7.0F, -33.0F, -14.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 3.1416F, 0.0F);
		cube_r1.setTextureOffset(57, 52).addBox(4.0F, -32.0F, 10.0F, 4.0F, 4.0F, 6.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.2654F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(40, 48).addBox(-8.0F, -5.0F, -26.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		cube_r2.setTextureOffset(40, 48).addBox(0.0F, -5.0F, -26.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 48).addBox(0.0F, -2.0F, -18.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 48).addBox(-8.0F, -2.0F, -18.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.5708F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(32, 8).addBox(-7.0F, -9.0F, 6.0F, 10.0F, 16.0F, 8.0F, 0.0F, false);
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