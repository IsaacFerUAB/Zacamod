package com.zaca.zacamod.item;

import com.zaca.zacamod.ZacaMod; // Importamos tu clase principal para leer el MOD_ID
import com.zaca.zacamod.block.ZacaBlocks;
import com.zaca.zacamod.item.custom.Tique;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
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


    //ARMAS / HERAMIENTAS
    public static final RegistryObject<Item> NAVAJA = ITEMS.register("navaja", 
        () -> new Item(new Item.Properties()
        .rarity(Rarity.EPIC)
        .durability(1200)
        ));

    
    
    //MATERIALES / OTROS
    public static final RegistryObject<Item> PEDROLO = ITEMS.register("pedrolo", 
        () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build()).stacksTo(16)));
    
    public static final RegistryObject<Item> SAL = ITEMS.register("sal",
        () -> new Item(new Item.Properties()));

    //PIEDRA ALIUS
    public static final RegistryObject<Item> ALIUS = ITEMS.register("alius",
        () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> ALIUS_ORE = ITEMS.register("alius_ore",
        () -> new BlockItem(ZacaBlocks.ALIUS_ORE.get(), new Item.Properties()));

    public static final RegistryObject<Item> ALIUS_BLOCK = ITEMS.register("alius_block",
        () -> new BlockItem(ZacaBlocks.ALIUS_BLOCK.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> TIQUE = ITEMS.register("tique",
        () -> new Tique(new Item.Properties().durability(500).rarity(Rarity.RARE)));
    //COMIDA
    public static final RegistryObject<Item> JAMON = ITEMS.register("jamon", 
        () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build()).stacksTo(64)));
    
    public static final RegistryObject<Item> BOCATAJAMON = ITEMS.register("bocata_jamon", 
        () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.8f).build()).stacksTo(32)));
        
    public static final RegistryObject<Item> SAL_ORE = ITEMS.register("sal_ore",
        () -> new BlockItem(ZacaBlocks.SAL_ORE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> OCTA = ITEMS.register("octapelao", 
        () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.8f).build()).stacksTo(32)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



    //ARAMS HERRAMIENTSAS


    public static final RegistryObject<Item> TENEDOR = ITEMS.register("tenedor",
            () -> new SwordItem(
                    ModToolTiers.ALIUS, // Tu material
                    4, // Daño de ataque ADICIONAL (3 + 3 del material + 1 base = 7 daño total)
                    -2.0f, // Velocidad de ataque (Siempre usa -2.4f para que se sienta como una espada normal)
                    new Item.Properties()
            ));









}