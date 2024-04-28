
package net.mcreator.clashofclansweapons.client.renderer;

import net.mcreator.clashofclansweapons.client.model.Modelcchealbottle;
import net.mcreator.clashofclansweapons.entity.GraveyardBEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.CCincantesimo0Entity;
import net.mcreator.clashofclansweapons.client.model.Modelccapitalh;

public class GraveyardBRenderer extends MobRenderer<GraveyardBEntity, Modelcchealbottle<GraveyardBEntity>> {
    public GraveyardBRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelcchealbottle(context.bakeLayer(Modelcchealbottle.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(GraveyardBEntity entity) {
        return new ResourceLocation("clashofclansweapons:textures/entities/graveyard_b.png");
    }
}

