package net.tigris.TigerMod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.tigris.TigerMod.TigerMod;
import net.tigris.TigerMod.item.ModItemGroup;


public class ModBlocks {

    public static final Block TIGRITE_BLOCK = registerBlock("tigrite_block",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2f).requiresTool()), ModItemGroup.TIGRITE);

    public static final Block TIGRITE_ORE = registerBlock("tigrite_ore",
            new OreBlock(FabricBlockSettings.of(Material.SPONGE).strength(2f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.TIGRITE);

    public static final Block DEEPSLATE_TIGRITE_ORE = registerBlock("deepslate_tigrite_ore",
            new OreBlock(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.TIGRITE);



    private static Block registerBlock(String name, Block block, ItemGroup tab){
registerBlockItem(name, block, tab);
return Registry.register(Registry.BLOCK, new Identifier(TigerMod.MOD_ID, name), block);



    }

private static Item registerBlockItem(String name, Block block, ItemGroup tab){
return Registry.register(Registry.ITEM, new Identifier(TigerMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(tab)));


}






public static void registerModBlocks(){

    TigerMod.LOGGER.debug("Register ModBlock for" + TigerMod.MOD_ID);
}






}




