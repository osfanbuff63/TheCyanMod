
package net.mcreator.connectedcampsclassmod.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.connectedcampsclassmod.init.TheCyanModModBlocks;

import java.util.Set;
import java.util.Random;

public class CyanOreFeature extends OreFeature {
	public static final CyanOreFeature FEATURE = (CyanOreFeature) new CyanOreFeature().setRegistryName("the_cyan_mod:cyan_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(CyanOreFeatureRuleTest.INSTANCE, TheCyanModModBlocks.CYAN_ORE.defaultBlockState(), 8))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(32)))).squared().count(2);
	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public CyanOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}

	private static class CyanOreFeatureRuleTest extends RuleTest {
		static final CyanOreFeatureRuleTest INSTANCE = new CyanOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<CyanOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<CyanOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("the_cyan_mod:cyan_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == Blocks.STONE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.ANDESITE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.GRANITE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.DIORITE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.DIRT)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
