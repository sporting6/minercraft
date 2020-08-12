package com.sporting6.mc.init;

import com.sporting6.mc.Minercraft;
import com.sporting6.mc.blocks.BlockBase;
import com.sporting6.mc.blocks.BlockItemBase;
import com.sporting6.mc.blocks.NanitariumFurnace;
import com.sporting6.mc.blocks.OreBase;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,Minercraft.MOD_ID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,Minercraft.MOD_ID);
	
	public static final RegistryObject<Block> BLUE_NANITARIUM_BLOCK = BLOCKS.register("blue_nanitarium_block",() -> new BlockBase(4, 7.0f, 20.0f));
	public static final RegistryObject<Block> RED_NANITARIUM_BLOCK = BLOCKS.register("red_nanitarium_block", () -> new BlockBase(4, 7.0f, 20.0f));
	public static final RegistryObject<Block> TUNGSTEN_BLOCK = BLOCKS.register("tungsten_block", () -> new BlockBase(2, 7.0f, 20.0f));
	public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block",  () -> new BlockBase(1, 5.0f, 15.0f));
	public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", () -> new BlockBase(2, 7.0f, 25.0f));
	public static final RegistryObject<Block> OBSIDIAN_BLOCK = BLOCKS.register("obsidian_block", () -> new BlockBase(2, 8.0f, 50.001f));
	public static final RegistryObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block", () -> new BlockBase(2, 5.0f, 25.0f));
	public static final RegistryObject<Block> TIN__BLOCK = BLOCKS.register("tin_block", () -> new BlockBase(1, 5.0f, 15.0f));
	public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () -> new BlockBase(2, 7.0f, 20.0f));
	public static final RegistryObject<Block> BLUE_NANITARIUM_ORE = BLOCKS.register("blue_nanitarium_ore", () -> new OreBase(4, 7.0f, 20.0f));
	public static final RegistryObject<Block> RED_NANITARIUM_ORE = BLOCKS.register("red_nanitarium_ore", () -> new OreBase(4, 7.0f,20.0f));
	public static final RegistryObject<Block> TUNGSTEN_ORE = BLOCKS.register("tungsten_ore", () -> new OreBase(2, 7.0f, 20.0f));
	public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", () -> new OreBase(2, 5.0f, 15.0f));
	public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register("titanium_ore", () -> new OreBase(2, 7.0f, 20.0f));
	public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore",  () -> new OreBase(1, 5.0f, 15.0f));
	public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () -> new OreBase(2, 7.0f, 20.0f));
	public static final RegistryObject<Block> MARBLE = BLOCKS.register("marble", () -> new OreBase(2, 7.0f, 20.0f));
	public static final RegistryObject<Block> POLISHED_MARBLE = BLOCKS.register("polished_marble", () -> new OreBase(2, 7.0f, 20.0f));
	public static final RegistryObject<Block> MARBLE_BRICKS = BLOCKS.register("marble_bricks", () -> new OreBase(2, 7.0f, 20.0f));
	public static final RegistryObject<Block> NANITARIUM_FURNACE = BLOCKS.register("nanitarium_furnace", NanitariumFurnace::new);
	
	public static final RegistryObject<Item> BLUE_NANITARIUM_BLOCK_ITEM = ITEMS.register("blue_nanitarium_block", () -> new BlockItemBase(BLUE_NANITARIUM_BLOCK.get()));
	public static final RegistryObject<Item> RED_NANITARIUM_BLOCK_ITEM = ITEMS.register("red_nanitarium_block", () -> new BlockItemBase(RED_NANITARIUM_BLOCK.get()));
	public static final RegistryObject<Item> TUNGSTEN_BLOCK_ITEM = ITEMS.register("tungsten_block", () -> new BlockItemBase(TUNGSTEN_BLOCK.get()));
	public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block", () -> new BlockItemBase(COPPER_BLOCK.get()));
	public static final RegistryObject<Item> TITANIUM_BLOCK_ITEM = ITEMS.register("titanium_block", () -> new BlockItemBase(TITANIUM_BLOCK.get()));
	public static final RegistryObject<Item> OBSIDIAN_BLOCK_ITEM = ITEMS.register("obsidian_block", () -> new BlockItemBase(OBSIDIAN_BLOCK.get()));
	public static final RegistryObject<Item> BRONZE_BLOCK_ITEM = ITEMS.register("bronze_block", () -> new BlockItemBase(BRONZE_BLOCK.get()));
	public static final RegistryObject<Item> TIN_BLOCK_ITEM = ITEMS.register("tin_block", () -> new BlockItemBase(TIN__BLOCK.get()));
	public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
	public static final RegistryObject<Item> BLUE_NANITARIUM_ORE_ITEM = ITEMS.register("blue_nanitarium_ore", () -> new BlockItemBase(BLUE_NANITARIUM_ORE.get()));
	public static final RegistryObject<Item> RED_NANITARIUM_ORE_ITEM = ITEMS.register("red_nanitarium_ore", () -> new BlockItemBase(RED_NANITARIUM_ORE.get()));
	public static final RegistryObject<Item> TUNGSTEN_ORE_ITEM = ITEMS.register("tungsten_ore", () -> new BlockItemBase(TUNGSTEN_ORE.get()));
	public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore", () -> new BlockItemBase(COPPER_ORE.get()));
	public static final RegistryObject<Item> TITANIUM_ORE_ITEM = ITEMS.register("titanium_ore", () -> new BlockItemBase(TITANIUM_ORE.get()));
	public static final RegistryObject<Item> TIN_ORE_ITEM = ITEMS.register("tin_ore", () -> new BlockItemBase(TIN_ORE.get()));
	public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));
	public static final RegistryObject<Item> MARBLE_ITEMS = ITEMS.register("marble", () -> new BlockItemBase(MARBLE.get()));
	public static final RegistryObject<Item> POLISHED_MARBLE_ITEM = ITEMS.register("polished_marble", () -> new BlockItemBase(POLISHED_MARBLE.get()));
	public static final RegistryObject<Item> MARBLE_BRICKS_ITEM = ITEMS.register("marble_bricks", () -> new BlockItemBase(MARBLE_BRICKS.get()));
	public static final RegistryObject<Item> NANITARIUM_FURNACE_ITEM = ITEMS.register("nanitarium_furnace", () -> new BlockItemBase(NANITARIUM_FURNACE.get()));
	

}
