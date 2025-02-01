package me.zings.additional_components_lib.mixin;


import me.zings.additional_components_lib.register.ItemComponents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Entity.class)
public abstract class LightningBlock {
    @Inject(at = @At("HEAD"), method = "onStruckByLightning", cancellable = true)
    private void AdditionalComponentsLib$onStruckByLightning(CallbackInfo ci) {

        Entity entity = (Entity) (Object) this;


        if (entity instanceof ItemEntity itemEntity){
            ItemStack itemStack = itemEntity.getStack();

            if (itemStack.getOrDefault(ItemComponents.LIGHTNING_RESISTANT, false)) ci.cancel();
        }

    }
}
