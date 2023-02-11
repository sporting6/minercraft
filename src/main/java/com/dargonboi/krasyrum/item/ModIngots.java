package com.dargonboi.krasyrum.item;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.util.item.ItemRegisters;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModIngots {


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