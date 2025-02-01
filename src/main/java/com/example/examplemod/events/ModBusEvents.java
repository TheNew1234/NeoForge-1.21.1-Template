package com.example.examplemod.events;

import com.example.examplemod.TemplateMod;
import com.example.examplemod.datagen.BlockAssetsGenerator;
import com.example.examplemod.datagen.DatapackProvider;
import com.example.examplemod.datagen.ItemAssetsGenerator;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
@EventBusSubscriber(modid = TemplateMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModBusEvents {


    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper helper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(
                event.includeClient(),
                new BlockAssetsGenerator(output, helper)
        );

        generator.addProvider(
                event.includeClient(),
                new ItemAssetsGenerator(output, helper)
        );

        generator.addProvider(
                event.includeServer(),
                new DatapackProvider(output, lookupProvider)
        );
    }

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {

    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {

    }
}
