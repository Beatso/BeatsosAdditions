package tk.beatso.beatsos.additions.item.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tk.beatso.beatsos.additions.BeatsosAdditions;

public class SoulDustItem extends Item {

	public SoulDustItem() {
		super(new Item.Settings().group(ItemGroup.MISC));
	}
	
	public static SoulDustItem register() {
		return Registry.register(Registry.ITEM, new Identifier(BeatsosAdditions.MOD_ID, "soul_dust"), new SoulDustItem());
	}

}
