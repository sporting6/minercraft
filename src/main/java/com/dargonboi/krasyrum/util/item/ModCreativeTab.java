package com.dargonboi.krasyrum.util.item;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.item.ModFoods;
import com.dargonboi.krasyrum.item.ModIngots;
import com.dargonboi.krasyrum.item.ModTools;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {

    public static final CreativeModeTab KRASYRUM_MATERIALS = new CreativeModeTab("krasyrum_materials") {

        @Override
        public ItemStack makeIcon(){
            return new ItemStack(Krasyrum.ITEMMAP.get("blue_nanitarium_ingot").get());
        }

    };

    public static final CreativeModeTab KRASYRUM_FOODS = new CreativeModeTab("krasyrum_foods") {

        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModFoods.BLUE_NANITARIUM_APPLE.get());
        }

    };

    public static final CreativeModeTab KRASYRUM_TOOLS_ARMOR = new CreativeModeTab("krasyrum_tools_armor") {

        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModTools.BLUE_NANITARIUM_PICKAXE.get());
        }

    };


}
