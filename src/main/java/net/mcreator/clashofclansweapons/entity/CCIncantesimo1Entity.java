
package net.mcreator.clashofclansweapons.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.Monster;
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
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;

import java.util.List;

public class CCIncantesimo1Entity extends PathfinderMob {
	private final int MAX_AGE = 48000;
	private int CURRENT_AGE = 0;

	public CCIncantesimo1Entity(PlayMessages.SpawnEntity packet, Level world) {
		this(ClashofclansweaponsModEntities.CC_INCANTESIMO_1.get(), world);
	}

	public CCIncantesimo1Entity(EntityType<CCIncantesimo1Entity> type, Level world) {
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

	public void aiStep() {
		super.aiStep();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;
		for (int l = 0; l < 8; ++l) {
			double x0 = x + 0.5 + (random.nextFloat() - 4) * 4D;
			double y0 = y + 1.2 + (random.nextFloat() - 4) * 4D;
			double z0 = z + 0.5 + (random.nextFloat() - 4) * 4D;
			world.addParticle(ParticleTypes.ITEM_SNOWBALL, x0, y0, z0, 0, 0, 0);
		}
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
			if (ent instanceof Monster) {
				ent.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60,1, false, false));
			}
		}
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -4;
		for (int index0 = 0; index0 < (int) (8); index0++) {
			sy = -4;
			for (int index1 = 0; index1 < (int) (8); index1++) {
				sz = -4;
				for (int index2 = 0; index2 < (int) (8); index2++) {
					if ((this.level.getBlockState(new BlockPos((int)this.getX() + sx,(int) this.getY() + sy,(int) this.getZ() + sz))).getBlock() == Blocks.WATER) {
						this.level.setBlock(new BlockPos((int)this.getX() + sx,(int) this.getY() + sy,(int) this.getZ() + sz), Blocks.ICE.defaultBlockState(), 3);
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (CURRENT_AGE >= MAX_AGE) {
			this.discard();
		}
	}
}
