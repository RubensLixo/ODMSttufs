package net.mcreator.odmsttuf.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

import net.mcreator.odmsttuf.network.OdmsttufModVariables;

public class CursedArtifactBaubleIsEquippedProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		itemstack.enchant(Enchantments.BINDING_CURSE, 1);
		OdmsttufModVariables.MapVariables.get(world).ImortalidadeCondenada = 9;
		OdmsttufModVariables.MapVariables.get(world).syncData(world);
	}
}
