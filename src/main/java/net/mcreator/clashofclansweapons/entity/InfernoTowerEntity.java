
package net.mcreator.clashofclansweapons.entity;

import net.minecraftforge.registries.ForgeRegistries;
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
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.clashofclansweapons.procedures.GameRuleProcedureProcedure;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;

import java.util.Random;

import coc.buidings.defence.Defense;

public class InfernoTowerEntity extends Defense implements RangedAttackMob {
	private int current_damage = 1;
	private final int max_damage = 10;
	private int ticks_ = 0;

	public InfernoTowerEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ClashofclansweaponsModEntities.INFERNO_TOWER.get(), world);
	}

	public InfernoTowerEntity(EntityType<InfernoTowerEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setCustomName(new TextComponent("Inferno Tower (Lv. 1)"));
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
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 1, 10) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source == DamageSource.FALL)
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.getTarget() != null) {
			ticks_++;
			if (ticks_ >= 6) {
				current_damage++;
				ticks_ = 0;
			}
			if (current_damage == 4) {
				this.level.playSound(null, this.getX(), this.getY(), this.getZ(),
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.furnace.fire_crackle")), SoundSource.PLAYERS, 1,
						1f / (new Random().nextFloat() * 0.5f + 1));
			}
			if (current_damage == 7) {
				this.level.playSound(null, this.getX(), this.getY(), this.getZ(),
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.ambient")), SoundSource.PLAYERS, 1,
						1f / (new Random().nextFloat() * 0.5f + 1));
			}
		} else {
			current_damage = 1;
		}
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		InfernoTowerLv1ItemEntity.shoot(this, target, current_damage);
	}

	public void aiStep() {
		super.aiStep();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;
		for (int l = 0; l < 2; ++l) {
			double x0 = x + random.nextFloat();
			double y0 = y + random.nextFloat();
			double z0 = z + random.nextFloat();
			double dx = (random.nextFloat() - 0.5D) * 0.2500000014901161D;
			double dy = (random.nextFloat() - 0.5D) * 0.2500000014901161D;
			double dz = (random.nextFloat() - 0.5D) * 0.2500000014901161D;
			world.addParticle(ParticleTypes.FLAME, x0, y0, z0, dx, dy, dz);
		}
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
		builder = builder.add(Attributes.MAX_HEALTH, 20);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 1);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 999);
		return builder;
	}
}
