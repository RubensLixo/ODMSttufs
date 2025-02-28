package net.mcreator.odmsttuf.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class CursedArtifactBaubleIsUnequippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).removePermanentModifier(UUID.fromString("e22566aa-5aed-4ade-a95a-d79ee9c3911d"));
	}
}
