package com.example.examplemod.datagen;

import com.example.examplemod.TemplateMod;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ItemAssetsGenerator extends ItemModelProvider {
    public ItemAssetsGenerator(PackOutput output,ExistingFileHelper existingFileHelper) {
        super(output, TemplateMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
    }
}
