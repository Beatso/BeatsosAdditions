package tk.beatso.beatsos.additions.statuseffect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.potion.Potion;
import tk.beatso.beatsos.additions.statuseffect.effects.SturdinessStatusEffect;

public class BeatsosAdditionsStatusEffects {

	public static StatusEffect STURDINESS;
	public static Potion STURDINESS_POTION;
	public static Potion STURDINESS_POTION_LONG;
	public static Potion STURDINESS_POTION_STRONG;

	public static final void effects() {
		
		STURDINESS = SturdinessStatusEffect.RegisterStatusEffect();
		STURDINESS_POTION = SturdinessStatusEffect.RegisterPotionNormal();
		STURDINESS_POTION_LONG = SturdinessStatusEffect.RegisterPotionLong();
		STURDINESS_POTION_STRONG = SturdinessStatusEffect.RegisterPotionStrong();

	}

}
