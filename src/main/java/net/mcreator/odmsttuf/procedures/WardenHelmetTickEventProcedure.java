package net.mcreator.odmsttuf.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class WardenHelmetTickEventProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getDisplayName().getString()).equals("Dev")) {
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLAST_PROTECTION, itemstack) != 0)) {
				itemstack.enchant(Enchantments.BLAST_PROTECTION, 5);
			}
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.PROJECTILE_PROTECTION, itemstack) != 0)) {
				itemstack.enchant(Enchantments.PROJECTILE_PROTECTION, 5);
			}
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BINDING_CURSE, itemstack) != 0)) {
				itemstack.enchant(Enchantments.BINDING_CURSE, 1);
			}
		}
	}
}
