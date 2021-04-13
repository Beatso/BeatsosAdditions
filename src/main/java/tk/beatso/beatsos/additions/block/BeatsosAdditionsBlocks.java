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
import tk.beatso.beatsos.additions.BeatsosAdditions;
import tk.beatso.beatsos.additions.block.blocks.CarvedPumpkinBlockExtend;
import tk.beatso.beatsos.additions.block.blocks.LadderBlockExtend;
import tk.beatso.beatsos.additions.block.blocks.SoulStoneBlock;
import tk.beatso.beatsos.additions.block.blocks.StairsBlockExtend;

public class BeatsosAdditionsBlocks {

	public static final StairsBlockExtend SMOOTH_STONE_STAIRS = new StairsBlockExtend(Blocks.SMOOTH_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE));
	public static final LadderBlockExtend IRON_LADDER = new LadderBlockExtend(FabricBlockSettings.copyOf(Blocks.LADDER));
	public static final CarvedPumpkinBlockExtend SOUL_JACK_O_LANTERN = new CarvedPumpkinBlockExtend(FabricBlockSettings.copyOf(Blocks.PUMPKIN));
	public static final SoulStoneBlock SOUL_STONE = new SoulStoneBlock();

	public static final void blocks() {
		
		Registry.register(Registry.BLOCK, new Identifier(BeatsosAdditions.MOD_ID, "smooth_stone_stairs"), SMOOTH_STONE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier(BeatsosAdditions.MOD_ID, "smooth_stone_stairs"), new BlockItem(SMOOTH_STONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier(BeatsosAdditions.MOD_ID, "iron_ladder"), IRON_LADDER);
		Registry.register(Registry.ITEM, new Identifier(BeatsosAdditions.MOD_ID, "iron_ladder"), new BlockItem(IRON_LADDER, new Item.Settings().group(ItemGroup.DECORATIONS)));
		BlockRenderLayerMap.INSTANCE.putBlock(IRON_LADDER, RenderLayer.getCutout());

		Registry.register(Registry.BLOCK, new Identifier(BeatsosAdditions.MOD_ID, "soul_jack_o_lantern"), SOUL_JACK_O_LANTERN);
		Registry.register(Registry.ITEM, new Identifier(BeatsosAdditions.MOD_ID, "soul_jack_o_lantern"), new BlockItem(SOUL_JACK_O_LANTERN, new Item.Settings().group(ItemGroup.DECORATIONS)));

		Registry.register(Registry.BLOCK, new Identifier(BeatsosAdditions.MOD_ID, "soul_stone"), SOUL_STONE);
		Registry.register(Registry.ITEM, new Identifier(BeatsosAdditions.MOD_ID, "soul_stone"), new BlockItem(SOUL_STONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

	}
}

