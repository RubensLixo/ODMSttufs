package net.mcreator.odmsttuf.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.odmsttuf.network.OdmsttufModVariables;
import net.mcreator.odmsttuf.init.OdmsttufModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WHOZAttrbuteblahblahunvariavelProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDisplayName().getString()).equals("bombbb001")) {
			if (OdmsttufModVariables.MapVariables.get(world).whozaattributes == 0) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OdmsttufModItems.WARHAMMER_OF_ZILLYHOO.get()) {
					OdmsttufModVariables.MapVariables.get(world).whozaattributes = 1;
					OdmsttufModVariables.MapVariables.get(world).syncData(world);
				}
			}
			if (OdmsttufModVariables.MapVariables.get(world).whozaattributes == 0) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == OdmsttufModItems.WARHAMMER_OF_ZILLYHOO.get()) {
					OdmsttufModVariables.MapVariables.get(world).whozaattributes = 1;
					OdmsttufModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
	}
}
