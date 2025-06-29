package me.zings.additional_components_lib.mixin;

import me.zings.additional_components_lib.register.ItemComponents;
import net.minecraft.block.BlockState;
import net.minecraft.block.CactusBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCollisionHandler;
import net.minecraft.entity.ItemEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CactusBlock.class)
public abstract class CactusBlockMixin {
	@Inject(at = @At("HEAD"), method = "onEntityCollision", cancellable = true)
	private void AdditionalComponentsLib$cactus_proof_items(
			BlockState state,
			World world,
			BlockPos pos,
			Entity entity,
			EntityCollisionHandler handler,  // new parameter!
			CallbackInfo ci
	) {
		if (entity instanceof ItemEntity itemEntity) {
			if (itemEntity.getStack().getOrDefault(ItemComponents.CACTUS_RESISTANT, false)) {
				ci.cancel();
			}
		}
	}
}