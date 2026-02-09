package com.zaca.zacamod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

public class Tique extends Item {
    
    public Tique(Item.Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
    
        if(!level.isClientSide()){
            // Añadimos Cooldown para que no spameen la ruleta como locos (20 ticks = 1 segundo)
            player.getCooldowns().addCooldown(this, 300);
        
            RandomSource tirada = level.getRandom();

            if(tirada.nextFloat() <= 0.2){
                player.sendSystemMessage(Component.literal("Unlucky"));
                player.addEffect(new MobEffectInstance(MobEffects.POISON,100,2));
            }else{
                player.sendSystemMessage(Component.literal("Tique!"));
                player.addEffect(new MobEffectInstance(MobEffects.REGENERATION,100,1));
            }
        }
            // animacion mano
            return InteractionResultHolder.success(player.getItemInHand(hand));
        
    }
    
}