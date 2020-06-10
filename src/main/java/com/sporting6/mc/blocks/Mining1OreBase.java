package com.sporting6.mc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Mining1OreBase extends Block{

	public Mining1OreBase() {
		super(Block.Properties.create(Material.ROCK)
				.hardnessAndResistance(5.0f, 15.0f)
				.harvestLevel(1)
				.sound(SoundType.STONE)
				.harvestTool(ToolType.PICKAXE)
				);
		
	}
}
