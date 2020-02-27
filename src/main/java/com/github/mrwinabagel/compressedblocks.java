package com.github.mrwinabagel;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class compressedblocks implements ModInitializer {

	private static final Block COMPRESSED_COBBLESTONE = new CompressedCobblestone(FabricBlockSettings.of(Material.STONE).strength(3, 40).build());
	private static final Item COMPRESSED_COBBLESTONE_ITEM = new BlockItem(COMPRESSED_COBBLESTONE, new Item.Settings().group(ItemGroup.MATERIALS));
	private static final Block COMPRESSED_COBBLESTONE2 = new CompressedCobblestone(FabricBlockSettings.of(Material.STONE).strength(4, 100).build());
	private static final Item COMPRESSED_COBBLESTONE2_ITEM = new BlockItem(COMPRESSED_COBBLESTONE2, new Item.Settings().group(ItemGroup.MATERIALS));
	private static final Block COMPRESSED_COBBLESTONE3 = new CompressedCobblestone(FabricBlockSettings.of(Material.STONE).strength(6, 200).build());
	private static final Item COMPRESSED_COBBLESTONE3_ITEM = new BlockItem(COMPRESSED_COBBLESTONE3, new Item.Settings().group(ItemGroup.MATERIALS));
	private static final Block COMPRESSED_COBBLESTONE4 = new CompressedCobblestone(FabricBlockSettings.of(Material.STONE).strength(8, 5000).build());
	private static final Item COMPRESSED_COBBLESTONE4_ITEM = new BlockItem(COMPRESSED_COBBLESTONE4, new Item.Settings().group(ItemGroup.MATERIALS));
	private static final Block COMPRESSED_COBBLESTONE5 = new CompressedCobblestone(FabricBlockSettings.of(Material.STONE).strength(10, 10000).build());
	private static final Item COMPRESSED_COBBLESTONE5_ITEM = new BlockItem(COMPRESSED_COBBLESTONE5, new Item.Settings().group(ItemGroup.MATERIALS));
	private static final Block COMPRESSED_COBBLESTONE6 = new CompressedCobblestone(FabricBlockSettings.of(Material.STONE).strength(12, 100000).build());
	private static final Item COMPRESSED_COBBLESTONE6_ITEM = new BlockItem(COMPRESSED_COBBLESTONE6, new Item.Settings().group(ItemGroup.MATERIALS));
	private static final Block COMPRESSED_COBBLESTONE7 = new CompressedCobblestone(FabricBlockSettings.of(Material.STONE).strength(16, 18000000).build());
	private static final Item COMPRESSED_COBBLESTONE7_ITEM = new BlockItem(COMPRESSED_COBBLESTONE7, new Item.Settings().group(ItemGroup.MATERIALS));
	private static final Block COMPRESSED_COBBLESTONE8 = new CompressedCobblestone(FabricBlockSettings.of(Material.STONE).strength(20, 18000000).build());
	private static final Item COMPRESSED_COBBLESTONE8_ITEM = new BlockItem(COMPRESSED_COBBLESTONE8, new Item.Settings().group(ItemGroup.MATERIALS));

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("compressedblocks", "compressed_cobblestone_x1"), COMPRESSED_COBBLESTONE);
		Registry.register(Registry.ITEM, new Identifier("compressedblocks", "compressed_cobblestone_x1"), COMPRESSED_COBBLESTONE_ITEM);
		Registry.register(Registry.BLOCK, new Identifier("compressedblocks", "compressed_cobblestone_x2"), COMPRESSED_COBBLESTONE2);
		Registry.register(Registry.ITEM, new Identifier("compressedblocks", "compressed_cobblestone_x2"), COMPRESSED_COBBLESTONE2_ITEM);
		Registry.register(Registry.BLOCK, new Identifier("compressedblocks", "compressed_cobblestone_x3"), COMPRESSED_COBBLESTONE3);
		Registry.register(Registry.ITEM, new Identifier("compressedblocks", "compressed_cobblestone_x3"), COMPRESSED_COBBLESTONE3_ITEM);
		Registry.register(Registry.BLOCK, new Identifier("compressedblocks", "compressed_cobblestone_x4"), COMPRESSED_COBBLESTONE4);
		Registry.register(Registry.ITEM, new Identifier("compressedblocks", "compressed_cobblestone_x4"), COMPRESSED_COBBLESTONE4_ITEM);
		Registry.register(Registry.BLOCK, new Identifier("compressedblocks", "compressed_cobblestone_x5"), COMPRESSED_COBBLESTONE5);
		Registry.register(Registry.ITEM, new Identifier("compressedblocks", "compressed_cobblestone_x5"), COMPRESSED_COBBLESTONE5_ITEM);
		Registry.register(Registry.BLOCK, new Identifier("compressedblocks", "compressed_cobblestone_x6"), COMPRESSED_COBBLESTONE6);
		Registry.register(Registry.ITEM, new Identifier("compressedblocks", "compressed_cobblestone_x6"), COMPRESSED_COBBLESTONE6_ITEM);
		Registry.register(Registry.BLOCK, new Identifier("compressedblocks", "compressed_cobblestone_x7"), COMPRESSED_COBBLESTONE7);
		Registry.register(Registry.ITEM, new Identifier("compressedblocks", "compressed_cobblestone_x7"), COMPRESSED_COBBLESTONE7_ITEM);
		Registry.register(Registry.BLOCK, new Identifier("compressedblocks", "compressed_cobblestone_x8"), COMPRESSED_COBBLESTONE8);
		Registry.register(Registry.ITEM, new Identifier("compressedblocks", "compressed_cobblestone_x8"), COMPRESSED_COBBLESTONE8_ITEM);
	}
}
