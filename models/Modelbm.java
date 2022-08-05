// Made with Blockbench 4.0.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelbm extends EntityModel<Entity> {
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;
	private final ModelRenderer cube_r1;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;
	private final ModelRenderer bbmain;

	public Modelbm() {
		textureWidth = 128;
		textureHeight = 128;

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(0.0F, 24.0F, 0.0F);
		leftarm.setTextureOffset(32, 8).addBox(12.0F, -46.0F, -1.0F, 9.0F, 4.0F, 3.0F, 0.0F, false);
		leftarm.setTextureOffset(5, 42).addBox(10.0F, -45.0F, -1.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		leftarm.setTextureOffset(5, 42).addBox(15.0F, -42.0F, -1.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);
		leftarm.setTextureOffset(33, 28).addBox(15.0F, -34.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(9, 42).addBox(15.0F, -32.0F, -2.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);
		leftarm.setTextureOffset(47, 11).addBox(17.0F, -24.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(37, 8).addBox(15.0F, -24.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(0.0F, 24.0F, 0.0F);
		rightarm.setTextureOffset(8, 44).addBox(-16.0F, -23.0F, -14.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(32, 5).addBox(-20.0F, -46.0F, -1.0F, 9.0F, 4.0F, 3.0F, 0.0F, false);
		rightarm.setTextureOffset(5, 42).addBox(-11.0F, -45.0F, -1.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		rightarm.setTextureOffset(8, 43).addBox(-17.0F, -42.0F, -1.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);
		rightarm.setTextureOffset(32, 16).addBox(-17.0F, -34.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(6, 44).addBox(-17.0F, -32.0F, -2.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);
		rightarm.setTextureOffset(33, 10).addBox(-15.0F, -24.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(30, 15).addBox(-17.0F, -24.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(0, 45).addBox(-16.0F, -23.0F, -10.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
		cube_r1.setTextureOffset(35, 11).addBox(-27.0F, 13.0F, -13.0F, 9.0F, 5.0F, 3.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(0.0F, 24.0F, 0.0F);
		rightleg.setTextureOffset(32, 12).addBox(12.0F, -1.0F, -8.0F, 3.0F, 1.0F, 9.0F, 0.0F, false);
		rightleg.setTextureOffset(38, 8).addBox(12.0F, -3.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		rightleg.setTextureOffset(4, 41).addBox(12.0F, -21.0F, -2.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);
		rightleg.setTextureOffset(44, 5).addBox(12.0F, -13.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		rightleg.setTextureOffset(4, 40).addBox(12.0F, -11.0F, -2.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(0.0F, 24.0F, 0.0F);
		leftleg.setTextureOffset(5, 43).addBox(-15.0F, -21.0F, -2.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);
		leftleg.setTextureOffset(45, 14).addBox(-15.0F, -13.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		leftleg.setTextureOffset(2, 43).addBox(-15.0F, -11.0F, -2.0F, 3.0F, 8.0F, 3.0F, 0.0F, false);
		leftleg.setTextureOffset(32, 12).addBox(-15.0F, -1.0F, -8.0F, 3.0F, 1.0F, 9.0F, 0.0F, false);
		leftleg.setTextureOffset(47, 12).addBox(-15.0F, -3.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		bbmain = new ModelRenderer(this);
		bbmain.setRotationPoint(0.0F, 24.0F, 0.0F);
		bbmain.setTextureOffset(34, 9).addBox(-14.0F, -23.0F, -1.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		bbmain.setTextureOffset(92, 0).addBox(-8.0F, -44.0F, 6.0F, 17.0F, 20.0F, 1.0F, 0.0F, false);
		bbmain.setTextureOffset(39, 13).addBox(9.0F, -23.0F, -1.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		bbmain.setTextureOffset(78, 12).addBox(-8.0F, -25.0F, -1.0F, 17.0F, 1.0F, 7.0F, 0.0F, false);
		bbmain.setTextureOffset(26, 1).addBox(-8.0F, -23.0F, -2.0F, 17.0F, 1.0F, 3.0F, 0.0F, false);
		bbmain.setTextureOffset(0, 105).addBox(-9.0F, -24.0F, -9.0F, 19.0F, 1.0F, 17.0F, 0.0F, false);
		bbmain.setTextureOffset(0, 105).addBox(-9.0F, -46.0F, 7.0F, 19.0F, 22.0F, 1.0F, 0.0F, false);
		bbmain.setTextureOffset(0, 110).addBox(-9.0F, -41.0F, -9.0F, 19.0F, 17.0F, 1.0F, 0.0F, false);
		bbmain.setTextureOffset(96, 96).addBox(-9.0F, -41.0F, -8.0F, 1.0F, 17.0F, 15.0F, 0.0F, false);
		bbmain.setTextureOffset(96, 96).addBox(9.0F, -41.0F, -8.0F, 1.0F, 17.0F, 15.0F, 0.0F, false);
		bbmain.setTextureOffset(9, 41).addBox(9.0F, -45.0F, -1.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);
		bbmain.setTextureOffset(12, 41).addBox(-9.0F, -45.0F, -1.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		bbmain.render(matrixStack, buffer, packedLight, packedOverlay);
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