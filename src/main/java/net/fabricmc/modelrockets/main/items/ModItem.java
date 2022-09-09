package net.fabricmc.modelrockets.main.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class ModItem extends Item {
    public ModItem(Settings settings) {
        super(settings);
    }

    public ModItem() {
        super(new FabricItemSettings());
    }
}
