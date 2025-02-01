package com.example.examplemod.events;

import com.example.examplemod.TemplateMod;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientChatEvent;


@EventBusSubscriber(modid = TemplateMod.MODID, bus = EventBusSubscriber.Bus.GAME, value = Dist.CLIENT)
public class ModClientEvents {
    //The reason I created this empty method that has no use is because NeoForge crashes if any EventBusSubscriber doesn't
    //any methods with the annotation SubscribeEvent.
    @SubscribeEvent
    public static void clientChat(ClientChatEvent event) {
        //Do whatever you want
    }
}
