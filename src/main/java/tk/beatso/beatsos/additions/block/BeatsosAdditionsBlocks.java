package tk.beatso.beatsos.additions.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BeatsosAdditionsBlocks {

	public static final StairsBlockExtend SMOOTH_STONE_STAIRS = new StairsBlockExtend(Blocks.SMOOTH_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE));

	public static final void blocks() {
		
		Registry.register(Registry.BLOCK, new Identifier("beatsosadditions", "smooth_stone_stairs"), SMOOTH_STONE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("beatsosadditions", "smooth_stone_stairs"), new BlockItem(SMOOTH_STONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

	}
}

