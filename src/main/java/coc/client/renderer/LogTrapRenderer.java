package coc.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mcreator.clashofclansweapons.ModID;
import net.mcreator.clashofclansweapons.entity.LogEntity;
import net.mcreator.clashofclansweapons.entity.LogTrapEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LogTrapRenderer extends GeoEntityRenderer<LogTrapEntity> {
    public LogTrapRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new LogTrapModel());
    }
    @Override
    public ResourceLocation getTextureLocation(LogTrapEntity entity) {
        return new ResourceLocation(ModID.MOD_ID, "textures/entities/log.png");
    }
    @Override
    public RenderType getRenderType(LogTrapEntity entity, float ticks, PoseStack pose, MultiBufferSource render, VertexConsumer vertex, int light, ResourceLocation tex)
    {
        pose.scale(0.8f,0.8f,0.8f);
        return super.getRenderType(entity,ticks,pose,render,vertex,light,tex);
    }
}
