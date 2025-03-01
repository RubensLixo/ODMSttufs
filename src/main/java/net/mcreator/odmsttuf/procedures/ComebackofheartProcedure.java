package net.mcreator.odmsttuf.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.odmsttuf.network.OdmsttufModVariables;
import net.mcreator.odmsttuf.init.OdmsttufModItems;
import net.mcreator.odmsttuf.OdmsttufMod;

public class ComebackofheartProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (OdmsttufModVariables.MapVariables.get(world).ImortalidadeCondenada == 0) {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "gamemode 1");
				}
			}
			OdmsttufMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player)
					_player.getInventory().clearContent();
				OdmsttufMod.queueServerWork(20, () -> {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(OdmsttufModItems.CURSED_ARTIFACT.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					OdmsttufMod.queueServerWork(1200, () -> {
						OdmsttufModVariables.MapVariables.get(world).whozaattributes = 9;
						OdmsttufModVariables.MapVariables.get(world).syncData(world);
					});
				});
			});
		}
	}
}
