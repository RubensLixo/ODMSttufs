package net.mcreator.odmsttuf.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.odmsttuf.network.OdmsttufModVariables;
import net.mcreator.odmsttuf.init.OdmsttufModItems;

public class UseadamstarProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (OdmsttufModVariables.MapVariables.get(world).adamrevives < 2) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 1200);
			OdmsttufModVariables.MapVariables.get(world).adamrevives = OdmsttufModVariables.MapVariables.get(world).adamrevives + 1;
			OdmsttufModVariables.MapVariables.get(world).syncData(world);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(OdmsttufModItems.ADAMSSTARS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (OdmsttufModVariables.MapVariables.get(world).adamrevives == 2) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 1200);
			OdmsttufModVariables.MapVariables.get(world).adamrevives = OdmsttufModVariables.MapVariables.get(world).adamrevives + 1;
			OdmsttufModVariables.MapVariables.get(world).syncData(world);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(OdmsttufModItems.ADAMSSTARS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
