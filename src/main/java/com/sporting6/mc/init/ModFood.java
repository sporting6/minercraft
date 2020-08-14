package com.sporting6.mc.init;

import com.sporting6.mc.Minercraft;
import com.sporting6.mc.items.food.CookedLion;
import com.sporting6.mc.items.food.NanitariumApple;
import com.sporting6.mc.items.food.RawLion;
import com.sporting6.mc.items.food.SlimeApple;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModFood {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,Minercraft.MOD_ID);

	//Effects
	public static final RegistryObject<NanitariumApple> BLUE_NANITARIUM_APPLE = ITEMS.register("nanitarium_apple", NanitariumApple::new);
	public static final RegistryObject<NanitariumApple> RED_NANITARIUM_APPLE = ITEMS.register("nanitarium_apple2", NanitariumApple::new);
	public static final RegistryObject<SlimeApple> SLIME_APPLE = ITEMS.register("slime_apple", SlimeApple::new);
	
	//Meat
	public static final RegistryObject<CookedLion> COOKED_LION = ITEMS.register("cooked_lion_meat", CookedLion::new);
	public static final RegistryObject<RawLion> RAW_LION = ITEMS.register("lion_meat", RawLion::new);




}
