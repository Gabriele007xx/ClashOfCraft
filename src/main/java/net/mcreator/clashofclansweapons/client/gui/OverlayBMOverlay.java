
package net.mcreator.clashofclansweapons.client.gui;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.clashofclansweapons.procedures.ShowcooldownProcedure;
import net.mcreator.clashofclansweapons.procedures.OverlayshowingfuncProcedure;
import net.mcreator.clashofclansweapons.network.ClashofclansweaponsModVariables;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class OverlayBMOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGameOverlayEvent.Pre event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
			int w = event.getWindow().getGuiScaledWidth();
			int h = event.getWindow().getGuiScaledHeight();
			int posX = w / 2;
			int posY = h / 2;
			Level _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;
			Player entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.level;
				_x = entity.getX();
				_y = entity.getY();
				_z = entity.getZ();
			}
			Level world = _world;
			double x = _x;
			double y = _y;
			double z = _z;
			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.enableBlend();
			RenderSystem.setShader(GameRenderer::getPositionTexShader);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
					GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.setShaderColor(1, 1, 1, 1);
			if (OverlayshowingfuncProcedure.execute(entity)) {
				Minecraft.getInstance().font.draw(event.getMatrixStack(),
						"Health:" + (int) ((entity.getCapability(ClashofclansweaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ClashofclansweaponsModVariables.PlayerVariables())).bmh) + "",
						posX + -180, posY + -112, -1);
				Minecraft.getInstance().font.draw(event.getMatrixStack(), "Space: Jump", posX + 153, posY + 104, -1);
				RenderSystem.setShaderTexture(0, new ResourceLocation("clashofclansweapons:textures/screens/ability_l.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -207, posY + 59, 0, 0, 63, 59, 63, 59);

				if (ShowcooldownProcedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("clashofclansweapons:textures/screens/ability_lc.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -207, posY + 59, 0, 0, 63, 59, 63, 59);
				}
				RenderSystem.setShaderTexture(0, new ResourceLocation("clashofclansweapons:textures/screens/hitpoint.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -207, posY + -112, 0, 0, 20, 19, 20, 19);

			}
			RenderSystem.depthMask(true);
			RenderSystem.defaultBlendFunc();
			RenderSystem.enableDepthTest();
			RenderSystem.disableBlend();
			RenderSystem.setShaderColor(1, 1, 1, 1);
		}
	}
}
