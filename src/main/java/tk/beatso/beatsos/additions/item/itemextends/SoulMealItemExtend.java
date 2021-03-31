package tk.beatso.beatsos.additions.item.itemextends;

import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class SoulMealItemExtend extends Item {

	public SoulMealItemExtend(Settings settings) {
		super(settings);
	}


	@Override
	public ActionResult useOnBlock(ItemUsageContext context) {

		World world = context.getWorld();

		if (!world.isClient) {

			BlockPos pos = context.getBlockPos();
			if (world.getBlockState(pos).getBlock().getTranslationKey().equals("block.minecraft.jack_o_lantern")) {

			context.getStack().decrement(1);
				
				world.setBlockState(
					pos,
					Registry.BLOCK.get(new Identifier("beatsosadditions", "soul_jack_o_lantern")).getDefaultState().with(
						HorizontalFacingBlock.FACING,
						world.getBlockState(pos).get(HorizontalFacingBlock.FACING)
					)
				);

				world.playSound(null, pos, SoundEvents.ENTITY_PARROT_IMITATE_WITHER_SKELETON, SoundCategory.BLOCKS, 1f, 1f);
				world.addParticle(ParticleTypes.EXPLOSION_EMITTER, pos.getX(), pos.getY(), pos.getZ(), 0.0D, 0.0D, 0.0D);
				
				return ActionResult.success(true);

			} else {
				return ActionResult.success(false);
			}
		} else {
			return ActionResult.success(false);
		}


	}
}

