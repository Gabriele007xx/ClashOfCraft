package net.mcreator.clashofclansweapons.entity;

import coc.troop.clancapital.ClanCapitalTroopBase;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.List;

public class HasteAreaEntity extends PathfinderMob implements IAnimatable {
    private final int MAX_AGE = 48000;
    private int CURRENT_AGE = 0;
    private AnimationFactory factory = new AnimationFactory(this);
    public HasteAreaEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(ClashofclansweaponsModEntities.CC_INCANTESIMO_2.get(), world);
    }
    public HasteAreaEntity(EntityType<? extends PathfinderMob> p_21683_, Level p_21684_) {
        super(p_21683_, p_21684_);
    }
    @Override
    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    @Override
    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    @Override
    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
    }

    @Override
    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        return false;
    }

    @Override
    public boolean isPushable() {
        return false;
    }

    @Override
    protected void doPush(Entity entityIn) {
    }

    @Override
    protected void pushEntities() {
    }

    public static void init() {
    }
    @Override
    public void tick() {
        super.tick();
        CURRENT_AGE++;
        List<LivingEntity> list = this.level.getEntitiesOfClass(LivingEntity.class,
                (new AABB(new BlockPos(this.getX(), this.getY(), this.getZ()))).inflate(8.0D, 2.9D, 8.0D));
        for (LivingEntity ent : list) {
            if (ent instanceof ClanCapitalTroopBase || ent instanceof Player) {
                ent.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 12000, 1, false, false));
            }
        }
        if (CURRENT_AGE >= MAX_AGE) {
            this.discard();
        }
    }
    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
        builder = builder.add(Attributes.MAX_HEALTH, 10);
        builder = builder.add(Attributes.ARMOR, 0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 255);
        return builder;
    }
    @Override
    public void registerControllers(AnimationData data) {
    data.addAnimationController(new AnimationController(this, "controller",0,this::predicate));
    }
    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
    {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.haste_area.idle", true));
        return PlayState.CONTINUE;
    }
    @Override
    public AnimationFactory getFactory() {
        return factory;
    }
}
