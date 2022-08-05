
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.CCrageEntity;
import net.mcreator.clashofclansweapons.client.model.Modelcchealbottle;

public class CCrageRenderer extends MobRenderer<CCrageEntity, Modelcchealbottle<CCrageEntity>> {
	public CCrageRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcchealbottle(context.bakeLayer(Modelcchealbottle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CCrageEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/rage_spell_glass_bt.png");
	}
}
