package com.dargonboi.krasyrum.init;

import com.dargonboi.krasyrum.MinerCraft;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            MinerCraft.MODID);


    // Raw Ore Blocks
    public static final RegistryObject<Block> RAW_BLUE_NANITARIUM_BLOCK = BLOCKS.register("raw_blue_nanitarium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE)
                    .requiresCorrectToolForDrops().strength(8.0F, 600.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> RAW_RED_NANITARIUM_BLOCK = BLOCKS.register("raw_red_nanitarium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED)
                    .requiresCorrectToolForDrops().strength(8.0F, 600.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> RAW_VERANIUM_BLOCK = BLOCKS.register("raw_veranium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> RAW_TITANIUM_BLOCK = BLOCKS.register("raw_titanium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    // Material Blocks

    public static final RegistryObject<Block> KYRANIUM_BLOCK = BLOCKS.register("kyranium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE)
                    .requiresCorrectToolForDrops().strength(8.0F, 1200.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> BLUE_NANITARIUM_BLOCK = BLOCKS.register("blue_nanitarium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE)
                    .requiresCorrectToolForDrops().strength(8.0F, 600.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> RED_NANITARIUM_BLOCK = BLOCKS.register("red_nanitarium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED)
                    .requiresCorrectToolForDrops().strength(8.0F, 600.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> VERANIUM_BLOCK = BLOCKS.register("veranium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static void Register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
