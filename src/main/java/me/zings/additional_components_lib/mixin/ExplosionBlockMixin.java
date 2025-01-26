package me.zings.additional_components_lib.mixin;


import me.zings.additional_components_lib.register.ItemComponents;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemEntity.class)
public abstract class ExplosionBlockMixin {
    @Shadow public abstract ItemStack getStack();

    @Inject(at = @At("HEAD"), method = "damage", cancellable = true)
    private void AdditionalComponentsLib$damage(ServerWorld world, DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir){
        if (getStack().getOrDefault(ItemComponents.EXPLOSION_RESISTANT, false)) {
            cir.setReturnValue(false);
        }
    }
}
