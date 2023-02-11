package com.dargonboi.krasyrum.util;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.util.block.BlockRegisters;
import com.dargonboi.krasyrum.util.item.*;
import com.dargonboi.krasyrum.world.feature.ModConfiguredFeatures;
import com.dargonboi.krasyrum.world.feature.ModPlacedFeatures;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class Material {

    private static String name;
    private static final CreativeModeTab DEFAULT_TAB = ModCreativeTab.KRASYRUM_MATERIALS;
    private CreativeModeTab tab = DEFAULT_TAB;
    private static boolean fireResistant = false;
    private static Rarity rarity = Rarity.COMMON;
    private static Tier toolTier;
    private static ArmorMaterial armorMaterial;


    public Material(String pName, CreativeModeTab pTab, Rarity pRarity){
        this.name = pName;
        this.rarity = pRarity;
        this.tab = pTab;
    }

    public Material(String pName, CreativeModeTab pTab){
        this.name = pName;
        this.rarity = Rarity.COMMON;
        this.tab = pTab;
    }

    public Material(String pName){
        this.name = pName;
        this.rarity = Rarity.COMMON;
        this.tab = DEFAULT_TAB;
    }

    public static String getName() {
        return name;
    }
    public static boolean getFireResistant(){
        return fireResistant;
    }

    public Material fireResistant(boolean isFireResistant){
        fireResistant = isFireResistant;
        return this;
    }
    public Material fireResistant(){
        fireResistant = true;
        return this;
    }

    public Material ingot(){
        final RegistryObject<Item> ITEM;
        if(fireResistant) {
            ITEM = Krasyrum.ITEMS.register(name + "_ingot", () -> new Item(new Item.Properties().tab(tab).rarity(rarity).fireResistant()));
        } else {
            ITEM = Krasyrum.ITEMS.register(name + "_ingot", () -> new Item(new Item.Properties().tab(tab).rarity(rarity)));
        }
            Krasyrum.ITEMMAP.put(name + "_ingot", ITEM);
        return this;
    }

    public Material raw(){
        final RegistryObject<Item> ITEM;
        if(fireResistant) {
            ITEM = Krasyrum.ITEMS.register("raw_" + name, () -> new Item(new Item.Properties().tab(tab).rarity(rarity).fireResistant()));
        } else {
            ITEM = Krasyrum.ITEMS.register("raw_" + name, () -> new Item(new Item.Properties().tab(tab).rarity(rarity)));
        }
        Krasyrum.ITEMMAP.put("raw_" + name, ITEM);
        return this;
    }

    public Material crushable(){
        final RegistryObject<Item> ITEM;
        if(fireResistant) {
            ITEM = Krasyrum.ITEMS.register("crushed_" + name, () -> new Item(new Item.Properties().tab(tab).rarity(rarity).fireResistant()));
        } else {
            ITEM = Krasyrum.ITEMS.register("crushed_" + name, () -> new Item(new Item.Properties().tab(tab).rarity(rarity)));
        }
        Krasyrum.ITEMMAP.put("crushed_" + name, ITEM);
        return this;
    }

    public Material tools(int level, int durability, float speed, float attackDamageBonus, float attackSpeedBonus, int enchantmentValue, TagKey<Block> tag, List beforeTier, List nextTier){
        final RegistryObject<SwordItem> SWORD;
        final RegistryObject<PickaxeItem> PICKAXE;
        final RegistryObject<AxeItem> AXE;
        final RegistryObject<ShovelItem> SHOVEL;
        final RegistryObject<HoeItem> HOE;
        toolTier = TierSortingRegistry.registerTier(
                new ForgeTier(level ,durability, speed, attackDamageBonus, enchantmentValue, tag,() -> Ingredient.of(Krasyrum.ITEMMAP.get(name + "_ingot").get())),
                new ResourceLocation("krasyrum:" + name),
                beforeTier, nextTier);

        if(fireResistant) {
            SWORD = Krasyrum.ITEMS.register(name + "_sword",
                    () -> new SwordItem(toolTier, 2, -2.4F + attackSpeedBonus,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(rarity)));
            PICKAXE = Krasyrum.ITEMS.register(name + "_pickaxe",
                    () -> new PickaxeItem(toolTier, 0, -2.8F + attackSpeedBonus,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(rarity)));
            AXE = Krasyrum.ITEMS.register(name + "_axe",
                    () -> new AxeItem(toolTier, 4, -3 + attackSpeedBonus,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(rarity)));
            SHOVEL = Krasyrum.ITEMS.register(name + "_shovel",
                    () -> new ShovelItem(toolTier, 0, -2.8F + attackSpeedBonus,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(rarity)));
            HOE = Krasyrum.ITEMS.register(name + "_hoe",
                    () -> new HoeItem(toolTier, -4, 0 + attackSpeedBonus,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(rarity)));
        } else {
            SWORD = Krasyrum.ITEMS.register(name + "_sword",
                    () -> new SwordItem(toolTier, 2, -2.4F + attackSpeedBonus,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).rarity(rarity)));
            PICKAXE = Krasyrum.ITEMS.register(name + "_pickaxe",
                    () -> new PickaxeItem(toolTier, 0, -2.8F + attackSpeedBonus,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).rarity(rarity)));
            AXE = Krasyrum.ITEMS.register(name + "_axe",
                    () -> new AxeItem(toolTier, 4, -3 + attackSpeedBonus,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).rarity(rarity)));
            SHOVEL = Krasyrum.ITEMS.register(name + "_shovel",
                    () -> new ShovelItem(toolTier, 0, -2.8F + attackSpeedBonus,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).rarity(rarity)));
            HOE = Krasyrum.ITEMS.register(name + "_hoe",
                    () -> new HoeItem(toolTier, -4, 0 + attackSpeedBonus,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).rarity(rarity)));
        }

        Krasyrum.TOOLMAP.put(name + "_pickaxe", PICKAXE);
        Krasyrum.TOOLMAP.put(name + "_axe", AXE);
        Krasyrum.TOOLMAP.put(name + "_shovel", SHOVEL);
        Krasyrum.TOOLMAP.put(name + "_sword", SWORD);
        Krasyrum.TOOLMAP.put(name + "_hoe", HOE);

        return this;

    }

    public Material armor(int enchantibility, int baseDurability, int[] armor, float knockbackResistance, float toughness, SoundEvent sound){
        final RegistryObject<ArmorItem> HELMET;
        final RegistryObject<ArmorItem> CHESTPLATE;
        final RegistryObject<ArmorItem> LEGGINGS;
        final RegistryObject<ArmorItem> BOOTS;
        armorMaterial = new BaseArmorMaterial(enchantibility, new int[] {(int)(baseDurability * 1.2), (int)(baseDurability * 1.5), (int)(baseDurability * 1.3), baseDurability},
                armor, knockbackResistance, toughness, Krasyrum.MODID + ":" + name,
                sound,() -> Ingredient.of(Krasyrum.ITEMMAP.get(name + "_ingot").get()));

        if(fireResistant) {
            HELMET = Krasyrum.ITEMS.register(name + "_helmet",
                    () -> new ArmorItem(armorMaterial, EquipmentSlot.HEAD,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(rarity)));
            CHESTPLATE = Krasyrum.ITEMS.register(name + "_chestplate",
                    () -> new ArmorItem(armorMaterial, EquipmentSlot.CHEST,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(rarity)));
            LEGGINGS = Krasyrum.ITEMS.register(name + "_leggings",
                    () -> new ArmorItem(armorMaterial, EquipmentSlot.LEGS,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(rarity)));
            BOOTS = Krasyrum.ITEMS.register(name + "_boots",
                    () -> new ArmorItem(armorMaterial, EquipmentSlot.FEET,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(rarity)));
        }else {
            HELMET = Krasyrum.ITEMS.register(name + "_helmet",
                    () -> new ArmorItem(armorMaterial, EquipmentSlot.HEAD,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).rarity(rarity)));
            CHESTPLATE = Krasyrum.ITEMS.register(name + "_chestplate",
                    () -> new ArmorItem(armorMaterial, EquipmentSlot.CHEST,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).rarity(rarity)));
            LEGGINGS = Krasyrum.ITEMS.register(name + "_leggings",
                    () -> new ArmorItem(armorMaterial, EquipmentSlot.LEGS,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).rarity(rarity)));
            BOOTS = Krasyrum.ITEMS.register(name + "_boots",
                    () -> new ArmorItem(armorMaterial, EquipmentSlot.FEET,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).rarity(rarity)));
        }

        Krasyrum.ARMORMAP.put(name + "_helmet", HELMET);
        Krasyrum.ARMORMAP.put(name + "_chestplate", CHESTPLATE);
        Krasyrum.ARMORMAP.put(name + "_leggings", LEGGINGS);
        Krasyrum.ARMORMAP.put(name + "_boots", BOOTS);


        return this;
    }

    public Material materialBlock(MaterialColor color, float destroyTime, float explosionResistance, boolean rawOreBlock){
        BlockRegisters.registerMaterialBlock(name + "_block", color, destroyTime, explosionResistance, rawOreBlock);
        return this;
    }

    public Material ore(float destroyTime, float explosionResistance, int veinSize, int orePerChunk, int minY, int maxY){
        BlockRegisters.registerOre(name + "_ore", destroyTime, explosionResistance);
        ModConfiguredFeatures.registerOverworldOres(name + "_ore", veinSize, Krasyrum.OREBLOCKMAP.get(name + "_ore"));
        ModPlacedFeatures.placeOres(name + "_ore", Krasyrum.OREMAP, orePerChunk, minY, maxY);
        return this;
    }

    public Material deepslateOre(float destroyTime, float explosionResistance, int veinSize, int orePerChunk, int minY, int maxY){
        BlockRegisters.registerDeepslateOre(name + "_ore", destroyTime, explosionResistance);
        ModConfiguredFeatures.registerDeepslateOres(name + "_ore", veinSize, Krasyrum.OREBLOCKMAP.get("deepslate_" + name + "_ore"));
        ModPlacedFeatures.placeOres(name + "_ore", Krasyrum.OREMAP, orePerChunk, minY, maxY);
        return this;
    }

    public Material stoneDeepslateOre(float destroyTime, float explosionResistance, int veinSize, int orePerChunk, int minY, int maxY){
        BlockRegisters.registerOres(name + "_ore", destroyTime, explosionResistance);
        ModConfiguredFeatures.registerOverworldOres(name + "_ore", veinSize, Krasyrum.OREBLOCKMAP.get(name + "_ore"), Krasyrum.OREBLOCKMAP.get("deepslate_" + name + "_ore"));
        ModPlacedFeatures.placeOres(name + "_ore", Krasyrum.OREMAP, orePerChunk, minY, maxY);
        return this;
    }

    public Material netherOre(float destroyTime, float explosionResistance, int veinSize, int orePerChunk, int minY, int maxY){
        BlockRegisters.registerOre(name + "_ore", destroyTime, explosionResistance);
        ModConfiguredFeatures.registerNetherOres(name + "_ore", veinSize, Krasyrum.OREBLOCKMAP.get(name + "_ore"));
        ModPlacedFeatures.placeOres(name + "_ore", Krasyrum.OREMAP, orePerChunk, minY, maxY);
        return this;
    }

    public Material endOre(float destroyTime, float explosionResistance, int veinSize, int orePerChunk, int minY, int maxY){
        BlockRegisters.registerOre(name + "_ore", destroyTime, explosionResistance);
        ModConfiguredFeatures.registerEndOres(name + "_ore", veinSize, Krasyrum.OREBLOCKMAP.get(name + "_ore"));
        ModPlacedFeatures.placeOres(name + "_ore", Krasyrum.OREMAP, orePerChunk, minY, maxY);
        return this;
    }
}
