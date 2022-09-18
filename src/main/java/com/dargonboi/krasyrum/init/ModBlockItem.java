package com.dargonboi.krasyrum.init;


import com.dargonboi.krasyrum.MinerCraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockItem {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinerCraft.MODID);

    //Oress
    public static final RegistryObject<BlockItem> BLUE_NANITARIUM_ORE_ITEM = ITEMS.register("blue_nanitarium_ore",
            () -> new BlockItem(ModOres.BLUE_NANITARIUM_ORE.get(),
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<BlockItem> RED_NANITARIUM_ORE_ITEM = ITEMS.register("red_nanitarium_ore",
            () -> new BlockItem(ModOres.RED_NANITARIUM_ORE.get(),
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<BlockItem> VERANIUM_ORE_ITEM = ITEMS.register("veranium_ore",
            () -> new BlockItem(ModOres.VERANIUM_ORE.get(),
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<BlockItem> THERIUM_ORE_ITEM = ITEMS.register("therium_ore",
            () -> new BlockItem(ModOres.THERIUM_ORE.get(),
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<BlockItem> TITANIUM_ORE_ITEM = ITEMS.register("titanium_ore",
            () -> new BlockItem(ModOres.TITANIUM_ORE.get(),
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS)));

    public static final RegistryObject<BlockItem> DEEPSLATE_TITANIUM_ORE_ITEM = ITEMS.register("deepslate_titanium_ore",
            () -> new BlockItem(ModOres.DEEPSLATE_TITANIUM_ORE.get(),
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS)));

    public static final RegistryObject<BlockItem> RUBY_ORE_ITEM = ITEMS.register("ruby_ore",
            () -> new BlockItem(ModOres.RUBY_ORE.get(), new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS)));

    public static final RegistryObject<BlockItem> DEEPSLATE_RUBY_ORE_ITEM = ITEMS.register("deepslate_ruby_ore",
            () -> new BlockItem(ModOres.DEEPSLATE_RUBY_ORE.get(),
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS)));

    // Raw Ore Blocks
    public static final RegistryObject<BlockItem> RAW_BLUE_NANITARIUM_BLOCK_ITEM = ITEMS
            .register("raw_blue_nanitarium_block", () -> new BlockItem(ModBlocks.RAW_BLUE_NANITARIUM_BLOCK.get(),
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<BlockItem> RAW_RED_NANITARIUM_BLOCK_ITEM = ITEMS
            .register("raw_red_nanitarium_block", () -> new BlockItem(ModBlocks.RAW_RED_NANITARIUM_BLOCK.get(),
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<BlockItem> RAW_VERANIUM_BLOCK_ITEM = ITEMS.register("raw_veranium_block",
            () -> new BlockItem(ModBlocks.RAW_VERANIUM_BLOCK.get(),
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<BlockItem> RAW_TITANIUM_BLOCK_ITEM = ITEMS.register("raw_titanium_block",
            () -> new BlockItem(ModBlocks.RAW_TITANIUM_BLOCK.get(),
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS)));

    // Meterial Blocks

    public static final RegistryObject<BlockItem> BLUE_NANITARIUM_BLOCK_ITEM = ITEMS.register("blue_nanitarium_block",
            () -> new BlockItem(ModBlocks.BLUE_NANITARIUM_BLOCK.get(),
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<BlockItem> KYRANIUM_BLOCK_ITEM = ITEMS.register("kyranium_block",
            () -> new BlockItem(ModBlocks.KYRANIUM_BLOCK.get(),
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).rarity(ModRaritys.INSANE).fireResistant()));

    public static final RegistryObject<BlockItem> RED_NANITARIUM_BLOCK_ITEM = ITEMS.register("red_nanitarium_block",
            () -> new BlockItem(ModBlocks.RED_NANITARIUM_BLOCK.get(),
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<BlockItem> VERANIUM_BLOCK_ITEM = ITEMS.register("veranium_block",
            () -> new BlockItem(ModBlocks.VERANIUM_BLOCK.get(),
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<BlockItem> TITANIUM_BLOCK_ITEM = ITEMS.register("titanium_block",
            () -> new BlockItem(ModBlocks.TITANIUM_BLOCK.get(),
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS)));

    public static final RegistryObject<BlockItem> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block",
            () -> new BlockItem(ModBlocks.RUBY_BLOCK.get(),
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS)));

    public static final RegistryObject<BlockItem> INFUSION_CHAMBER_ITEM = ITEMS.register("infusion_chamber",
            () -> new BlockItem(ModBlocks.INFUSION_CHAMBER.get(),
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS)));

    public static void Register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
