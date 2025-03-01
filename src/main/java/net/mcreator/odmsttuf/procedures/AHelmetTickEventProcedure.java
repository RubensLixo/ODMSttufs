package net.mcreator.odmsttuf.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.odmsttuf.network.OdmsttufModVariables;
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
		if (!(OdmsttufModVariables.MapVariables.get(world).WaterReviveCount == 0)) {
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.WATER_BUCKET)) {
				OdmsttufMod.queueServerWork(40, () -> {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.DROWN)), 2);
				});
			}
		}
	}
}
