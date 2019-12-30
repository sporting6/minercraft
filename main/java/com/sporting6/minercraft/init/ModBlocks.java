 package com.sporting6.minercraft.init;

import java.util.ArrayList;
import java.util.List;

import com.sporting6.minercraft.block.BlockBase;
import com.sporting6.minercraft.block.TungstenBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	 public static final List<Block> BLOCKS = new ArrayList<Block>();  
	
	 public static final Block TUNGSTEN_BLOCK = new TungstenBlock ("tungsten_block", Material.IRON); 
}
