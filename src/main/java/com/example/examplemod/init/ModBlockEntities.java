package com.example.examplemod.init;

import com.example.examplemod.TemplateMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static DeferredRegister<BlockEntityType<?>> blockEntityTypes =
            DeferredRegister.create(
                    Registries.BLOCK_ENTITY_TYPE,
                    TemplateMod.MODID
            );

    private static <T extends BlockEntity> Supplier<BlockEntityType<T>> register(String name, Block block, BlockEntityType.BlockEntitySupplier<T> blockEntity) {
        return blockEntityTypes.register(
                name,
                () -> BlockEntityType.Builder.of(
                                blockEntity,
                                block
                        )
                        .build(null)
        );
    }
}
