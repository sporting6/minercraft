package com.sporting6.mc.util;

import com.sporting6.mc.Minercraft;
import com.sporting6.mc.blocks.BlockItemBase;
import com.sporting6.mc.blocks.OreBase;
import com.sporting6.mc.blocks.BlockBase;
import com.sporting6.mc.items.ItemBase;
import com.sporting6.mc.tools.ModitemTeir;

import net.minecraft.block.Block;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
	
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,Minercraft.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,Minercraft.MOD_ID);

	
	public static void init() {
		
		 ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		 BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

	}
	
	
	//Items
	
	public static final RegistryObject<Item> NANITARIUM_INGOT = ITEMS.register("nanitarium_ingot", ItemBase::new);
	public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", ItemBase::new);
	public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ItemBase::new);
	public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", ItemBase::new);
	public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot", ItemBase::new);
	public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", ItemBase::new);
	public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", ItemBase::new);
	public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
	
	//Tools
	
	public static final RegistryObject<SwordItem> NANITARIUM_SWORD = ITEMS.register("nanitarium_sword", () -> 
	new SwordItem(ModitemTeir.NANITARIUM, 5, -2.0f, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<PickaxeItem> NANITARIUM_PICK = ITEMS.register("nanitarium_pickaxe", () -> 
	new PickaxeItem(ModitemTeir.NANITARIUM, 0, -2.8f, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ShovelItem> NANITARIUM_SHOVEL = ITEMS.register("nanitarium_shovel", () -> 
	new ShovelItem(ModitemTeir.NANITARIUM, 1, -2.8f, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<AxeItem> NANITARIUM_AXE = ITEMS.register("nanitarium_axe", () -> 
	new AxeItem(ModitemTeir.NANITARIUM, 6, -2.6f, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<HoeItem> NANITARIUM_HOE = ITEMS.register("nanitarium_hoe", () -> 
	new HoeItem(ModitemTeir.NANITARIUM, -0.8f, new Item.Properties().group(Minercraft.TAB)));

	
	//Blocks
	
	public static final RegistryObject<Block> NANITARIUM_BLOCK = BLOCKS.register("nanitarium_block", () -> new BlockBase(2, 7.0f, 20.0f));
	public static final RegistryObject<Block> TUNGSTEN_BLOCK = BLOCKS.register("tungsten_block", () -> new BlockBase(2, 7.0f, 20.0f));
	public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block",  () -> new BlockBase(1, 5.0f, 15.0f));
	public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", () -> new BlockBase(2, 7.0f, 25.0f));
	public static final RegistryObject<Block> OBSIDIAN_BLOCK = BLOCKS.register("obsidian_block", () -> new BlockBase(2, 8.0f, 50.001f));
	public static final RegistryObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block", () -> new BlockBase(2, 5.0f, 25.0f));
	public static final RegistryObject<Block> TIN__BLOCK = BLOCKS.register("tin_block", () -> new BlockBase(1, 5.0f, 15.0f));
	public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () -> new BlockBase(2, 7.0f, 20.0f));
	public static final RegistryObject<Block> NANITARIUM_ORE = BLOCKS.register("nanitarium_ore", () -> new OreBase(2, 7.0f, 20.0f));
	public static final RegistryObject<Block> TUNGSTEN_ORE = BLOCKS.register("tungsten_ore", () -> new OreBase(2, 7.0f, 20.0f));
	public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", () -> new OreBase(2, 5.0f, 15.0f));
	public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register("titanium_ore", () -> new OreBase(2, 7.0f, 20.0f));
	public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore",  () -> new OreBase(1, 5.0f, 15.0f));
	public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () -> new OreBase(2, 7.0f, 20.0f));
	public static final RegistryObject<Block> MARBLE = BLOCKS.register("marble", () -> new OreBase(2, 7.0f, 20.0f));
	public static final RegistryObject<Block> POLISHED_MARBLE = BLOCKS.register("polished_marble", () -> new OreBase(2, 7.0f, 20.0f));
	public static final RegistryObject<Block> MARBLE_BRICKS = BLOCKS.register("marble_bricks", () -> new OreBase(2, 7.0f, 20.0f));

	//Block Items
	
	public static final RegistryObject<Item> NANITARIUM_BLOCK_ITEM = ITEMS.register("nanitarium_block", () -> new BlockItemBase(NANITARIUM_BLOCK.get()));
	public static final RegistryObject<Item> TUNGSTEN_BLOCK_ITEM = ITEMS.register("tungsten_block", () -> new BlockItemBase(TUNGSTEN_BLOCK.get()));
	public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block", () -> new BlockItemBase(COPPER_BLOCK.get()));
	public static final RegistryObject<Item> TITANIUM_BLOCK_ITEM = ITEMS.register("titanium_block", () -> new BlockItemBase(TITANIUM_BLOCK.get()));
	public static final RegistryObject<Item> OBSIDIAN_BLOCK_ITEM = ITEMS.register("obsidian_block", () -> new BlockItemBase(OBSIDIAN_BLOCK.get()));
	public static final RegistryObject<Item> BRONZE_BLOCK_ITEM = ITEMS.register("bronze_block", () -> new BlockItemBase(BRONZE_BLOCK.get()));
	public static final RegistryObject<Item> TIN_BLOCK_ITEM = ITEMS.register("tin_block", () -> new BlockItemBase(TIN__BLOCK.get()));
	public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
	public static final RegistryObject<Item> NANITARIUM_ORE_ITEM = ITEMS.register("nanitarium_ore", () -> new BlockItemBase(NANITARIUM_ORE.get()));
	public static final RegistryObject<Item> TUNGSTEN_ORE_ITEM = ITEMS.register("tungsten_ore", () -> new BlockItemBase(TUNGSTEN_ORE.get()));
	public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore", () -> new BlockItemBase(COPPER_ORE.get()));
	public static final RegistryObject<Item> TITANIUM_ORE_ITEM = ITEMS.register("titanium_ore", () -> new BlockItemBase(TITANIUM_ORE.get()));
	public static final RegistryObject<Item> TIN_ORE_ITEM = ITEMS.register("tin_ore", () -> new BlockItemBase(TIN_ORE.get()));
	public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));
	public static final RegistryObject<Item> MARBLE_ITEMS = ITEMS.register("marble", () -> new BlockItemBase(MARBLE.get()));
	public static final RegistryObject<Item> POLISHED_MARBLE_ITEM = ITEMS.register("polished_marble", () -> new BlockItemBase(POLISHED_MARBLE.get()));
	public static final RegistryObject<Item> MARBLE_BRICKS_ITEM = ITEMS.register("marble_bricks", () -> new BlockItemBase(MARBLE_BRICKS.get()));
	

	
}
