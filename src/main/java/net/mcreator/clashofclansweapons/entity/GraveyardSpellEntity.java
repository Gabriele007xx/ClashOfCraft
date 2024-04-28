package net.mcreator.clashofclansweapons.entity;

import coc.spawn.SpellS;
import coc.troop.clancapital.ClanCapitalTroopBase;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GraveyardSpellEntity extends PathfinderMob {
    private final int MAX_AGE = 48000;
    private int CURRENT_AGE = 0;

    private int CURRENT_WAIT;

    private int MAX_WAIT=0;

    public GraveyardSpellEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(ClashofclansweaponsModEntities.GRAVEYARD_SPELL.get(), world);
    }

    public GraveyardSpellEntity(EntityType<GraveyardSpellEntity> type, Level world) {
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
        for (int l = 0; l < 4; ++l) {
            double x0 = x + 0.5 + (random.nextFloat() - 0.5) * 0.5D;
            double y0 = y + 1.2 + (random.nextFloat() - 0.5) * 0.5D;
            double z0 = z + 0.5 + (random.nextFloat() - 0.5) * 0.5D;
            //world.addParticle(ParticleTypes.EFFECT, x0, y0, z0, 0, 0, 0);
        }
    }

    @Nullable
    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor p_21434_, DifficultyInstance p_21435_, MobSpawnType p_21436_, @Nullable SpawnGroupData p_21437_, @Nullable CompoundTag p_21438_) {
        SpellS.execute(level,"clashofclansweapons:graveyard.spell.deploy",this);
        return super.finalizeSpawn(p_21434_, p_21435_, p_21436_, p_21437_, p_21438_);
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
        if(MAX_WAIT == 0)
        {
            MAX_WAIT = (random.nextInt(7) + 4)*20;
        }
        CURRENT_WAIT++;
        if(CURRENT_WAIT >= MAX_WAIT)
        {
            WitchSkeletonEntity skeletonEntity = new WitchSkeletonEntity(ClashofclansweaponsModEntities.WITCH_SKELETON.get(), level);
            skeletonEntity.moveTo(getX(),getY(),getZ());
            level.addFreshEntity(skeletonEntity);
            MAX_WAIT = 0;
            CURRENT_WAIT = 0;
        }
        CURRENT_AGE++;
        if (CURRENT_AGE >= MAX_AGE) {
            this.discard();
        }
    }
}
