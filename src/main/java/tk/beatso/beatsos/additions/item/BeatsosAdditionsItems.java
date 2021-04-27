package tk.beatso.beatsos.additions.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import tk.beatso.beatsos.additions.item.items.SoulDustItem;
import tk.beatso.beatsos.additions.item.items.SoulMealItem;

public class BeatsosAdditionsItems {

	// settings
	public static final Item.Settings MISC = new Item.Settings().group(ItemGroup.MISC);

	public static Item SOUL_MEAL;
	public static Item SOUL_DUST;

	public static final void items() {
		
		SOUL_MEAL = SoulMealItem.register();
		SOUL_DUST = SoulDustItem.register();
	}
}
