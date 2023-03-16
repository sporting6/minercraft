package com.dargonboi.krasyrum.item;

import com.dargonboi.krasyrum.Krasyrum;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModPotions {

    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTIONS, Krasyrum.MODID);


    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
