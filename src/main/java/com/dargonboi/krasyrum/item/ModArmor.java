package com.dargonboi.krasyrum.item;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.util.item.ModArmorMaterial;
import com.dargonboi.krasyrum.util.item.ModCreativeTab;
import com.dargonboi.krasyrum.util.item.ModRaritys;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModArmor {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Krasyrum.MODID);

    // Blue Nanitarium Armor
//    public static final RegistryObject<ArmorItem> BLUE_NANITARIUM_HELMET = ITEMS.register("blue_nanitarium_helmet",
//            () -> new ArmorItem(ModArmorMaterial.BLUE_NANITARIUM, EquipmentSlot.HEAD,
//                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
//    public static final RegistryObject<ArmorItem> BLUE_NANITARIUM_CHESTPLATE = ITEMS.register(
//            "blue_nanitarium_chestplate", () -> new ArmorItem(ModArmorMaterial.BLUE_NANITARIUM, EquipmentSlot.CHEST,
//                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
//    public static final RegistryObject<ArmorItem> BLUE_NANITARIUM_LEGGINGS = ITEMS.register("blue_nanitarium_leggings",
//            () -> new ArmorItem(ModArmorMaterial.BLUE_NANITARIUM, EquipmentSlot.LEGS,
//                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
//    public static final RegistryObject<ArmorItem> BLUE_NANITARIUM_BOOTS = ITEMS.register("blue_nanitarium_boots",
//            () -> new ArmorItem(ModArmorMaterial.BLUE_NANITARIUM, EquipmentSlot.FEET,
//                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));

    // Red Nanitarium Armor
//    public static final RegistryObject<ArmorItem> RED_NANITARIUM_HELMET = ITEMS.register("red_nanitarium_helmet",
//            () -> new ArmorItem(ModArmorMaterial.RED_NANITARIUM, EquipmentSlot.HEAD,
//                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
//    public static final RegistryObject<ArmorItem> RED_NANITARIUM_CHESTPLATE = ITEMS.register(
//            "red_nanitarium_chestplate", () -> new ArmorItem(ModArmorMaterial.RED_NANITARIUM, EquipmentSlot.CHEST,
//                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
//    public static final RegistryObject<ArmorItem> RED_NANITARIUM_LEGGINGS = ITEMS.register("red_nanitarium_leggings",
//            () -> new ArmorItem(ModArmorMaterial.RED_NANITARIUM, EquipmentSlot.LEGS,
//                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
//    public static final RegistryObject<ArmorItem> RED_NANITARIUM_BOOTS = ITEMS.register("red_nanitarium_boots",
//            () -> new ArmorItem(ModArmorMaterial.RED_NANITARIUM, EquipmentSlot.FEET,
//                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
    // Kyranium Aromor
//    public static final RegistryObject<ArmorItem> KYRANIUM_HELMET = ITEMS.register("kyranium_helmet",
//            () -> new ArmorItem(ModArmorMaterial.KYRANIUM, EquipmentSlot.HEAD,
//                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(ModRaritys.INSANE)));
//    public static final RegistryObject<ArmorItem> KYRANIUM_CHESTPLATE = ITEMS.register("kyranium_chestplate",
//            () -> new ArmorItem(ModArmorMaterial.KYRANIUM, EquipmentSlot.CHEST,
//                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(ModRaritys.INSANE)));
//    public static final RegistryObject<ArmorItem> KYRANIUM_LEGGINGS = ITEMS.register("kyranium_leggings",
//            () -> new ArmorItem(ModArmorMaterial.KYRANIUM, EquipmentSlot.LEGS,
//                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(ModRaritys.INSANE)));
//    public static final RegistryObject<ArmorItem> KYRANIUM_BOOTS = ITEMS.register("kyranium_boots",
//            () -> new ArmorItem(ModArmorMaterial.KYRANIUM, EquipmentSlot.FEET,
//                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(ModRaritys.INSANE)));

    // Titanium Armor
//    public static final RegistryObject<ArmorItem> TITANIUM_HELMET = ITEMS.register("titanium_helmet",
//            () -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.HEAD,
//                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR)));
//    public static final RegistryObject<ArmorItem> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate",
//            () -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.CHEST,
//                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR)));
//    public static final RegistryObject<ArmorItem> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings",
//            () -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.LEGS,
//                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR)));
//    public static final RegistryObject<ArmorItem> TITANIUM_BOOTS = ITEMS.register("titanium_boots",
//            () -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.FEET,
//                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR)));

//    // Ruby Armor
//    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet",
//            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.HEAD,
//                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR)));
//    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
//            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.CHEST,
//                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR)));
//    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
//            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.LEGS,
//                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR)));
//    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots",
//            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.FEET,
//                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR)));

    
    public static void Register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
