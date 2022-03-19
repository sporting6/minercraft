package com.dargonboi.mrc.core.init;

import com.dargonboi.mrc.MinerCraft;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {

	private ModItems() {
	}

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinerCraft.MODID);

	// Items

	// Ingots
	public static final RegistryObject<Item> BLUE_NANITARIUM_INGOT = ITEMS.register("blue_nanitarium_ingot",
			() -> new Item(
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant().rarity(Rarity.RARE)));

	public static final RegistryObject<Item> RED_NANITARIUM_INGOT = ITEMS.register("red_nanitarium_ingot",
			() -> new Item(
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant().rarity(Rarity.RARE)));

	public static final RegistryObject<Item> VERANIUM_INGOT = ITEMS.register("veranium_ingot", () -> new Item(
			new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant().rarity(Rarity.RARE)));

	public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
			() -> new Item(new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS)));

	public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
			() -> new Item(new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS)));

	public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
			() -> new Item(new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS)));

	public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
			() -> new Item(new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS)));

	// Other Recources
	public static final RegistryObject<Item> PERFECT_DIAMOND = ITEMS.register("perfect_diamond", () -> new Item(
			new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant().rarity(Rarity.UNCOMMON)));
	
	public static final RegistryObject<Item> CHARGED_REDSTONE = ITEMS.register("charged_redstone", () -> new Item(
			new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant().rarity(Rarity.UNCOMMON)));

	// Upgrade Cores
	public static final RegistryObject<Item> BLUE_NANITARIUM_UPGRADE = ITEMS.register("blue_nanitarium_upgrade",
			() -> new Item(
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant().rarity(Rarity.RARE)));

	public static final RegistryObject<Item> RED_NANITARIUM_UPGRADE = ITEMS.register("red_nanitarium_upgrade",
			() -> new Item(
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant().rarity(Rarity.RARE)));
	
	public static final RegistryObject<Item> NETHERITE_UPGRADE = ITEMS.register("netherite_upgrade",
			() -> new Item(
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant().rarity(Rarity.UNCOMMON)));
	
	public static final RegistryObject<Item> NANITARIUM_UPGRADE = ITEMS.register("nanitarium_upgrade",
			() -> new Item(
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant().rarity(Rarity.RARE)));
	
	

	// Raw Ores
	public static final RegistryObject<Item> RAW_BLUE_NANITARIUM = ITEMS.register("raw_blue_nanitarium", () -> new Item(
			new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant().rarity(Rarity.RARE)));

	public static final RegistryObject<Item> RAW_RED_NANITARIUM = ITEMS.register("raw_red_nanitarium", () -> new Item(
			new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant().rarity(Rarity.RARE)));

	public static final RegistryObject<Item> RAW_VERANIUM = ITEMS.register("raw_veranium", () -> new Item(
			new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant().rarity(Rarity.RARE)));

	public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
			() -> new Item(new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS)));

	// Food
	public static final RegistryObject<Item> BLUE_NANITARIUM_APPLE = ITEMS.register("blue_nanitarium_apple",
			() -> new Item(new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant()
					.rarity(Rarity.EPIC)
					.food(new FoodProperties.Builder().alwaysEat().nutrition(5).saturationMod(1.5F).fast()
							.effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 12000, 4), 1)
							.effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 6), 1)
							.effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 12000, 1), 1)
							.effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 3000, 4), 1)
							.effect(() -> new MobEffectInstance(MobEffects.GLOWING, 400, 1), .1f)
							.effect(() -> new MobEffectInstance(MobEffects.JUMP, 6000, 2), 1)
							.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 2), 1).build())));
	public static final RegistryObject<Item> RED_NANITARIUM_APPLE = ITEMS.register("red_nanitarium_apple",
			() -> new Item(new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant()
					.rarity(Rarity.EPIC)
					.food(new FoodProperties.Builder().alwaysEat().nutrition(5).saturationMod(1.5F).fast()
							.effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 12000, 4), 1)
							.effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 6), 1)
							.effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 12000, 1), 1)
							.effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 3000, 4), 1)
							.effect(() -> new MobEffectInstance(MobEffects.GLOWING, 400, 1), .1f)
							.effect(() -> new MobEffectInstance(MobEffects.JUMP, 6000, 2), 1)
							.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 2), 1).build())));
	public static final RegistryObject<Item> HASTEY_APPLE = ITEMS
			.register("hastey_apple",
					() -> new Item(new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant()
							.rarity(Rarity.EPIC)
							.food(new FoodProperties.Builder().alwaysEat().nutrition(5).saturationMod(1.5F).fast()
									.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 24000, 2), 1)
									.effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 24000, 2), 1)

									.build())));

	// Blue Nanitarium Tools
	public static final RegistryObject<SwordItem> BLUE_NANITARIUM_SWORD = ITEMS.register("blue_nanitarium_sword",
			() -> new SwordItem(ModToolMaterials.BLUE_NANITARIUM, 14, -2F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	public static final RegistryObject<PickaxeItem> BLUE_NANITARIUM_PICKAXE = ITEMS.register("blue_nanitarium_pickaxe",
			() -> new PickaxeItem(ModToolMaterials.BLUE_NANITARIUM, 8, -2.4F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	public static final RegistryObject<AxeItem> BLUE_NANITARIUM_AXE = ITEMS.register("blue_nanitarium_axe",
			() -> new AxeItem(ModToolMaterials.BLUE_NANITARIUM, 18, -2.6F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	public static final RegistryObject<ShovelItem> BLUE_NANITARIUM_SHOVEL = ITEMS.register("blue_nanitarium_shovel",
			() -> new ShovelItem(ModToolMaterials.BLUE_NANITARIUM, 5, -2.8F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	public static final RegistryObject<HoeItem> BLUE_NANITARIUM_HOE = ITEMS.register("blue_nanitarium_hoe",
			() -> new HoeItem(ModToolMaterials.BLUE_NANITARIUM, 3, -2.8F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));

	// Blue Nanitarium Multi-Tools
	// public static final RegistryObject<> BLUE_NANITARIUM_PICK_SHOVEL =
	// ITEMS.register("blue_nanitarium_pick_shovel",
	// () -> new HoeItem(ModToolMaterials.BLUE_NANITARIUM, 7, -2.8F,
	// new
	// Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));

	// Red Nanitarium Tools
	public static final RegistryObject<SwordItem> RED_NANITARIUM_SWORD = ITEMS.register("red_nanitarium_sword",
			() -> new SwordItem(ModToolMaterials.RED_NANITARIUM, 11, -2.3F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	public static final RegistryObject<PickaxeItem> RED_NANITARIUM_PICKAXE = ITEMS.register("red_nanitarium_pickaxe",
			() -> new PickaxeItem(ModToolMaterials.RED_NANITARIUM, 5, -2.7F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	public static final RegistryObject<AxeItem> RED_NANITARIUM_AXE = ITEMS.register("red_nanitarium_axe",
			() -> new AxeItem(ModToolMaterials.RED_NANITARIUM, 14, -2.8F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	public static final RegistryObject<ShovelItem> RED_NANITARIUM_SHOVEL = ITEMS.register("red_nanitarium_shovel",
			() -> new ShovelItem(ModToolMaterials.RED_NANITARIUM, 5, -2.7F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	public static final RegistryObject<HoeItem> RED_NANITARIUM_HOE = ITEMS.register("red_nanitarium_hoe",
			() -> new HoeItem(ModToolMaterials.RED_NANITARIUM, 2, -2.6F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));

	// Veranium Tools
	public static final RegistryObject<SwordItem> VERANIUM_SWORD = ITEMS.register("veranium_sword",
			() -> new SwordItem(ModToolMaterials.VERANIUM, 8, -1.8F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	public static final RegistryObject<PickaxeItem> VERANIUM_PICKAXE = ITEMS.register("veranium_pickaxe",
			() -> new PickaxeItem(ModToolMaterials.VERANIUM, 6, -2.0F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	public static final RegistryObject<AxeItem> VERANIUM_AXE = ITEMS.register("veranium_axe",
			() -> new AxeItem(ModToolMaterials.VERANIUM, 10, -2.4F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	public static final RegistryObject<ShovelItem> VERANIUM_SHOVEL = ITEMS.register("veranium_shovel",
			() -> new ShovelItem(ModToolMaterials.VERANIUM, 5, -2.8F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	public static final RegistryObject<HoeItem> VERANIUM_HOE = ITEMS.register("veranium_hoe",
			() -> new HoeItem(ModToolMaterials.VERANIUM, 3, -2.8F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));

	// Titanium Tools
	public static final RegistryObject<SwordItem> TITANIUM_SWORD = ITEMS.register("titanium_sword",
			() -> new SwordItem(ModToolMaterials.TITANIUM, 5, -2.6F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR)));
	public static final RegistryObject<PickaxeItem> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
			() -> new PickaxeItem(ModToolMaterials.TITANIUM, 3, -2.8F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR)));
	public static final RegistryObject<AxeItem> TITANIUM_AXE = ITEMS.register("titanium_axe",
			() -> new AxeItem(ModToolMaterials.TITANIUM, 8, -2.8F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR)));
	public static final RegistryObject<ShovelItem> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
			() -> new ShovelItem(ModToolMaterials.TITANIUM, 5, -2.6F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR)));
	public static final RegistryObject<HoeItem> TITANIUM_HOE = ITEMS.register("titanium_hoe",
			() -> new HoeItem(ModToolMaterials.TITANIUM, 2, -0.8F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR)));

	// Titanium Tools
	public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword",
			() -> new SwordItem(ModToolMaterials.RUBY, 6, -2.6F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR)));
	public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
			() -> new PickaxeItem(ModToolMaterials.RUBY, 4, -2.8F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR)));
	public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe",
			() -> new AxeItem(ModToolMaterials.RUBY, 8, -2.8F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR)));
	public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
			() -> new ShovelItem(ModToolMaterials.RUBY, 5, -2.6F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR)));
	public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe",
			() -> new HoeItem(ModToolMaterials.RUBY, 3, -0.8F,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR)));

	// Blue Nanitarium Armor
	public static final RegistryObject<ArmorItem> BLUE_NANITARIUM_HELMET = ITEMS.register("blue_nanitarium_helmet",
			() -> new ArmorItem(ModArmorMaterial.BLUE_NANITARIUM, EquipmentSlot.HEAD,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	public static final RegistryObject<ArmorItem> BLUE_NANITARIUM_CHESTPLATE = ITEMS.register(
			"blue_nanitarium_chestplate", () -> new ArmorItem(ModArmorMaterial.BLUE_NANITARIUM, EquipmentSlot.CHEST,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	public static final RegistryObject<ArmorItem> BLUE_NANITARIUM_LEGGINGS = ITEMS.register("blue_nanitarium_leggings",
			() -> new ArmorItem(ModArmorMaterial.BLUE_NANITARIUM, EquipmentSlot.LEGS,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	public static final RegistryObject<ArmorItem> BLUE_NANITARIUM_BOOTS = ITEMS.register("blue_nanitarium_boots",
			() -> new ArmorItem(ModArmorMaterial.BLUE_NANITARIUM, EquipmentSlot.FEET,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));

	// Red Nanitarium Armor
	public static final RegistryObject<ArmorItem> RED_NANITARIUM_HELMET = ITEMS.register("red_nanitarium_helmet",
			() -> new ArmorItem(ModArmorMaterial.RED_NANITARIUM, EquipmentSlot.HEAD,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	public static final RegistryObject<ArmorItem> RED_NANITARIUM_CHESTPLATE = ITEMS.register(
			"red_nanitarium_chestplate", () -> new ArmorItem(ModArmorMaterial.RED_NANITARIUM, EquipmentSlot.CHEST,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	public static final RegistryObject<ArmorItem> RED_NANITARIUM_LEGGINGS = ITEMS.register("red_nanitarium_leggings",
			() -> new ArmorItem(ModArmorMaterial.RED_NANITARIUM, EquipmentSlot.LEGS,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	public static final RegistryObject<ArmorItem> RED_NANITARIUM_BOOTS = ITEMS.register("red_nanitarium_boots",
			() -> new ArmorItem(ModArmorMaterial.RED_NANITARIUM, EquipmentSlot.FEET,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));

	// Titanium Armor
	public static final RegistryObject<ArmorItem> TITANIUM_HELMET = ITEMS.register("titanium_helmet",
			() -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.HEAD,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR)));
	public static final RegistryObject<ArmorItem> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate",
			() -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.CHEST,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR)));
	public static final RegistryObject<ArmorItem> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings",
			() -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.LEGS,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR)));
	public static final RegistryObject<ArmorItem> TITANIUM_BOOTS = ITEMS.register("titanium_boots",
			() -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.FEET,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR)));

	// Ruby Armor
	public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet",
			() -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.HEAD,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR)));
	public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
			() -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.CHEST,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR)));
	public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
			() -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.LEGS,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR)));
	public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots",
			() -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.FEET,
					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR)));

	// Ore
	// Block Items

	// Ores
	public static final RegistryObject<BlockItem> BLUE_NANITARIUM_ORE_ITEM = ITEMS.register("blue_nanitarium_ore",
			() -> new BlockItem(ModBlocks.BLUE_NANITARIUM_ORE.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).rarity(Rarity.RARE).fireResistant()));

	public static final RegistryObject<BlockItem> RED_NANITARIUM_ORE_ITEM = ITEMS.register("red_nanitarium_ore",
			() -> new BlockItem(ModBlocks.RED_NANITARIUM_ORE.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).rarity(Rarity.RARE).fireResistant()));

	public static final RegistryObject<BlockItem> VERANIUM_ORE_ITEM = ITEMS.register("veranium_ore",
			() -> new BlockItem(ModBlocks.VERANIUM_ORE.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).rarity(Rarity.RARE).fireResistant()));

	public static final RegistryObject<BlockItem> TITANIUM_ORE_ITEM = ITEMS.register("titanium_ore",
			() -> new BlockItem(ModBlocks.TITANIUM_ORE.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS)));

	public static final RegistryObject<BlockItem> DEEPSLATE_TITANIUM_ORE_ITEM = ITEMS.register("deepslate_titanium_ore",
			() -> new BlockItem(ModBlocks.DEEPSLATE_TITANIUM_ORE.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS)));

	public static final RegistryObject<BlockItem> RUBY_ORE_ITEM = ITEMS.register("ruby_ore",
			() -> new BlockItem(ModBlocks.RUBY_ORE.get(), new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS)));

	public static final RegistryObject<BlockItem> DEEPSLATE_RUBY_ORE_ITEM = ITEMS.register("deepslate_ruby_ore",
			() -> new BlockItem(ModBlocks.DEEPSLATE_RUBY_ORE.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS)));

	// Raw Ore Blocks
	public static final RegistryObject<BlockItem> RAW_BLUE_NANITARIUM_BLOCK_ITEM = ITEMS
			.register("raw_blue_nanitarium_block", () -> new BlockItem(ModBlocks.RAW_BLUE_NANITARIUM_BLOCK.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).rarity(Rarity.RARE).fireResistant()));

	public static final RegistryObject<BlockItem> RAW_RED_NANITARIUM_BLOCK_ITEM = ITEMS
			.register("raw_red_nanitarium_block", () -> new BlockItem(ModBlocks.RAW_RED_NANITARIUM_BLOCK.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).rarity(Rarity.RARE).fireResistant()));

	public static final RegistryObject<BlockItem> RAW_VERANIUM_BLOCK_ITEM = ITEMS.register("raw_veranium_block",
			() -> new BlockItem(ModBlocks.RAW_VERANIUM_BLOCK.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).rarity(Rarity.RARE).fireResistant()));

	public static final RegistryObject<BlockItem> RAW_TITANIUM_BLOCK_ITEM = ITEMS.register("raw_titanium_block",
			() -> new BlockItem(ModBlocks.RAW_TITANIUM_BLOCK.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS)));

	// Meterial Blocks
	public static final RegistryObject<BlockItem> BLUE_NANITARIUM_BLOCK_ITEM = ITEMS.register("blue_nanitarium_block",
			() -> new BlockItem(ModBlocks.BLUE_NANITARIUM_BLOCK.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).rarity(Rarity.RARE).fireResistant()));

	public static final RegistryObject<BlockItem> RED_NANITARIUM_BLOCK_ITEM = ITEMS.register("red_nanitarium_block",
			() -> new BlockItem(ModBlocks.RED_NANITARIUM_BLOCK.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).rarity(Rarity.RARE).fireResistant()));

	public static final RegistryObject<BlockItem> VERANIUM_BLOCK_ITEM = ITEMS.register("veranium_block",
			() -> new BlockItem(ModBlocks.VERANIUM_BLOCK.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).rarity(Rarity.RARE).fireResistant()));

	public static final RegistryObject<BlockItem> TITANIUM_BLOCK_ITEM = ITEMS.register("titanium_block",
			() -> new BlockItem(ModBlocks.TITANIUM_BLOCK.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS)));

	public static final RegistryObject<BlockItem> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block",
			() -> new BlockItem(ModBlocks.RUBY_BLOCK.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS)));
	
	public static final RegistryObject<BlockItem> CHARGED_REDSTONE_BLOCK_ITEM = ITEMS.register("charged_redstone_block",
			() -> new BlockItem(ModBlocks.CHARGED_REDSTONE_BLOCK.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS)));


	// Block Entity Items

	public static final RegistryObject<BlockItem> IRON_CHEST_ITEM = ITEMS.register("iron_chest",
			() -> new BlockItem(ModBlocks.IRON_CHEST.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_CHESTS)));
	
	public static final RegistryObject<BlockItem> DIAMOND_CHEST_ITEM = ITEMS.register("diamond_chest",
			() -> new BlockItem(ModBlocks.DIAMOND_CHEST.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_CHESTS)));
	
	public static final RegistryObject<BlockItem> NETHERITE_CHEST_ITEM = ITEMS.register("netherite_chest",
			() -> new BlockItem(ModBlocks.NETHERITE_CHEST.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_CHESTS).rarity(Rarity.UNCOMMON).fireResistant()));
	
	public static final RegistryObject<BlockItem> NANITARIUM_CHEST_ITEM = ITEMS.register("nanitarium_chest",
			() -> new BlockItem(ModBlocks.NANITARIUM_CHEST.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_CHESTS).rarity(Rarity.RARE).fireResistant()));
	
	public static final RegistryObject<BlockItem> POWERED_CHEST_ITEM = ITEMS.register("powered_chest",
			() -> new BlockItem(ModBlocks.POWERED_CHEST.get(),
					new Item.Properties().tab(MinerCraft.MINERCRAFT_CHESTS).rarity(Rarity.RARE).fireResistant()));

}
