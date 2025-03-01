package net.mcreator.odmsttuf.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.odmsttuf.network.OdmsttufModVariables;

public class TimeTravelClockRightclickedProcedure {
	public static void execute(LevelAccessor world) {
		if (OdmsttufModVariables.MapVariables.get(world).fasttime == 1) {
			OdmsttufModVariables.MapVariables.get(world).fasttime = 0;
			OdmsttufModVariables.MapVariables.get(world).syncData(world);
		}
		if (OdmsttufModVariables.MapVariables.get(world).fasttime == 0) {
			OdmsttufModVariables.MapVariables.get(world).fasttime = 1;
			OdmsttufModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
