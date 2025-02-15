
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.odmsttuf.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.odmsttuf.client.model.Modelsteampunk_glasses;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class OdmsttufModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelsteampunk_glasses.LAYER_LOCATION, Modelsteampunk_glasses::createBodyLayer);
	}
}
