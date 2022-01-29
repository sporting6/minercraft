package com.dargonboi.mrc.core.init;

import com.dargonboi.mrc.MinerCraft;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
	
	 private ModItems() {}
	 
	 public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinerCraft.MODID);
	 
	 //Items
	 public static final RegistryObject<Item> BLUE_NANITARIUM_INGOT = ITEMS.register("blue_nanitarium_ingot",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).fireResistant()));
	 
	 
	 
	 
	 
	 
	 //Block Items
	 
	 public static final RegistryObject<BlockItem> BLUE_NANITARIUM_ORE_ITEM = ITEMS.register("blue_nanitarium_ore",
			 () -> new BlockItem(ModBlocks.BLUE_NANITARIUM_ORE.get() , new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

}
