package com.sporting6.mc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sporting6.mc.entities.LionEntity;
import com.sporting6.mc.init.ModArmor;
import com.sporting6.mc.init.ModBlocks;
import com.sporting6.mc.init.ModEntityType;
import com.sporting6.mc.init.ModFood;
import com.sporting6.mc.init.ModItems;
import com.sporting6.mc.init.ModTools;

import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod ("mc")
public class Minercraft {
	
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "mc";
	
	public Minercraft() {
		
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
		
		ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModBlocks.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModTools.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModArmor.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModFood.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModEntityType.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());



		MinecraftForge.EVENT_BUS.register(this);
			
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		DeferredWorkQueue.runLater(() -> {
			GlobalEntityTypeAttributes.put(ModEntityType.LION.get(), LionEntity.setCustomAttributes().create());
			});
		
	}
	
	private void doClientStuff(final FMLCommonSetupEvent event) {}
	
	
	public static final ItemGroup TAB = new ItemGroup("minercraft") {
		
		@Override
		public ItemStack createIcon() {
			
			return new ItemStack(ModTools .BLUE_NANITARIUM_PICK.get());
		}
		
	};
	

}
