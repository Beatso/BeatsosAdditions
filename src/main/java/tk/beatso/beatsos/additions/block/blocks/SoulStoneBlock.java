package tk.beatso.beatsos.additions.block.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import tk.beatso.beatsos.additions.statuseffect.effects.SturdinessStatusEffect;

public class SoulStoneBlock extends Block {

	public SoulStoneBlock() {
		super(FabricBlockSettings.copyOf(Blocks.STONE));
	}

	public void onSteppedOn(World world, BlockPos pos, Entity entity) {

		if (entity instanceof LivingEntity && entity.age % 40 == 0) {

			LivingEntity livingEntity = ((LivingEntity) entity);

			if (livingEntity.getAttributeValue(EntityAttributes.GENERIC_MAX_HEALTH) > 6.0D && !livingEntity.hasStatusEffect(SturdinessStatusEffect.STURDINESS)) {

				livingEntity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).addPersistentModifier(new EntityAttributeModifier("1146f672-aaa6-4c70-b601-5c99d0a00efd", -2.0D, EntityAttributeModifier.Operation.ADDITION));

			}

		}
		
	}
	
}
