package com.dargonboi.krasyrum.block;

import com.dargonboi.krasyrum.Krasyrum;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            Krasyrum.MODID);


    public static void Register(IEventBus eventBus){
//        BlockRegisters.registerMaterialBlock("blue_nanitarium_block", MaterialColor.COLOR_BLUE, 8.0F, 600.0F, true);
//        BlockRegisters.registerMaterialBlock("red_nanitarium_block", MaterialColor.COLOR_RED, 8.0F, 600.0F, true);

//        BlockRegisters.registerMaterialBlock("kyranium_block", MaterialColor.COLOR_MAGENTA, 8.0F, 600.0F, false);
//
//        BlockRegisters.registerMaterialBlock("titanium_block", MaterialColor.TERRACOTTA_WHITE, 5.0F, 6.0F, true);
//
//        BlockRegisters.registerMaterialBlock("ruby_block", MaterialColor.COLOR_PINK, 5.0F, 6.0F, false);
//
//        BlockRegisters.registerMaterialBlock("veranium_block", MaterialColor.COLOR_PINK, 5.0F, 6.0F, true);

        BLOCKS.register(eventBus);
    }

}
