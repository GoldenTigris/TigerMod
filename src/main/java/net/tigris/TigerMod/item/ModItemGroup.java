package net.tigris.TigerMod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.tigris.TigerMod.TigerMod;

public class ModItemGroup {

public static final ItemGroup TIGRITE = FabricItemGroupBuilder.build(
        new Identifier(TigerMod.MOD_ID, "tigrite"), () -> new ItemStack(ModItems.TIGRITE));






}
