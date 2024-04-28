package util;

import coc.buidings.defence.Building;
import coc.troop.Troop;
import coc.troop.clancapital.ClanCapitalTroopBase;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class LevelUtil {
     public static boolean isCOCVillage(BlockPos pos, ServerLevel level)
     {
          int i = 0;
          List<Building> list = level.getEntitiesOfClass(Building.class, new AABB(pos).inflate(32d,8d,32d));
          for(Building e : list)
          {
                    i++;
          }
          return i >= 3;
     }
}
