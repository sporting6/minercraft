package com.dargonboi.krasyrum.block;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.util.block.BlockRegisters;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModOres {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            Krasyrum.MODID);



    public static void Register(IEventBus eventBus){
        BlockRegisters.registerOre("blue_nanitarium_ore", MaterialColor.DEEPSLATE, 40f, 600f, SoundType.DEEPSLATE);
        BlockRegisters.registerOre("red_nanitarium_ore", MaterialColor.NETHER, 40f, 600f, SoundType.NETHERRACK);
        BlockRegisters.registerOre("ruby_ore", 4.5f, 4f);
        BlockRegisters.registerOre("titanium_ore", 4.5f, 4f);
        BlockRegisters.registerOre("veranium_ore", MaterialColor.SAND, 30f, 600f, SoundType.STONE);
        BlockRegisters.registerOre("therium_ore", MaterialColor.SAND, 30f, 600f, SoundType.STONE);

        BLOCKS.register(eventBus);
    }
}
