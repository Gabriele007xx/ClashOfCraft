
package net.mcreator.clashofclansweapons.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;

import java.util.List;

import coc.troop.clancapital.ClanCapitalTroopBase;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class CCIncantesimo2Entity extends PathfinderMob implements IAnimatable {
	private final int MAX_AGE = 48000;
	private int CURRENT_AGE = 0;
	private AnimationFactory factory = new AnimationFactory(this);
	public CCIncantesimo2Entity(PlayMessages.SpawnEntity packet, Level world) {
		this(ClashofclansweaponsModEntities.CC_INCANTESIMO_2.get(), world);
	}

	public CCIncantesimo2Entity(EntityType<CCIncantesimo2Entity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
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
	public boolean hurt(DamageSource source, float amount) {
		return false;
	}

	@Override
	public boolean isPushable() {
		return false;
	}

	@Override
	protected void doPush(Entity entityIn) {
	}

	@Override
	protected void pushEntities() {
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 255);
		return builder;
	}

	@Override
	public void tick() {
		super.tick();
		CURRENT_AGE++;
		List<LivingEntity> list = this.level.getEntitiesOfClass(LivingEntity.class,
				(new AABB(new BlockPos(this.getX(), this.getY(), this.getZ()))).inflate(8.0D, 2.9D, 8.0D));
		for (LivingEntity ent : list) {
			if (ent instanceof ClanCapitalTroopBase || ent instanceof Player) {
				ent.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 1, false, false));
				ent.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 1, false, false));
			}
		}
		if (CURRENT_AGE >= MAX_AGE) {
			this.discard();
		}
	}
	private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
	{
		event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.rage.idle", true));
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
}
