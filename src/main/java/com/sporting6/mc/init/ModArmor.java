package com.sporting6.mc.init;

import com.sporting6.mc.Minercraft;
import com.sporting6.mc.util.enums.ModArmorMaterial;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModArmor {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,Minercraft.MOD_ID);

	
	public static final RegistryObject<ArmorItem> RED_NANITARIUM_HELMET = ITEMS.register("red_nanitarium_helmet",()-> 
	new ArmorItem(ModArmorMaterial.RED_NANITARIUM, EquipmentSlotType.HEAD, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> RED_NANITARIUM_CHESTPLATE = ITEMS.register("red_nanitarium_chestplate",()-> 
	new ArmorItem(ModArmorMaterial.RED_NANITARIUM, EquipmentSlotType.CHEST, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> RED_NANITARIUM_LEGS = ITEMS.register("red_nanitarium_leggings",()-> 
	new ArmorItem(ModArmorMaterial.RED_NANITARIUM, EquipmentSlotType.LEGS, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> RED_NANITARIUM_BOOTS = ITEMS.register("red_nanitarium_boots", () -> 
	new ArmorItem(ModArmorMaterial.RED_NANITARIUM, EquipmentSlotType.FEET, new Item.Properties().group(Minercraft.TAB)));
		
	public static final RegistryObject<ArmorItem> BLUE_NANITARIUM_HELMET = ITEMS.register("blue_nanitarium_helmet",()-> 
	new ArmorItem(ModArmorMaterial.BLUE_NANITARIUM, EquipmentSlotType.HEAD, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> BLUE_NANITARIUM_CHESTPLATE = ITEMS.register("blue_nanitarium_chestplate",()-> 
	new ArmorItem(ModArmorMaterial.BLUE_NANITARIUM, EquipmentSlotType.CHEST, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> BLUE_NANITARIUM_LEGS = ITEMS.register("blue_nanitarium_leggings",()-> 
	new ArmorItem(ModArmorMaterial.BLUE_NANITARIUM, EquipmentSlotType.LEGS, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> BLUE_NANITARIUM_BOOTS = ITEMS.register("blue_nanitarium_boots", () -> 
	new ArmorItem(ModArmorMaterial.BLUE_NANITARIUM, EquipmentSlotType.FEET, new Item.Properties().group(Minercraft.TAB)));
		
	public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet",()-> 
	new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",()-> 
	new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> RUBY_LEGS = ITEMS.register("ruby_leggings",()-> 
	new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> 
	new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(Minercraft.TAB)));

	public static final RegistryObject<ArmorItem> BRONZE_HELMET = ITEMS.register("bronze_helmet",()-> 
	new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.HEAD, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate",()-> 
	new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.CHEST, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> BRONZE_LEGS = ITEMS.register("bronze_leggings",()-> 
	new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.LEGS, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> 
	new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.FEET, new Item.Properties().group(Minercraft.TAB)));

	public static final RegistryObject<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet",()-> 
	new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.HEAD, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",()-> 
	new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.CHEST, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> COPPER_LEGS = ITEMS.register("copper_leggings",()-> 
	new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.LEGS, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots", () -> 
	new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.FEET, new Item.Properties().group(Minercraft.TAB)));

	public static final RegistryObject<ArmorItem> TIN_HELMET = ITEMS.register("tin_helmet",()-> 
	new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.HEAD, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> TIN_CHESTPLATE = ITEMS.register("tin_chestplate",()-> 
	new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.CHEST, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> TIN_LEGS = ITEMS.register("tin_leggings",()-> 
	new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.LEGS, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> TIN_BOOTS = ITEMS.register("tin_boots", () -> 
	new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.FEET, new Item.Properties().group(Minercraft.TAB)));

	public static final RegistryObject<ArmorItem> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet",()-> 
	new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.HEAD, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate",()-> 
	new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.CHEST, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> OBSIDIAN_LEGS = ITEMS.register("obsidian_leggings",()-> 
	new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.LEGS, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots", () -> 
	new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.FEET, new Item.Properties().group(Minercraft.TAB)));

	public static final RegistryObject<ArmorItem> TITANIUM_HELMET = ITEMS.register("titanium_helmet",()-> 
	new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.HEAD, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate",()-> 
	new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.CHEST, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> TITANIUM_LEGS = ITEMS.register("titanium_leggings",()-> 
	new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.LEGS, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> TITANIUM_BOOTS = ITEMS.register("titanium_boots", () -> 
	new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.FEET, new Item.Properties().group(Minercraft.TAB)));

	public static final RegistryObject<ArmorItem> TUNGSTEN_HELMET = ITEMS.register("tungsten_helmet",()-> 
	new ArmorItem(ModArmorMaterial.TUNGSTEN, EquipmentSlotType.HEAD, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> TUNGSTEN_CHESTPLATE = ITEMS.register("tungsten_chestplate",()-> 
	new ArmorItem(ModArmorMaterial.TUNGSTEN, EquipmentSlotType.CHEST, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> TUNGSTEN_LEGS = ITEMS.register("tungsten_leggings",()-> 
	new ArmorItem(ModArmorMaterial.TUNGSTEN, EquipmentSlotType.LEGS, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ArmorItem> TUNGSTEN_BOOTS = ITEMS.register("tungsten_boots", () -> 
	new ArmorItem(ModArmorMaterial.TUNGSTEN, EquipmentSlotType.FEET, new Item.Properties().group(Minercraft.TAB)));


}
