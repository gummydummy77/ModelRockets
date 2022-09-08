package net.fabricmc.modelrockets.main;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.modelrockets.main.items.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemsInitializer {
    public static String modid = "modelrockets";
    //Items
    public static ModItem IRON_DUST, SALT;
    public static final ItemGroup MODEL_ROCKETS_GROUP;

    static {
        IRON_DUST = register(Registry.ITEM, "irondust", new IronDust());
        SALT = register(Registry.ITEM, "salt", new Salt());

        MODEL_ROCKETS_GROUP = FabricItemGroupBuilder.create(
                        new Identifier(modid, "modelrocketsgroup"))
                //.icon(() -> new ItemStack())
                .appendItems(stacks -> {
                    stacks.add(new ItemStack(IRON_DUST));
                    stacks.add(new ItemStack(SALT));
                    stacks.add(new ItemStack(Items.SALMON));
                })
                .build();
    }

    public void Initialize() {}
    public static ModItem register (Registry<Item> Registrytype, String path, Item item) {
        return (ModItem) Registry.register(Registrytype, new Identifier(modid, path), item);
    }
}
