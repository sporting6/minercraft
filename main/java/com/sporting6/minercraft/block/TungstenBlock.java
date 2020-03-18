package com.sporting6.minercraft.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TungstenBlock extends BlockBase
{

	public TungstenBlock(String name, Material miterial) 
	{
		super(name, miterial);
		
		setSoundType(SoundType.METAL);
		setHardness(3.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 2);
	}

}