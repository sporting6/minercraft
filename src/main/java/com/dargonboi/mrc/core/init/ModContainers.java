package com.dargonboi.mrc.core.init;

import com.dargonboi.mrc.MinerCraft;
import com.dargonboi.mrc.common.container.DiamondChestContainer;
import com.dargonboi.mrc.common.container.IronChestContainer;
import com.dargonboi.mrc.common.container.NanitariumChestContainer;
import com.dargonboi.mrc.common.container.NetheriteChestContainer;

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

	public static final RegistryObject<MenuType<DiamondChestContainer>> DIAMOND_CHEST = CONTAINERS
			.register("diamond_chest", () -> new MenuType<>(DiamondChestContainer::new));

	public static final RegistryObject<MenuType<NetheriteChestContainer>> NETHERITE_CHEST = CONTAINERS
			.register("netherite_chest", () -> new MenuType<>(NetheriteChestContainer::new));
	
	public static final RegistryObject<MenuType<NanitariumChestContainer>> NANITARIUM_CHEST = CONTAINERS
			.register("nanitarium_chest", () -> new MenuType<>(NanitariumChestContainer::new));


}
