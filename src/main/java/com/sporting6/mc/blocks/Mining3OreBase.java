package com.sporting6.mc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Mining3OreBase extends Block{

	public Mining3OreBase() {
		super(Block.Properties.create(Material.ROCK)
				.hardnessAndResistance(7.0f, 25.0f)
				.harvestLevel(3)
				.sound(SoundType.STONE)
				.harvestTool(ToolType.PICKAXE)
				);
		
	}
}
