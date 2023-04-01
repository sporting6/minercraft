package com.dargonboi.krasyrum.util.world.feature;

import com.dargonboi.krasyrum.util.block.BlockRegisters;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.RegistryObject;

public class Tree {

    private final String name;
    private final RegistryObject<? extends Block> log;
    private final RegistryObject<? extends Block> leaves;

    public Tree(String name){
        this.name = name;
        this.leaves = leaves();
        this.log = log();

    }

    public String getName() {
        return name;
    }


    private RegistryObject<? extends Block> log(){
        return BlockRegisters.registerBlock(name + "_log",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD, MaterialColor.COLOR_BLACK).strength(6, 12)));
    }

    private RegistryObject<? extends Block> leaves(){
        return BlockRegisters.registerBlock(name + "_leaves",
                () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD, MaterialColor.COLOR_BLACK).strength(3, 5)));
    }


}
