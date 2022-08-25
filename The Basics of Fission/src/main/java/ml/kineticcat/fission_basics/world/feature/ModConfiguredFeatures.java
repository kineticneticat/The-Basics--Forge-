package ml.kineticcat.fission_basics.world.feature;

import com.google.common.base.Suppliers;
import ml.kineticcat.fission_basics.Utilities;
import ml.kineticcat.fission_basics.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGUREATED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Utilities.MODID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_URANIUM_ORES = Suppliers.memoize(() ->List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.URANIUM_ORE.get().defaultBlockState())
    ));

    public static final RegistryObject<ConfiguredFeature<?, ?>> URANIUM_ORE = CONFIGUREATED_FEATURES.register("uranium_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_URANIUM_ORES.get(), 7)));



    public static void register(IEventBus eventBus) {
        CONFIGUREATED_FEATURES.register(eventBus);
    }

}
