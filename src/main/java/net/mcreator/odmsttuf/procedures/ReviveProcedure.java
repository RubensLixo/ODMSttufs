package net.mcreator.odmsttuf.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.odmsttuf.network.OdmsttufModVariables;
import net.mcreator.odmsttuf.init.OdmsttufModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ReviveProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getSource(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, DamageSource damagesource, Entity entity) {
		execute(null, world, damagesource, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, DamageSource damagesource, Entity entity) {
		if (damagesource == null || entity == null)
			return;
		if (OdmsttufModVariables.MapVariables.get(world).whozaattributes == 1) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == OdmsttufModItems.WARHAMMER_OF_ZILLYHOO.get()) {
				if (!damagesource.is(DamageTypes.PLAYER_ATTACK)) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2));
					if (!damagesource.is(DamageTypes.PLAYER_EXPLOSION)) {
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2));
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						} else if (event != null && event.hasResult()) {
							event.setResult(Event.Result.DENY);
						}
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == OdmsttufModItems.WARHAMMER_OF_ZILLYHOO.get()) {
				if (!damagesource.is(DamageTypes.PLAYER_ATTACK)) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2));
				}
				if (!damagesource.is(DamageTypes.PLAYER_EXPLOSION)) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2));
				}
			}
		}
	}
}
