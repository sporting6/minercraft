package com.sporting6.minercraft.items.tools;

import com.sporting6.minercraft.Main;
import com.sporting6.minercraft.init.ModItems;
import com.sporting6.minercraft.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ToolAxe  extends ItemAxe implements IHasModel{
	

		public ToolAxe(String name, ToolMaterial material)
		{
			super(material, 8.0F, -3.2F);
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


