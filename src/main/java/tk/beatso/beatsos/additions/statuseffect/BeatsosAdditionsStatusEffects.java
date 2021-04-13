package tk.beatso.beatsos.additions.statuseffect;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tk.beatso.beatsos.additions.BeatsosAdditions;
import tk.beatso.beatsos.additions.statuseffect.effects.SturdinessStatusEffect;

public class BeatsosAdditionsStatusEffects {

	public static final void effects() {
		
		Registry.register(Registry.STATUS_EFFECT, new Identifier(BeatsosAdditions.MOD_ID, "sturdiness"), SturdinessStatusEffect.STURDINESS);

		Registry.register(Registry.POTION, new Identifier(BeatsosAdditions.MOD_ID, "sturdiness"), new Potion(new StatusEffectInstance(SturdinessStatusEffect.STURDINESS, 3600)));

	}

}