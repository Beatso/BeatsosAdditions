package tk.beatso.beatsos.additions.statuseffect;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tk.beatso.beatsos.additions.BeatsosAdditions;
import tk.beatso.beatsos.additions.statuseffect.effects.SturdinessStatusEffect;

public class BeatsosAdditionsStatusEffects {

	public static final Potion STURDINESS_POTION = new Potion(new StatusEffectInstance(SturdinessStatusEffect.STURDINESS, 3600));
	public static final Potion STURDINESS_POTION_LONG = new Potion(new StatusEffectInstance(SturdinessStatusEffect.STURDINESS, 9600));
	public static final Potion STURDINESS_POTION_STRONG = new Potion(new StatusEffectInstance(SturdinessStatusEffect.STURDINESS, 1800, 1));

	public static final void effects() {
		
		Registry.register(Registry.STATUS_EFFECT, new Identifier(BeatsosAdditions.MOD_ID, "sturdiness"), SturdinessStatusEffect.STURDINESS);

		Registry.register(Registry.POTION, new Identifier(BeatsosAdditions.MOD_ID, "sturdiness"), STURDINESS_POTION);
		Registry.register(Registry.POTION, new Identifier(BeatsosAdditions.MOD_ID, "sturdiness_long"), STURDINESS_POTION_LONG);
		Registry.register(Registry.POTION, new Identifier(BeatsosAdditions.MOD_ID, "sturdiness_strong"), STURDINESS_POTION_STRONG);

	}

}
