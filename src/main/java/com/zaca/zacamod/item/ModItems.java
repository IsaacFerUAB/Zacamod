package com.zaca.zacamod.item;

import com.zaca.zacamod.ZacaMod; // Importamos tu clase principal para leer el MOD_ID

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    // 1. EL DEFERRED REGISTER (La Lista de Espera)
    // Creamos la lista vacía específica para ITEMS.
    // Le decimos: "Esta lista es para Ítems y pertenece al mod 'zacamod'".

    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, ZacaMod.MOD_ID);


    
    public static final RegistryObject<Item> PEDROLO = ITEMS.register("pedrolo", 
        () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build()).stacksTo(16)));
    
    public static final RegistryObject<Item> JAMON = ITEMS.register("jamon", 
        () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build()).stacksTo(64)));
    
    public static final RegistryObject<Item> BOCATAJAMON = ITEMS.register("bocata_jamon", 
        () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.8f).build()).stacksTo(32)));
        
    public static final RegistryObject<Item> NAVAJA = ITEMS.register("navaja", 
        () -> new Item(new Item.Properties()
        .rarity(Rarity.EPIC)
        .durability(1200)
        ));
    public static final RegistryObject<Item> TENEDOR = ITEMS.register("tenedor", 
        () -> new Item(new Item.Properties()
        .stacksTo(4)));
        
    public static final RegistryObject<Item> SAL = ITEMS.register("sal",
        () -> new Item(new Item.Properties()));

    // 3. EL MÉTODO DE REGISTRO (El Mensajero)
    // Este método es el que llamaremos desde la clase principal para entregar la lista.
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}