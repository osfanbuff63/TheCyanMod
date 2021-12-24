
package net.mcreator.connectedcampsclassmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.connectedcampsclassmod.init.TheCyanModModTabs;
import net.mcreator.connectedcampsclassmod.init.TheCyanModModItems;

public class CyanSwordItem extends SwordItem {
	public CyanSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 12f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheCyanModModItems.CYAN_GEM));
			}
		}, 3, -3f, new Item.Properties().tab(TheCyanModModTabs.TAB_CLASS_BLOCKS).fireResistant());
		setRegistryName("cyan_sword");
	}
}
