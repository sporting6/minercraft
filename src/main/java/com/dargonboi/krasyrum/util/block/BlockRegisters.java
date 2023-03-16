package com.dargonboi.krasyrum.util.block;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.util.item.ModCreativeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockRegisters {


    public static final RegistryObject<Block> registerOres(String name, float destroyTime, float explosionResistance){
        final RegistryObject<Block> ORE_BLOCK = registerBlock(name,
                () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
                        .requiresCorrectToolForDrops().strength(destroyTime, explosionResistance).sound(SoundType.STONE)));

        final RegistryObject<Block> DEEPSLATE_ORE_BLOCK = registerBlock("deepslate_" + name,
                () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE)
                        .requiresCorrectToolForDrops().strength(destroyTime + 1.5f,
                                explosionResistance + 1.5f).sound(SoundType.DEEPSLATE)));

        Krasyrum.OREBLOCKMAP.put(name, ORE_BLOCK);
        Krasyrum.OREBLOCKMAP.put("deepslate_" + name, DEEPSLATE_ORE_BLOCK);
        return Krasyrum.OREBLOCKMAP.get(name);
    }
    public static final RegistryObject<Block> registerOre(String name, float destroyTime, float explosionResistance){
        final RegistryObject<Block> ORE_BLOCK = registerBlock(name,
                () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
                        .requiresCorrectToolForDrops().strength(destroyTime, explosionResistance).sound(SoundType.STONE)));

        Krasyrum.OREBLOCKMAP.put(name, ORE_BLOCK);
        return Krasyrum.OREBLOCKMAP.get(name);
    }
    public static final RegistryObject<Block> registerDeepslateOre(String name, float destroyTime, float explosionResistance){
        final RegistryObject<Block> DEEPSLATE_ORE_BLOCK = registerBlock("deepslate_" + name,
                () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE)
                        .requiresCorrectToolForDrops().strength(destroyTime + 1.5f,
                                explosionResistance + 1.5f).sound(SoundType.DEEPSLATE)));

        Krasyrum.OREBLOCKMAP.put("deepslate_" + name, DEEPSLATE_ORE_BLOCK);
        return Krasyrum.OREBLOCKMAP.get(name);
    }

    public static final RegistryObject<Block> registerOre(String name, MaterialColor color, float destroyTime, float explosionResistance, SoundType soundType){
        final RegistryObject<Block> ORE_BLOCK = registerBlock(name,
                () -> new Block(BlockBehaviour.Properties.of(Material.STONE, color)
                        .requiresCorrectToolForDrops().strength(destroyTime, explosionResistance).sound(soundType)));
        Krasyrum.OREBLOCKMAP.put(name, ORE_BLOCK);
        return Krasyrum.OREBLOCKMAP.get(name);
    }
    public static final RegistryObject<? extends Block> registerMaterialBlock(String name, MaterialColor color, float destroyTime, float explosionResistance, boolean rawOreBlock){
        final RegistryObject<Block> MATERIAL_BLOCK = registerBlock(name,
                () -> new Block(BlockBehaviour.Properties.of(Material.METAL, color)
                        .requiresCorrectToolForDrops().strength(destroyTime, explosionResistance).sound(SoundType.METAL)));
        Krasyrum.BLOCKMAP.put(name, MATERIAL_BLOCK);

        if(rawOreBlock){
            final RegistryObject<Block> RAW_MATERIAL_BLOCK = registerBlock("raw_" + name,
                    () -> new Block(BlockBehaviour.Properties.of(Material.METAL, color)
                            .requiresCorrectToolForDrops().strength(destroyTime -2f, explosionResistance -5f).sound(SoundType.METAL)));
            Krasyrum.BLOCKMAP.put("raw_" + name, RAW_MATERIAL_BLOCK);
        }
        return Krasyrum.BLOCKMAP.get(name);
    }

    public static final  RegistryObject<? extends Block> registerMaterialBlock(String name, Material material, MaterialColor color, float destroyTime, float explosionResistance, SoundType soundType,  boolean rawOreBlock){
        final RegistryObject<Block> MATERIAL_BLOCK = registerBlock(name,
                () -> new Block(BlockBehaviour.Properties.of(material, color)
                        .requiresCorrectToolForDrops().strength(destroyTime, explosionResistance).sound(soundType)));
        Krasyrum.BLOCKMAP.put(name, MATERIAL_BLOCK);
        if(rawOreBlock){
            final RegistryObject<Block> RAW_MATERIAL_BLOCK = registerBlock("raw_" + name,
                    () -> new Block(BlockBehaviour.Properties.of(material, color)
                            .requiresCorrectToolForDrops().strength(destroyTime -2f, explosionResistance -5f).sound(soundType)));
            Krasyrum.BLOCKMAP.put("raw_" + name, RAW_MATERIAL_BLOCK);
        }
        return Krasyrum.BLOCKMAP.get(name);
    }

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = Krasyrum.BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        Krasyrum.BLOCKMAP.put(name, toReturn);
        return toReturn;
    }
    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = Krasyrum.BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        Krasyrum.BLOCKMAP.put(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        RegistryObject<Item> toReturn = Krasyrum.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS)));
        Krasyrum.OREITEMMAP.put(name, toReturn);
        return toReturn;
    }
    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        RegistryObject<Item> toReturn = Krasyrum.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
        Krasyrum.OREITEMMAP.put(name, toReturn);
        return toReturn;
    }
}
