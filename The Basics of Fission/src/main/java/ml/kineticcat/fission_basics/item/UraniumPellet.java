package ml.kineticcat.fission_basics.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class UraniumPellet extends Item {
    public UraniumPellet(Properties properties) {
        super(properties);
    }

    public static final UraniumPellet URANIUM_PELLET = new UraniumPellet(new Item.Properties().tab(ModCreativeModeTab.RAD_TAB));

}
