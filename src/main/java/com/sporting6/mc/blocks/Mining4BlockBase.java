package com.sporting6.mc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Mining4BlockBase extends Block {

	public Mining4BlockBase(int harvestLevel) {
		super(Block.Properties.create(Material.IRON)
				.hardnessAndResistance(10.0f, 30.0f)
				.harvestLevel(4)
				.sound(SoundType.METAL)
				.harvestTool(ToolType.PICKAXE)
				);
	}
	
	
	
	

}
