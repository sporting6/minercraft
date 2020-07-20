package com.sporting6.mc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sporting6.mc.util.RegistryHandler;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod ("mc")
public class Minercraft {
	
	private static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "mc";
	
	public Minercraft() {
		
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
		
		RegistryHandler.init();

		MinecraftForge.EVENT_BUS.register(this);
			
	}
	
	private void setup(final FMLCommonSetupEvent event) {}
	
	private void doClientStuff(final FMLCommonSetupEvent event) {}
	
	
	public static final ItemGroup TAB = new ItemGroup("minercraft") {
		
		@Override
		public ItemStack createIcon() {
			
			return new ItemStack(RegistryHandler.BLUE_NANITARIUM_PICK.get());
		}
		
	};
	

}
