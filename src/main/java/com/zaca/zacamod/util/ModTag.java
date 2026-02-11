package com.zaca.zacamod.util;

import com.zaca.zacamod.ZacaMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTag {

    public static class Blocks {
        // Aquí definiremos tus tags de BLOQUES
        // public static final TagKey<Block> DETECTOR_VALIOSOS = tag("detector_valiosos");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ZacaMod.MOD_ID, name));
        }
    }

    public static class Items {
        // Aquí definiremos tus tags de ITEMS
        // public static final TagKey<Item> COMBUSTIBLE_NUEVO = tag("combustible_nuevo");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(ZacaMod.MOD_ID, name));
        }
    }
}