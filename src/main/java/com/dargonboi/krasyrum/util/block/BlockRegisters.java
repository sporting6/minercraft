package com.dargonboi.krasyrum.util.block;

import com.dargonboi.krasyrum.block.ModOres;
import com.dargonboi.krasyrum.item.ModIngots;
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


    public static final RegistryObject<Block> registerOre(String name, float destroyTime, float explosionResistance){
        final RegistryObject<Block> ORE_BLOCK = registerBlock(name,
                () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
                        .requiresCorrectToolForDrops().strength(destroyTime, explosionResistance).sound(SoundType.STONE)));

        final RegistryObject<Block> DEEPSLATE_ORE_BLOCK = registerBlock("deepslate_" + name,
                () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE)
                        .requiresCorrectToolForDrops().strength(destroyTime + 1.5f,
                                explosionResistance + 1.5f).sound(SoundType.DEEPSLATE)));

        ModOres.OREBLOCKMAP.put(name, ORE_BLOCK);
        ModOres.OREBLOCKMAP.put("deepslate_" + name, DEEPSLATE_ORE_BLOCK);
        return ModOres.OREBLOCKMAP.get(name);
    }

    public static final RegistryObject<Block> registerOre(String name, MaterialColor color, float destroyTime, float explosionResistance, SoundType soundType){
        final RegistryObject<Block> ORE_BLOCK = registerBlock(name,
                () -> new Block(BlockBehaviour.Properties.of(Material.STONE, color)
                        .requiresCorrectToolForDrops().strength(destroyTime, explosionResistance).sound(soundType)));
        ModOres.OREBLOCKMAP.put(name, ORE_BLOCK);
        return ModOres.OREBLOCKMAP.get(name);
    }

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = ModOres.BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = ModOres.BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        RegistryObject<Item> toReturn = ModIngots.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS)));
        ModOres.OREITEMMAP.put(name, toReturn);
        return toReturn;
    }
    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        RegistryObject<Item> toReturn = ModIngots.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
        ModOres.OREITEMMAP.put(name, toReturn);
        return toReturn;
    }
}
