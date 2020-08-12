package com.sporting6.mc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockBase extends Block {

	public BlockBase(int harvestLevel, float hardness, float resistance) {
		super(Block.Properties.create(Material.IRON)
				.hardnessAndResistance(hardness, resistance)
				.harvestLevel(harvestLevel)
				.setRequiresTool()
				.sound(SoundType.METAL)
				.harvestTool(ToolType.PICKAXE)
				.setRequiresTool()
				);
	}	

}
