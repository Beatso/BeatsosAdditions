package tk.beatso.beatsos.additions.statuseffect;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tk.beatso.beatsos.additions.statuseffect.effects.SturdinessStatusEffect;

public class BeatsosAdditionsStatusEffects {

	public static final void effects() {
		
		Registry.register(Registry.STATUS_EFFECT, new Identifier("beatsosadditions", "sturdiness"), SturdinessStatusEffect.STURDINESS);

	}

}
