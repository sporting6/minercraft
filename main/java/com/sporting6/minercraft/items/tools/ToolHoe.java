package com.sporting6.minercraft.items.tools;

import com.sporting6.minercraft.Main;
import com.sporting6.minercraft.init.ModItems;
import com.sporting6.minercraft.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ToolHoe  extends ItemHoe implements IHasModel{
	

		public ToolHoe(String name, ToolMaterial material)
		{
			super(material);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(CreativeTabs.TOOLS);  
			 
			 
			 ModItems.ITEMS.add(this); 
		}
		
		
		@Override
		public void registerModels() 
		{
			Main.proxy.registerItemRenderer(this, 0, "inventory");  
		}
	}


