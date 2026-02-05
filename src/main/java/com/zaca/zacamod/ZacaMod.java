package com.zaca.zacamod;

import com.zaca.zacamod.item.ModItems;
import com.zaca.zacamod.item.tab.ModCreativeModeTabs;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("zacamod")
public class ZacaMod {
    public static final String MOD_ID = "zacamod";

    public ZacaMod() {
        
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // REGISTRO
        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        

        // Registra el mod en el bus principal de Forge
        MinecraftForge.EVENT_BUS.register(this);
    }
}