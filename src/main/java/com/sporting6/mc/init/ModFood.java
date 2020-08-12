package com.sporting6.mc.init;

import com.sporting6.mc.Minercraft;
import com.sporting6.mc.items.NanitariumApple;
import com.sporting6.mc.items.SlimeApple;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModFood {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,Minercraft.MOD_ID);

	
	public static final RegistryObject<NanitariumApple> BLUE_NANITARIUM_APPLE = ITEMS.register("nanitarium_apple", NanitariumApple::new);
	public static final RegistryObject<NanitariumApple> RED_NANITARIUM_APPLE = ITEMS.register("nanitarium_apple2", NanitariumApple::new);
	public static final RegistryObject<SlimeApple> SLIME_APPLE = ITEMS.register("slime_apple", SlimeApple::new);


}
