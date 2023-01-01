package com.dargonboi.krasyrum.screen;

import com.dargonboi.krasyrum.Krasyrum;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {

    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, Krasyrum.MODID);

    public static final RegistryObject<MenuType<InfusionChamberMenu>> INFUSION_CHAMBER_MENU =
            registerMenuType(InfusionChamberMenu::new, "infusion_chamber_menu");
    public static final RegistryObject<MenuType<CondenserMenu>> CONDENSER_MENU =
            registerMenuType(CondenserMenu::new, "condenser_menu");
    public static final RegistryObject<MenuType<StrainerMenu>> STRAINER_MENU =
            registerMenuType(StrainerMenu::new, "strainer_menu");
    public static final RegistryObject<MenuType<ForgeMenu>> FORGE_MENU =
            registerMenuType(ForgeMenu::new, "forge_menu");



    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory, String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
