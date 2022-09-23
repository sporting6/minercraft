package com.dargonboi.krasyrum.block.entity;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.block.ModBlocks;
import com.dargonboi.krasyrum.block.entity.custom.CondenserBlockEntity;
import com.dargonboi.krasyrum.block.entity.custom.InfusionChamberBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Krasyrum.MODID);

    public static final RegistryObject<BlockEntityType<InfusionChamberBlockEntity>> INFUSION_CHAMBER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("infusion_chamber_block_entity",
                    () -> BlockEntityType.Builder.of(InfusionChamberBlockEntity::new,
                            ModBlocks.INFUSION_CHAMBER.get()).build(null));

    public static final RegistryObject<BlockEntityType<CondenserBlockEntity>> CONDENSER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("condenser_block_entity",
                    () -> BlockEntityType.Builder.of(CondenserBlockEntity::new,
                            ModBlocks.CONDENSER.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
