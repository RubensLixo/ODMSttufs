package net.mcreator.odmsttuf.init;

import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OdmsttufModCuriosSlots {
	@SubscribeEvent
	public static void enqueueIMC(final InterModEnqueueEvent event) {
	}
}
