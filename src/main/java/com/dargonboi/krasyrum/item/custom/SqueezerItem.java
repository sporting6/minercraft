package com.dargonboi.krasyrum.item.custom;

import com.dargonboi.krasyrum.item.ModIngots;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import java.util.Random;


public class SqueezerItem extends Item {

    public SqueezerItem(Properties pProperties) {
        super(pProperties);
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        System.out.println("Squeeze Attempted!\n");
        System.out.println(pPlayer.getItemInHand(InteractionHand.OFF_HAND));
        ItemStack offHandCheck = (new ItemStack(ModIngots.LEMON.get(), pPlayer.getItemInHand(InteractionHand.OFF_HAND).getCount()));
        System.out.println(offHandCheck);


        if(pPlayer.getItemInHand(InteractionHand.OFF_HAND).equals(offHandCheck, true)
                && !pPlayer.getItemInHand(InteractionHand.OFF_HAND).equals(ItemStack.EMPTY)){

            System.out.println("Squeeze Successful!\n");

            ItemStack offHand =  new ItemStack(ModIngots.LEMON.get(), (pPlayer.getItemInHand(InteractionHand.OFF_HAND).getCount()-1));
            pPlayer.setItemInHand(InteractionHand.OFF_HAND, offHand);

            ItemStack mainHand =  new ItemStack(ModIngots.SQUEEZER.get());
            mainHand.hurtAndBreak(1, pPlayer,null);
            pPlayer.setItemInHand(InteractionHand.MAIN_HAND, mainHand);

            pPlayer.addEffect(new MobEffectInstance(MobEffects.HUNGER,2, 25));

            pPlayer.addItem(new ItemStack(ModIngots.LEMON_JUICE.get(), 1));
        }
        return super.use(pLevel, pPlayer, pUsedHand);
    }
}
