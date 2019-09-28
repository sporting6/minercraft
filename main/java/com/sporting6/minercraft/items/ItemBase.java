 package com.sporting6.minercraft.items;

import com.sporting6.minercraft.Main;
import com.sporting6.minercraft.init.ModItems;
import com.sporting6.minercraft.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel 
{
	public ItemBase(String name)
	{
		 setUnlocalizedName(name);
		 setRegistryName(name);
		 setCreativeTab(CreativeTabs.MISC);  
		 
		 
		 ModItems.ITEMS.add(this); 
	}
	
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");  
	}
}
