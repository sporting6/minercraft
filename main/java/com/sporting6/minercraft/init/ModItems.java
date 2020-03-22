package com.sporting6.minercraft.init;

import java.util.ArrayList;
import java.util.List;

import com.sporting6.minercraft.items.ItemBase;
import com.sporting6.minercraft.items.armor.ArmorBase;
import com.sporting6.minercraft.items.tools.ToolAxe;
import com.sporting6.minercraft.items.tools.ToolHoe;
import com.sporting6.minercraft.items.tools.ToolPickaxe;
import com.sporting6.minercraft.items.tools.ToolSpade;
import com.sporting6.minercraft.items.tools.ToolSword;
import com.sporting6.minercraft.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List <Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_TUNGSTEN = 
			EnumHelper.addToolMaterial("material_tungsten", 2, 1500,  9.5f, 3.0f, 14);
	public static final ToolMaterial MATERIAL_NANITERIUM = 
			EnumHelper.addToolMaterial("material_naniterium", 4, 3000,  12.0f, 4.0f, 10);
	public static final ToolMaterial MATERIAL_TITANIUM = 
			EnumHelper.addToolMaterial("material_titanium", 2, 750,  9.5f, 3.0f, 14);
	public static final ToolMaterial MATERIAL_RUBY = 
			EnumHelper.addToolMaterial("material_ruby", 2, 250,  7.0f, 3.0f, 14);
	public static final ToolMaterial MATERIAL_COPPER = 
			EnumHelper.addToolMaterial("material_copper", 2, 200 ,  10.5f, 2.0f, 18);
	public static final ToolMaterial MATERIAL_TIN = 
			EnumHelper.addToolMaterial("material_tin", 1, 100 ,  10.0f, 1.5f, 18);
	public static final ToolMaterial MATERIAL_BRONZE = 
			EnumHelper.addToolMaterial("material_bronze", 2, 450 ,  8.0f, 2.5f, 16);
	public static final ToolMaterial MATERIAL_OBSIDIAN = 
			EnumHelper.addToolMaterial("material_obsidian", 4, 2000,  8.0f, 3.0f, 14);
	
	//Armor Materials
	public static final ArmorMaterial ARMOR_MATERIAL_TUNGSTEN = EnumHelper.addArmorMaterial
			("armor_material_tungsten", Reference.MOD_ID + ":tungsten", 14, 
			new int[] {2, 6, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_NANITERIUM = EnumHelper.addArmorMaterial
			("armor_material_naniterium", Reference.MOD_ID + ":naniterium", 14, 
			new int[] {4, 8, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial
			("armor_material_ruby", Reference.MOD_ID + ":ruby", 14, 
			new int[] {2, 4, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_TITANIUM = EnumHelper.addArmorMaterial
			("armor_material_titanium", Reference.MOD_ID + ":titanium", 14, 
			new int[] {2, 5, 6, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COPPER = EnumHelper.addArmorMaterial
			("armor_material_copper", Reference.MOD_ID + ":copper", 14, 
			new int[] {1, 4, 6, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_TIN = EnumHelper.addArmorMaterial
			("armor_material_tin", Reference.MOD_ID + ":tin", 14, 
			new int[] {1, 3, 3, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_BRONZE = EnumHelper.addArmorMaterial
			("armor_material_tungsten", Reference.MOD_ID + ":bronze", 14, 
			new int[] {3, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_OBSIDIAN = EnumHelper.addArmorMaterial
			("armor_material_obsidian", Reference.MOD_ID + ":obsidian", 14, 
			new int[] {4, 7, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	
	
	//Items
	public static final Item TUNGSTEN_INGOT = new ItemBase("tungsten_ingot");
	public static final Item NANITERIUM_INGOT = new ItemBase("naniterium_ingot");
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item TIN_INGOT = new ItemBase("tin_ingot");
	public static final Item BRONZE_INGOT = new ItemBase("bronze_ingot");
	public static final Item TITANIUM_INGOT = new ItemBase("titanium_ingot");
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
	public static final Item OBSIDIAN_SHARD = new ItemBase("obsidian_shard");
	public static final Item RUBY = new ItemBase("ruby");


	

	
	//Tools
	public static final ItemSword TUNGSTEN_SWORD = new ToolSword("tungsten_sword", MATERIAL_TUNGSTEN);
	public static final ItemSpade TUNGSTEN_SHOVEL = new ToolSpade("tungsten_shovel", MATERIAL_TUNGSTEN);
	public static final ItemPickaxe TUNGSTEN_PICKAXE = new ToolPickaxe("tungsten_pickaxe", MATERIAL_TUNGSTEN);
	public static final ItemAxe TUNGSTEN_AXE = new ToolAxe("tungsten_axe", MATERIAL_TUNGSTEN);
	public static final ItemHoe TUNGSTEN_HOE = new ToolHoe("tungsten_hoe", MATERIAL_TUNGSTEN);
	
	public static final ItemSword NANITERIUM_SWORD = new ToolSword("naniterium_sword", MATERIAL_NANITERIUM);
	public static final ItemSpade NANITERIUM_SHOVEL = new ToolSpade("naniterium_shovel", MATERIAL_NANITERIUM);
	public static final ItemPickaxe NANITERIUM_PICKAXE = new ToolPickaxe("naniterium_pickaxe", MATERIAL_NANITERIUM);
	public static final ItemAxe NANITERIUM_AXE = new ToolAxe("naniterium_axe", MATERIAL_NANITERIUM);
	public static final ItemHoe NANITERIUM_HOE = new ToolHoe("naniterium_hoe", MATERIAL_NANITERIUM);
	
	public static final ItemSword TITANIUM_SWORD = new ToolSword("titanium_sword", MATERIAL_TITANIUM);
	public static final ItemSpade TITANIUM_SHOVEL = new ToolSpade("titanium_shovel", MATERIAL_TITANIUM);
	public static final ItemPickaxe TITANIUM_PICKAXE = new ToolPickaxe("titanium_pickaxe", MATERIAL_TITANIUM);
	public static final ItemAxe TITANIUM_AXE = new ToolAxe("titanium_axe", MATERIAL_TITANIUM);
	public static final ItemHoe TITANIUM_HOE = new ToolHoe("titanium_hoe", MATERIAL_TITANIUM);
	
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	
	public static final ItemSword COPPER_SWORD = new ToolSword("copper_sword", MATERIAL_COPPER);
	public static final ItemSpade COPPER_SHOVEL = new ToolSpade("copper_shovel", MATERIAL_COPPER);
	public static final ItemPickaxe COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", MATERIAL_COPPER);
	public static final ItemAxe COPPER_AXE = new ToolAxe("copper_axe", MATERIAL_COPPER);
	public static final ItemHoe COPPER_HOE = new ToolHoe("copper_hoe", MATERIAL_COPPER);
	
	public static final ItemSword BRONZE_SWORD = new ToolSword("bronze_sword", MATERIAL_COPPER);
	public static final ItemSpade BRONZE_SHOVEL = new ToolSpade("bronze_shovel", MATERIAL_COPPER);
	public static final ItemPickaxe BRONZE_PICKAXE = new ToolPickaxe("bronze_pickaxe", MATERIAL_COPPER);
	public static final ItemAxe BRONZE_AXE = new ToolAxe("bronze_axe", MATERIAL_COPPER);
	public static final ItemHoe BRONZE_HOE = new ToolHoe("bronze_hoe", MATERIAL_COPPER);
	
	public static final ItemSword TIN_SWORD = new ToolSword("tin_sword", MATERIAL_TIN);
	public static final ItemSpade TIN_SHOVEL = new ToolSpade("tin_shovel", MATERIAL_TIN);
	public static final ItemPickaxe TIN_PICKAXE = new ToolPickaxe("tin_pickaxe", MATERIAL_TIN);
	public static final ItemAxe TIN_AXE = new ToolAxe("tin_axe", MATERIAL_TIN);
	public static final ItemHoe TIN_HOE = new ToolHoe("tin_hoe", MATERIAL_TIN);
	
	public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN);
	public static final ItemSpade OBSIDIAN_SHOVEL = new ToolSpade("obsidian_shovel", MATERIAL_OBSIDIAN);
	public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", MATERIAL_OBSIDIAN);
	public static final ItemAxe OBSIDIAN_AXE = new ToolAxe("obsidian_axe", MATERIAL_OBSIDIAN);
	public static final ItemHoe OBSIDIAN_HOE = new ToolHoe("obsidian_hoe", MATERIAL_OBSIDIAN);
	
	//Armor
	public static final Item TUNGSTEN_HELMET = new ArmorBase
			("tungsten_helmet", ARMOR_MATERIAL_TUNGSTEN, 1, EntityEquipmentSlot.HEAD);
	public static final Item TUNGSTEN_CHESTPLATE = new ArmorBase
			("tungsten_chestplate", ARMOR_MATERIAL_TUNGSTEN, 1, EntityEquipmentSlot.CHEST);
	public static final Item TUNGSTEN_LEGGINGS = new ArmorBase
			("tungsten_leggings", ARMOR_MATERIAL_TUNGSTEN, 2, EntityEquipmentSlot.LEGS);
	public static final Item TUNGSTEN_BOOTS = new ArmorBase
			("tungsten_boots", ARMOR_MATERIAL_TUNGSTEN, 1, EntityEquipmentSlot.FEET);
	
	public static final Item NANITERIUM_HELMET = new ArmorBase
			("naniterium_helmet", ARMOR_MATERIAL_NANITERIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item NANITERIUM_CHESTPLATE = new ArmorBase
			("naniterium_chestplate", ARMOR_MATERIAL_NANITERIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item NANITERIUM_LEGGINGS = new ArmorBase
			("naniterium_leggings", ARMOR_MATERIAL_NANITERIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item NANITERIUM_BOOTS = new ArmorBase
			("naniterium_boots", ARMOR_MATERIAL_NANITERIUM, 1, EntityEquipmentSlot.FEET);
	
	public static final Item TITANIUM_HELMET = new ArmorBase
			("titanium_helmet", ARMOR_MATERIAL_TITANIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item TITANIUM_CHESTPLATE = new ArmorBase
			("titanium_chestplate", ARMOR_MATERIAL_TITANIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item TITANIUM_LEGGINGS = new ArmorBase
			("titanium_leggings", ARMOR_MATERIAL_TITANIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item TITANIUM_BOOTS = new ArmorBase
			("titanium_boots", ARMOR_MATERIAL_TITANIUM, 1, EntityEquipmentSlot.FEET);
	
	public static final Item RUBY_HELMET = new ArmorBase
			("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmorBase
			("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorBase
			("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase
			("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);

	
	public static final Item COPPER_HELMET = new ArmorBase
			("copper_helmet", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item COPPER_CHESTPLATE = new ArmorBase
			("copper_chestplate", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item COPPER_LEGGINGS = new ArmorBase
			("copper_leggings", ARMOR_MATERIAL_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item COPPER_BOOTS = new ArmorBase
			("copper_boots", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.FEET);
	
	public static final Item TIN_HELMET = new ArmorBase
			("tin_helmet", ARMOR_MATERIAL_TIN, 1, EntityEquipmentSlot.HEAD);
	public static final Item TIN_CHESTPLATE = new ArmorBase
			("tin_chestplate", ARMOR_MATERIAL_TIN, 1, EntityEquipmentSlot.CHEST);
	public static final Item TIN_LEGGINGS = new ArmorBase
			("tin_leggings", ARMOR_MATERIAL_TIN, 2, EntityEquipmentSlot.LEGS);
	public static final Item TIN_BOOTS = new ArmorBase
			("tin_boots", ARMOR_MATERIAL_TIN, 1, EntityEquipmentSlot.FEET);
	
	public static final Item BRONZE_HELMET = new ArmorBase
			("bronze_helmet", ARMOR_MATERIAL_BRONZE, 1, EntityEquipmentSlot.HEAD);
	public static final Item BRONZE_CHESTPLATE = new ArmorBase
			("bronze_chestplate", ARMOR_MATERIAL_BRONZE, 1, EntityEquipmentSlot.CHEST);
	public static final Item BRONZE_LEGGINGS = new ArmorBase
			("bronze_leggings", ARMOR_MATERIAL_BRONZE, 2, EntityEquipmentSlot.LEGS);
	public static final Item BRONZE_BOOTS = new ArmorBase
			("bronze_boots", ARMOR_MATERIAL_BRONZE, 1, EntityEquipmentSlot.FEET);
	
	public static final Item OBSIDIAN_HELMET = new ArmorBase
			("obsidian_helmet", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
	public static final Item OBSIDIAN_CHESTPLATE = new ArmorBase
			("obsidian_chestplate", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.CHEST);
	public static final Item OBSIDIAN_LEGGINGS = new ArmorBase
			("obsidian_leggings", ARMOR_MATERIAL_OBSIDIAN, 2, EntityEquipmentSlot.LEGS);
	public static final Item OBSIDIAN_BOOTS = new ArmorBase
			("obsidian_boots", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.FEET);
}