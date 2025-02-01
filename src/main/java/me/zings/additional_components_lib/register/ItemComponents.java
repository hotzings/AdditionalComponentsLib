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
            Identifier.of(Additional_components_lib.MOD_ID, "blast_resistant"),
            ComponentType.<Boolean>builder().codec(Codec.BOOL).build()
    );

    public static final ComponentType<Boolean> DESPAWN_RESISTANT = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            Identifier.of(Additional_components_lib.MOD_ID, "despawn_resistant"),
            ComponentType.<Boolean>builder().codec(Codec.BOOL).build()
    );

    public static final ComponentType<Boolean> VOID_RESISTANT = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            Identifier.of(Additional_components_lib.MOD_ID, "void_resistant"),
            ComponentType.<Boolean>builder().codec(Codec.BOOL).build()
    );

    public static final ComponentType<Boolean> LIGHTNING_RESISTANT = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            Identifier.of(Additional_components_lib.MOD_ID, "lightning_resistant"),
            ComponentType.<Boolean>builder().codec(Codec.BOOL).build()
    );

    public static final ComponentType<Boolean> OCCLUDE_VIBRATION_SIGNALS = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            Identifier.of(Additional_components_lib.MOD_ID, "occlude_vibration_signals"),
            ComponentType.<Boolean>builder().codec(Codec.BOOL).build()
    );

    public static final ComponentType<Double> WEIGHT = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            Identifier.of(Additional_components_lib.MOD_ID, "weight"),
            ComponentType.<Double>builder().codec(Codec.DOUBLE).build()
    );

    public static void registerItemComponents(){

    }
}
