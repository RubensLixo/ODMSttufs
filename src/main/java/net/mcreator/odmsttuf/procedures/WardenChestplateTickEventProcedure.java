package net.mcreator.odmsttuf.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.odmsttuf.init.OdmsttufModItems;
import net.mcreator.odmsttuf.OdmsttufMod;

import java.util.UUID;

public class WardenChestplateTickEventProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getDisplayName().getString()).equals("da")) {
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.PROJECTILE_PROTECTION, itemstack) != 0)) {
				itemstack.enchant(Enchantments.PROJECTILE_PROTECTION, 10);
			}
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLAST_PROTECTION, itemstack) != 0)) {
				itemstack.enchant(Enchantments.BLAST_PROTECTION, 10);
			}
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.PROJECTILE_PROTECTION, new ItemStack(OdmsttufModItems.WARDEN_HELMET.get())) != 0)) {
				new ItemStack(OdmsttufModItems.WARDEN_HELMET.get()).enchant(Enchantments.PROJECTILE_PROTECTION, 10);
			}
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.PROJECTILE_PROTECTION, new ItemStack(OdmsttufModItems.WARDEN_LEGGINGS.get())) != 0)) {
				new ItemStack(OdmsttufModItems.WARDEN_LEGGINGS.get()).enchant(Enchantments.PROJECTILE_PROTECTION, 10);
			}
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.PROJECTILE_PROTECTION, new ItemStack(OdmsttufModItems.WARDEN_BOOTS.get())) != 0)) {
				new ItemStack(OdmsttufModItems.WARDEN_LEGGINGS.get()).enchant(Enchantments.PROJECTILE_PROTECTION, 10);
			}
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLAST_PROTECTION, new ItemStack(OdmsttufModItems.WARDEN_HELMET.get())) != 0)) {
				new ItemStack(OdmsttufModItems.WARDEN_HELMET.get()).enchant(Enchantments.BLAST_PROTECTION, 10);
			}
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLAST_PROTECTION, new ItemStack(OdmsttufModItems.WARDEN_LEGGINGS.get())) != 0)) {
				new ItemStack(OdmsttufModItems.WARDEN_LEGGINGS.get()).enchant(Enchantments.BLAST_PROTECTION, 10);
			}
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLAST_PROTECTION, new ItemStack(OdmsttufModItems.WARDEN_BOOTS.get())) != 0)) {
				new ItemStack(OdmsttufModItems.WARDEN_LEGGINGS.get()).enchant(Enchantments.BLAST_PROTECTION, 10);
			}
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BINDING_CURSE, new ItemStack(OdmsttufModItems.WARDEN_BOOTS.get())) != 0)) {
				new ItemStack(OdmsttufModItems.WARDEN_BOOTS.get()).enchant(Enchantments.BINDING_CURSE, 1);
			}
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BINDING_CURSE, new ItemStack(OdmsttufModItems.WARDEN_LEGGINGS.get())) != 0)) {
				new ItemStack(OdmsttufModItems.WARDEN_LEGGINGS.get()).enchant(Enchantments.BINDING_CURSE, 1);
			}
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BINDING_CURSE, new ItemStack(OdmsttufModItems.WARDEN_HELMET.get())) != 0)) {
				new ItemStack(OdmsttufModItems.WARDEN_HELMET.get()).enchant(Enchantments.BINDING_CURSE, 1);
			}
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BINDING_CURSE, itemstack) != 0)) {
				itemstack.enchant(Enchantments.BINDING_CURSE, 1);
				OdmsttufMod.queueServerWork(20, () -> {
					if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH)
							.hasModifier((new AttributeModifier(UUID.fromString("8a5d144c-54e6-461e-a579-bd3ff4e5d0a7"), "wardenlife", 500, AttributeModifier.Operation.ADDITION)))))
						((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH)
								.addPermanentModifier((new AttributeModifier(UUID.fromString("8a5d144c-54e6-461e-a579-bd3ff4e5d0a7"), "wardenlife", 500, AttributeModifier.Operation.ADDITION)));
					if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
							.hasModifier((new AttributeModifier(UUID.fromString("989b3ef3-c93a-48fc-bbac-6ceaaac3d0a2"), "wardendamage", 45, AttributeModifier.Operation.ADDITION)))))
						((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
								.addPermanentModifier((new AttributeModifier(UUID.fromString("989b3ef3-c93a-48fc-bbac-6ceaaac3d0a2"), "wardendamage", 45, AttributeModifier.Operation.ADDITION)));
				});
			}
		}
	}
}
