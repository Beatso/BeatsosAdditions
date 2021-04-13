package tk.beatso.beatsos.additions.statuseffects.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;

public class SturdinessStatusEffect extends StatusEffect {

	public SturdinessStatusEffect() {
		super(
			StatusEffectType.BENEFICIAL,
			0x98D982
		);
	}

	public static final StatusEffect STURDINESS =
		new SturdinessStatusEffect().addAttributeModifier(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, "D3F78FA6-D282-482B-A572-E17BD971597D", 0.20000000298023224D, EntityAttributeModifier.Operation.ADDITION);

}
