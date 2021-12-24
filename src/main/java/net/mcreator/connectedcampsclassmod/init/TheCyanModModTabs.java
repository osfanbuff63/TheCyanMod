
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.connectedcampsclassmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TheCyanModModTabs {
	public static CreativeModeTab TAB_CLASS_BLOCKS;

	public static void load() {
		TAB_CLASS_BLOCKS = new CreativeModeTab("tabclass_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.CYAN_BED);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
