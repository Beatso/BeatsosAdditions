package tk.beatso.beatsos.additions.block.blocks;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.LadderBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tk.beatso.beatsos.additions.BeatsosAdditions;

public class IronLadderBlock extends LadderBlock {	
	
	public IronLadderBlock() {
		super(FabricBlockSettings.copyOf(Blocks.LADDER));
	}

	public static void register(IronLadderBlock block) {
		Identifier id = new Identifier(BeatsosAdditions.MOD_ID, "iron_ladder");
		final BlockItem blockItem = new BlockItem(block, new Item.Settings().group(ItemGroup.DECORATIONS));
		Registry.register(Registry.BLOCK, id, block);
		Registry.register(Registry.ITEM, id, blockItem);
		BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
	}

}
