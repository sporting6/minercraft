package com.dargonboi.krasyrum.item;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.fluid.ModFluids;
import com.dargonboi.krasyrum.util.item.ItemRegisters;
import com.dargonboi.krasyrum.util.item.ModCreativeTab;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class ModIngots {


    public static final RegistryObject<Item> BOILING_WATER_BUCKET = Krasyrum.ITEMS.register("boiling_water_bucket",
            () -> new BucketItem(ModFluids.SOURCE_BOILING_WATER,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_MATERIALS).craftRemainder(Items.BUCKET).stacksTo(1)));


    public static void Register(IEventBus eventBus){

        ItemRegisters.registerItem("kyranium_handle", Krasyrum.RARITY_INSANE, true);
        ItemRegisters.registerItem("perfect_diamond");
        ItemRegisters.registerItem("compressed_netherite");
        ItemRegisters.registerItem("obsidian_shards");
        ItemRegisters.registerItem("partally_refined_obsidian", true);
        ItemRegisters.registerItem("refined_obsidian", true);
        ItemRegisters.registerItem("refined_obsidian_ingot", true);



        Krasyrum.ITEMS.register(eventBus);
    }
}