package net.mcreator.odmsttuf.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.AnvilRepairEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.odmsttuf.init.OdmsttufModItems;

import javax.annotation.Nullable;

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
		if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(OdmsttufModItems.STEAMPUNK_GLASSES.get(), lv).isPresent() : false) {
			if (event instanceof AnvilRepairEvent _repair) {
				_repair.setBreakChance(0);
			}
		}
	}
}
