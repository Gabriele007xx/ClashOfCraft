package net.mcreator.clashofclansweapons.entity;

import coc.troop.Troop;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.List;
import java.util.Random;

public class HealerEntity extends Troop implements RangedAttackMob, IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);
    public HealerEntity(EntityType<? extends Troop> type, Level level) {
        super(type, level);
        xpReward = 0;
        setNoAi(false);
        setPersistenceRequired();
        setCustomName(new TextComponent("Healer (Level 1)"));
        setPersistenceRequired();
        this.moveControl = new FlyingMoveControl(this, 10, true);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new RandomStrollGoal(this, 0.8, 20) {
            @Override
            protected Vec3 getPosition() {
                Random random = HealerEntity.this.getRandom();
                double dir_x = HealerEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
                double dir_y = HealerEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
                double dir_z = HealerEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
                return new Vec3(dir_x, dir_y, dir_z);
            }
        });
        this.goalSelector.addGoal(2,new RangedAttackGoal(this,1.25, 20,10));
        this.goalSelector.addGoal(3, new HealerHealsTroopsGoal(this));
        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
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
    public boolean causeFallDamage(float l, float d, DamageSource source) {
        return false;
    }

    @Override
    public void performRangedAttack(LivingEntity target, float flval) {
        UnicornHealEntity.shoot(this, target);
    }

    @Override
    public void travel(Vec3 dir) {
        Entity entity = this.getPassengers().isEmpty() ? null : (Entity) this.getPassengers().get(0);
        if (this.isVehicle()) {
            this.setYRot(entity.getYRot());
            this.yRotO = this.getYRot();
            this.setXRot(entity.getXRot() * 0.5F);
            this.setRot(this.getYRot(), this.getXRot());
            this.flyingSpeed = this.getSpeed() * 0.15F;
            this.yBodyRot = entity.getYRot();
            this.yHeadRot = entity.getYRot();
            this.maxUpStep = 1.0F;
            if (entity instanceof LivingEntity passenger) {
                this.setSpeed((float) this.getAttributeValue(Attributes.MOVEMENT_SPEED));
                float forward = passenger.zza;
                float strafe = passenger.xxa;
                super.travel(new Vec3(strafe, 0, forward));
            }
            this.animationSpeedOld = this.animationSpeed;
            double d1 = this.getX() - this.xo;
            double d0 = this.getZ() - this.zo;
            float f1 = (float) Math.sqrt(d1 * d1 + d0 * d0) * 4;
            if (f1 > 1.0F)
                f1 = 1.0F;
            this.animationSpeed += (f1 - this.animationSpeed) * 0.4F;
            this.animationPosition += this.animationSpeed;
            return;
        }
        this.maxUpStep = 0.5F;
        this.flyingSpeed = 0.02F;
        super.travel(dir);
    }

    @Override
    protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
    }

    @Override
    public void setNoGravity(boolean ignored) {
        super.setNoGravity(true);
    }

    public void aiStep() {
        super.aiStep();
        this.setNoGravity(true);
    }
    @Override
    protected PathNavigation createNavigation(Level world) {
        return new FlyingPathNavigation(this, world);
    }

    public static void init() {
    }
    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
        builder = builder.add(Attributes.MAX_HEALTH, 20);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 32);
        builder = builder.add(Attributes.FLYING_SPEED, 0.2);
        return builder;
    }
    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
    {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.healer.idle", true));
        return PlayState.CONTINUE;
    }
    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this,"controller",0,this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    class HealerHealsTroopsGoal extends Goal{
        HealerEntity entity;
        LivingEntity target = null;
        HealerHealsTroopsGoal(HealerEntity entity)
        {
            this.entity = entity;
        }
        @Override
        public boolean canUse() {
            return true;
        }

        @Override
        public void tick() {
            if(target != null)
            {
                if(target.getHealth() >= target.getMaxHealth())
                {
                    target = findTarget();
                }
                else
                {
                    entity.setTarget(target);
                }

            }
            else
            {
                target = findTarget();
            }
        }
        @Override
        public boolean isInterruptable() {
            return true;
        }

        @Override
        public void stop() {
        }
        private LivingEntity findTarget() {
            List<LivingEntity> list = entity.level.getEntitiesOfClass(LivingEntity.class,
                    (new AABB(new BlockPos(entity.getX(), entity.getY(), entity.getZ()))).inflate(32.0D, 6.0D, 32.0D));
            for (LivingEntity ent : list) {
                if (ent instanceof Troop || ent instanceof Player) {
                    if (ent.getHealth() < ent.getMaxHealth()) {
                        return ent;
                    }
                }
            }
            return null;
        }
    }
}
