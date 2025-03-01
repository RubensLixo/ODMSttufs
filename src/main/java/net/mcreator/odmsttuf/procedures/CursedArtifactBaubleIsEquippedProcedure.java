package net.mcreator.odmsttuf.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class CursedArtifactBaubleIsEquippedProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.enchant(Enchantments.BINDING_CURSE, 10);
	}
}
