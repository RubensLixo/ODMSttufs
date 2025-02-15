package net.mcreator.odmsttuf.procedures;

import net.minecraftforge.eventbus.api.Event;

public class SteampunkGlassesBaubleIsUnequippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		((LivingEntity) entity).getAttribute(ForgeMod.ENTITY_REACH.get()).removePermanentModifier(UUID.fromString("81e4d237-7ca3-4f0f-8ab6-c84710a895e5"));
		((LivingEntity) entity).getAttribute(ForgeMod.BLOCK_REACH.get()).removePermanentModifier(UUID.fromString("81e4d237-7ca3-4f0f-8ab6-c84710a895e5"));
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.LUCK).removePermanentModifier(UUID.fromString("81e4d237-7ca3-4f0f-8ab6-c84710a895e5"));
	}
}
