package tk.beatso.beatsos.additions;

import net.fabricmc.api.ModInitializer;
import tk.beatso.beatsos.additions.block.BeatsosAdditionsBlocks;
import tk.beatso.beatsos.additions.feature.BeatsosAdditionsFeatures;
import tk.beatso.beatsos.additions.item.BeatsosAdditionsItems;
import tk.beatso.beatsos.additions.statuseffect.BeatsosAdditionsStatusEffects;

public class BeatsosAdditions implements ModInitializer {

	public static final String MOD_ID = "beatsosadditions";

	@Override
	public void onInitialize() {
		
		BeatsosAdditionsBlocks.blocks();
		BeatsosAdditionsItems.items();
		BeatsosAdditionsStatusEffects.effects();
		BeatsosAdditionsFeatures.features();

	}
}
