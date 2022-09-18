package com.dargonboi.krasyrum.init;

import com.dargonboi.krasyrum.MinerCraft;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {

    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTIONS, MinerCraft.MODID);

    public static final RegistryObject<Potion> ACID_BOTTLE = POTIONS.register("acid_bottle",
            () -> new Potion(new MobEffectInstance(MobEffects.POISON, 200, 0)));


    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
