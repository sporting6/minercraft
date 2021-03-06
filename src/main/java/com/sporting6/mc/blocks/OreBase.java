package com.sporting6.mc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OreBase extends OreBlock {

	public OreBase(int harvestLevel, float hardness, float resistance) {
		super(Block.Properties.create(Material.ROCK)
				.hardnessAndResistance(hardness, resistance)
				.harvestLevel(harvestLevel)
				.setRequiresTool()
				.sound(SoundType.STONE)
				.harvestTool(ToolType.PICKAXE)
				);
	}	

}
