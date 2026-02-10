package com.zaca.zacamod.block;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ZacaBlocks {
    public static final DeferredRegister<Block> BLOCKS = 
        DeferredRegister.create(ForgeRegistries.BLOCKS, "zacamod");

    // Nuestro mineral de sal
    public static final RegistryObject<Block> SAL_ORE = BLOCKS.register("sal_ore",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> ALIUS_ORE = BLOCKS.register("alius_ore",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
