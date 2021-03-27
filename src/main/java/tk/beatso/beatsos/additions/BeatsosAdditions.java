package tk.beatso.beatsos.additions;

import net.fabricmc.api.ModInitializer;
import tk.beatso.beatsos.additions.block.BeatsosAdditionsBlocks;

public class BeatsosAdditions implements ModInitializer {

	@Override
	public void onInitialize() {
		
		System.out.println("Hello Fabric world!");

		BeatsosAdditionsBlocks.blocks();

	}
}
