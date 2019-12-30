package com.sporting6.minercraft.items.tools;

import com.sporting6.minercraft.Main;
import com.sporting6.minercraft.init.ModItems;
import com.sporting6.minercraft.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword  extends ItemSword implements IHasModel{
	

		public ToolSword(String name, ToolMaterial material)
		{
			super(material);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(CreativeTabs.COMBAT);  
			 
			 
			 ModItems.ITEMS.add(this); 
		}
		
		
		@Override
		public void registerModels() 
		{
			Main.proxy.registerItemRenderer(this, 0, "inventory");  
		}
	}


