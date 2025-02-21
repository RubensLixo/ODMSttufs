
package net.mcreator.odmsttuf.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IItem extends Item {
	public IItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
