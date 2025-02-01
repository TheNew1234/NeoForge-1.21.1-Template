package com.example.examplemod.events;

import com.example.examplemod.TemplateMod;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@EventBusSubscriber(modid = TemplateMod.MODID,bus = EventBusSubscriber.Bus.GAME, value = Dist.DEDICATED_SERVER)
public class ModEvents {
    @SubscribeEvent
    public static void addToTab(final BuildCreativeModeTabContentsEvent event) {
    }
}
