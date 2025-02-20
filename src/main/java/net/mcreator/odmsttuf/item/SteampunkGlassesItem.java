
package net.mcreator.odmsttuf.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.monster.EnderMan;

import net.mcreator.odmsttuf.procedures.SteampunkGlassesBaubleIsUnequippedProcedure;
import net.mcreator.odmsttuf.procedures.SteampunkGlassesBaubleIsEquippedProcedure;

public class SteampunkGlassesItem extends Item implements ICurioItem {
	public SteampunkGlassesItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public boolean makesPiglinsNeutral(SlotContext slotContext, ItemStack stack) {
		return true;
	}

	@Override
	public boolean isEnderMask(SlotContext slotContext, EnderMan enderMan, ItemStack stack) {
		return true;
	}

	@Override
	public int getEnchantmentValue() {
		return 999;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		SteampunkGlassesBaubleIsEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		SteampunkGlassesBaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
