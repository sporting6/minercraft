package com.dargonboi.mrc.core.init;

import com.dargonboi.mrc.MinerCraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModBlocks {
	
	private ModBlocks() {}
	
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MinerCraft.MODID);
	
	
	//Ores
	public static final RegistryObject<Block> BLUE_NANITARIUM_ORE = BLOCKS.register("blue_nanitarium_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
					.requiresCorrectToolForDrops().strength(40.0F, 600.0F).sound(SoundType.DEEPSLATE)));
	//                                            Mine Resestance, Blast Resestance.
	
	public static final RegistryObject<Block> RED_NANITARIUM_ORE = BLOCKS.register("red_nanitarium_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
					.requiresCorrectToolForDrops().strength(30.0F, 600.0F).sound(SoundType.NETHERRACK)));
	
	public static final RegistryObject<Block> VERANIUM_ORE = BLOCKS.register("veranium_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE)
					.requiresCorrectToolForDrops().strength(30.0F, 600.0F).sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register("titanium_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
					.requiresCorrectToolForDrops().strength(3.0F, 600.0F).sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = BLOCKS.register("deepslate_titanium_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
					.requiresCorrectToolForDrops().strength(4.5F, 600.0F).sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
					.requiresCorrectToolForDrops().strength(3.0F, 600.0F).sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = BLOCKS.register("deepslate_ruby_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
					.requiresCorrectToolForDrops().strength(4.5F, 600.0F).sound(SoundType.STONE)));
	
	//Raw Ore Blocks
	public static final RegistryObject<Block> RAW_BLUE_NANITARIUM_BLOCK = BLOCKS.register("raw_blue_nanitarium_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE)
					.requiresCorrectToolForDrops().strength(8.0F, 600.0F).sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> RAW_RED_NANITARIUM_BLOCK = BLOCKS.register("raw_red_nanitarium_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED)
					.requiresCorrectToolForDrops().strength(8.0F, 600.0F).sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> RAW_VERANIUM_BLOCK = BLOCKS.register("raw_veranium_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE)
					.requiresCorrectToolForDrops().strength(8.0F, 600.0F).sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> RAW_TITANIUM_BLOCK = BLOCKS.register("raw_titanium_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
					.requiresCorrectToolForDrops().strength(4.0F, 600.0F).sound(SoundType.METAL)));
	

	
	//Material Blocks
	public static final RegistryObject<Block> BLUE_NANITARIUM_BLOCK = BLOCKS.register("blue_nanitarium_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE)
					.requiresCorrectToolForDrops().strength(8.0F, 600.0F).sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> RED_NANITARIUM_BLOCK = BLOCKS.register("red_nanitarium_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED)
					.requiresCorrectToolForDrops().strength(8.0F, 600.0F).sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> VERANIUM_BLOCK = BLOCKS.register("veranium_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE)
					.requiresCorrectToolForDrops().strength(8.0F, 600.0F).sound(SoundType.METAL)));

	public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
					.requiresCorrectToolForDrops().strength(4.0F, 600.0F).sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
					.requiresCorrectToolForDrops().strength(4.0F, 600.0F).sound(SoundType.METAL)));




}