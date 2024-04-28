/**
package net.mcreator.clashofclansweapons.client.renderer;

import net.mcreator.clashofclansweapons.client.model.Modelair_bo;
import net.mcreator.clashofclansweapons.client.model.Modellogtrap;
import net.mcreator.clashofclansweapons.entity.LogTrapEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class LogTrapRenderer extends MobRenderer<LogTrapEntity, Modellogtrap<LogTrapEntity>> {
    public LogTrapRenderer(EntityRendererProvider.Context context) {
        super(context, new Modellogtrap(context.bakeLayer(Modellogtrap.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(LogTrapEntity entity) {
        return new ResourceLocation("clashofclansweapons:textures/entities/log.png");
    }
}
 **/
