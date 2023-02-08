package com.dargonboi.krasyrum.block;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.item.ModIngots;
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

    private static final RegistryObject<Block> registerBlock(String name, MaterialColor color,
                                                             float destroyTime, float explosionResistance, SoundType soundType){
        final RegistryObject<Block> ORE_BLOCK = registerBlock(name,
                () -> new Block(BlockBehaviour.Properties.of(Material.STONE, color)
                        .requiresCorrectToolForDrops().strength(destroyTime, explosionResistance).sound(soundType)));
        OREBLOCKMAP.put(name, ORE_BLOCK);
        return OREBLOCKMAP.get(name);
    }




//    public static final RegistryObject<Block> BLUE_NANITARIUM_ORE = registerBlock("blue_nanitarium_ore",
//            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
//                    .requiresCorrectToolForDrops().strength(40.0F, 600.0F).sound(SoundType.DEEPSLATE)));
//                                                            // Mine Resestance, Blast Resestance.

    public static final RegistryObject<Block> RED_NANITARIUM_ORE = registerBlock("red_nanitarium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
                    .requiresCorrectToolForDrops().strength(30.0F, 600.0F).sound(SoundType.NETHERRACK)));

    public static final RegistryObject<Block> VERANIUM_ORE = registerBlock("veranium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE)
                    .requiresCorrectToolForDrops().strength(30.0F, 600.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> THERIUM_ORE = registerBlock("therium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN)
                    .requiresCorrectToolForDrops().strength(30.0F, 600.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
                    .requiresCorrectToolForDrops().strength(4.5F, 4.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
                    .requiresCorrectToolForDrops().strength(4.5F, 4.0F).sound(SoundType.STONE)));

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
        RegistryObject<Item> toReturn = ModIngots.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS)));
        OREITEMMAP.put(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        RegistryObject<Item> toReturn = ModIngots.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
        OREITEMMAP.put(name, toReturn);
        return toReturn;
    }

    public static void Register(IEventBus eventBus){
        registerBlock("blue_nanitarium_ore", MaterialColor.DEEPSLATE, 40f, 600f, SoundType.DEEPSLATE);

        BLOCKS.register(eventBus);
    }
}
