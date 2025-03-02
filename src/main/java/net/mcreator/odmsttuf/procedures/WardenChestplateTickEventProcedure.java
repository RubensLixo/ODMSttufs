package net.mcreator.odmsttuf.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.odmsttuf.init.OdmsttufModItems;

import java.util.UUID;

public class WardenChestplateTickEventProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getDisplayName().getString()).equals("DrakeYTz")) {
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLAST_PROTECTION, itemstack) != 0)) {
				itemstack.enchant(Enchantments.BLAST_PROTECTION, 5);
			}
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.PROJECTILE_PROTECTION, itemstack) != 0)) {
				itemstack.enchant(Enchantments.PROJECTILE_PROTECTION, 5);
			}
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BINDING_CURSE, itemstack) != 0)) {
				itemstack.enchant(Enchantments.BINDING_CURSE, 1);
			}
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == OdmsttufModItems.WARDEN_HELMET.get()) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == OdmsttufModItems.WARDEN_LEGGINGS.get()) {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == OdmsttufModItems.WARDEN_BOOTS.get()) {
						if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH)
								.hasModifier((new AttributeModifier(UUID.fromString("8a5d144c-54e6-461e-a579-bd3ff4e5d0a7"), "wardenlife", 500, AttributeModifier.Operation.ADDITION)))))
							((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH)
									.addPermanentModifier((new AttributeModifier(UUID.fromString("8a5d144c-54e6-461e-a579-bd3ff4e5d0a7"), "wardenlife", 500, AttributeModifier.Operation.ADDITION)));
						if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
								.hasModifier((new AttributeModifier(UUID.fromString("989b3ef3-c93a-48fc-bbac-6ceaaac3d0a2"), "wardendamage", 45, AttributeModifier.Operation.ADDITION)))))
							((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
									.addPermanentModifier((new AttributeModifier(UUID.fromString("989b3ef3-c93a-48fc-bbac-6ceaaac3d0a2"), "wardendamage", 45, AttributeModifier.Operation.ADDITION)));
					}
				}
			}
		}
		if (!(entity.getDisplayName().getString()).equals("DrakeYTz")) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.SONIC_BOOM)), 10);
		}
	}
}
