package net.mcreator.odmsttuf.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
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
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.INDIRECT_MAGIC)), (float) Double.POSITIVE_INFINITY);
		}
	}
}
