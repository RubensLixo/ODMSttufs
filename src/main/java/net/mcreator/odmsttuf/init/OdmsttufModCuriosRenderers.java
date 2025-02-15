package net.mcreator.odmsttuf.init;

import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;

import net.mcreator.odmsttuf.client.renderer.SteampunkGlassesRenderer;
import net.mcreator.odmsttuf.client.model.Modelsteampunk_glasses;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OdmsttufModCuriosRenderers {
	@SubscribeEvent
	public static void registerLayers(final EntityRenderersEvent.RegisterLayerDefinitions evt) {
		evt.registerLayerDefinition(OdmsttufModLayerDefinitions.STEAMPUNK_GLASSES, Modelsteampunk_glasses::createBodyLayer);
	}

	@SubscribeEvent
	public static void clientSetup(final FMLClientSetupEvent evt) {
		CuriosRendererRegistry.register(OdmsttufModItems.STEAMPUNK_GLASSES.get(), SteampunkGlassesRenderer::new);
	}
}
