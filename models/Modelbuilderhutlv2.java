// Made with Blockbench 4.0.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelbuilderhutlv2 extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bb_main;

	public Modelbuilderhutlv2() {
		textureWidth = 128;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(15.0F, 24.0F, -11.0F);
		bone.setTextureOffset(0, 11).addBox(-4.0F, -11.0F, 1.0F, 1.0F, 11.0F, 19.0F, 0.0F, false);
		bone.setTextureOffset(0, 11).addBox(-27.0F, -11.0F, 20.0F, 23.0F, 11.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 16).addBox(-28.0F, -11.0F, 1.0F, 1.0F, 11.0F, 19.0F, 0.0F, false);
		bone.setTextureOffset(1, 75).addBox(-28.0F, -30.0F, 20.0F, 1.0F, 30.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(13, 75).addBox(-28.0F, -30.0F, 0.0F, 1.0F, 30.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(8, 73).addBox(-4.0F, -30.0F, 0.0F, 1.0F, 30.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 72).addBox(-4.0F, -30.0F, 20.0F, 1.0F, 30.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 16).addBox(-27.0F, -30.0F, 20.0F, 23.0F, 19.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 16).addBox(-4.0F, -30.0F, 1.0F, 1.0F, 19.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(0, 16).addBox(-28.0F, -30.0F, 1.0F, 1.0F, 19.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(0, 16).addBox(-4.0F, -30.0F, 13.0F, 1.0F, 19.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(0, 16).addBox(-28.0F, -30.0F, 13.0F, 1.0F, 19.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(0, 75).addBox(-29.0F, -45.0F, -1.0F, 27.0F, 1.0F, 23.0F, 0.0F, false);
		bone.setTextureOffset(36, 10).addBox(-28.0F, -31.0F, 0.0F, 25.0F, 1.0F, 21.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.0F, 0.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.3927F, 0.0F);
		cube_r1.setTextureOffset(0, 5).addBox(-19.0F, -46.0F, 3.0F, 3.0F, 1.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(9, 74).addBox(-16.0F, -46.0F, 5.0F, 9.0F, 1.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(3.0F, -5.0F, 0.0F);
		bb_main.setTextureOffset(27, 20).addBox(-4.0F, -13.0F, -10.0F, 3.0F, 11.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 128).addBox(-11.0F, -13.0F, -11.0F, 17.0F, 0.0F, 17.0F, 0.0F, false);
		bb_main.setTextureOffset(80, 209).addBox(-4.0F, -5.0F, -10.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(80, 209).addBox(-1.0F, -5.0F, -10.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(114, 250).addBox(-4.0F, -15.0F, 0.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
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