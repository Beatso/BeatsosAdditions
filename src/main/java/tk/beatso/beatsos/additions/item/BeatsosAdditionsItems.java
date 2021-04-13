package tk.beatso.beatsos.additions.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tk.beatso.beatsos.additions.item.items.SoulMealItemExtend;

public class BeatsosAdditionsItems {

	// settings
	public static final Item.Settings MISC = new Item.Settings().group(ItemGroup.MISC);

	public static final Item SOUL_MEAL = new SoulMealItemExtend(MISC);

	public static final void items() {
		
		Registry.register(Registry.ITEM, new Identifier("beatsosadditions", "soul_meal"), SOUL_MEAL);

	}
}
