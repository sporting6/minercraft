package com.sporting6.minercraft.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TungstenOre extends BlockBase {

	public TungstenOre(String name, Material miterial) {
		super(name, miterial);
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
		
		

	}

}
