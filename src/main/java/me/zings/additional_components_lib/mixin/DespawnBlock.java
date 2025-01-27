package me.zings.additional_components_lib.mixin;

import me.zings.additional_components_lib.register.ItemComponents;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemEntity.class)
public abstract class DespawnBlock {
    @Shadow
    public abstract ItemStack getStack();
    @Shadow
    public abstract void setNeverDespawn();

    @Inject(at = @At("HEAD"), method = "tick")
    private void AdditionalComponentsLib$tick(CallbackInfo ci){
        if (getStack().getOrDefault(ItemComponents.DESPAWN_RESISTANT, false)) {
            setNeverDespawn();
        }
    }
}
