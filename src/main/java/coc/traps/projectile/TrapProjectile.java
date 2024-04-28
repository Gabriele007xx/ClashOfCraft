package coc.traps.projectile;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.level.Level;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class TrapProjectile extends PathfinderMob implements IAnimatable {
    protected AnimationFactory factory = new AnimationFactory(this);

    protected TrapProjectile(EntityType<? extends PathfinderMob> p_21683_, Level p_21684_) {
        super(p_21683_, p_21684_);
    }

    protected  <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
    {
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<>(this,"controller",0,this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }
}
