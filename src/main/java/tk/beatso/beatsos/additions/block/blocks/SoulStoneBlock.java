package tk.beatso.beatsos.additions.block.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class SoulStoneBlock extends Block {

	public SoulStoneBlock() {
		// super(FabricBlockSettings.copyOf(Blocks.STONE));
		super(FabricBlockSettings.copy(Blocks.STONE));
	}
	
}
