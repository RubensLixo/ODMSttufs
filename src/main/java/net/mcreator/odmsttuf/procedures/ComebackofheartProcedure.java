package net.mcreator.odmsttuf.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.odmsttuf.network.OdmsttufModVariables;
import net.mcreator.odmsttuf.OdmsttufMod;

public class ComebackofheartProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDisplayName().getString()).equals("Dev")) {
			if (OdmsttufModVariables.MapVariables.get(world).ImortalidadeCondenada == 0) {
				if (entity instanceof ServerPlayer _player)
					_player.setGameMode(GameType.SURVIVAL);
				OdmsttufMod.queueServerWork(1, () -> {
					if (entity instanceof Player _player)
						_player.getInventory().clearContent();
					OdmsttufMod.queueServerWork(20, () -> {
						OdmsttufMod.queueServerWork(1200, () -> {
							OdmsttufModVariables.MapVariables.get(world).ImortalidadeCondenada = 9;
							OdmsttufModVariables.MapVariables.get(world).syncData(world);
						});
					});
				});
			}
		}
	}
}
