package com.zaca.zacamod.item;

import com.zaca.zacamod.ZacaMod;
import com.zaca.zacamod.util.ModTag; // Si usas tus tags
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {

    // Creamos un material llamado "ZACA"
    public static final Tier ALIUS = TierSortingRegistry.registerTier(
            new ForgeTier(
                    3, // Nivel de minado
                    1800, // Durabilidad
                    8.0f, // Velocidad de minado
                    3.0f, // Daño base extra
                    25, // Probabilidad de encantamiento (Oro tiene 22)
                    BlockTags.NEEDS_IRON_TOOL, // Tag del bloque que necesita (puedes poner BlockTags.NEEDS_IRON_TOOL por ahora)
                    () -> Ingredient.of(ModItems.ALIUS.get()) // Item para reparar (¡Pon aquí tu item principal!)
            ),
            new ResourceLocation(ZacaMod.MOD_ID, "zaca"), // ID único
            List.of(Tiers.IRON), List.of(Tiers.DIAMOND) // Es mejor que Hierro, peor que Diamante
    );
}
