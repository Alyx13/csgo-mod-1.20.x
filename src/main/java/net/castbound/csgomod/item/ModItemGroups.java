package net.castbound.csgomod.item;

import net.castbound.csgomod.CsgoMod;
import net.castbound.csgomod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TUTORIAL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CsgoMod.MOD_ID, "tutorial_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tutorial_group"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {

                        // Modded Items
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);


                        // Modded Blocks
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);

                    }).build());

    public static final ItemGroup CSGO_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CsgoMod.MOD_ID, "csgo_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.csgo_group"))
                    .icon(() -> new ItemStack(ModItems.C4)).entries((displayContext, entries) -> {

                        // C4 item
                        entries.add(ModItems.C4);

                        // CSGO utilities
                        entries.add(ModItems.MOLOTOV);
//                        entries.add(ModItems.INCENDIARY);
//                        entries.add(ModItems.HE_GRENADE);
                        entries.add(ModItems.SMOKE);
//                        entries.add(ModItems.FLASHBANG);
//                        entries.add(ModItems.DECOY);

                        // Vanilla Minecraft Items
                        entries.add(Items.GUNPOWDER);

                    }).build());

    public static void registerItemGroups() {

        CsgoMod.LOGGER.info("Registering Item Groups for " + CsgoMod.MOD_ID);
    }
}
