package com.dargonboi.krasyrum.block;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.fluid.ModFluids;
import com.dargonboi.krasyrum.util.block.BlockRegisters;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final RegistryObject<LiquidBlock> BOILING_WATER_BLOCK = Krasyrum.BLOCKS.register("boiling_water_block",
            () -> new LiquidBlock(ModFluids.SOURCE_BOILING_WATER, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static void register() {
        BlockRegisters.registerBlock("krasyrum_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(20f, 1200f).sound(SoundType.POLISHED_DEEPSLATE)));
        BlockRegisters.registerBlock("krasyrum_cobblestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(20f, 1200f).sound(SoundType.DEEPSLATE)));
        BlockRegisters.registerBlock("krasyrum_magma", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(20f, 1200f).sound(SoundType.DEEPSLATE)));


    }

}
