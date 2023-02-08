package com.dargonboi.krasyrum.block;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.item.ModIngots;
import com.dargonboi.krasyrum.util.block.BlockRegisters;
import com.dargonboi.krasyrum.util.item.ModCreativeTab;
import it.unimi.dsi.fastutil.Hash;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockCollisions;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.function.Supplier;

public class ModOres {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            Krasyrum.MODID);

    public static final HashMap<String, RegistryObject<Item>> OREITEMMAP = new HashMap<String, RegistryObject<Item>>();
    public static final HashMap<String, RegistryObject<Block>> OREBLOCKMAP = new HashMap<String, RegistryObject<Block>>();




//    public static final RegistryObject<Block> RED_NANITARIUM_ORE = registerBlock("red_nanitarium_ore",
//            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
//                    .requiresCorrectToolForDrops().strength(30.0F, 600.0F).sound(SoundType.NETHERRACK)));

    public static void Register(IEventBus eventBus){
        BlockRegisters.registerOre("blue_nanitarium_ore", MaterialColor.DEEPSLATE, 40f, 600f, SoundType.DEEPSLATE);
        BlockRegisters.registerOre("red_nanitarium_ore", MaterialColor.NETHER, 40f, 600f, SoundType.NETHERRACK);
        BlockRegisters.registerOre("ruby_ore", 4.5f, 4f);
        BlockRegisters.registerOre("titanium_ore", 4.5f, 4f);
        BlockRegisters.registerOre("veranium_ore", MaterialColor.SAND, 30f, 600f, SoundType.STONE);
        BlockRegisters.registerOre("therium_ore", MaterialColor.SAND, 30f, 600f, SoundType.STONE);




        BLOCKS.register(eventBus);
    }
}
