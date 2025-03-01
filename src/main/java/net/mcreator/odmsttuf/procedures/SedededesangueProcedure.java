package net.mcreator.odmsttuf.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.odmsttuf.network.OdmsttufModVariables;
import net.mcreator.odmsttuf.init.OdmsttufModItems;
import net.mcreator.odmsttuf.OdmsttufMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SedededesangueProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity sourceentity) {
		execute(null, world, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(OdmsttufModItems.CURSED_ARTIFACT.get(), lv).isPresent() : false) {
			if (!(OdmsttufModVariables.MapVariables.get(world).sededesangueheart != 5)) {
				OdmsttufModVariables.MapVariables.get(world).sededesangueheart = OdmsttufModVariables.MapVariables.get(world).sededesangueheart + 1;
				OdmsttufModVariables.MapVariables.get(world).syncData(world);
				OdmsttufMod.queueServerWork(600, () -> {
					OdmsttufModVariables.MapVariables.get(world).sededesangueheart = OdmsttufModVariables.MapVariables.get(world).sededesangueheart - 1;
					OdmsttufModVariables.MapVariables.get(world).syncData(world);
				});
			}
		}
	}
}
