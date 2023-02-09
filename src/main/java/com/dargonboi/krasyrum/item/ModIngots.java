package com.dargonboi.krasyrum.item;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.util.item.ModCreativeTab;
import com.dargonboi.krasyrum.util.item.ModRaritys;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collection;
import java.util.HashMap;

public class ModIngots {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Krasyrum.MODID);

    Collection<RegistryObject<Item>> ENTRIES = ITEMS.getEntries();

    public static final HashMap<String, RegistryObject<Item>> INGOTMAP = new HashMap<String, RegistryObject<Item>>();
    public static final CreativeModeTab DEFAULT_TAB = ModCreativeTab.KRASYRUM_MATERIALS;

    public static void registerIngot(String name, Item.Properties properties, CreativeModeTab tab, Rarity rarity) {
        // Register Item
        final RegistryObject<Item> ITEM = ITEMS.register(name, () -> new Item(properties.tab(tab).rarity(rarity)));
        INGOTMAP.put(name, ITEM);

    }
    public static void registerIngot(String name, CreativeModeTab tab) {
        registerIngot(name, new Item.Properties(), tab, Rarity.COMMON);

    }
    public static void registerFireResistantIngot(String name, CreativeModeTab tab, Rarity rarity) {
        registerIngot(name, new Item.Properties().fireResistant(), tab, rarity);


    }
    public static void registerFireResistantIngot(String name) {
        registerFireResistantIngot(name, DEFAULT_TAB, Rarity.COMMON);
    }


    public static void registerIngot(String name) {
        registerIngot(name, new Item.Properties(), DEFAULT_TAB, Rarity.COMMON);


    }

//    public static final RegistryObject<Item> BLUE_NANITARIUM_INGOT = ITEMS.register("blue_nanitarium_ingot",
//            () -> new Item(new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).fireResistant().rarity(Rarity.RARE)));

//    public static final RegistryObject<Item> RED_NANITARIUM_INGOT = ITEMS.register("red_nanitarium_ingot",
//            () -> new Item(new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).fireResistant().rarity(Rarity.RARE)));
//
//    public static final RegistryObject<Item> VERANIUM_INGOT = ITEMS.register("veranium_ingot", () -> new Item(
//            new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).fireResistant().rarity(Rarity.RARE)));
//
//    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
//            () -> new Item(new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS)));
//
//    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
//            () -> new Item(new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS)));
//
//    public static final RegistryObject<Item> THERIUM_INGOT = ITEMS.register("therium_ingot", () -> new Item(
//            new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).fireResistant().rarity(Rarity.RARE)));
//
//    public static final RegistryObject<Item> KYRANIUM_INGOT = ITEMS.register("kyranium_ingot",
//            () -> new Item(new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).fireResistant().rarity(ModRaritys.INSANE)));
//
//    // Other Recources
//    public static final RegistryObject<Item> PERFECT_DIAMOND = ITEMS.register("perfect_diamond",
//            () -> new Item(new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).rarity(Rarity.UNCOMMON)));
//
//    public static final RegistryObject<Item> COMPRESSED_NETHERITE = ITEMS.register("compressed_netherite",
//            () -> new Item(new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).fireResistant()
//                    .rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> KYRANIUM_HANDLE = ITEMS.register("kyranium_handle",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).fireResistant().rarity(ModRaritys.INSANE)));



    //Raw Ores
    public static final RegistryObject<Item> RAW_BLUE_NANITARIUM = ITEMS.register("raw_blue_nanitarium", () -> new Item(
            new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).fireResistant().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> RAW_RED_NANITARIUM = ITEMS.register("raw_red_nanitarium", () -> new Item(
            new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).fireResistant().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> RAW_VERANIUM = ITEMS.register("raw_veranium", () -> new Item(
            new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).fireResistant().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS)));

    public static final RegistryObject<Item> RAW_THERIUM = ITEMS.register("raw_therium", () -> new Item(
            new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).fireResistant().rarity(Rarity.RARE)));

    //Obsidian
    public static final RegistryObject<Item> OBSIDIAN_SHARDS = ITEMS.register("obsidian_shards", () -> new Item(
            new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).fireResistant().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> PARTALLY_REFINED_OBSIDIAN = ITEMS.register("partally_refined_obsidian",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).fireResistant()
                    .rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> REFINED_OBSIDIAN = ITEMS.register("refined_obsidian", () -> new Item(
            new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).fireResistant().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> REFINED_OBSIDIAN_INGOT = ITEMS.register("refined_obsidian_ingot",
            () -> new Item(
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).fireResistant().rarity(Rarity.RARE)));




    public static void Register(IEventBus eventBus){

        ModIngots.registerFireResistantIngot("kyranium_ingot", DEFAULT_TAB, ModRaritys.INSANE);
        ModIngots.registerFireResistantIngot("blue_nanitarium_ingot", DEFAULT_TAB, Rarity.RARE);
        ModIngots.registerFireResistantIngot("red_nanitarium_ingot", DEFAULT_TAB, Rarity.RARE);
        ModIngots.registerIngot("titanium_ingot");
        ModIngots.registerIngot("veranium_ingot");
        ModIngots.registerIngot("therium_ingot");
        ModIngots.registerIngot("ruby");
        ModIngots.registerIngot("perfect_diamond");
        ModIngots.registerIngot("compressed_netherite");



        ITEMS.register(eventBus);
    }
}