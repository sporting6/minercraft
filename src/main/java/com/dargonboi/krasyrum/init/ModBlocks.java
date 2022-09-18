package com.dargonboi.krasyrum.init;

import com.dargonboi.krasyrum.MinerCraft;
import com.dargonboi.krasyrum.block.custom.InfusionChamberBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            MinerCraft.MODID);


    // Raw Ore Blocks
    public static final RegistryObject<Block> RAW_BLUE_NANITARIUM_BLOCK = registerBlock("raw_blue_nanitarium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE)
                    .requiresCorrectToolForDrops().strength(8.0F, 600.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> RAW_RED_NANITARIUM_BLOCK = registerBlock("raw_red_nanitarium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED)
                    .requiresCorrectToolForDrops().strength(8.0F, 600.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> RAW_VERANIUM_BLOCK = registerBlock("raw_veranium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

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

    public static final RegistryObject<Block> INFUSION_CHAMBER = registerBlock("infusion_chamber",
            () -> new InfusionChamberBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
                    .strength(5.0F, 6.0F).sound(SoundType.METAL)));

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
