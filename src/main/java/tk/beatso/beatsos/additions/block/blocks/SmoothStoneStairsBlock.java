package tk.beatso.beatsos.additions.block.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tk.beatso.beatsos.additions.BeatsosAdditions;

public class SmoothStoneStairsBlock extends StairsBlock {
	
	public SmoothStoneStairsBlock() {
		super(Blocks.SMOOTH_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE));
	}

	public static SmoothStoneStairsBlock register() {
		Identifier id = new Identifier(BeatsosAdditions.MOD_ID, "smooth_stone_stairs");
		SmoothStoneStairsBlock block = new SmoothStoneStairsBlock();
		final BlockItem blockItem = new BlockItem(block, new Item.Settings().group(ItemGroup.DECORATIONS));
		Registry.register(Registry.BLOCK, id, block);
		Registry.register(Registry.ITEM, id, blockItem);
		return block;
	}
	
}
