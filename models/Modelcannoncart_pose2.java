// Made with Blockbench 4.0.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcannoncart_pose2 extends EntityModel<Entity> {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public Modelcannoncart_pose2() {
		textureWidth = 128;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(84, 15).addBox(-5.0F, -5.0F, 6.0F, 8.0F, 5.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(67, 15).addBox(-5.0F, -5.0F, -8.0F, 8.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.2618F);
		cube_r1.setTextureOffset(110, 34).addBox(7.0F, -3.0F, 1.0F, 2.0F, 5.0F, 7.0F, 0.0F, false);
		cube_r1.setTextureOffset(110, 34).addBox(7.0F, -3.0F, -6.0F, 2.0F, 5.0F, 7.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.6109F, -0.4363F);
		cube_r2.setTextureOffset(85, 34).addBox(-18.0F, -9.0F, 0.0F, 12.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.5672F, -0.3927F);
		cube_r3.setTextureOffset(85, 34).addBox(-17.0F, -8.0F, -3.0F, 12.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.3927F);
		cube_r4.setTextureOffset(85, 34).addBox(-17.0F, -8.0F, -3.0F, 12.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r4.setTextureOffset(85, 34).addBox(-17.0F, -8.0F, 0.0F, 12.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 1.5708F, 0.0F);
		cube_r5.setTextureOffset(0, 0).addBox(9.0F, -17.0F, -7.0F, 3.0F, 1.0F, 14.0F, 0.0F, false);
		cube_r5.setTextureOffset(0, 0).addBox(9.0F, -8.0F, -7.0F, 3.0F, 1.0F, 14.0F, 0.0F, false);
		cube_r5.setTextureOffset(0, 0).addBox(9.0F, -16.0F, 6.0F, 3.0F, 8.0F, 1.0F, 0.0F, false);
		cube_r5.setTextureOffset(0, 0).addBox(9.0F, -16.0F, -7.0F, 3.0F, 8.0F, 1.0F, 0.0F, false);
		cube_r5.setTextureOffset(0, 27).addBox(-9.0F, -16.0F, -6.0F, 18.0F, 8.0F, 12.0F, 0.0F, false);
		cube_r5.setTextureOffset(72, 0).addBox(-6.0F, -8.0F, -8.0F, 12.0F, 3.0F, 16.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
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