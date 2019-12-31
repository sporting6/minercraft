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
			EnumHelper.addToolMaterial("material_tungsten", 2, 500,  9.0f, 2.5f, 14);
	public static final ToolMaterial MATERIAL_COPPER = 
			EnumHelper.addToolMaterial("material_copper", 2, 200 ,  10.5f, 2.0f, 10);
	
	public static final ArmorMaterial ARMOR_MATERIAL_TUNGSTEN = EnumHelper.addArmorMaterial("armor_material_tungsten", Reference.MOD_ID + ":tungsten", 14, 
			new int[] {2, 7, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COPPER = EnumHelper.addArmorMaterial("armor_material_copper", Reference.MOD_ID + ":copper", 14, 
			new int[] {1, 6, 4, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	
	//ITEMS
	public static final Item TUNGSTEN_INGOT = new ItemBase("tungsten_ingot");
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	
	//Tools
	public static final ItemSword TUNGSTEN_SWORD = new ToolSword("tungsten_sword", MATERIAL_TUNGSTEN);
	public static final ItemSpade TUNGSTEN_SHOVEL = new ToolSpade("tungsten_shovel", MATERIAL_TUNGSTEN);
	public static final ItemPickaxe TUNGSTEN_PICKAXE = new ToolPickaxe("tungsten_pickaxe", MATERIAL_TUNGSTEN);
	public static final ItemAxe TUNGSTEN_AXE = new ToolAxe("tungsten_axe", MATERIAL_TUNGSTEN);
	public static final ItemHoe TUNGSTEN_HOE = new ToolHoe("tungsten_hoe", MATERIAL_TUNGSTEN);
	
	public static final ItemSword COPPER_SWORD = new ToolSword("copper_sword", MATERIAL_COPPER);
	public static final ItemSpade COPPER_SHOVEL = new ToolSpade("copper_shovel", MATERIAL_COPPER);
	public static final ItemPickaxe COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", MATERIAL_COPPER);
	public static final ItemAxe COPPER_AXE = new ToolAxe("copper_axe", MATERIAL_COPPER);
	public static final ItemHoe COPPER_HOE = new ToolHoe("copper_hoe", MATERIAL_COPPER);
	
	//Armor
	public static final Item TUNGSTEN_HELMET = new ArmorBase
			("tungsten_helmet", ARMOR_MATERIAL_TUNGSTEN, 1, EntityEquipmentSlot.HEAD);
	public static final Item TUNGSTEN_CHESTPLATE = new ArmorBase
			("tungsten_chestplate", ARMOR_MATERIAL_TUNGSTEN, 1, EntityEquipmentSlot.CHEST);
	public static final Item TUNGSTEN_LEGGINGS = new ArmorBase
			("tungsten_leggings", ARMOR_MATERIAL_TUNGSTEN, 2, EntityEquipmentSlot.LEGS);
	public static final Item TUNGSTEN_BOOTS = new ArmorBase
			("tungsten_boots", ARMOR_MATERIAL_TUNGSTEN, 1, EntityEquipmentSlot.FEET);
	
	public static final Item COPPER_HELMET = new ArmorBase
			("copper_helmet", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item COPPER_CHESTPLATE = new ArmorBase
			("copper_chestplate", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item COPPER_LEGGINGS = new ArmorBase
			("copper_leggings", ARMOR_MATERIAL_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item COPPER_BOOTS = new ArmorBase
			("copper_boots", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.FEET);


}
