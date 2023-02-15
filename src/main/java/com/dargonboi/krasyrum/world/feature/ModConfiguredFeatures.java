package com.dargonboi.krasyrum.world.feature;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.world.feature.ore.LavaPoolFeature;
import com.google.common.base.Suppliers;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {

    public static final RuleTest ENDSTONE_ORE_REPLACEABLES = new BlockMatchTest(Blocks.END_STONE);



    private static void registerOres(String name, int veinSize, RegistryObject<Block>[] ore, RuleTest[] ruleTest){
        final Supplier<List<OreConfiguration.TargetBlockState>> ORES = Suppliers.memoize(() -> {
            List list = new ArrayList();
            for(int i = 0; i< ruleTest.length; i++) {
                list.add(OreConfiguration.target(ruleTest[i], ore[i].get().defaultBlockState()));
            }
            return list;
        });

        final RegistryObject<ConfiguredFeature<?, ?>> ORE = Krasyrum.CONFIGURED_FEATURES.register(name,
                () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORES.get(), veinSize)));

        Krasyrum.CONFIGUREDOREMAP.put(name, ORE);
    }

    public static void registerOverworldOres(String name, int veinSize, RegistryObject<Block> stoneOre, RegistryObject<Block> deepslateOre){
        RegistryObject<Block>[] ore = new RegistryObject[]{stoneOre, deepslateOre};
        registerOres(name, veinSize, ore, new RuleTest[]{OreFeatures.STONE_ORE_REPLACEABLES, OreFeatures.DEEPSLATE_ORE_REPLACEABLES});
    }
    public static void registerOverworldOres(String name, int veinSize, RegistryObject<Block> stoneOre){
        RegistryObject<Block>[] ore = new RegistryObject[]{stoneOre};
        registerOres(name, veinSize, ore, new RuleTest[]{OreFeatures.STONE_ORE_REPLACEABLES});
    }
    public static void registerDeepslateOres(String name, int veinSize, RegistryObject<Block> deepslateOre){
        RegistryObject<Block>[] ore = new RegistryObject[]{ deepslateOre};
        registerOres(name, veinSize, ore, new RuleTest[]{OreFeatures.DEEPSLATE_ORE_REPLACEABLES});
    }

    public static void registerNetherOres(String name, int veinSize, RegistryObject<Block> ore){
        RegistryObject<Block>[] ores = new RegistryObject[]{ore};
        registerOres(name, veinSize, ores, new RuleTest[]{OreFeatures.NETHER_ORE_REPLACEABLES});
    }
    public static void registerEndOres(String name, int veinSize, RegistryObject<Block> ore){
        RegistryObject<Block>[] ores = new RegistryObject[]{ore};
        registerOres(name, veinSize, ores, new RuleTest[]{ENDSTONE_ORE_REPLACEABLES});
    }
}
