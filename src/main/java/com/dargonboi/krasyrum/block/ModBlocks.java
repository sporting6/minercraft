package com.dargonboi.krasyrum.block;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.block.entity.custom.CondenserBlock;
import com.dargonboi.krasyrum.block.entity.custom.InfusionChamberBlock;
import com.dargonboi.krasyrum.block.entity.custom.StrainerBlock;
import com.dargonboi.krasyrum.item.ModIngots;
import com.dargonboi.krasyrum.util.item.ModCreativeTab;
import com.dargonboi.krasyrum.world.feature.tree.LemonTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
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

    public static final RegistryObject<Block> LEMON_LEAVES = registerBlock("lemon_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, ModCreativeTab.KRASYRUM_MATERIALS);
    public static final RegistryObject<Block> LEMON_SAPLING = registerBlock("lemon_sapling",
            () -> new SaplingBlock(new LemonTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeTab.KRASYRUM_TOOLS_ARMOR);

    // Machines
    public static final RegistryObject<Block> INFUSION_CHAMBER = registerBlock("infusion_chamber",
            () -> new InfusionChamberBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
                    .strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> CONDENSER = registerBlock("condenser",
            () -> new CondenserBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
                    .strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> STRAINER = registerBlock("strainer",
            () -> new StrainerBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD)
                    .strength(3.0F, 6.0F).sound(SoundType.WOOD)));

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
