package dev.purppecat.template;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(PurpsTemplate.MOD_ID)
public class PurpsTemplate {
    public static final String MOD_ID = "template";
    public static final String MOD_NAME = "Purp's Template";
    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public PurpsTemplate(IEventBus modEventBus) {}

    public static ResourceLocation modLoc(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
