package coc.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mcreator.clashofclansweapons.ModID;
import net.mcreator.clashofclansweapons.entity.LogEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LogRenderer extends GeoEntityRenderer<LogEntity> {
    public LogRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new LogModel());
    }
    @Override
    public ResourceLocation getTextureLocation(LogEntity entity) {
        return new ResourceLocation(ModID.MOD_ID, "textures/entities/log.png");
    }
    @Override
    public RenderType getRenderType(LogEntity entity, float ticks, PoseStack pose, MultiBufferSource render, VertexConsumer vertex, int light, ResourceLocation tex)
    {
        pose.scale(0.8f,0.8f,0.8f);
        return super.getRenderType(entity,ticks,pose,render,vertex,light,tex);
    }
}
