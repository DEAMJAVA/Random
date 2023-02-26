package net.DEAMJAVA.random.painting;

import net.DEAMJAVA.random.random;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintings {

    public static final PaintingVariant DEAMJAVA = registerpainting("deamjava",
            new PaintingVariant(16,16));

    public static PaintingVariant registerpainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(random.MOD_ID, name),
                paintingVariant);

    }
    public static void registermodpaintings() {
        random.LOGGER.debug("Registering Paintings for "+ random.MOD_ID);
    }
}
