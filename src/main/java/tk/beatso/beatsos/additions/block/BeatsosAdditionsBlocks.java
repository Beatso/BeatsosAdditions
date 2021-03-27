package tk.beatso.beatsos.additions.block;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BeatsosAdditionsBlocks {

	public static final StairsBlockExtend SMOOTH_STONE_STAIRS = new StairsBlockExtend(Blocks.SMOOTH_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE));
	public static final LadderBlockExtend IRON_LADDER = new LadderBlockExtend(FabricBlockSettings.copyOf(Blocks.LADDER));

	public static final void blocks() {
		
		Registry.register(Registry.BLOCK, new Identifier("beatsosadditions", "smooth_stone_stairs"), SMOOTH_STONE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("beatsosadditions", "smooth_stone_stairs"), new BlockItem(SMOOTH_STONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier("beatsosadditions", "iron_ladder"), IRON_LADDER);
		Registry.register(Registry.ITEM, new Identifier("beatsosadditions", "iron_ladder"), new BlockItem(IRON_LADDER, new Item.Settings().group(ItemGroup.DECORATIONS)));
		BlockRenderLayerMap.INSTANCE.putBlock(IRON_LADDER, RenderLayer.getCutout());

	}
}

