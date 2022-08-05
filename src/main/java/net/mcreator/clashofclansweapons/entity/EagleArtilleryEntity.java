
package net.mcreator.clashofclansweapons.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
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

public class EagleArtilleryEntity extends Defense implements RangedAttackMob {
	private final int TIME_TO_RECHARGE = 300;
	private boolean isCooldown = false;
	private int CURRENT_CHARGE = 0;
	private int SHOTS = 0;

	public EagleArtilleryEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ClashofclansweaponsModEntities.EAGLE_ARTILLERY.get(), world);
	}

	public EagleArtilleryEntity(EntityType<EagleArtilleryEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setCustomName(new TextComponent("Eagle Artillery (liv.1)"));
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
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 16, 10) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	@Override
	public void baseTick() {
		super.baseTick();
		if (isCooldown) {
			CURRENT_CHARGE++;
			if (CURRENT_CHARGE >= TIME_TO_RECHARGE) {
				isCooldown = false;
				CURRENT_CHARGE = 0;
				SHOTS = 0;
			}
		}
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source == DamageSource.DROWN)
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		if (!isCooldown && SHOTS < 3) {
			EaEntity.shoot(this, target);
			SHOTS++;
		}
		if (SHOTS >= 3) {
			isCooldown = true;
		}
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
		builder = builder.add(Attributes.MAX_HEALTH, 40);
		builder = builder.add(Attributes.ARMOR, 12);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 999);
		return builder;
	}
}
