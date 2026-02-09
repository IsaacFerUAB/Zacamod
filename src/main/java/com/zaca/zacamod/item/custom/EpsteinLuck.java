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

public class EpsteinLuck extends Item {
    
    public EpsteinLuck(Item.Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
    
            // Añadimos Cooldown para que no spameen la ruleta como locos (20 ticks = 1 segundo)
            player.getCooldowns().addCooldown(this, 40);
        
        RandomSource tirada = level.getRandom();

        if(tirada.nextFloat() <= 0.5){
            player.sendSystemMessage(Component.literal("Epstein te ha penetrado muuy duro."));
            player.setDeltaMovement(0, 1.5, 0); 
            player.hurtMarked = true;
        }else{
            player.sendSystemMessage(Component.literal("¡Has tenido suerte!"));
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION,100,1));
        }
        

        // Esto hace que la mano haga la animación de "usar"
        return InteractionResultHolder.success(player.getItemInHand(hand));
    }
    
}