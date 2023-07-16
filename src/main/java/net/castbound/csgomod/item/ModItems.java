package net.castbound.csgomod.item;

import net.castbound.csgomod.CsgoMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // Custom tutorial items
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

    // Csgo Utilities
    public static final Item C4 = registerItem("c4", new Item(new FabricItemSettings()));
    public static final Item MOLOTOV = registerItem("molotov", new Item(new FabricItemSettings()));
//    public static final Item INCENDIARY = registerItem("INCENDIARY", new Item(new FabricItemSettings()));
//    public static final Item HE_GRENADE = registerItem("he_grenade", new Item(new FabricItemSettings()));
    public static final Item SMOKE = registerItem("smoke", new Item(new FabricItemSettings()));
//    public static final Item FLASHBANG = registerItem("flashbang", new Item(new FabricItemSettings()));
//    public static final Item DECOY = registerItem("decoy", new Item(new FabricItemSettings()));

    // T side weapons

    // Any Item which is added to this means it is an ingredient item.
    private static void addItemsToIngredientsTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }
    private static void addItemsToCombatTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(C4);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CsgoMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CsgoMod.LOGGER.info("Registering Mod Items for " + CsgoMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatTabItemGroup);
    }
}
