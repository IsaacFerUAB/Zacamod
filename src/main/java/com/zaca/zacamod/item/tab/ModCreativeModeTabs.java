package com.zaca.zacamod.item.tab;
import com.zaca.zacamod.item.ModItems;
import com.zaca.zacamod.ZacaMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    // 1. Creamos el registro para las pestañas
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ZacaMod.MOD_ID);

    // 2. Definimos nuestra pestaña personalizada
    public static final RegistryObject<CreativeModeTab> ZACA_TAB = CREATIVE_MODE_TABS.register("zaca_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.NAVAJA.get())) // Icono
                    .title(Component.translatable("zaca_tab")) // Nombre
                    .displayItems((parameters, output) -> {
                        //OBJETOS
                        output.accept(ModItems.NAVAJA.get());
                        output.accept(ModItems.PEDROLO.get());
                        output.accept(ModItems.JAMON.get());
                        output.accept(ModItems.TENEDOR.get());
                        output.accept(ModItems.SAL.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}