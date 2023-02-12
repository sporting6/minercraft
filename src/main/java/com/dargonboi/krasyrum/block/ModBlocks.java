package com.dargonboi.krasyrum.block;
import com.dargonboi.krasyrum.util.block.BlockRegisters;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class ModBlocks {

    public static void register(){
        BlockRegisters.registerBlock("krasyrum_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(20f, 1200f).sound(SoundType.POLISHED_DEEPSLATE)));
        BlockRegisters.registerBlock("krasyrum_cobblestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(20f, 1200f).sound(SoundType.DEEPSLATE)));
    }

}
