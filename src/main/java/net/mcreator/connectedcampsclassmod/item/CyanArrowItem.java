
package net.mcreator.connectedcampsclassmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.connectedcampsclassmod.init.TheCyanModModTabs;

public class CyanArrowItem extends Item {
	public CyanArrowItem() {
		super(new Item.Properties().tab(TheCyanModModTabs.TAB_CLASS_BLOCKS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("cyan_arrow");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
