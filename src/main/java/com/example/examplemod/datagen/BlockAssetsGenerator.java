package com.example.examplemod.datagen;

import com.example.examplemod.TemplateMod;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class BlockAssetsGenerator extends BlockStateProvider {
    public BlockAssetsGenerator(PackOutput output,ExistingFileHelper exFileHelper) {
        super(output, TemplateMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
    }

    private void simpleBlockWithItem(Block block) {
        simpleBlock(block);
        simpleBlockItem(block, models().getExistingFile(blockTexture(block)));
    }
}
