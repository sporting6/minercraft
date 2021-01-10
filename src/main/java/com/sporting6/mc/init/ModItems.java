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
	public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", ItemBase::new);
	public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", ItemBase::new);
	public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
	public static final RegistryObject<Item> VERANIRUM_INGOT = ITEMS.register("veranirum_ingot", ItemBase::new);
	public static final RegistryObject<Item> THERIUM_INGOT = ITEMS.register("therium_ingot", ItemBase::new);
	
	//Spawn Eggs
	public static final RegistryObject<ModSpawnEggItem> LION_SPAWN_EGG = ITEMS.register("lion_spawn_egg", 
			() -> new ModSpawnEggItem(ModEntityType.LION,0xDFAB16 , 0xA05D01, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ModSpawnEggItem> TIGER_SPAWN_EGG = ITEMS.register("tiger_spawn_egg", 
			() -> new ModSpawnEggItem(ModEntityType.TIGER,0xDFAB16 , 0x000000, new Item.Properties().group(Minercraft.TAB)));
	public static final RegistryObject<ModSpawnEggItem> WHITE_TIGER_SPAWN_EGG = ITEMS.register("white_tiger_spawn_egg", 
			() -> new ModSpawnEggItem(ModEntityType.WHITE_TIGER,0xf9f9f9 , 0x000000, new Item.Properties().group(Minercraft.TAB)));


	//Coins
	public static final RegistryObject<Item> TIN_COIN = ITEMS.register("tin_coin", ItemBase::new);
	public static final RegistryObject<Item> TITANIUM_COIN = ITEMS.register("titanium_coin", ItemBase::new);
	public static final RegistryObject<Item> RED_NANITARIUM_COIN = ITEMS.register("red_nanitarium_coin", ItemBase::new);
	public static final RegistryObject<Item> BLUE_NANITARIUM_COIN = ITEMS.register("blue_nanitarium_coin", ItemBase::new);
	public static final RegistryObject<Item> TUNGSTEN_COIN = ITEMS.register("tungsten_coin", ItemBase::new);
	public static final RegistryObject<Item> COPPER_COIN = ITEMS.register("copper_coin", ItemBase::new);
	public static final RegistryObject<Item> IRON_COIN = ITEMS.register("iron_coin", ItemBase::new);
	public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin", ItemBase::new);
	public static final RegistryObject<Item> BRONZE_COIN = ITEMS.register("bronze_coin", ItemBase::new);
	public static final RegistryObject<Item> OBSIDIAN_COIN = ITEMS.register("obsidian_coin", ItemBase::new);
	public static final RegistryObject<Item> VERANIRUM_COIN = ITEMS.register("veranirum_coin", ItemBase::new);
	public static final RegistryObject<Item> THERIUM_COIN = ITEMS.register("therium_coin", ItemBase::new);



	//Nuggets
	public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", ItemBase::new);
	public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget", ItemBase::new);
	public static final RegistryObject<Item> RED_NANITARIUM_NUGGET = ITEMS.register("red_nanitarium_nugget", ItemBase::new);
	public static final RegistryObject<Item> BLUE_NANITARIUM_NUGGET = ITEMS.register("blue_nanitarium_nugget", ItemBase::new);
	public static final RegistryObject<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget", ItemBase::new);
	public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", ItemBase::new);
	public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", ItemBase::new);
	public static final RegistryObject<Item> OBSIDIAN_SHARD = ITEMS.register("obsidian_shard", ItemBase::new);
	public static final RegistryObject<Item> VERANIRUM_NUGGET = ITEMS.register("veranirum_nugget", ItemBase::new);
	public static final RegistryObject<Item> THERIUM_NUGGET = ITEMS.register("therium_nugget", ItemBase::new);

}
