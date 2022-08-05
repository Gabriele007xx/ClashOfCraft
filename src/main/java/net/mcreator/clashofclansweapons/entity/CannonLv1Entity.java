
package net.mcreator.clashofclansweapons.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.clashofclansweapons.procedures.GameRuleProcedureProcedure;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;

import coc.buidings.defence.Defense;

public class CannonLv1Entity extends Defense implements RangedAttackMob {
	public CannonLv1Entity(PlayMessages.SpawnEntity packet, Level world) {
		this(ClashofclansweaponsModEntities.CANNON_LV_1.get(), world);
	}

	public CannonLv1Entity(EntityType<CannonLv1Entity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setCustomName(new TextComponent("Cannon (Liv.1)"));
		setCustomNameVisible(true);
		setPersistenceRequired();
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(17, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 16, 10) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source == DamageSource.DROWN)
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		CannonLv1ProjectileEntity.shoot(this, target);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
		builder = builder.add(Attributes.MAX_HEALTH, 12);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 2);
		return builder;
	}
}
