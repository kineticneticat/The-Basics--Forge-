package ml.kineticcat.fission_basics.block;

import ml.kineticcat.fission_basics.item.ModCreativeModeTab;
import ml.kineticcat.fission_basics.item.UraniumPellet;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class UraniumOre extends Block {
    public UraniumOre(Properties properties) {
        super(properties);
    }


    public static final UraniumOre URANIUM_ORE = new UraniumOre(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops());
}
