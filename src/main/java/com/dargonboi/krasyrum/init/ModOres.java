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

public class ModOres {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            MinerCraft.MODID);
    
    public static final RegistryObject<Block> BLUE_NANITARIUM_ORE = BLOCKS.register("blue_nanitarium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
                    .requiresCorrectToolForDrops().strength(40.0F, 600.0F).sound(SoundType.DEEPSLATE)));
                                                            // Mine Resestance, Blast Resestance.

    public static final RegistryObject<Block> RED_NANITARIUM_ORE = BLOCKS.register("red_nanitarium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
                    .requiresCorrectToolForDrops().strength(30.0F, 600.0F).sound(SoundType.NETHERRACK)));

    public static final RegistryObject<Block> VERANIUM_ORE = BLOCKS.register("veranium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops().strength(30.0F, 600.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> THERIUM_ORE = BLOCKS.register("therium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN)
                    .requiresCorrectToolForDrops().strength(30.0F, 600.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register("titanium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = BLOCKS.register("deepslate_titanium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
                    .requiresCorrectToolForDrops().strength(4.5F, 4.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = BLOCKS.register("deepslate_ruby_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
                    .requiresCorrectToolForDrops().strength(4.5F, 4.0F).sound(SoundType.STONE)));

    public static void Register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
