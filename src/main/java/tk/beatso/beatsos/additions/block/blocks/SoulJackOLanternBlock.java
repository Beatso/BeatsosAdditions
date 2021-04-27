package tk.beatso.beatsos.additions.block.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarvedPumpkinBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tk.beatso.beatsos.additions.BeatsosAdditions;
public class SoulJackOLanternBlock extends CarvedPumpkinBlock {
	
	public SoulJackOLanternBlock() {
		super(FabricBlockSettings.copyOf(Blocks.JACK_O_LANTERN));
	}

	public static void register(SoulJackOLanternBlock block) {
		Identifier id = new Identifier(BeatsosAdditions.MOD_ID, "soul_jack_o_lantern");
		final BlockItem blockItem = new BlockItem(block, new Item.Settings().group(ItemGroup.DECORATIONS));
		Registry.register(Registry.BLOCK, id, block);
		Registry.register(Registry.ITEM, id, blockItem);
	}

}
