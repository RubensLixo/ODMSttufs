package net.mcreator.odmsttuf.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.odmsttuf.init.OdmsttufModItems;

import java.util.Map;

public class WaterpickaxePowerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((world.getFluidState(BlockPos.containing(x, y, z)).createLegacyBlock()).getBlock() == Blocks.WATER) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OdmsttufModItems.WATER_PICKAXE.get()) {
				if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0)) {
					itemstack.enchant(Enchantments.BLOCK_FORTUNE, 20);
				}
			}
		}
		if (!((world.getFluidState(BlockPos.containing(x, y, z)).createLegacyBlock()).getBlock() == Blocks.WATER)) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OdmsttufModItems.WATER_PICKAXE.get()) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.BLOCK_FORTUNE)) {
						_enchantments.remove(Enchantments.BLOCK_FORTUNE);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			}
		}
	}
}
