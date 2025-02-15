package net.mcreator.odmsttuf.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class CursedArtifactWhileBaubleIsEquippedTickProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource(), event.getEntity());
		}
	}

	public static void execute(DamageSource damagesource, Entity entity) {
		execute(null, damagesource, entity);
	}

	private static void execute(@Nullable Event event, DamageSource damagesource, Entity entity) {
		if (damagesource == null || entity == null)
			return;
		entity.hurt(damagesource, entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
	}
}
