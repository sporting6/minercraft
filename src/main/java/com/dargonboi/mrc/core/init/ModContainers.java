package com.dargonboi.mrc.core.init;

import com.dargonboi.mrc.MinerCraft;
import com.dargonboi.mrc.common.container.IronChestContainer;

import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModContainers {

	private ModContainers() {
	}

	public static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS,
			MinerCraft.MODID);

	public static final RegistryObject<MenuType<IronChestContainer>> IRON_CHEST = CONTAINERS.register("iron_chest",
			() -> new MenuType<>(IronChestContainer::new));

}
