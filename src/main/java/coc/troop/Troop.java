package coc.troop;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.clashofclansweapons.procedures.GameRuleProcedureProcedure;

import coc.buidings.defence.Defense;

public class Troop extends PathfinderMob {
	public Troop(EntityType<? extends Troop> type, Level level) {
		super(type, level);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Defense.class, true, true) {
			@Override
			public boolean canUse() {
				double x = Troop.this.getX();
				double y = Troop.this.getY();
				double z = Troop.this.getZ();
				Entity entity = Troop.this;
				Level world = Troop.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Monster.class, false, false));
		this.goalSelector.addGoal(13, new RandomLookAroundGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}
}
