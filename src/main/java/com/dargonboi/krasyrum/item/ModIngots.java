package com.dargonboi.krasyrum.item;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.util.item.ItemRegisters;
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


    public static void Register(IEventBus eventBus){

//        ItemRegisters.registerItem("kyranium_ingot", ModRaritys.INSANE, true);
        ItemRegisters.registerItem("kyranium_handle", ModRaritys.INSANE, true);
//        ItemRegisters.registerIngot("blue_nanitarium",  Rarity.RARE, true);
        ItemRegisters.registerIngot("red_nanitarium",  Rarity.RARE, true);
        ItemRegisters.registerIngot("titanium");
        ItemRegisters.registerIngot("veranium");
        ItemRegisters.registerIngot("therium");
        ItemRegisters.registerItem("ruby");
        ItemRegisters.registerItem("perfect_diamond");
        ItemRegisters.registerItem("compressed_netherite");
        ItemRegisters.registerItem("obsidian_shards");
        ItemRegisters.registerItem("partally_refined_obsidian", true);
        ItemRegisters.registerItem("refined_obsidian", true);
        ItemRegisters.registerItem("refined_obsidian_ingot", true);


        Krasyrum.ITEMS.register(eventBus);
    }
}