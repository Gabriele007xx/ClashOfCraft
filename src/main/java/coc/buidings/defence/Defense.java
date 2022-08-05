package coc.buidings.defence;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.clashofclansweapons.procedures.GameRuleProcedureProcedure;
import net.mcreator.clashofclansweapons.entity.UnicornEntity;
import net.mcreator.clashofclansweapons.entity.LASSIEntity;

import coc.troop.Troop;

public class Defense extends Building {
	public Defense(EntityType<? extends Defense> type, Level world) {
		super(type, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, LASSIEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = Defense.this.getX();
				double y = Defense.this.getY();
				double z = Defense.this.getZ();
				Entity entity = Defense.this;
				Level world = Defense.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, Troop.class, true, true) {
			@Override
			public boolean canUse() {
				double x = Defense.this.getX();
				double y = Defense.this.getY();
				double z = Defense.this.getZ();
				Entity entity = Defense.this;
				Level world = Defense.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, UnicornEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = Defense.this.getX();
				double y = Defense.this.getY();
				double z = Defense.this.getZ();
				Entity entity = Defense.this;
				Level world = Defense.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, Monster.class, false, false));
	}
}
