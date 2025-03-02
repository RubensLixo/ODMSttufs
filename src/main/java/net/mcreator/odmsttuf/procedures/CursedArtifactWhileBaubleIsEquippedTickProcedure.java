package net.mcreator.odmsttuf.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.odmsttuf.network.OdmsttufModVariables;
import net.mcreator.odmsttuf.init.OdmsttufModItems;
import net.mcreator.odmsttuf.OdmsttufMod;

import java.util.List;
import java.util.Comparator;

public class CursedArtifactWhileBaubleIsEquippedTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDisplayName().getString()).equals("Dev")) {
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(OdmsttufModItems.CURSED_ARTIFACT.get(), lv).isPresent() : false) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 40, 1, false, false));
				if (OdmsttufModVariables.MapVariables.get(world).ImortalidadeCondenada == 9) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator.getDisplayName().getString()).equals("Dev")) {
								if (!(entityiterator instanceof ItemEntity)) {
									entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("odmsttuf:abyssdevours")))), 1);
								}
							}
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 2, false, false));
				}
				if (OdmsttufModVariables.MapVariables.get(world).ImortalidadeCondenada == 8) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator.getDisplayName().getString()).equals("Dev")) {
								if (!(entityiterator instanceof ItemEntity)) {
									entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("odmsttuf:abyssdevours")))), 5);
								}
							}
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 3, false, false));
				}
				if (OdmsttufModVariables.MapVariables.get(world).ImortalidadeCondenada == 7) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator.getDisplayName().getString()).equals("Dev")) {
								if (!(entityiterator instanceof ItemEntity)) {
									entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("odmsttuf:abyssdevours")))), 10);
								}
							}
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 4, false, false));
				}
				if (OdmsttufModVariables.MapVariables.get(world).ImortalidadeCondenada == 6) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator.getDisplayName().getString()).equals("Dev")) {
								if (!(entityiterator instanceof ItemEntity)) {
									entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("odmsttuf:abyssdevours")))), 15);
								}
							}
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 5, false, false));
				}
				if (OdmsttufModVariables.MapVariables.get(world).ImortalidadeCondenada == 5) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator.getDisplayName().getString()).equals("Dev")) {
								if (!(entityiterator instanceof ItemEntity)) {
									entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("odmsttuf:abyssdevours")))), 20);
								}
							}
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 6, false, false));
				}
				if (OdmsttufModVariables.MapVariables.get(world).ImortalidadeCondenada == 4) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator.getDisplayName().getString()).equals("Dev")) {
								if (!(entityiterator instanceof ItemEntity)) {
									entityiterator.hurt(
											new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("odmsttuf:abyssdevours"))), entity), 25);
								}
							}
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 7, false, false));
				}
				if (OdmsttufModVariables.MapVariables.get(world).ImortalidadeCondenada == 3) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator.getDisplayName().getString()).equals("Dev")) {
								if (!(entityiterator instanceof ItemEntity)) {
									entityiterator.hurt(
											new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("odmsttuf:abyssdevours"))), entity), 35);
								}
							}
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 8, false, false));
				}
				if (OdmsttufModVariables.MapVariables.get(world).ImortalidadeCondenada == 2) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator.getDisplayName().getString()).equals("Dev")) {
								if (!(entityiterator instanceof ItemEntity)) {
									entityiterator.hurt(
											new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("odmsttuf:abyssdevours"))), entity), 45);
								}
							}
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 9, false, false));
				}
				if (OdmsttufModVariables.MapVariables.get(world).ImortalidadeCondenada == 1) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator.getDisplayName().getString()).equals("Dev")) {
								if (!(entityiterator instanceof ItemEntity)) {
									entityiterator.hurt(
											new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("odmsttuf:abyssdevours"))), entity), 50);
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60, 1, false, false));
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 10, false, false));
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 60, 10, false, false));
								}
							}
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.forceAddEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 3, false, false), entity);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.forceAddEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 2, false, false), entity);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.forceAddEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 2, false, false), entity);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 10, false, false));
				}
				OdmsttufMod.queueServerWork(1200, () -> {
					if (Math.random() < 0.7) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
					if (Math.random() > 0.7) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.scream")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.scream")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
					if (Math.random() == 0.7) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.death")), SoundSource.HOSTILE, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.death")), SoundSource.HOSTILE, 1, 1, false);
							}
						}
					}
				});
			}
		}
		if (!(entity.getDisplayName().getString()).equals("Dev")) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK), entity), (float) Double.POSITIVE_INFINITY);
		}
	}
}
