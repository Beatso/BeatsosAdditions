package tk.beatso.beatsos.additions.statuseffect.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tk.beatso.beatsos.additions.BeatsosAdditions;

public class SturdinessStatusEffect extends StatusEffect {

	public SturdinessStatusEffect() {
		super(
			StatusEffectType.BENEFICIAL,
			0x98D982
		);
	}

	public static StatusEffect RegisterStatusEffect() {
		return Registry.register(Registry.STATUS_EFFECT, new Identifier(BeatsosAdditions.MOD_ID, "sturdiness"), SturdinessStatusEffect.STURDINESS);
	}
	public static Potion RegisterPotionNormal() {
		return Registry.register(Registry.POTION, new Identifier(BeatsosAdditions.MOD_ID, "sturdiness"), new Potion(new StatusEffectInstance(SturdinessStatusEffect.STURDINESS, 3600)));
	}
	public static Potion RegisterPotionLong() {
		return Registry.register(Registry.POTION, new Identifier(BeatsosAdditions.MOD_ID, "sturdiness_long"), new Potion(new StatusEffectInstance(SturdinessStatusEffect.STURDINESS, 9600)));
	}
	public static Potion RegisterPotionStrong() {
		return Registry.register(Registry.POTION, new Identifier(BeatsosAdditions.MOD_ID, "sturdiness_strong"), new Potion(new StatusEffectInstance(SturdinessStatusEffect.STURDINESS, 1800, 1)));
	}

	public static final StatusEffect STURDINESS =
		new SturdinessStatusEffect().addAttributeModifier(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, "D3F78FA6-D282-482B-A572-E17BD971597D", 0.20000000298023224D, EntityAttributeModifier.Operation.ADDITION);
	

}
