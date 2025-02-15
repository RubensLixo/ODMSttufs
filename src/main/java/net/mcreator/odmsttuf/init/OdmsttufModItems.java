
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.odmsttuf.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.odmsttuf.item.WarhammerOfZillyhooItem;
import net.mcreator.odmsttuf.item.CursedArtifactItem;
import net.mcreator.odmsttuf.OdmsttufMod;

public class OdmsttufModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OdmsttufMod.MODID);
	public static final RegistryObject<Item> WARHAMMER_OF_ZILLYHOO = REGISTRY.register("warhammer_of_zillyhoo", () -> new WarhammerOfZillyhooItem());
	public static final RegistryObject<Item> CURSED_ARTIFACT = REGISTRY.register("cursed_artifact", () -> new CursedArtifactItem());
	// Start of user code block custom items
	// End of user code block custom items
}
