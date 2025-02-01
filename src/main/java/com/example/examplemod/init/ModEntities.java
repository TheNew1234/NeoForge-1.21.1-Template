package com.example.examplemod.init;

import com.example.examplemod.TemplateMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> entityTypes =
            DeferredRegister.create(
                    BuiltInRegistries.ENTITY_TYPE,
                    TemplateMod.MODID
            );
}
