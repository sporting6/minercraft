package com.sporting6.mc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Mining2OreBase extends Block{

	public Mining2OreBase() {
		super(Block.Properties.create(Material.ROCK)
				.hardnessAndResistance(5.0f, 15.0f)
				.harvestLevel(2)
				.sound(SoundType.STONE)
				.harvestTool(ToolType.PICKAXE)
				);
		
	}
}
