package me.zings.additional_components_lib.mixin;

import me.zings.additional_components_lib.register.ItemComponents;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemEntity.class)
public abstract class Weight {
    @Shadow
    public abstract ItemStack getStack();

    @Inject(at = @At("HEAD"), method = "getGravity", cancellable = true)
    private void AdditionalComponentsLib$getGravity(CallbackInfoReturnable<Double> cir){
        cir.setReturnValue(getStack().getOrDefault(ItemComponents.WEIGHT, 0.04));
    }
}
