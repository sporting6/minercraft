 package com.sporting6.minercraft.init;

import java.util.ArrayList;
import java.util.List;

import com.sporting6.minercraft.block.BlockBase;
import com.sporting6.minercraft.block.CopperBlock;
import com.sporting6.minercraft.block.CopperOre;
import com.sporting6.minercraft.block.Marble;
import com.sporting6.minercraft.block.NaniteriumOre;
import com.sporting6.minercraft.block.RubyBlock;
import com.sporting6.minercraft.block.RubyOre;
import com.sporting6.minercraft.block.TinBlock;
import com.sporting6.minercraft.block.TinOre;
import com.sporting6.minercraft.block.TungstenBlock;
import com.sporting6.minercraft.block.TungstenOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	 public static final List<Block> BLOCKS = new ArrayList<Block>();  
	
	 public static final Block TUNGSTEN_BLOCK = new TungstenBlock ("tungsten_block", Material.IRON); 
	 public static final Block RUBY_BLOCK = new RubyBlock ("ruby_block", Material.IRON); 
	 public static final Block BRONZE_BLOCK = new TungstenBlock ("bronze_block", Material.IRON); 
	 public static final Block COPPER_BLOCK = new CopperBlock ("copper_block", Material.IRON); 
	 public static final Block TIN_BLOCK = new TinBlock ("tin_block", Material.IRON); 
	 public static final Block OBSISIAN_BLOCK = new CopperBlock ("obsidian_block", Material.IRON); 
	 public static final Block TUNGSTEN_ORE = new TungstenOre ("tungsten_ore", Material.ROCK);
	 public static final Block TITANIUM_BLOCK = new TungstenBlock ("titanium_block", Material.IRON); 
	 public static final Block TITANIUM_ORE = new TungstenOre ("titanium_ore", Material.ROCK);
	 public static final Block NANITERIUM_BLOCK = new TungstenBlock ("naniterium_block", Material.IRON); 
	 public static final Block NANITERIUM_ORE = new NaniteriumOre ("naniterium_ore", Material.ROCK);
	 public static final Block RUBY_ORE = new RubyOre ("ruby_ore", Material.ROCK);
	 public static final Block COPPER_ORE = new CopperOre ("copper_ore", Material.ROCK);
	 public static final Block MARBLE = new Marble ("marble", Material.ROCK); 
	 public static final Block POLISHED_MARBLE = new Marble ("polished_marble", Material.ROCK); 
	 public static final Block MARBLE_BRICKS = new Marble ("marble_bricks", Material.ROCK); 
	 public static final Block TIN_ORE = new TinOre ("tin_ore", Material.ROCK);
}
