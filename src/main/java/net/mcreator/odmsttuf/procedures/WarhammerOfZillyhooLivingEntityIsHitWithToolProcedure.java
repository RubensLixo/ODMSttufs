package net.mcreator.odmsttuf.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class WarhammerOfZillyhooLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() > 0.005) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.forceAddEffect(new MobEffectInstance(MobEffects.LEVITATION, 1200, 2, false, false), entity);
		}
		if (Math.random() < 0.005) {
			for (int index0 = 0; index0 < 20; index0++) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("odmsttuf:godtierdamage")))),
						(float) Double.POSITIVE_INFINITY);
			}
		}
		if (Math.random() < 0.0001) {
			if (entity instanceof Player _player)
				_player.getInventory().clearContent();
		}
	}
}
