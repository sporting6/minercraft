package com.dargonboi.krasyrum.block;

import com.dargonboi.krasyrum.Krasyrum;
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
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            Krasyrum.MODID);


    // Raw Ore Blocks
    public static final RegistryObject<Block> RAW_BLUE_NANITARIUM_BLOCK = registerBlock("raw_blue_nanitarium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE)
                    .requiresCorrectToolForDrops().strength(8.0F, 600.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> RAW_RED_NANITARIUM_BLOCK = registerBlock("raw_red_nanitarium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED)
                    .requiresCorrectToolForDrops().strength(8.0F, 600.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> RAW_VERANIUM_BLOCK = registerBlock("raw_veranium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops().strength(5.0F, 60.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
                    .requiresCorrectToolForDrops().strength(5.0F, 30.0F).sound(SoundType.METAL)));

    // Material Blocks

    public static final RegistryObject<Block> KYRANIUM_BLOCK = registerBlock("kyranium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE)
                    .requiresCorrectToolForDrops().strength(8.0F, 1200.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> BLUE_NANITARIUM_BLOCK = registerBlock("blue_nanitarium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE)
                    .requiresCorrectToolForDrops().strength(8.0F, 600.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> RED_NANITARIUM_BLOCK = registerBlock("red_nanitarium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED)
                    .requiresCorrectToolForDrops().strength(8.0F, 600.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> VERANIUM_BLOCK = registerBlock("veranium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));


    public static final RegistryObject<Block> KRASYRUM_STONE = registerBlock("krasyrum_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE)
                    .requiresCorrectToolForDrops().strength(10.0F, 12.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> KRASYRUM_SAND = registerBlock("krasyrum_sand",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE)
                    .requiresCorrectToolForDrops().strength(8.0f, 3.0F).sound(SoundType.SAND)));

    //Machines

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        CreativeModeTab tab = ModCreativeTab.KRASYRUM_MATERIALS;
        CreativeModeTab finalTab = tab;
        return ModIngots.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(finalTab)));
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModIngots.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }


    public static void Register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
