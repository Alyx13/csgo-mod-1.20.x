package net.castbound.csgomod.item;

import net.castbound.csgomod.CsgoMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MODDED_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CsgoMod.MOD_ID, "modded_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.modded_group"))
                    .icon(() -> new ItemStack(ModItems.C4)).entries((displayContext, entries) -> {
                        // Modded Items
                        entries.add(ModItems.C4);
                        entries.add(ModItems.AMMO);
                        entries.add(ModItems.BULLETSHELL);

                        // Vanilla Minecraft Items
                        entries.add(Items.GUNPOWDER);

                    }).build());

    public static void registerItemGroups() {

        CsgoMod.LOGGER.info("Registering Item Groups for " + CsgoMod.MOD_ID);
    }
}
