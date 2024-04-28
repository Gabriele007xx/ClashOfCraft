package net.mcreator.clashofclansweapons.entity;

import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.PlayMessages;

public class FireArrowEntity extends AbstractArrow {
    private final Item pickedUpItem = ClashofclansweaponsModItems.FIRE_ARROW_ITEM.get();
    public FireArrowEntity(EntityType<? extends AbstractArrow> p_36721_, Level p_36722_) {
        super(p_36721_, p_36722_);
    }

    public FireArrowEntity(EntityType<? extends AbstractArrow> p_36717_, LivingEntity p_36718_, Level p_36719_) {
        super(p_36717_, p_36718_, p_36719_);
    }
    public FireArrowEntity(PlayMessages.SpawnEntity spawnEntity,Level level)
    {
        super(ClashofclansweaponsModEntities.FIRE_ARROW.get(),level);
    }
    @Override
    public ItemStack getPickupItem() {
        return new ItemStack(pickedUpItem);
    }
}
