package com.dargonboi.krasyrum.world;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.world.gen.ModOreGeneration;
import com.dargonboi.krasyrum.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Krasyrum.MODID,bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);

        ModTreeGeneration.generateTrees(event);


    }
}
