package overwhelmed.overwhelmed.registry;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import overwhelmed.overwhelmed.Overwhelmed;
import overwhelmed.overwhelmed.world.item.SnailSpawnEggItem;


import static overwhelmed.overwhelmed.registry.CreativeTabRegistry.MY_TAB;

public class ItemRegistry {
    public static RegistrySupplier<Item> snailShellItem;
    public static RegistrySupplier<Item> gooBallItem;
    public static RegistrySupplier<Item> goldBeadItem;
    public static RegistrySupplier<Item> iceCrystalShardItem;
    public static RegistrySupplier<Item> iceCubeItem;
    public static RegistrySupplier<Item> pebbleItem;
    public static RegistrySupplier<SnailSpawnEggItem> snailSpawnEggItem;

    public static void registerItems() {
        snailShellItem = Overwhelmed.items.register(new ResourceLocation(Overwhelmed.MOD_ID, "snail_shell"), () ->
                new Item(new Item.Properties()
                        .stacksTo(64)
                        .rarity(Rarity.COMMON)
                        .arch$tab(MY_TAB)));
        gooBallItem = Overwhelmed.items.register(new ResourceLocation(Overwhelmed.MOD_ID, "goo_ball"), () ->
                new Item(new Item.Properties()
                        .stacksTo(64)
                        .rarity(Rarity.COMMON)
                        .arch$tab(MY_TAB)));
        goldBeadItem = Overwhelmed.items.register(new ResourceLocation(Overwhelmed.MOD_ID, "gold_bead"), () ->
                new Item(new Item.Properties()
                        .stacksTo(64)
                        .rarity(Rarity.UNCOMMON)
                        .arch$tab(MY_TAB)));
        iceCrystalShardItem = Overwhelmed.items.register(new ResourceLocation(Overwhelmed.MOD_ID, "ice_crystal_shard"), () ->
                new Item(new Item.Properties()
                        .stacksTo(64)
                        .rarity(Rarity.UNCOMMON)
                        .arch$tab(CreativeModeTabs.INGREDIENTS)));
        iceCubeItem = Overwhelmed.items.register(new ResourceLocation(Overwhelmed.MOD_ID, "ice_cube"), () ->
                new Item(new Item.Properties()
                        .stacksTo(64)
                        .rarity(Rarity.COMMON)
                        .arch$tab(MY_TAB)));
        pebbleItem = Overwhelmed.items.register(new ResourceLocation(Overwhelmed.MOD_ID, "pebble"), () ->
                new Item(new Item.Properties()
                        .stacksTo(64)
                        .rarity(Rarity.COMMON)
                        .arch$tab(MY_TAB)));

        snailSpawnEggItem = Overwhelmed.items.register(new ResourceLocation(Overwhelmed.MOD_ID, "snail_spawn_egg"), () ->
                new SnailSpawnEggItem(new Item.Properties()
                        .arch$tab(MY_TAB)));
    }


}
