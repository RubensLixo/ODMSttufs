package net.mcreator.odmsttuf.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class CursedArtifactBaubleIsEquippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH)
				.hasModifier((new AttributeModifier(UUID.fromString("5ea76175-0d4d-476e-b003-4e348686fe11"), "CursedHealth", 2, AttributeModifier.Operation.MULTIPLY_TOTAL)))))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH)
					.addPermanentModifier((new AttributeModifier(UUID.fromString("5ea76175-0d4d-476e-b003-4e348686fe11"), "CursedHealth", 2, AttributeModifier.Operation.MULTIPLY_TOTAL)));
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
				.hasModifier((new AttributeModifier(UUID.fromString("e22566aa-5aed-4ade-a95a-d79ee9c3911d"), "CursedDamage", 3, AttributeModifier.Operation.MULTIPLY_TOTAL)))))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
					.addPermanentModifier((new AttributeModifier(UUID.fromString("e22566aa-5aed-4ade-a95a-d79ee9c3911d"), "CursedDamage", 3, AttributeModifier.Operation.MULTIPLY_TOTAL)));
		if (entity instanceof Player _player)
			_player.getFoodData().setSaturation(0);
		if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) == 20) {
			if (entity instanceof Player _player)
				_player.getFoodData().setFoodLevel(19);
		}
	}
}
