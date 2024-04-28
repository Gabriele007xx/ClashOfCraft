package net.mcreator.clashofclansweapons.entity;

import coc.buidings.defence.Defense;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class TownHall14Entity extends Defense implements RangedAttackMob, IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);
    public TownHall14Entity(PlayMessages.SpawnEntity packet, Level world) {
        this(ClashofclansweaponsModEntities.TH14.get(), world);
    }
    public TownHall14Entity(EntityType<? extends Defense> type, Level world) {
        super(type, world);
        xpReward = 0;
        setNoAi(false);
        setCustomName(new TextComponent("Town Hall (Liv.14)"));
        setCustomNameVisible(true);
        setPersistenceRequired();
    }
    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 2, 10) {
            @Override
            public boolean canContinueToUse() {
                return this.canUse();
            }
        });
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
        if (source == DamageSource.FALL)
            return false;
        if (source == DamageSource.ANVIL)
            return false;
        return super.hurt(source, amount);
    }
    @Override
    public void performRangedAttack(LivingEntity p_33317_, float p_33318_) {
        TH14PEntity.shoot(this, p_33317_);
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this,"controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }
    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
    {
       event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.th14.idle", true));
        return PlayState.CONTINUE;
    }
    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
        builder = builder.add(Attributes.MAX_HEALTH, 80);
        builder = builder.add(Attributes.ARMOR, 0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 9);
        return builder;
    }
}
