package com.example.examplemod.init;

import com.example.examplemod.TemplateMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static DeferredRegister<CreativeModeTab> creativeTabs =
            DeferredRegister.create(
                    BuiltInRegistries.CREATIVE_MODE_TAB,
                    TemplateMod.MODID
            );

    public static Supplier<CreativeModeTab> register(String name, Component title, CreativeModeTab.DisplayItemsGenerator itemsGenerator) {
        return creativeTabs.register(name, () -> CreativeModeTab.builder()
                .title(title)
                .displayItems(itemsGenerator)
                .build()
        );
    }
}
