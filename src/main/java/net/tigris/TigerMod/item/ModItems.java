package net.tigris.TigerMod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tigris.TigerMod.TigerMod;

public class ModItems {

    public static final Item RAW_TIGRITE = registerItem("raw_tigrite", new Item(new FabricItemSettings().group(ModItemGroup.TIGRITE)));
    public static final Item TIGRITE = registerItem("tigrite", new Item(new FabricItemSettings().group(ModItemGroup.TIGRITE)));




    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TigerMod.MOD_ID, name), item);

    }


    public static void registerModItems(){
        TigerMod.LOGGER.debug("Register Mod Items pour " + TigerMod.MOD_ID);

    }







}
