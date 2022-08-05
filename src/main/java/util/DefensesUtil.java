package util;

import net.minecraft.world.entity.LivingEntity;

public class DefensesUtil {
	public static final float MORTAR_BLIND_RANGE = 4.0f;
	public static final float EAGLE_ARTILLERY_BLIND_RANGE = 6.0f;
	public static final float LAVA_LAUNCHER_BLIND_RANGE = 7.0f;
	public static final float SCATTERSHOT_BLIND_RANGE = 2.0f;
	
	public static double DistanceFromDeadSpot(LivingEntity entity,LivingEntity target)
	{
		double d = Math.sqrt(Math.pow(target.getX()-entity.getX(), 2) + Math.pow(target.getY()-entity.getY(), 2) + Math.pow(target.getZ()-entity.getZ(), 2));
		return d;
	}
}
