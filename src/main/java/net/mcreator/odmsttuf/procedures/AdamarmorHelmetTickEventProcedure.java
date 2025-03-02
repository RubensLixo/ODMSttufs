package net.mcreator.odmsttuf.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class AdamarmorHelmetTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDisplayName().getString()).equals("Dev")) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).setBaseValue(0.5);
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = true;
				_player.onUpdateAbilities();
			}
		}
		if (!(entity.getDisplayName().getString()).equals("Dev")) {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "kill");
				}
			}
		}
	}
}
