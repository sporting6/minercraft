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
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
	
	 private ModItems() {}
	 
	 public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinerCraft.MODID);
	 
	 //Items
	 
	 //Ingots
	 public static final RegistryObject<Item> BLUE_NANITARIUM_INGOT = ITEMS.register("blue_nanitarium_ingot",
			() -> new Item(new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant().rarity(Rarity.RARE)));
	 
	 public static final RegistryObject<Item> RED_NANITARIUM_INGOT = ITEMS.register("red_nanitarium_ingot",
				() -> new Item(new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant().rarity(Rarity.RARE)));
		 
	 public static final RegistryObject<Item> PERFECT_DIAMOND = ITEMS.register("perfect_diamond", 
			 () -> new Item(new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant().rarity(Rarity.UNCOMMON)));
	 
	 public static final RegistryObject<Item> BLUE_NANITARIUM_UPGRADE = ITEMS.register("blue_nanitarium_upgrade", 
			 () -> new Item(new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant().rarity(Rarity.RARE)));
	 
	 //Food
	 public static final RegistryObject<Item> BLUE_NANITARIUM_APPLE = ITEMS.register("blue_nanitarium_apple",
				() -> new Item(new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant().rarity(Rarity.EPIC)
						.food(new FoodProperties.Builder()
								.alwaysEat()
								.nutrition(5)
								.saturationMod(1.5F)
								.fast()
								.effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 12000, 4), 1)
								.effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 6), 1)
								.effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 12000, 1), 1)
								.effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 3000, 4), 1)
								.effect(() -> new MobEffectInstance(MobEffects.GLOWING, 400, 1), .1f)
								.effect(() -> new MobEffectInstance(MobEffects.JUMP, 6000, 2), 1)
								.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 2), 1)
								.build()
								)
						)
				)
			 ;
	 public static final RegistryObject<Item> HASTEY_APPLE = ITEMS.register("hastey_apple",
				() -> new Item(new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant().rarity(Rarity.EPIC)
						.food(new FoodProperties.Builder()
								.alwaysEat()
								.nutrition(5)
								.saturationMod(1.5F)
								.fast()
								.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 24000, 2), 1)		
								.effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 24000, 2), 1)								

								.build()
								)
						)
				)
			 ;
		 
	 
	 //Raw Ores
	 public static final RegistryObject<Item> RAW_BLUE_NANITARIUM = ITEMS.register("raw_blue_nanitarium",
			() -> new Item(new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).fireResistant().rarity(Rarity.RARE)));
	 
	 //Blue Nanitarium Tools
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
	 
	 //Blue Nanitarium Multi-Tools
	 //public static final RegistryObject<> BLUE_NANITARIUM_PICK_SHOVEL = ITEMS.register("blue_nanitarium_pick_shovel", 
	 //			() -> new HoeItem(ModToolMaterials.BLUE_NANITARIUM, 7, -2.8F, 
	 //					new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	 
	//Red Nanitarium Tools
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
		 
		 	
		 
		 
	 
	 
	 //Blue Nanitarium Armor
	 public static final RegistryObject<ArmorItem> BLUE_NANITARIUM_HELMET = ITEMS.register("blue_nanitarium_helmet",
			 () -> new ArmorItem(ModArmorMaterial.BLUE_NANITARIUM, EquipmentSlot.HEAD, new 
					 Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	 public static final RegistryObject<ArmorItem> BLUE_NANITARIUM_CHESTPLATE = ITEMS.register("blue_nanitarium_chestplate",
			 () -> new ArmorItem(ModArmorMaterial.BLUE_NANITARIUM, EquipmentSlot.CHEST, new 
					 Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	 public static final RegistryObject<ArmorItem> BLUE_NANITARIUM_LEGGINGS = ITEMS.register("blue_nanitarium_leggings",
			 () -> new ArmorItem(ModArmorMaterial.BLUE_NANITARIUM, EquipmentSlot.LEGS, new 
					 Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	 public static final RegistryObject<ArmorItem> BLUE_NANITARIUM_BOOTS = ITEMS.register("blue_nanitarium_boots",
			 () -> new ArmorItem(ModArmorMaterial.BLUE_NANITARIUM, EquipmentSlot.FEET, new 
					 Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	 
	 //Red Nanitarium Armor
	 public static final RegistryObject<ArmorItem> RED_NANITARIUM_HELMET = ITEMS.register("red_nanitarium_helmet",
			 () -> new ArmorItem(ModArmorMaterial.RED_NANITARIUM, EquipmentSlot.HEAD, new 
					 Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	 public static final RegistryObject<ArmorItem> RED_NANITARIUM_CHESTPLATE = ITEMS.register("red_nanitarium_chestplate",
			 () -> new ArmorItem(ModArmorMaterial.RED_NANITARIUM, EquipmentSlot.CHEST, new 
					 Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	 public static final RegistryObject<ArmorItem> RED_NANITARIUM_LEGGINGS = ITEMS.register("red_nanitarium_leggings",
			 () -> new ArmorItem(ModArmorMaterial.RED_NANITARIUM, EquipmentSlot.LEGS, new 
					 Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
	 public static final RegistryObject<ArmorItem> RED_NANITARIUM_BOOTS = ITEMS.register("red_nanitarium_boots",
			 () -> new ArmorItem(ModArmorMaterial.RED_NANITARIUM, EquipmentSlot.FEET, new 
					 Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
		 
	 
	 
	 //Block Items
	 
	 //Ores
	 public static final RegistryObject<BlockItem> BLUE_NANITARIUM_ORE_ITEM = ITEMS.register("blue_nanitarium_ore",
			 () -> new BlockItem(ModBlocks.BLUE_NANITARIUM_ORE.get(), 
			new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).rarity(Rarity.RARE)));
	 
	 //Raw Ore Blocks
	 public static final RegistryObject<BlockItem> RAW_BLUE_NANITARIUM_BLOCK_ITEM = ITEMS.register("raw_blue_nanitarium_block",
			 () -> new BlockItem(ModBlocks.RAW_BLUE_NANITARIUM_BLOCK.get(), 
			new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).rarity(Rarity.RARE)));
	 
	 //Meterial Blocks
	 public static final RegistryObject<BlockItem> BLUE_NANITARIUM_BLOCK_ITEM = ITEMS.register("blue_nanitarium_block",
			 () -> new BlockItem(ModBlocks.BLUE_NANITARIUM_BLOCK.get(), 
			new Item.Properties().tab(MinerCraft.MINERCRAFT_MATERIALS).rarity(Rarity.RARE)));
	 
	 
}
