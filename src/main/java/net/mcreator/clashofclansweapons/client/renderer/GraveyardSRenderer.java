
package net.mcreator.clashofclansweapons.client.renderer;

import net.mcreator.clashofclansweapons.entity.GraveyardSpellEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.CCincantesimo0Entity;
import net.mcreator.clashofclansweapons.client.model.Modelccapitalh;

public class GraveyardSRenderer extends MobRenderer<GraveyardSpellEntity, Modelccapitalh<GraveyardSpellEntity>> {
    public GraveyardSRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelccapitalh(context.bakeLayer(Modelccapitalh.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(GraveyardSpellEntity entity) {
        return new ResourceLocation("clashofclansweapons:textures/entities/graveyard_spell.png");
    }
}

