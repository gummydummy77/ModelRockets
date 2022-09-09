package net.fabricmc.modelrockets.main;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.modelrockets.main.items.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ItemsInitializer {
    public static String modid = "modelrockets";
    //Items
    public static ModItem IRON_DUST, SALT, POTASSIUM_NITRATE, AMMONIUM_NITRATE, SODIUM_NITRATE, IRON_OXIDE, DEXTRIN;
    public static Item SALTY_WATER_BUCKET;
    public static final ItemGroup MODEL_ROCKETS_GROUP;

    static {
        //TODO after making the mortar block make the iron dust crafting recipe.
        IRON_DUST = (ModItem)register(Registry.ITEM, "iron_dust", new ModItem());
        SALT = (ModItem)register(Registry.ITEM, "salt", new Salt());
        POTASSIUM_NITRATE = (ModItem)register(Registry.ITEM, "potassium_nitrate", new PotassiumNitrate());
        AMMONIUM_NITRATE = (ModItem)register(Registry.ITEM, "ammonium_nitrate", new AmmoniumNitrate());
        SODIUM_NITRATE = (ModItem)register(Registry.ITEM, "sodium_nitrate", new SodiumNitrate());
        IRON_OXIDE = (ModItem)register(Registry.ITEM, "iron_oxide", new IronOxide());
        DEXTRIN = (ModItem)register(Registry.ITEM, "dextrin", new Dextrin());
        //TODO fix the crafting recipe for salty water bucket (leaves the bucket behind)
        //TODO fix the smelting recipe using the salty water bucket (bucket disappears)
        SALTY_WATER_BUCKET = register(Registry.ITEM , "salty_water_bucket", (Item)(new BucketItem(Fluids.WATER, (new Item.Settings()).recipeRemainder(Items.BUCKET).maxCount(1).group(ItemGroup.MISC))));


        MODEL_ROCKETS_GROUP = FabricItemGroupBuilder.create(
                        new Identifier(modid, "modelrocketsgroup"))
                //.icon(() -> new ItemStack())
                .appendItems(stacks -> {
                    stacks.add(new ItemStack(IRON_DUST));
                    stacks.add(new ItemStack(IRON_OXIDE));
                    stacks.add(new ItemStack(SALT));
                    stacks.add(new ItemStack(SODIUM_NITRATE));
                    stacks.add(new ItemStack(SALTY_WATER_BUCKET));
                    stacks.add(new ItemStack(POTASSIUM_NITRATE));
                    stacks.add(new ItemStack(AMMONIUM_NITRATE));

                    stacks.add(new ItemStack(DEXTRIN));

                })
                .build();
    }

    public void Initialize() {} //Don't have a need for it right now? still there for future use though.

    public static Item register (Registry<Item> Registrytype, String path, Item item) {
        return Registry.register(Registrytype, new Identifier(modid, path), item);
    }
}
