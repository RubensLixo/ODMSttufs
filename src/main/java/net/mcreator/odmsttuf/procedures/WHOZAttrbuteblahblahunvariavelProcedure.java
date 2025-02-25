package net.mcreator.odmsttuf.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.odmsttuf.network.OdmsttufModVariables;
import net.mcreator.odmsttuf.init.OdmsttufModItems;

public class WHOZAttrbuteblahblahunvariavelProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (OdmsttufModVariables.MapVariables.get(world).whozaattributes == 0) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OdmsttufModItems.WARHAMMER_OF_ZILLYHOO.get()) {
				OdmsttufModVariables.MapVariables.get(world).whozaattributes = 1;
				OdmsttufModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if (OdmsttufModVariables.MapVariables.get(world).whozaattributes == 0) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == OdmsttufModItems.WARHAMMER_OF_ZILLYHOO.get()) {
				OdmsttufModVariables.MapVariables.get(world).whozaattributes = 1;
				OdmsttufModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
