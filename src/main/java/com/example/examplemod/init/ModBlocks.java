package com.example.examplemod.init;

import com.example.examplemod.TemplateMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks blocks = DeferredRegister.createBlocks(
            TemplateMod.MODID
    );

    private static <T extends Block> DeferredBlock<T> register(String name, Supplier<T> block) {
        ModItems.items.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return blocks.register(name, block);
    }
}
