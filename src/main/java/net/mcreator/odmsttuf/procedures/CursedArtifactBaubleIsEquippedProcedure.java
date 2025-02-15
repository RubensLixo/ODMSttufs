package net.mcreator.odmsttuf.procedures;

import net.minecraftforge.eventbus.api.Event;

public class CursedArtifactBaubleIsEquippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH)
				.hasModifier((new AttributeModifier(UUID.fromString("5ea76175-0d4d-476e-b003-4e348686fe11"), "CursedHealth", 4, AttributeModifier.Operation.MULTIPLY_TOTAL)))))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH)
					.addPermanentModifier((new AttributeModifier(UUID.fromString("5ea76175-0d4d-476e-b003-4e348686fe11"), "CursedHealth", 4, AttributeModifier.Operation.MULTIPLY_TOTAL)));
	}
}
