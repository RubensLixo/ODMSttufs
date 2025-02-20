package net.mcreator.odmsttuf.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class CursedArtifactBaubleIsUnequippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).removePermanentModifier(UUID.fromString("5ea76175-0d4d-476e-b003-4e348686fe11"));
	}
}
