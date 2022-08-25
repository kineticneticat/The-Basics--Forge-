package ml.kineticcat.fission_basics.item;

import ml.kineticcat.fission_basics.Utilities;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utilities.MODID);


    public static final RegistryObject<Item> URANIUM_PELLET = ITEMS.register("uranium_pellet", () -> UraniumPellet.URANIUM_PELLET);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
