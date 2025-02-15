package net.mcreator.odmsttuf.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class AnvilSpecialistProcedure {
	@SubscribeEvent
	public static void onEventTriggered(AnvilRepairEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(OdmsttufModItems.DELETED_MOD_ELEMENT.get(), lv).isPresent() : false) {
			if (event instanceof AnvilRepairEvent _repair) {
				_repair.setBreakChance(0);
			}
		}
	}
}
