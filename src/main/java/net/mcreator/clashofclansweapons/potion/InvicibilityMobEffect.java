
package net.mcreator.clashofclansweapons.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.clashofclansweapons.procedures.InvicibilityEffectStartedappliedProcedure;

public class InvicibilityMobEffect extends MobEffect {
	public InvicibilityMobEffect() {
		super(MobEffectCategory.NEUTRAL, -256);
	}

	@Override
	public String getDescriptionId() {
		return "effect.clashofclansweapons.invicibility";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		InvicibilityEffectStartedappliedProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
