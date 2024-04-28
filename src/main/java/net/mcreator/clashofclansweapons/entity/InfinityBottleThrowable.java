package net.mcreator.clashofclansweapons.entity;

import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class InfinityBottleThrowable extends ThrowableItemProjectile {
    public InfinityBottleThrowable(EntityType<? extends ThrowableItemProjectile> p_37442_, Level p_37443_) {
        super(p_37442_, p_37443_);
    }

    public InfinityBottleThrowable(EntityType<? extends ThrowableItemProjectile> p_37432_, double p_37433_, double p_37434_, double p_37435_, Level p_37436_) {
        super(p_37432_, p_37433_, p_37434_, p_37435_, p_37436_);
    }

    public InfinityBottleThrowable(EntityType<? extends ThrowableItemProjectile> p_37438_, LivingEntity p_37439_, Level p_37440_) {
        super(p_37438_, p_37439_, p_37440_);
    }

    @Override
    protected Item getDefaultItem() {
        return ClashofclansweaponsModItems.INFINITY_BOTTLE.get();
    }
}
