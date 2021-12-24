
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.connectedcampsclassmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.connectedcampsclassmod.block.CyanWorldPortalBlock;
import net.mcreator.connectedcampsclassmod.block.CyanStoneBlock;
import net.mcreator.connectedcampsclassmod.block.CyanShardBlockBlock;
import net.mcreator.connectedcampsclassmod.block.CyanOreBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheCyanModModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block CYAN_ORE = register(new CyanOreBlock());
	public static final Block CYAN_SHARD_BLOCK = register(new CyanShardBlockBlock());
	public static final Block CYAN_STONE = register(new CyanStoneBlock());
	public static final Block CYAN_WORLD_PORTAL = register(new CyanWorldPortalBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
