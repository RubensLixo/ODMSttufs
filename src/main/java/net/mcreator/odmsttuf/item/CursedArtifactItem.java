
package net.mcreator.odmsttuf.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.odmsttuf.procedures.CursedArtifactWhileBaubleIsEquippedTickProcedure;
import net.mcreator.odmsttuf.procedures.CursedArtifactBaubleIsEquippedProcedure;

public class CursedArtifactItem extends Item implements ICurioItem {
	public CursedArtifactItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		CursedArtifactWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity().level(), slotContext.entity().getX(), slotContext.entity().getY(), slotContext.entity().getZ(), slotContext.entity());
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		CursedArtifactBaubleIsEquippedProcedure.execute(slotContext.entity().level(), stack);
	}
}
