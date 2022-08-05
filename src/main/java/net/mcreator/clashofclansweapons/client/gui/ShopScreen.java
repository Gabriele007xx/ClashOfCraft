
package net.mcreator.clashofclansweapons.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.clashofclansweapons.world.inventory.ShopMenu;
import net.mcreator.clashofclansweapons.network.ShopButtonMessage;
import net.mcreator.clashofclansweapons.ClashofclansweaponsMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ShopScreen extends AbstractContainerScreen<ShopMenu> {
	private final static HashMap<String, Object> guistate = ShopMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ShopScreen(ShopMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("clashofclansweapons:textures/screens/shop.png");

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
		this.font.draw(poseStack, "Shop", 78, 7, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 6, this.topPos + 25, 72, 20, new TextComponent("Resources"), e -> {
			if (true) {
				ClashofclansweaponsMod.PACKET_HANDLER.sendToServer(new ShopButtonMessage(0, x, y, z));
				ShopButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 87, this.topPos + 25, 67, 20, new TextComponent("Defences"), e -> {
			if (true) {
				ClashofclansweaponsMod.PACKET_HANDLER.sendToServer(new ShopButtonMessage(1, x, y, z));
				ShopButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 6, this.topPos + 52, 82, 20, new TextComponent("Decorations"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 96, this.topPos + 52, 46, 20, new TextComponent("Army"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 78, this.topPos + 79, 51, 20, new TextComponent("Traps"), e -> {
		}));
	}
}
