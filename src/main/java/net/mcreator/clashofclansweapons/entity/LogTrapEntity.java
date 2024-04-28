package net.mcreator.clashofclansweapons.entity;

import coc.traps.Trap;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.network.PlayMessages;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

import java.util.List;

public class LogTrapEntity extends Trap {
    private int MAX_COOLDOWN = 35;
    private int CURRENT = 0;
    private boolean activated = false;
    public LogTrapEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(ClashofclansweaponsModEntities.LOG_TRAP.get(), world);
    }
    public LogTrapEntity(EntityType<? extends PathfinderMob> p_21683_, Level p_21684_) {
        super(p_21683_, p_21684_);
    }

    @Override
    public void tick() {
        super.tick();
        if(!activated) {
            if (this.getDirection() == Direction.NORTH) {
                if (checkforNorthmobs()) {
                    if (!this.level.isClientSide()) {
                        LogEntity log = new LogEntity(ClashofclansweaponsModEntities.LOG.get(), this.level);
                        log.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), this.getXRot());
                        this.level.addFreshEntity(log);
                        activated = true;
                    }
                }
            }
            if (this.getDirection() == Direction.SOUTH) {
                if (checkforSouthmobs()) {
                    if (!this.level.isClientSide()) {
                        LogEntity log = new LogEntity(ClashofclansweaponsModEntities.LOG.get(), this.level);
                        log.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), this.getXRot());
                        this.level.addFreshEntity(log);
                        activated = true;
                    }
                }
            }
            if (this.getDirection() == Direction.WEST) {
                if (checkforWestmobs()) {
                    if (!this.level.isClientSide()) {
                        LogEntity log = new LogEntity(ClashofclansweaponsModEntities.LOG.get(), this.level);
                        log.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), this.getXRot());
                        this.level.addFreshEntity(log);
                        activated = true;
                    }
                }
            }
            if (this.getDirection() == Direction.EAST) {
                if (checkforOvestmobs()) {
                    if (!this.level.isClientSide()) {
                        LogEntity log = new LogEntity(ClashofclansweaponsModEntities.LOG.get(), this.level);
                        log.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), this.getXRot());
                        this.level.addFreshEntity(log);
                        activated = true;
                    }
                }
            }
        }
        else
        {
            CURRENT++;
            if(CURRENT >= MAX_COOLDOWN)
            {
                activated = false;
                CURRENT = 0;
            }
        }
    }
    private boolean checkforNorthmobs()
    {
        List<LivingEntity> list = this.level.getEntitiesOfClass(LivingEntity.class, new AABB(new BlockPos(this.getX(),this.getY(),this.getZ() - 4.5f)).inflate(1,2,9));
        for(LivingEntity e : list)
        {
            if(e instanceof Monster)
            {
                return true;
            }
        }
        return false;
    }
    private boolean checkforSouthmobs()
    {
        List<LivingEntity> list = this.level.getEntitiesOfClass(LivingEntity.class, new AABB(new BlockPos(this.getX(),this.getY(),this.getZ() + 4.5f)).inflate(1,2,9));
        for(LivingEntity e : list)
        {
            if(e instanceof Monster)
            {
                return true;
            }
        }
        return false;
    }
    private boolean checkforWestmobs()
    {
        List<LivingEntity> list = this.level.getEntitiesOfClass(LivingEntity.class, new AABB(new BlockPos(this.getX() - 4.5f,this.getY(),this.getZ())).inflate(9,2,1));
        for(LivingEntity e : list)
        {
            if(e instanceof Monster)
            {
                return true;
            }
        }
        return false;
    }
    private boolean checkforOvestmobs()
    {
        List<LivingEntity> list = this.level.getEntitiesOfClass(LivingEntity.class, new AABB(new BlockPos(this.getX() + 4.5f,this.getY(),this.getZ())).inflate(9,2,1));
        for(LivingEntity e : list)
        {
            if(e instanceof Monster)
            {
                return true;
            }
        }
        return false;
    }
    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
        builder = builder.add(Attributes.MAX_HEALTH, 10);
        builder = builder.add(Attributes.ARMOR, 0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 32);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 255);
        return builder;
    }

    @Override
    protected <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.logtrap.idle", true));
        return PlayState.CONTINUE;
    }

    @Override
    public boolean isPushable() {
        return false;
    }
}
