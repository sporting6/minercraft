package com.sporting6.mc.blocks;

import com.sporting6.mc.Minercraft;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem{

	public BlockItemBase(Block block) {
		super(block, new Item.Properties().group(Minercraft.TAB));	
	}
}