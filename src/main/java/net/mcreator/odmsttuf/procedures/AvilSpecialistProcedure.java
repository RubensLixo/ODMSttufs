package net.mcreator.odmsttuf.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.odmsttuf.init.OdmsttufModItems;

import javax.annotation.Nullable;

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
		if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(OdmsttufModItems.STEAMPUNK_GLASSES.get(), lv).isPresent() : false) {
			if (event instanceof AnvilUpdateEvent _anvil) {
				_anvil.setCost(0);
			}
			if (event instanceof AnvilUpdateEvent _anvil) {
				_anvil.setMaterialCost(1);
			}
		}
	}
}
