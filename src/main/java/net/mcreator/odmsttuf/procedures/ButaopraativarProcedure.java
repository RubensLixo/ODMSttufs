package net.mcreator.odmsttuf.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.odmsttuf.network.OdmsttufModVariables;
import net.mcreator.odmsttuf.init.OdmsttufModItems;

public class ButaopraativarProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(OdmsttufModItems.CURSED_ARTIFACT.get(), lv).isPresent() : false) {
			if (OdmsttufModVariables.MapVariables.get(world).ativadoheart == 0) {
				OdmsttufModVariables.MapVariables.get(world).ativadoheart = 1;
				OdmsttufModVariables.MapVariables.get(world).syncData(world);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("activated"), true);
			}
			if (OdmsttufModVariables.MapVariables.get(world).ativadoheart == 1) {
				OdmsttufModVariables.MapVariables.get(world).ativadoheart = 0;
				OdmsttufModVariables.MapVariables.get(world).syncData(world);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("disabled"), true);
			}
		}
	}
}
