package com.dargonboi.krasyrum.world.feature;

import com.dargonboi.krasyrum.Krasyrum;
import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {

    public static final RuleTest ENDSTONE_ORE_REPLACEABLES = new BlockMatchTest(Blocks.END_STONE);

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Krasyrum.MODID);



    private static void registerOres(String name, int veinSize, RegistryObject<Block>[] ore, RuleTest[] ruleTest){
        final Supplier<List<OreConfiguration.TargetBlockState>> ORES = Suppliers.memoize(() -> {
            List list = new ArrayList();
            for(int i = 0; i< ruleTest.length; i++) {
                list.add(OreConfiguration.target(ruleTest[i], ore[i].get().defaultBlockState()));
            }
            return list;
        });

        final RegistryObject<ConfiguredFeature<?, ?>> ORE = CONFIGURED_FEATURES.register(name,
                () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORES.get(), veinSize)));

        Krasyrum.OREMAP.put(name, ORE);
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


    public static void register(IEventBus eventBus) {

        //Overworld
//        registerOverworldOres("titanium_ore", 6, Krasyrum.OREBLOCKMAP.get("titanium_ore"),  Krasyrum.OREBLOCKMAP.get("deepslate_titanium_ore"));
        registerOverworldOres("ruby_ore", 3, Krasyrum.OREBLOCKMAP.get("ruby_ore"), Krasyrum.OREBLOCKMAP.get("deepslate_ruby_ore"));

//        registerDeepslateOres("blue_nanitarium_ore", 3, Krasyrum.OREBLOCKMAP.get("blue_nanitarium_ore"));

        //Nether
//        registerNetherOres("red_nanitarium_ore", 3, Krasyrum.OREBLOCKMAP.get("red_nanitarium_ore"));

        //The End
        registerEndOres("veranium_ore", 5, Krasyrum.OREBLOCKMAP.get("veranium_ore"));
        registerEndOres("therium_ore", 5, Krasyrum.OREBLOCKMAP.get("therium_ore"));

        CONFIGURED_FEATURES.register(eventBus);
    }
}
