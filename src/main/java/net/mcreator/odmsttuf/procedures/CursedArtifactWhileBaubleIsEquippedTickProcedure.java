package net.mcreator.odmsttuf.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.odmsttuf.init.OdmsttufModItems;
import net.mcreator.odmsttuf.OdmsttufMod;

public class CursedArtifactWhileBaubleIsEquippedTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(OdmsttufModItems.CURSED_ARTIFACT.get(), lv).isPresent() : false) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > 1) {
				OdmsttufMod.queueServerWork(40, () -> {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 1);
				});
			}
		}
		if (entity instanceof Player _player)
			_player.getFoodData().setSaturation(0);
		if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) == 20) {
			if (entity instanceof Player _player)
				_player.getFoodData().setFoodLevel(19);
		}
	}
}
