package com.sporting6.minercraft.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TinBlock extends BlockBase
{

	public TinBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(3.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 1);
	}

}
