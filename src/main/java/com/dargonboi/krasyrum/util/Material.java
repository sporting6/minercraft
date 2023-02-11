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

    private String name;
    private static final CreativeModeTab DEFAULT_TAB = ModCreativeTab.KRASYRUM_MATERIALS;
    private CreativeModeTab tab = DEFAULT_TAB;
    private  boolean fireResistant = false;
    private  Rarity rarity = Rarity.COMMON;
    private  Tier toolTier;
    private  ArmorMaterial armorMaterial;


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

    public String getName() {
        return this.name;
    }
    public boolean getFireResistant(){
        return this.fireResistant;
    }

    public Material fireResistant(boolean isFireResistant){
        this.fireResistant = isFireResistant;
        return this;
    }
    public Material fireResistant(){
        this.fireResistant = true;
        return this;
    }

    public Material ingot(){
        final RegistryObject<Item> ITEM;
        if(fireResistant) {
            ITEM = Krasyrum.ITEMS.register(this.name + "_ingot", () -> new Item(new Item.Properties().tab(tab).rarity(rarity).fireResistant()));
        } else {
            ITEM = Krasyrum.ITEMS.register(this.name + "_ingot", () -> new Item(new Item.Properties().tab(tab).rarity(rarity)));
        }
            Krasyrum.ITEMMAP.put(this.name + "_ingot", ITEM);
        return this;
    }

    public Material raw(){
        final RegistryObject<Item> ITEM;
        if(fireResistant) {
            ITEM = Krasyrum.ITEMS.register("raw_" + this.name, () -> new Item(new Item.Properties().tab(tab).rarity(rarity).fireResistant()));
        } else {
            ITEM = Krasyrum.ITEMS.register("raw_" + this.name, () -> new Item(new Item.Properties().tab(tab).rarity(rarity)));
        }
        Krasyrum.ITEMMAP.put("raw_" + this.name, ITEM);
        return this;
    }

    public Material crushable(){
        final RegistryObject<Item> ITEM;
        if(fireResistant) {
            ITEM = Krasyrum.ITEMS.register("crushed_" + this.name, () -> new Item(new Item.Properties().tab(tab).rarity(rarity).fireResistant()));
        } else {
            ITEM = Krasyrum.ITEMS.register("crushed_" + this.name, () -> new Item(new Item.Properties().tab(tab).rarity(rarity)));
        }
        Krasyrum.ITEMMAP.put("crushed_" + this.name, ITEM);
        return this;
    }

    public Material tools(int level, int durability, float speed, float attackDamageBonus, float attackSpeedBonus, int enchantmentValue, TagKey<Block> tag, List beforeTier, List nextTier){
        final RegistryObject<SwordItem> SWORD;
        final RegistryObject<PickaxeItem> PICKAXE;
        final RegistryObject<AxeItem> AXE;
        final RegistryObject<ShovelItem> SHOVEL;
        final RegistryObject<HoeItem> HOE;
        this.toolTier = TierSortingRegistry.registerTier(
                new ForgeTier(level ,durability, speed, attackDamageBonus, enchantmentValue, tag,() -> Ingredient.of(Krasyrum.ITEMMAP.get(name + "_ingot").get())),
                new ResourceLocation("krasyrum:" + name),
                beforeTier, nextTier);
        Krasyrum.TIERMAP.put(this.name, this.toolTier);
        if(fireResistant) {
            SWORD = Krasyrum.ITEMS.register(this.name + "_sword",
                    () -> new SwordItem(Krasyrum.TIERMAP.get(this.name), 2, -2.4F + attackSpeedBonus,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(rarity)));
            PICKAXE = Krasyrum.ITEMS.register(this.name + "_pickaxe",
                    () -> new PickaxeItem(Krasyrum.TIERMAP.get(this.name), 0, -2.8F + attackSpeedBonus,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(rarity)));
            AXE = Krasyrum.ITEMS.register(this.name + "_axe",
                    () -> new AxeItem(Krasyrum.TIERMAP.get(this.name), 4, -3 + attackSpeedBonus,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(rarity)));
            SHOVEL = Krasyrum.ITEMS.register(this.name + "_shovel",
                    () -> new ShovelItem(Krasyrum.TIERMAP.get(this.name), 0, -2.8F + attackSpeedBonus,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(rarity)));
            HOE = Krasyrum.ITEMS.register(this.name + "_hoe",
                    () -> new HoeItem(Krasyrum.TIERMAP.get(this.name), -4, 0 + attackSpeedBonus,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(rarity)));
        } else {
            SWORD = Krasyrum.ITEMS.register(this.name + "_sword",
                    () -> new SwordItem(Krasyrum.TIERMAP.get(this.name), 2, -2.4F + attackSpeedBonus,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).rarity(rarity)));
            PICKAXE = Krasyrum.ITEMS.register(this.name + "_pickaxe",
                    () -> new PickaxeItem(Krasyrum.TIERMAP.get(this.name), 0, -2.8F + attackSpeedBonus,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).rarity(rarity)));
            AXE = Krasyrum.ITEMS.register(this.name + "_axe",
                    () -> new AxeItem(Krasyrum.TIERMAP.get(this.name), 4, -3 + attackSpeedBonus,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).rarity(rarity)));
            SHOVEL = Krasyrum.ITEMS.register(this.name + "_shovel",
                    () -> new ShovelItem(Krasyrum.TIERMAP.get(this.name), 0, -2.8F + attackSpeedBonus,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).rarity(rarity)));
            HOE = Krasyrum.ITEMS.register(this.name + "_hoe",
                    () -> new HoeItem(Krasyrum.TIERMAP.get(this.name), -4, 0 + attackSpeedBonus,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).rarity(rarity)));
        }

        Krasyrum.TOOLMAP.put(this.name + "_pickaxe", PICKAXE);
        Krasyrum.TOOLMAP.put(this.name + "_axe", AXE);
        Krasyrum.TOOLMAP.put(this.name + "_shovel", SHOVEL);
        Krasyrum.TOOLMAP.put(this.name + "_sword", SWORD);
        Krasyrum.TOOLMAP.put(this.name + "_hoe", HOE);

        return this;

    }

    public Material armor(int enchantibility, int baseDurability, int[] armor, float knockbackResistance, float toughness, SoundEvent sound){
        final RegistryObject<ArmorItem> HELMET;
        final RegistryObject<ArmorItem> CHESTPLATE;
        final RegistryObject<ArmorItem> LEGGINGS;
        final RegistryObject<ArmorItem> BOOTS;
        this.armorMaterial = new BaseArmorMaterial(enchantibility, new int[] {(int)(baseDurability * 1.2), (int)(baseDurability * 1.5), (int)(baseDurability * 1.3), baseDurability},
                armor, knockbackResistance, toughness, Krasyrum.MODID + ":" + name,
                sound,() -> Ingredient.of(Krasyrum.ITEMMAP.get(name + "_ingot").get()));

        Krasyrum.ARMORMATERIALMAP.put(this.name, this.armorMaterial);

        if(fireResistant) {
            HELMET = Krasyrum.ITEMS.register(this.name + "_helmet",
                    () -> new ArmorItem(Krasyrum.ARMORMATERIALMAP.get(this.name), EquipmentSlot.HEAD,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(rarity)));
            CHESTPLATE = Krasyrum.ITEMS.register(this.name + "_chestplate",
                    () -> new ArmorItem(Krasyrum.ARMORMATERIALMAP.get(this.name), EquipmentSlot.CHEST,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(rarity)));
            LEGGINGS = Krasyrum.ITEMS.register(this.name + "_leggings",
                    () -> new ArmorItem(Krasyrum.ARMORMATERIALMAP.get(this.name), EquipmentSlot.LEGS,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(rarity)));
            BOOTS = Krasyrum.ITEMS.register(this.name + "_boots",
                    () -> new ArmorItem(Krasyrum.ARMORMATERIALMAP.get(this.name), EquipmentSlot.FEET,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(rarity)));
        }else {
            HELMET = Krasyrum.ITEMS.register(this.name + "_helmet",
                    () -> new ArmorItem(Krasyrum.ARMORMATERIALMAP.get(this.name), EquipmentSlot.HEAD,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).rarity(rarity)));
            CHESTPLATE = Krasyrum.ITEMS.register(this.name + "_chestplate",
                    () -> new ArmorItem(Krasyrum.ARMORMATERIALMAP.get(this.name), EquipmentSlot.CHEST,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).rarity(rarity)));
            LEGGINGS = Krasyrum.ITEMS.register(this.name + "_leggings",
                    () -> new ArmorItem(Krasyrum.ARMORMATERIALMAP.get(this.name), EquipmentSlot.LEGS,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).rarity(rarity)));
            BOOTS = Krasyrum.ITEMS.register(this.name + "_boots",
                    () -> new ArmorItem(Krasyrum.ARMORMATERIALMAP.get(this.name), EquipmentSlot.FEET,
                            new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).rarity(rarity)));
        }

        Krasyrum.ARMORMAP.put(this.name + "_helmet", HELMET);
        Krasyrum.ARMORMAP.put(this.name + "_chestplate", CHESTPLATE);
        Krasyrum.ARMORMAP.put(this.name + "_leggings", LEGGINGS);
        Krasyrum.ARMORMAP.put(this.name + "_boots", BOOTS);


        return this;
    }

    public Material materialBlock(MaterialColor color, float destroyTime, float explosionResistance, boolean rawOreBlock){
        BlockRegisters.registerMaterialBlock(this.name + "_block", color, destroyTime, explosionResistance, rawOreBlock);
        return this;
    }

    public Material ore(float destroyTime, float explosionResistance, int veinSize, int orePerChunk, int minY, int maxY){
        BlockRegisters.registerOre(this.name + "_ore", destroyTime, explosionResistance);
        ModConfiguredFeatures.registerOverworldOres(this.name + "_ore", veinSize, Krasyrum.OREBLOCKMAP.get(this.name + "_ore"));
        ModPlacedFeatures.placeOres(this.name + "_ore", Krasyrum.OREMAP, orePerChunk, minY, maxY);
        return this;
    }

    public Material deepslateOre(float destroyTime, float explosionResistance, int veinSize, int orePerChunk, int minY, int maxY){
        BlockRegisters.registerDeepslateOre(this.name + "_ore", destroyTime, explosionResistance);
        ModConfiguredFeatures.registerDeepslateOres(this.name + "_ore", veinSize, Krasyrum.OREBLOCKMAP.get("deepslate_" + this.name + "_ore"));
        ModPlacedFeatures.placeOres(this.name + "_ore", Krasyrum.OREMAP, orePerChunk, minY, maxY);
        return this;
    }

    public Material stoneDeepslateOre(float destroyTime, float explosionResistance, int veinSize, int orePerChunk, int minY, int maxY){
        BlockRegisters.registerOres(this.name + "_ore", destroyTime, explosionResistance);
        ModConfiguredFeatures.registerOverworldOres(this.name + "_ore", veinSize, Krasyrum.OREBLOCKMAP.get(this.name + "_ore"), Krasyrum.OREBLOCKMAP.get("deepslate_" + this.name + "_ore"));
        ModPlacedFeatures.placeOres(this.name + "_ore", Krasyrum.OREMAP, orePerChunk, minY, maxY);
        return this;
    }

    public Material netherOre(float destroyTime, float explosionResistance, int veinSize, int orePerChunk, int minY, int maxY){
        BlockRegisters.registerOre(this.name + "_ore", destroyTime, explosionResistance);
        ModConfiguredFeatures.registerNetherOres(this.name + "_ore", veinSize, Krasyrum.OREBLOCKMAP.get(this.name + "_ore"));
        ModPlacedFeatures.placeOres(this.name + "_ore", Krasyrum.OREMAP, orePerChunk, minY, maxY);
        return this;
    }

    public Material endOre(float destroyTime, float explosionResistance, int veinSize, int orePerChunk, int minY, int maxY){
        BlockRegisters.registerOre(this.name + "_ore", destroyTime, explosionResistance);
        ModConfiguredFeatures.registerEndOres(this.name + "_ore", veinSize, Krasyrum.OREBLOCKMAP.get(this.name + "_ore"));
        ModPlacedFeatures.placeOres(this.name + "_ore", Krasyrum.OREMAP, orePerChunk, minY, maxY);
        return this;
    }
}
