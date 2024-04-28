package net.mcreator.clashofclansweapons.entity;

import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class TH14PEntity extends AbstractArrow implements ItemSupplier {
    public TH14PEntity(PlayMessages.SpawnEntity packet, Level world) {
        super(ClashofclansweaponsModEntities.TH14_P.get(), world);
    }
    public TH14PEntity(EntityType<? extends TH14PEntity> p_36721_, Level p_36722_) {
        super(p_36721_, p_36722_);
    }

    protected TH14PEntity(EntityType<? extends AbstractArrow> p_36711_, double p_36712_, double p_36713_, double p_36714_, Level p_36715_) {
        super(p_36711_, p_36712_, p_36713_, p_36714_, p_36715_);
    }

    protected TH14PEntity(EntityType<? extends AbstractArrow> p_36717_, LivingEntity p_36718_, Level p_36719_) {
        super(p_36717_, p_36718_, p_36719_);
    }

    @Override
    protected ItemStack getPickupItem() {
        return ItemStack.EMPTY;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public ItemStack getItem() {
        return new ItemStack(Items.FIRE_CHARGE);
    }
    @Override
    protected void doPostHurtEffects(LivingEntity entity) {
        super.doPostHurtEffects(entity);
        entity.setArrowCount(entity.getArrowCount() - 1);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.inGround)
            this.discard();
    }

    public static TH14PEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
        TH14PEntity entityarrow = new TH14PEntity(ClashofclansweaponsModEntities.TOWN_HALL_12_RW.get(), entity, world);
        entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
        entityarrow.setSilent(true);
        entityarrow.setCritArrow(false);
        entityarrow.setBaseDamage(damage);
        entityarrow.setKnockback(knockback);
        world.addFreshEntity(entityarrow);
        world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
                1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
        return entityarrow;
    }

    public static TH14PEntity shoot(LivingEntity entity, LivingEntity target) {
        TH14PEntity entityarrow = new TH14PEntity(ClashofclansweaponsModEntities.TOWN_HALL_12_RW.get(), entity, entity.level);
        double dx = target.getX() - entity.getX();
        double dy = target.getY() + target.getEyeHeight() - 1.1;
        double dz = target.getZ() - entity.getZ();
        entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 21.0F);
        entityarrow.setSilent(true);
        entityarrow.setBaseDamage(2);
        entityarrow.setKnockback(0);
        entityarrow.setCritArrow(false);
        entity.level.addFreshEntity(entityarrow);
        entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
                1f / (new Random().nextFloat() * 0.5f + 1));
        return entityarrow;
    }
}
