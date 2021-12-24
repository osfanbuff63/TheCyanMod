
package net.mcreator.connectedcampsclassmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.connectedcampsclassmod.init.TheCyanModModTabs;
import net.mcreator.connectedcampsclassmod.init.TheCyanModModItems;

public class CyanHoeItem extends HoeItem {
	public CyanHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2380;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 30;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheCyanModModItems.CYAN_GEM));
			}
		}, 0, -3f, new Item.Properties().tab(TheCyanModModTabs.TAB_CLASS_BLOCKS).fireResistant());
		setRegistryName("cyan_hoe");
	}
}
