
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.odmsttuf.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.odmsttuf.OdmsttufMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OdmsttufModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OdmsttufMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(OdmsttufModItems.CURSED_ARTIFACT.get());
			tabData.accept(OdmsttufModItems.STEAMPUNK_GLASSES.get());
			tabData.accept(OdmsttufModItems.A_HELMET.get());
		}
	}
}
