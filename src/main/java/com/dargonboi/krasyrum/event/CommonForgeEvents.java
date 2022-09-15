package com.dargonboi.krasyrum.event;

import java.util.List;
import java.util.function.Supplier;

import com.dargonboi.krasyrum.MinerCraft;
import com.dargonboi.krasyrum.world.OreGeneration;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

	
	
	@Mod.EventBusSubscriber(modid = MinerCraft.MODID, bus = Bus.FORGE)
	public class CommonForgeEvents {
	    @SubscribeEvent(priority = EventPriority.HIGHEST)
	    public static void biomeLoading(BiomeLoadingEvent event) {
	        final List<Supplier<PlacedFeature>> features = event.getGeneration()
	                .getFeatures(Decoration.UNDERGROUND_ORES);
	        
	        System.out.println("==> TPM biomeLoading: " + event.getCategory());

	        switch (event.getCategory()) {
	            case NETHER -> OreGeneration.NETHER_ORES.forEach(ore -> features.add(() -> ore));
	            case THEEND -> OreGeneration.END_ORES.forEach(ore -> features.add(() -> ore));
	            default -> OreGeneration.OVERWORLD_ORES.forEach(ore -> features.add(() -> ore));
	        }
	}
}