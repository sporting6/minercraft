package com.sporting6.mc.init;

import com.sporting6.mc.Minercraft;
import com.sporting6.mc.util.enums.ModitemTeir;

import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTools {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,Minercraft.MOD_ID);

	
public static final RegistryObject<SwordItem> BLUE_NANITARIUM_SWORD = ITEMS.register("blue_nanitarium_sword", () -> 
	new SwordItem(ModitemTeir.BLUE_NANITARIUM, 3, -2.0f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<PickaxeItem> BLUE_NANITARIUM_PICK = ITEMS.register("blue_nanitarium_pickaxe", () -> 
	new PickaxeItem(ModitemTeir.BLUE_NANITARIUM, 0, -2.4f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<ShovelItem> BLUE_NANITARIUM_SHOVEL = ITEMS.register("blue_nanitarium_shovel", () -> 
	new ShovelItem(ModitemTeir.BLUE_NANITARIUM, 1, -2.4f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<AxeItem> BLUE_NANITARIUM_AXE = ITEMS.register("blue_nanitarium_axe", () -> 
	new AxeItem(ModitemTeir.BLUE_NANITARIUM, 4, -2.2f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<HoeItem> BLUE_NANITARIUM_HOE = ITEMS.register("blue_nanitarium_hoe", () -> 
	new HoeItem(ModitemTeir.BLUE_NANITARIUM,-2, -0.8f, new Item.Properties().group(Minercraft.TAB)));

public static final RegistryObject<SwordItem> RED_NANITARIUM_SWORD = ITEMS.register("red_nanitarium_sword", () -> 
	new SwordItem(ModitemTeir.RED_NANITARIUM, 3, -2.4f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<PickaxeItem> RED_NANITARIUM_PICK = ITEMS.register("red_nanitarium_pickaxe", () -> 
	new PickaxeItem(ModitemTeir.RED_NANITARIUM, 0, -2.8f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<ShovelItem> RED_NANITARIUM_SHOVEL = ITEMS.register("red_nanitarium_shovel", () -> 
	new ShovelItem(ModitemTeir.RED_NANITARIUM, 1, -2.8f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<AxeItem> RED_NANITARIUM_AXE = ITEMS.register("red_nanitarium_axe", () -> 
	new AxeItem(ModitemTeir.RED_NANITARIUM, 4, -2.6f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<HoeItem> RED_NANITARIUM_HOE = ITEMS.register("red_nanitarium_hoe", () -> 
	new HoeItem(ModitemTeir.RED_NANITARIUM,-2, -0.8f, new Item.Properties().group(Minercraft.TAB)));

public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () -> 
	new SwordItem(ModitemTeir.RUBY, 3, -2.7f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<PickaxeItem> RUBY_PICK = ITEMS.register("ruby_pickaxe", () -> 
	new PickaxeItem(ModitemTeir.RUBY, 0, -2.8f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> 
	new ShovelItem(ModitemTeir.RUBY, 1, -2.8f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () -> 
	new AxeItem(ModitemTeir.RUBY, 4, -3.0f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () -> 
	new HoeItem(ModitemTeir.RUBY,-2, -0.8f, new Item.Properties().group(Minercraft.TAB)));

public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", () -> 
	new SwordItem(ModitemTeir.COPPER, 3, -2.8f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<PickaxeItem> COPPER_PICK = ITEMS.register("copper_pickaxe", () -> 
	new PickaxeItem(ModitemTeir.COPPER, 0, -2.8f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> 
	new ShovelItem(ModitemTeir.COPPER, 1, -2.8f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", () -> 
	new AxeItem(ModitemTeir.COPPER, 4, -3.0f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe", () -> 
	new HoeItem(ModitemTeir.COPPER,-2, -0.8f, new Item.Properties().group(Minercraft.TAB)));

public static final RegistryObject<SwordItem> TUNGSTEN_SWORD = ITEMS.register("tungsten_sword", () -> 
	new SwordItem(ModitemTeir.TUNGSTEN, 3, -2.8f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<PickaxeItem> TUNGSTEN_PICK = ITEMS.register("tungsten_pickaxe", () -> 
	new PickaxeItem(ModitemTeir.TUNGSTEN, 1, -2.8f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<ShovelItem> TUNGSTEN_SHOVEL = ITEMS.register("tungsten_shovel", () -> 
	new ShovelItem(ModitemTeir.TUNGSTEN, 1, -2.8f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<AxeItem> TUNGSTEN_AXE = ITEMS.register("tungsten_axe", () -> 
	new AxeItem(ModitemTeir.TUNGSTEN, 4, -3.0f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<HoeItem> TUNGSTEN_HOE = ITEMS.register("tungsten_hoe", () -> 
	new HoeItem(ModitemTeir.TUNGSTEN,-2, -0.8f, new Item.Properties().group(Minercraft.TAB)));

public static final RegistryObject<SwordItem> TITANIUM_SWORD = ITEMS.register("titanium_sword", () -> 
	new SwordItem(ModitemTeir.TITANIUM, 3, -2.6f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<PickaxeItem> TITANIUM_PICK = ITEMS.register("titanium_pickaxe", () -> 
	new PickaxeItem(ModitemTeir.TITANIUM, 1, -2.8f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<ShovelItem> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel", () -> 
	new ShovelItem(ModitemTeir.TITANIUM, 1, -2.8f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<AxeItem> TITANIUM_AXE = ITEMS.register("titanium_axe", () -> 
	new AxeItem(ModitemTeir.TITANIUM, 4, -2.6f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<HoeItem> TITANIUM_HOE = ITEMS.register("titanium_hoe", () -> 
	new HoeItem(ModitemTeir.TITANIUM,-2, -0.8f, new Item.Properties().group(Minercraft.TAB)));

public static final RegistryObject<SwordItem> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () -> 
	new SwordItem(ModitemTeir.OBSIDIAN, 3, -2.8f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<PickaxeItem> OBSIDIAN_PICK = ITEMS.register("obsidian_pickaxe", () -> 
	new PickaxeItem(ModitemTeir.OBSIDIAN, 1, -2.8f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<ShovelItem> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () -> 
	new ShovelItem(ModitemTeir.OBSIDIAN, 1, -2.8f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<AxeItem> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () -> 
	new AxeItem(ModitemTeir.OBSIDIAN, 4, -3.0f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<HoeItem> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", () -> 
	new HoeItem(ModitemTeir.OBSIDIAN,-2, -0.8f, new Item.Properties().group(Minercraft.TAB)));

public static final RegistryObject<SwordItem> TIN_SWORD = ITEMS.register("tin_sword", () -> 
	new SwordItem(ModitemTeir.TIN, 3, -2.8f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<PickaxeItem> TIN_PICK = ITEMS.register("tin_pickaxe", () -> 
	new PickaxeItem(ModitemTeir.TIN, 1, -2.8f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<ShovelItem> TIN_SHOVEL = ITEMS.register("tin_shovel", () -> 
	new ShovelItem(ModitemTeir.TIN, 1, -2.8f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<AxeItem> TIN_AXE = ITEMS.register("tin_axe", () -> 
	new AxeItem(ModitemTeir.TIN, 4, -3.0f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<HoeItem> TIN_HOE = ITEMS.register("tin_hoe", () -> 
	new HoeItem(ModitemTeir.TIN,-2, -0.8f, new Item.Properties().group(Minercraft.TAB)));

public static final RegistryObject<SwordItem> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> 
	new SwordItem(ModitemTeir.BRONZE, 3, -2.6f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<PickaxeItem> BRONZE_PICK = ITEMS.register("bronze_pickaxe", () -> 
	new PickaxeItem(ModitemTeir.BRONZE, 1, -2.8f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<ShovelItem> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> 
	new ShovelItem(ModitemTeir.BRONZE, 1, -2.8f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<AxeItem> BRONZE_AXE = ITEMS.register("bronze_axe", () -> 
	new AxeItem(ModitemTeir.BRONZE, 4, -3.0f, new Item.Properties().group(Minercraft.TAB)));
public static final RegistryObject<HoeItem> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> 
	new HoeItem(ModitemTeir.BRONZE,-2, -0.8f, new Item.Properties().group(Minercraft.TAB)));
}
