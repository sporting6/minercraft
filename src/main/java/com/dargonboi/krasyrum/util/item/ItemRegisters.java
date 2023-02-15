package com.dargonboi.krasyrum.util.item;

import com.dargonboi.krasyrum.Krasyrum;
import net.minecraft.world.item.*;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegisters {


    public static final CreativeModeTab DEFAULT_TAB = ModCreativeTab.KRASYRUM_MATERIALS;

    public static RegistryObject<Item> registerItem(String name, Item.Properties properties) {
        final RegistryObject<Item> ITEM = Krasyrum.ITEMS.register(name, () -> new Item(properties));
        Krasyrum.ITEMMAP.put(name, ITEM);
        return Krasyrum.ITEMMAP.get(name);
    }


    public static RegistryObject<Item> registerItem(String name, CreativeModeTab tab, Rarity rarity, boolean isFireResistant) {
        final RegistryObject<Item> ITEM;
        if(isFireResistant) {
            ITEM = registerItem(name, new Item.Properties().tab(tab).rarity(rarity).fireResistant());
        } else {
            ITEM = registerItem(name, new Item.Properties().tab(tab).rarity(rarity));
        }
        Krasyrum.ITEMMAP.put(name, ITEM);
        return Krasyrum.ITEMMAP.get(name);
    }

    public static RegistryObject<Item> registerItem(String name, Rarity rarity, boolean isFireResistant){
        return registerItem(name, DEFAULT_TAB, rarity, isFireResistant);
    }
    public static RegistryObject<Item> registerItem(String name, boolean isFireResistant){
        return registerItem(name, DEFAULT_TAB, Rarity.COMMON, isFireResistant);
    }
    public static RegistryObject<Item> registerItem(String name){
        return registerItem(name, DEFAULT_TAB, Rarity.COMMON, false);
    }

    public static RegistryObject<Item> registerIngot(String name, CreativeModeTab tab, Rarity rarity, boolean isFireResistant){
        final RegistryObject<Item> ITEM;
        if(isFireResistant) {
            ITEM = registerItem(name + "_ingot", new Item.Properties().tab(tab).rarity(rarity).fireResistant());
        }else {
            ITEM = registerItem(name + "_ingot", new Item.Properties().tab(tab).rarity(rarity));
        }
        return ITEM;
    }

    public static RegistryObject<Item> registerIngot(String name, CreativeModeTab tab, Rarity rarity){
        registerRaw(name, tab, rarity, false);
        return registerIngot(name, tab, rarity, false);
    }
    public static RegistryObject<Item> registerIngot(String name, Rarity rarity, boolean isFireResistant){
        registerRaw(name, DEFAULT_TAB, rarity, isFireResistant);
        return registerIngot(name, DEFAULT_TAB, rarity, isFireResistant);
    }

    public static RegistryObject<Item> registerIngot(String name){
        registerRaw(name, DEFAULT_TAB, Rarity.COMMON, false);
        return registerIngot(name, DEFAULT_TAB, Rarity.COMMON, false);
    }

    public static RegistryObject<Item> registerRaw(String name, CreativeModeTab tab, Rarity rarity, boolean isFireResistant){
        final RegistryObject<Item> ITEM;
        if(isFireResistant) {
            ITEM = registerItem("raw_" + name, new Item.Properties().tab(tab).rarity(rarity).fireResistant());
        }else {
            ITEM = registerItem("raw_" + name, new Item.Properties().tab(tab).rarity(rarity));
        }
        return ITEM;
    }

    public static RegistryObject<Item> registerBucket(String name, RegistryObject<FlowingFluid> fluid, Item.Properties properties) {
        final RegistryObject<Item> BUCKET = Krasyrum.ITEMS.register(name, () -> new BucketItem(fluid, properties));
        Krasyrum.ITEMMAP.put(name, BUCKET);
        return Krasyrum.ITEMMAP.get(name);
    }
    public static RegistryObject<Item> registerBucket(String name, RegistryObject<FlowingFluid> fluid) {
        registerBucket(name, fluid, new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).craftRemainder(Items.BUCKET).stacksTo(1));
        return Krasyrum.ITEMMAP.get(name);
    }


}
