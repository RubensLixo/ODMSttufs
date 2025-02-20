package net.mcreator.odmsttuf.procedures;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class SteampunkGlassesBaubleIsEquippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(((LivingEntity) entity).getAttribute(ForgeMod.BLOCK_REACH.get()).hasModifier((new AttributeModifier(UUID.fromString("81e4d237-7ca3-4f0f-8ab6-c84710a895e5"), "SteampunkAttributes", 3, AttributeModifier.Operation.ADDITION)))))
			((LivingEntity) entity).getAttribute(ForgeMod.BLOCK_REACH.get()).addPermanentModifier((new AttributeModifier(UUID.fromString("81e4d237-7ca3-4f0f-8ab6-c84710a895e5"), "SteampunkAttributes", 3, AttributeModifier.Operation.ADDITION)));
		if (!(((LivingEntity) entity).getAttribute(ForgeMod.ENTITY_REACH.get()).hasModifier((new AttributeModifier(UUID.fromString("81e4d237-7ca3-4f0f-8ab6-c84710a895e5"), "SteampunkAttributes", 3, AttributeModifier.Operation.ADDITION)))))
			((LivingEntity) entity).getAttribute(ForgeMod.ENTITY_REACH.get()).addPermanentModifier((new AttributeModifier(UUID.fromString("81e4d237-7ca3-4f0f-8ab6-c84710a895e5"), "SteampunkAttributes", 3, AttributeModifier.Operation.ADDITION)));
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.LUCK)
				.hasModifier((new AttributeModifier(UUID.fromString("81e4d237-7ca3-4f0f-8ab6-c84710a895e5"), "SteampunkAttributes", 4, AttributeModifier.Operation.MULTIPLY_TOTAL)))))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.LUCK)
					.addPermanentModifier((new AttributeModifier(UUID.fromString("81e4d237-7ca3-4f0f-8ab6-c84710a895e5"), "SteampunkAttributes", 4, AttributeModifier.Operation.MULTIPLY_TOTAL)));
	}
}
