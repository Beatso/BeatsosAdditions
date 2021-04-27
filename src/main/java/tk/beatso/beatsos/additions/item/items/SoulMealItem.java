package tk.beatso.beatsos.additions.item.items;

import net.minecraft.block.DispenserBlock;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.dispenser.FallibleItemDispenserBehavior;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPointer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import tk.beatso.beatsos.additions.BeatsosAdditions;

public class SoulMealItem extends Item {

	public SoulMealItem() {
		super(new Item.Settings().group(ItemGroup.MISC));
	}

	public static SoulDustItem register() {
		return Registry.register(Registry.ITEM, new Identifier(BeatsosAdditions.MOD_ID, "soul_meal"), new SoulDustItem());
	}

	private static void corruptJackOLantern(World world, BlockPos blockPos) {
		if (!world.isClient) {
			world.setBlockState(
				blockPos,
				Registry.BLOCK.get(new Identifier("beatsosadditions", "soul_jack_o_lantern")).getDefaultState().with(
					HorizontalFacingBlock.FACING,
					world.getBlockState(blockPos).get(HorizontalFacingBlock.FACING)
				)
			);
			world.playSound(null, blockPos, SoundEvents.ENTITY_PARROT_IMITATE_WITHER_SKELETON, SoundCategory.BLOCKS, 1f, 1f);
		} else {
			world.addParticle(ParticleTypes.SOUL, (double)blockPos.getX() + 0.5D, (double)blockPos.getY() + 1.5D, (double)blockPos.getZ() + 0.5D, 0.0D, 0.0D, 0.0D);
		}
	}

	public static void initialize() {
		DispenserBlock.registerBehavior(Registry.ITEM.get(new Identifier(BeatsosAdditions.MOD_ID, "soul_meal")), new FallibleItemDispenserBehavior () {
			protected ItemStack dispenseSilently (BlockPointer pointer, ItemStack stack) {			
				this.setSuccess(true);
				World world = pointer.getWorld();
				BlockPos blockPos = pointer.getBlockPos().offset((Direction)pointer.getBlockState().get(DispenserBlock.FACING));
				if (world.getBlockState(blockPos).isOf(Registry.BLOCK.get(new Identifier("minecraft", "jack_o_lantern")))) {
					SoulMealItem.corruptJackOLantern(world, blockPos);
					world.syncWorldEvent(2005, blockPos, 0);
				} else
					this.setSuccess(false);
				return stack;
			}
		});
	}

	@Override
	public ActionResult useOnBlock(ItemUsageContext context) {

		World world = context.getWorld();

			BlockPos blockPos = context.getBlockPos();

			if (world.getBlockState(blockPos).isOf(Registry.BLOCK.get(new Identifier("minecraft", "jack_o_lantern")))) {

			context.getStack().decrement(1);
				
				corruptJackOLantern(world, blockPos);

				return ActionResult.success(true);

			} else {
				return ActionResult.success(false);
			}

	}

}

