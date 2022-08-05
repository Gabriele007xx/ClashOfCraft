
package net.mcreator.clashofclansweapons.client.gui;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.clashofclansweapons.world.inventory.ElixirCollectorLevel1GUIMenu;
import net.mcreator.clashofclansweapons.procedures.Bar75Procedure;
import net.mcreator.clashofclansweapons.procedures.Bar50Procedure;
import net.mcreator.clashofclansweapons.procedures.Bar25Procedure;
import net.mcreator.clashofclansweapons.procedures.Bar100Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ElixirCollectorLevel1GUIScreen extends AbstractContainerScreen<ElixirCollectorLevel1GUIMenu> {
	private final static HashMap<String, Object> guistate = ElixirCollectorLevel1GUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ElixirCollectorLevel1GUIScreen(ElixirCollectorLevel1GUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("clashofclansweapons:textures/screens/elixir_collector_level_1_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("clashofclansweapons:textures/screens/elixirbar1.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 61, 0, 0, 64, 16, 64, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("clashofclansweapons:textures/screens/bar_empty.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 34, 0, 0, 64, 16, 64, 16);

		if (Bar25Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("clashofclansweapons:textures/screens/bar_1.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 34, 0, 0, 64, 16, 64, 16);
		}
		if (Bar50Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("clashofclansweapons:textures/screens/bar_2.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 34, 0, 0, 64, 16, 64, 16);
		}
		if (Bar75Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("clashofclansweapons:textures/screens/bar_3.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 34, 0, 0, 64, 16, 64, 16);
		}
		if (Bar100Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("clashofclansweapons:textures/screens/bar_4.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 34, 0, 0, 64, 16, 64, 16);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Elixir Collector (Liv.1)", 24, 7, -12829636);
		this.font.draw(poseStack, "Production:0.25 elixir/sec", 6, 52, -3407668);
		this.font.draw(poseStack, "Capacity:" + ((int) new Object() {
			public double getValue(BlockPos pos, String tag) {
				BlockEntity BlockEntity = world.getBlockEntity(pos);
				if (BlockEntity != null)
					return BlockEntity.getTileData().getDouble(tag);
				return 0;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "capacity")) + "", 6, 25, -3407668);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
