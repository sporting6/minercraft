package com.sporting6.mc.init;

import com.sporting6.mc.Minercraft;
import com.sporting6.mc.items.ItemBase;
import com.sporting6.mc.items.ModSpawnEggItem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,Minercraft.MOD_ID);
	
	//Ingots
	public static final RegistryObject<Item> BLUE_NANITARIUM_INGOT = ITEMS.register("blue_nanitarium_ingot", ItemBase::new);
	public static final RegistryObject<Item> RED_NANITARIUM_INGOT = ITEMS.register("red_nanitarium_ingot", ItemBase::new);
	public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", ItemBase::new);
	public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ItemBase::new);
	public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", ItemBase::new);
	public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot", ItemBase::new);
	public static final RegistryObject<Item> OBSIDIAN_SHARD = ITEMS.register("obsidian_shard", ItemBase::new);
	public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", ItemBase::new);
	public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", ItemBase::new);
	public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
	
	//Spawn Eggs
	public static final RegistryObject<ModSpawnEggItem> LION_SPAWN_EGG = ITEMS.register("lion_spawn_egg", 
			() -> new ModSpawnEggItem(ModEntityType.LION,0xDFAB16 , 0xA05D01, new Item.Properties().group(Minercraft.TAB)));

}
