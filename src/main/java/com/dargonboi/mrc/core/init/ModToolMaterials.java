package com.dargonboi.mrc.core.init;

import java.util.List;

import com.dargonboi.mrc.MinerCraft;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;




public final class ModToolMaterials {
	
	//For MultiTools
	public static final Tag.Named<Block> PICK_SHOVEL_TAG = BlockTags.createOptional(new ResourceLocation("tag_based_tool_types:minable/my_tool"));
    
	
	public static final Tag.Named<Block> BLUE_NANITARIUM_TAG = BlockTags.createOptional(new ResourceLocation("mrc:needs_blue_nanitarium_tool"));
	public static final Tier BLUE_NANITARIUM = TierSortingRegistry.registerTier(
			new ForgeTier(6 ,3420, 30f, 0, 22, BLUE_NANITARIUM_TAG,() -> Ingredient.of(ModItems.BLUE_NANITARIUM_INGOT.get())),
			new ResourceLocation("mrc:blue_nanitarium"),
			List.of(Tiers.NETHERITE), List.of());
	
	public static final Tag.Named<Block> RED_NANITARIUM_TAG = BlockTags.createOptional(new ResourceLocation("mrc:needs_red_nanitarium_tool"));
	public static final Tier RED_NANITARIUM = TierSortingRegistry.registerTier(
			new ForgeTier(4 ,2680, 12f, 0, 19,RED_NANITARIUM_TAG,() -> Ingredient.of(ModItems.RED_NANITARIUM_INGOT.get())),
			new ResourceLocation("mrc:red_nanitarium"),
			List.of(Tiers.NETHERITE), List.of(BLUE_NANITARIUM));
	
	
	
	@SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new DiggerItem(1, 1, BLUE_NANITARIUM, PICK_SHOVEL_TAG, new Item.Properties().tab(MinerCraft.MINERCRAFT_TOOLS_ARMOR))
        {
            @Override
            public float getDestroySpeed(ItemStack stack, BlockState state)
            {
                if (state.is(BlockTags.MINEABLE_WITH_SHOVEL)) return speed;
                if (state.is(BlockTags.MINEABLE_WITH_PICKAXE)) return speed;
                return super.getDestroySpeed(stack, state);
            }

            @Override
            public boolean isCorrectToolForDrops(ItemStack stack, BlockState state)
            {
                if (state.is(BlockTags.MINEABLE_WITH_PICKAXE))
                    return TierSortingRegistry.isCorrectTierForDrops(BLUE_NANITARIUM, state);
                if (state.is(BlockTags.MINEABLE_WITH_SHOVEL))
                    return TierSortingRegistry.isCorrectTierForDrops(BLUE_NANITARIUM, state);
                if (state.is(PICK_SHOVEL_TAG))
                    return TierSortingRegistry.isCorrectTierForDrops(BLUE_NANITARIUM, state);
                return false;
            }
            
        
        }.setRegistryName("blue_nanitarium_pick_shovel"));
    }

    
	public ModToolMaterials() {
		
	}
	
	
	

}
