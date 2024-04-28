package net.mcreator.clashofclansweapons.entity;

import coc.traps.projectile.TrapProjectile;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.PlayMessages;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

import java.util.List;

public class LogEntity extends TrapProjectile {
    private int MAX_AGE = 960;
    private int CURRENT_AGE = 0;
    public LogEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(ClashofclansweaponsModEntities.LOG.get(), world);
    }
    public LogEntity(EntityType<LogEntity> type, Level world) {
        super(type, world);
        xpReward = 0;
        setNoAi(false);
        setPersistenceRequired();
    }

    @Override
    public boolean hurt(DamageSource p_21016_, float p_21017_) {
        return false;
    }

    @Override
    protected <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.log.roll", true));
        return PlayState.CONTINUE;
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3f);
        builder = builder.add(Attributes.MAX_HEALTH, 30);
        builder = builder.add(Attributes.ARMOR, 7);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 4);
        builder = builder.add(Attributes.FOLLOW_RANGE, 32);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 255);
        return builder;
    }

    @Override
    protected void registerGoals() {

    }

    @Override
    public void tick() {
        super.tick();
        CURRENT_AGE++;
        if(CURRENT_AGE >= MAX_AGE)
        {
            this.discard();
        }
        if(this.getDirection() == Direction.NORTH)
        {
            this.setDeltaMovement(0,0,-0.2);
        }
        if(this.getDirection() == Direction.SOUTH)
        {
            this.setDeltaMovement(0,0,0.2);
        }
        if(this.getDirection() == Direction.WEST)
        {
            this.setDeltaMovement(-0.2,0,0);
        }
        if(this.getDirection() == Direction.EAST)
        {
            this.setDeltaMovement(0.2,0,0);
        }
        List<LivingEntity> list = this.level.getEntitiesOfClass(LivingEntity.class,this.getBoundingBox());
        for(LivingEntity e : list)
        {
            if(e instanceof Monster)
            {
                touch(e);
            }
        }
    }
public static void init()
{

}
private void touch(LivingEntity mob)
{
    mob.hurt(DamageSource.GENERIC, 2f);
}
}
