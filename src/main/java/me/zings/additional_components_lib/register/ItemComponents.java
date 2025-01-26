package me.zings.additional_components_lib.register;

import com.mojang.serialization.Codec;
import me.zings.additional_components_lib.Additional_components_lib;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemComponents {

    public static final ComponentType<Boolean> CACTUS_RESISTANT = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            Identifier.of(Additional_components_lib.MOD_ID, "cactus_resistant"),
            ComponentType.<Boolean>builder().codec(Codec.BOOL).build()
    );

    public static final ComponentType<Boolean> EXPLOSION_RESISTANT = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            Identifier.of(Additional_components_lib.MOD_ID, "explosion_resistant"),
            ComponentType.<Boolean>builder().codec(Codec.BOOL).build()
    );

    public static void registerItemComponents(){

    }
}
