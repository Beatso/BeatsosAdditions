package tk.beatso.beatsos.additions.block;

import tk.beatso.beatsos.additions.block.blocks.IronLadderBlock;
import tk.beatso.beatsos.additions.block.blocks.SmoothStoneStairsBlock;
import tk.beatso.beatsos.additions.block.blocks.SoulJackOLanternBlock;
import tk.beatso.beatsos.additions.block.blocks.SoulStoneBlock;

public class BeatsosAdditionsBlocks {

	public static IronLadderBlock IRON_LADDER;
	public static SmoothStoneStairsBlock SMOOTH_STONE_STAIRS;
	public static SoulJackOLanternBlock SOUL_JACK_O_LANTERN;
	public static SoulStoneBlock SOUL_STONE;

	public static final void blocks() {

		IRON_LADDER = IronLadderBlock.register();
		SMOOTH_STONE_STAIRS = SmoothStoneStairsBlock.register();
		SOUL_JACK_O_LANTERN = SoulJackOLanternBlock.register();
		SOUL_STONE = SoulStoneBlock.register();

	}
}

