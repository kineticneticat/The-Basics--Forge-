package ml.kineticcat.indust_basics.item;

import net.minecraft.world.item.CreativeModeTab;
        import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModeTab {
    public static final CreativeModeTab INDUST_BASICS_TAB = new CreativeModeTab("indust_basics_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.IRON_INGOT);
        }
    };
}