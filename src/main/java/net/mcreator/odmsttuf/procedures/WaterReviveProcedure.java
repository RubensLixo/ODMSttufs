package net.mcreator.odmsttuf.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.odmsttuf.network.OdmsttufModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WaterReviveProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDisplayName().getString()).equals("Dev")) {
			if (OdmsttufModVariables.MapVariables.get(world).WaterReviveCount >= 1) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				} else if (event != null && event.hasResult()) {
					event.setResult(Event.Result.DENY);
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SPLASH, x, y, z, 25, 0, 0, 0, 1);
				OdmsttufModVariables.MapVariables.get(world).WaterReviveCount = OdmsttufModVariables.MapVariables.get(world).WaterReviveCount - 1;
				OdmsttufModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
