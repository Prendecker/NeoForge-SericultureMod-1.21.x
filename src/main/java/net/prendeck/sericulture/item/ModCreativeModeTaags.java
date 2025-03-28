package net.prendeck.sericulture.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.prendeck.sericulture.Sericulture;
import net.prendeck.sericulture.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTaags {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Sericulture.MOD_ID);

    public static final Supplier<CreativeModeTab> SERICULTURE_TAB = CREATIVE_MODE_TAB.register("sericulture_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MULBERRY_LEAF.get()))
                    .title(Component.translatable("itemGroup.sericulture"))
                    .displayItems((itemDisplayPamaeters, output) -> {
                        output.accept(ModItems.MULBERRY_LEAF.get());

                        output.accept(ModItems.WOODEN_HOOkS.get());
                        output.accept(ModItems.STONE_HOOKS.get());
                        output.accept(ModItems.IRON_HOOkS.get());
                        output.accept(ModItems.GOLDEN_HOOkS.get());
                        output.accept(ModItems.DIAMOND_HOOkS.get());
                        output.accept(ModItems.NETHERITE_HOOkS.get());

                        output.accept(ModBlocks.JUMBLED_BLOCK.get());
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
