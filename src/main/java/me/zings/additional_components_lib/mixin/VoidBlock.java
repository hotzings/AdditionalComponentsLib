package me.zings.additional_components_lib.mixin;

import me.zings.additional_components_lib.register.ItemComponents;
import net.minecraft.component.ComponentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(ItemEntity.class)
public abstract class VoidBlock{
    @Shadow
    public abstract ItemStack getStack();

    @Inject(at = @At("HEAD"), method = "tick")
    private void AdditionalComponentsLib$tick(CallbackInfo ci){
        if (getStack().getOrDefault(ItemComponents.VOID_RESISTANT, false)) {
            // check if below bedrock aka -65 getPos().y
            // reset velocity
            // set gravity to 0
            ItemEntity itemEntity = (ItemEntity) (Object) this;

            if (itemEntity instanceof Entity entity){
                if (entity.getPos().y < -65){
                    entity.setVelocity(new Vec3d(entity.getVelocity().x, 0.25, entity.getVelocity().z));
                    if (entity.getPos().y < -120){
                        entity.setPos(entity.getPos().x, -120, entity.getPos().z);
                    }
                }
            }

        }
    }
}




