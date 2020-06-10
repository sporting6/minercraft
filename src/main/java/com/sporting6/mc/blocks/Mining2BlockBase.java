package com.sporting6.mc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Mining2BlockBase extends Block{

	public Mining2BlockBase() {
		super(Block.Properties.create(Material.IRON)
				.hardnessAndResistance(5.0f, 15.0f)
				.harvestLevel(2)
				.sound(SoundType.METAL)
				.harvestTool(ToolType.PICKAXE)
				);
		
	}
}
