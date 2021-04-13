package tk.beatso.beatsos.additions.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import tk.beatso.beatsos.additions.item.BeatsosAdditionsItems;
import tk.beatso.beatsos.additions.statuseffect.BeatsosAdditionsStatusEffects;

@Mixin(BrewingRecipeRegistry.class)
public class BrewingRecipeRegistryMixin {
	
	@Shadow private static void registerPotionRecipe(Potion input, Item item, Potion output) {}

	@Inject(method = "registerDefaults", at = @At("RETURN"))
	private static void afterRegistration(CallbackInfo ci) {
		registerPotionRecipe(Potions.AWKWARD, BeatsosAdditionsItems.SOUL_DUST, BeatsosAdditionsStatusEffects.STURDINESS_POTION);
		registerPotionRecipe(Potions.AWKWARD, Items.REDSTONE, BeatsosAdditionsStatusEffects.STURDINESS_POTION_LONG);
		registerPotionRecipe(Potions.AWKWARD, Items.GLOWSTONE_DUST, BeatsosAdditionsStatusEffects.STURDINESS_POTION_STRONG);
	}

}
