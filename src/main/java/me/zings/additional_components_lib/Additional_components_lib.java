package me.zings.additional_components_lib;

import me.zings.additional_components_lib.register.ItemComponents;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Additional_components_lib implements ModInitializer {
    public static final String MOD_ID = "additional_components";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ItemComponents.registerItemComponents();



    }
}
