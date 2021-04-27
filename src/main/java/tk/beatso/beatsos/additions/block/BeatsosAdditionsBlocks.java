package tk.beatso.beatsos.additions.block;

import tk.beatso.beatsos.additions.block.blocks.IronLadderBlock;
import tk.beatso.beatsos.additions.block.blocks.SmoothStoneStairsBlock;
import tk.beatso.beatsos.additions.block.blocks.SoulJackOLanternBlock;
import tk.beatso.beatsos.additions.block.blocks.SoulStoneBlock;

public class BeatsosAdditionsBlocks {

	// public static final SmoothStoneStairsBlock SMOOTH_STONE_STAIRS = new SmoothStoneStairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE));
	// public static final SoulStoneBlock SOUL_STONE = new SoulStoneBlock();

	public static final IronLadderBlock IRON_LADDER = new IronLadderBlock();
	public static final SmoothStoneStairsBlock SMOOTH_STONE_STAIRS = new SmoothStoneStairsBlock();
	public static final SoulJackOLanternBlock SOUL_JACK_O_LANTERN = new SoulJackOLanternBlock();
	public static final SoulStoneBlock SOUL_STONE = new SoulStoneBlock();

	public static final void blocks() {

		// Registry.register(Registry.BLOCK, new Identifier(BeatsosAdditions.MOD_ID, "smooth_stone_stairs"), SMOOTH_STONE_STAIRS);
		// Registry.register(Registry.ITEM, new Identifier(BeatsosAdditions.MOD_ID, "smooth_stone_stairs"), new BlockItem(SMOOTH_STONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		IronLadderBlock.register(IRON_LADDER);
		SmoothStoneStairsBlock.register(SMOOTH_STONE_STAIRS);
		SoulJackOLanternBlock.register(SOUL_JACK_O_LANTERN);
		SoulStoneBlock.register(SOUL_STONE);

	}
}

