
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.odmsttuf.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.odmsttuf.item.WaterPickaxeItem;
import net.mcreator.odmsttuf.item.WarhammerOfZillyhooItem;
import net.mcreator.odmsttuf.item.SteampunkGlassesItem;
import net.mcreator.odmsttuf.item.CursedArtifactItem;
import net.mcreator.odmsttuf.item.AdamarmorItem;
import net.mcreator.odmsttuf.item.ADAMSSTARSItem;
import net.mcreator.odmsttuf.OdmsttufMod;

public class OdmsttufModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OdmsttufMod.MODID);
	public static final RegistryObject<Item> WARHAMMER_OF_ZILLYHOO = REGISTRY.register("warhammer_of_zillyhoo", () -> new WarhammerOfZillyhooItem());
	public static final RegistryObject<Item> CURSED_ARTIFACT = REGISTRY.register("cursed_artifact", () -> new CursedArtifactItem());
	public static final RegistryObject<Item> STEAMPUNK_GLASSES = REGISTRY.register("steampunk_glasses", () -> new SteampunkGlassesItem());
	public static final RegistryObject<Item> WATER_PICKAXE = REGISTRY.register("water_pickaxe", () -> new WaterPickaxeItem());
	public static final RegistryObject<Item> ADAMARMOR_HELMET = REGISTRY.register("adamarmor_helmet", () -> new AdamarmorItem.Helmet());
	public static final RegistryObject<Item> ADAMSSTARS = REGISTRY.register("adamsstars", () -> new ADAMSSTARSItem());
	// Start of user code block custom items
	// End of user code block custom items
}
