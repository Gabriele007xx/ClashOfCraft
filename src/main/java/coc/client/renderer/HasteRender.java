package coc.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mcreator.clashofclansweapons.ModID;
import net.mcreator.clashofclansweapons.entity.HasteAreaEntity;
import net.mcreator.clashofclansweapons.entity.HasteEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class HasteRender extends GeoEntityRenderer<HasteEntity> {
    public HasteRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new HasteModel());
    }
    @Override
    public ResourceLocation getTextureLocation(HasteEntity entity) {
        return new ResourceLocation(ModID.MOD_ID, "textures/entities/haste_bottle.png");
    }
    @Override
    public RenderType getRenderType(HasteEntity entity, float ticks, PoseStack pose, MultiBufferSource render, VertexConsumer vertex, int light, ResourceLocation tex)
    {
        pose.scale(0.8f,0.8f,0.8f);
        return super.getRenderType(entity,ticks,pose,render,vertex,light,tex);
    }
}
