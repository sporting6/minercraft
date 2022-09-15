package com.dargonboi.krasyrum;

import com.dargonboi.krasyrum.init.*;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MinerCraft.MODID)
public class MinerCraft {
	public static final String MODID = "krasyrum";

	public MinerCraft() {

		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		ModIngots.Register(bus);
		ModBlockItem.Register(bus);
		ModTools.Register(bus);
		ModArmor.Register(bus);

		ModFoods.Register(bus);

		ModBlocks.Register(bus);
		ModOres.Register(bus);
	}
}
