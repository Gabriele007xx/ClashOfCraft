package coc.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mcreator.clashofclansweapons.ModID;
import net.mcreator.clashofclansweapons.entity.CCIncantesimo2Entity;
import net.mcreator.clashofclansweapons.entity.HealerEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RageRenderer extends GeoEntityRenderer<CCIncantesimo2Entity> {
    public RageRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new RageModel());
    }
    @Override
    public ResourceLocation getTextureLocation(CCIncantesimo2Entity entity) {
        return new ResourceLocation(ModID.MOD_ID, "textures/entities/rage_spell_circle.png");
    }
    @Override
    public RenderType getRenderType(CCIncantesimo2Entity entity, float ticks, PoseStack pose, MultiBufferSource render, VertexConsumer vertex, int light, ResourceLocation tex)
    {
        pose.scale(0.8f,0.8f,0.8f);
        return super.getRenderType(entity,ticks,pose,render,vertex,light,tex);
    }
}
