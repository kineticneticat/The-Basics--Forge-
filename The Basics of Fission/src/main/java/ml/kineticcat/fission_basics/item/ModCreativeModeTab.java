package ml.kineticcat.fission_basics.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab FISSION_TAB = new CreativeModeTab("fission_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.URANIUM_PELLET.get());
        }
    };

    public static final CreativeModeTab RAD_TAB = new CreativeModeTab("radioactive_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.URANIUM_PELLET.get());
        }
    };

}
