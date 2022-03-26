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
			new ForgeTier(5 ,2670, 10f, 0, 16, BLUE_NANITARIUM_TAG,() -> Ingredient.of(ModItems.BLUE_NANITARIUM_INGOT.get())),
			new ResourceLocation("mrc:blue_nanitarium"),
			List.of(Tiers.NETHERITE), List.of());
	
	public static final Tag.Named<Block> KYRANIUM_TAG = BlockTags.createOptional(new ResourceLocation("mrc:needs_kyranium_tool"));
	public static final Tier KYRANIUM = TierSortingRegistry.registerTier(
			new ForgeTier(6 ,4200, 33f, 4, 26, KYRANIUM_TAG,() -> Ingredient.of(ModItems.KYRANIUM_INGOT.get())),
			new ResourceLocation("mrc:kyranium"),
			List.of(BLUE_NANITARIUM), List.of());
	
	
	public static final Tag.Named<Block> RED_NANITARIUM_TAG = BlockTags.createOptional(new ResourceLocation("mrc:needs_red_nanitarium_tool"));
	public static final Tier RED_NANITARIUM = TierSortingRegistry.registerTier(
			new ForgeTier(5 ,2100, 8f, 0, 19,RED_NANITARIUM_TAG,() -> Ingredient.of(ModItems.RED_NANITARIUM_INGOT.get())),
			new ResourceLocation("mrc:red_nanitarium"),
			List.of(Tiers.NETHERITE), List.of(BLUE_NANITARIUM));
	
	
	public static final Tag.Named<Block> VERANIUM_TAG = BlockTags.createOptional(new ResourceLocation("mrc:needs_veranium_tool"));
	public static final Tier VERANIUM = TierSortingRegistry.registerTier(
			new ForgeTier(3 ,1869, 100f, 0, 27,VERANIUM_TAG,() -> Ingredient.of(ModItems.VERANIUM_INGOT.get())),
			new ResourceLocation("mrc:veranium"),
			List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
	
	public static final Tag.Named<Block> TITANIUM_TAG = BlockTags.createOptional(new ResourceLocation("mrc:needs_titanium_tool"));
	public static final Tier TITANIUM = TierSortingRegistry.registerTier(
			new ForgeTier(2 ,500, 7.5f, 0, 12,TITANIUM_TAG,() -> Ingredient.of(ModItems.TITANIUM_INGOT.get())),
			new ResourceLocation("mrc:titanium"),
			List.of(Tiers.IRON), List.of(VERANIUM));
	
	public static final Tag.Named<Block> RUBY_TAG = BlockTags.createOptional(new ResourceLocation("mrc:needs_ruby_tool"));
	public static final Tier RUBY = TierSortingRegistry.registerTier(
			new ForgeTier(2 ,700, 10f, 0, 18,RUBY_TAG,() -> Ingredient.of(ModItems.RUBY.get())),
			new ResourceLocation("mrc:ruby"),
			List.of(Tiers.IRON), List.of(TITANIUM));
	
	
	
	
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
