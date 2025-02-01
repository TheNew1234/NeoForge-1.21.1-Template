package com.example.examplemod.init;

import com.example.examplemod.TemplateMod;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.UnaryOperator;

public class ModDataComponents {
    public static DeferredRegister<DataComponentType<?>> dataComponents =
            DeferredRegister.create(
                    BuiltInRegistries.DATA_COMPONENT_TYPE,
                    TemplateMod.MODID);

    private static <T> DeferredHolder<DataComponentType<?>, DataComponentType<T>> register(String name,
                                                                                           UnaryOperator<DataComponentType.Builder<T>> builderOperator) {
        return dataComponents.register(name, () -> builderOperator.apply(DataComponentType.builder()).build());
    }
}
