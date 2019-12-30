package com.sporting6.minercraft.block;

import com.sporting6.minercraft.Main;
import com.sporting6.minercraft.init.ModBlocks;
import com.sporting6.minercraft.init.ModItems;
import com.sporting6.minercraft.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material miterial)
	{
		super(miterial); 
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS); 
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName())); 
		
	}

	@Override
	public void registerModels() 
	{
		 Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0 , "inventory");
	}
}
