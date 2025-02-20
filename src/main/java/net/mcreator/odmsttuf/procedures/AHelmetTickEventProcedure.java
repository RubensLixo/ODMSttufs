package net.mcreator.odmsttuf.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.odmsttuf.OdmsttufMod;

public class AHelmetTickEventProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			_player.getAbilities().mayfly = true;
			_player.onUpdateAbilities();
		}
		if (entity instanceof Player player && player.getAbilities().flying) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SPLASH, x, (y - 1), z, 25, 0, 0, 0, 1);
		}
		OdmsttufMod.queueServerWork(35, () -> {
			entity.setAirSupply((int) (entity.getAirSupply() - 1));
		});
	}
}
