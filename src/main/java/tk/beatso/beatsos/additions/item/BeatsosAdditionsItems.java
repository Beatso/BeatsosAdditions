package tk.beatso.beatsos.additions.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tk.beatso.beatsos.additions.BeatsosAdditions;
import tk.beatso.beatsos.additions.item.items.SoulMealItemExtend;

public class BeatsosAdditionsItems {

	// settings
	public static final Item.Settings MISC = new Item.Settings().group(ItemGroup.MISC);

	public static Item SOUL_MEAL;
	public static Item SOUL_DUST;

	public static final void items() {
		
		SOUL_MEAL = Registry.register(Registry.ITEM, new Identifier(BeatsosAdditions.MOD_ID, "soul_meal"), new SoulMealItemExtend(MISC));
		SOUL_DUST = Registry.register(Registry.ITEM, new Identifier(BeatsosAdditions.MOD_ID, "soul_dust"), new Item(MISC));
	}
}
