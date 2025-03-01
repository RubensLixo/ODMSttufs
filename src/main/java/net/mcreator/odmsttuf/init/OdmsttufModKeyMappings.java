
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.odmsttuf.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.odmsttuf.network.ActivateAgonizingAuraMessage;
import net.mcreator.odmsttuf.OdmsttufMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class OdmsttufModKeyMappings {
	public static final KeyMapping ACTIVATE_AGONIZING_AURA = new KeyMapping("key.odmsttuf.activate_agonizing_aura", GLFW.GLFW_KEY_Y, "key.categories.odmkeys") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				OdmsttufMod.PACKET_HANDLER.sendToServer(new ActivateAgonizingAuraMessage(0, 0));
				ActivateAgonizingAuraMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(ACTIVATE_AGONIZING_AURA);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				ACTIVATE_AGONIZING_AURA.consumeClick();
			}
		}
	}
}
