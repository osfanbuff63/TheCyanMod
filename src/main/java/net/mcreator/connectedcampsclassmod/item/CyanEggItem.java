
package net.mcreator.connectedcampsclassmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.connectedcampsclassmod.init.TheCyanModModTabs;

public class CyanEggItem extends Item {
	public CyanEggItem() {
		super(new Item.Properties().tab(TheCyanModModTabs.TAB_CLASS_BLOCKS).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(20).saturationMod(2f)

						.build()));
		setRegistryName("cyan_egg");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 20;
	}
}
