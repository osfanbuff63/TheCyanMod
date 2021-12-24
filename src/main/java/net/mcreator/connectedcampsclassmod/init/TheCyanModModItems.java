
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.connectedcampsclassmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.connectedcampsclassmod.item.CyanWorldItem;
import net.mcreator.connectedcampsclassmod.item.CyanSwordItem;
import net.mcreator.connectedcampsclassmod.item.CyanShovelItem;
import net.mcreator.connectedcampsclassmod.item.CyanPickaxeItem;
import net.mcreator.connectedcampsclassmod.item.CyanItem;
import net.mcreator.connectedcampsclassmod.item.CyanHoeItem;
import net.mcreator.connectedcampsclassmod.item.CyanGemItem;
import net.mcreator.connectedcampsclassmod.item.CyanEggItem;
import net.mcreator.connectedcampsclassmod.item.CyanBowItem;
import net.mcreator.connectedcampsclassmod.item.CyanAxeItem;
import net.mcreator.connectedcampsclassmod.item.CyanArrowItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheCyanModModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item CYAN_ORE = register(TheCyanModModBlocks.CYAN_ORE, TheCyanModModTabs.TAB_CLASS_BLOCKS);
	public static final Item CYAN_GEM = register(new CyanGemItem());
	public static final Item CYAN_SHARD_BLOCK = register(TheCyanModModBlocks.CYAN_SHARD_BLOCK, TheCyanModModTabs.TAB_CLASS_BLOCKS);
	public static final Item CYAN_PICKAXE = register(new CyanPickaxeItem());
	public static final Item CYAN_AXE = register(new CyanAxeItem());
	public static final Item CYAN_HELMET = register(new CyanItem.Helmet());
	public static final Item CYAN_CHESTPLATE = register(new CyanItem.Chestplate());
	public static final Item CYAN_LEGGINGS = register(new CyanItem.Leggings());
	public static final Item CYAN_BOOTS = register(new CyanItem.Boots());
	public static final Item CYAN_SHOVEL = register(new CyanShovelItem());
	public static final Item CYAN_SWORD = register(new CyanSwordItem());
	public static final Item CYAN_EGG = register(new CyanEggItem());
	public static final Item CYAN_STONE = register(TheCyanModModBlocks.CYAN_STONE, TheCyanModModTabs.TAB_CLASS_BLOCKS);
	public static final Item CYAN_WORLD = register(new CyanWorldItem());
	public static final Item CYAN_ARROW = register(new CyanArrowItem());
	public static final Item CYAN_BOW = register(new CyanBowItem());
	public static final Item CYAN_HOE = register(new CyanHoeItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
