package tk.beatso.beatsos.additions.block;

import tk.beatso.beatsos.additions.block.blocks.IronLadderBlock;
import tk.beatso.beatsos.additions.block.blocks.SmoothStoneStairsBlock;
import tk.beatso.beatsos.additions.block.blocks.SoulJackOLanternBlock;
import tk.beatso.beatsos.additions.block.blocks.SoulStoneBlock;

public class BeatsosAdditionsBlocks {

	public static final IronLadderBlock IRON_LADDER = new IronLadderBlock();
	public static final SmoothStoneStairsBlock SMOOTH_STONE_STAIRS = new SmoothStoneStairsBlock();
	public static final SoulJackOLanternBlock SOUL_JACK_O_LANTERN = new SoulJackOLanternBlock();
	public static final SoulStoneBlock SOUL_STONE = new SoulStoneBlock();

	public static final void blocks() {

		IronLadderBlock.register(IRON_LADDER);
		SmoothStoneStairsBlock.register(SMOOTH_STONE_STAIRS);
		SoulJackOLanternBlock.register(SOUL_JACK_O_LANTERN);
		SoulStoneBlock.register(SOUL_STONE);

	}
}

