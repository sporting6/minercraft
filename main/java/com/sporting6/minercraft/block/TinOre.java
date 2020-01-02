package com.sporting6.minercraft.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TinOre extends BlockBase {

	public TinOre(String name, Material miterial) {
		super(name, miterial);
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 1);
		
		

	}

}
