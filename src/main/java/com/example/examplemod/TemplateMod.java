package com.example.examplemod;

import com.example.examplemod.init.*;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@Mod(TemplateMod.MODID)
public class TemplateMod
{
    public static final String MODID = "template";

    public static final Logger LOGGER = LogUtils.getLogger();

    public TemplateMod(IEventBus bus, ModContainer modContainer) {
        ModBlocks.blocks.register(bus);
        ModItems.items.register(bus);
        ModBlockEntities.blockEntityTypes.register(bus);
        ModSounds.SOUND_EVENTS.register(bus);
        ModCreativeTabs.creativeTabs.register(bus);
        ModDataComponents.dataComponents.register(bus);
        ModEntities.entityTypes.register(bus);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
