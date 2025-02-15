package net.mcreator.odmsttuf.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class AvilSpecialistProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onEventTriggered(AnvilUpdateEvent event) {
		execute(event, event.getPlayer());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(OdmsttufModItems.DELETED_MOD_ELEMENT.get(), lv).isPresent() : false) {
			if (event instanceof AnvilUpdateEvent _anvil) {
				_anvil.setCost(0);
			}
			if (event instanceof AnvilUpdateEvent _anvil) {
				_anvil.setMaterialCost(1);
			}
		}
	}
}
