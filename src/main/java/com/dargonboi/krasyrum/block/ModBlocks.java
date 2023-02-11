package com.dargonboi.krasyrum.block;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.item.ModIngots;
import com.dargonboi.krasyrum.util.block.BlockRegisters;
import com.dargonboi.krasyrum.util.item.ModCreativeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            Krasyrum.MODID);


    public static void Register(IEventBus eventBus){
//        BlockRegisters.registerMaterialBlock("blue_nanitarium_block", MaterialColor.COLOR_BLUE, 8.0F, 600.0F, true);
//        BlockRegisters.registerMaterialBlock("red_nanitarium_block", MaterialColor.COLOR_RED, 8.0F, 600.0F, true);

        BlockRegisters.registerMaterialBlock("kyranium_block", MaterialColor.COLOR_MAGENTA, 8.0F, 600.0F, false);

        BlockRegisters.registerMaterialBlock("titanium_block", MaterialColor.TERRACOTTA_WHITE, 5.0F, 6.0F, true);

        BlockRegisters.registerMaterialBlock("ruby_block", MaterialColor.COLOR_PINK, 5.0F, 6.0F, false);

        BlockRegisters.registerMaterialBlock("veranium_block", MaterialColor.COLOR_PINK, 5.0F, 6.0F, true);

        BLOCKS.register(eventBus);
    }

}
