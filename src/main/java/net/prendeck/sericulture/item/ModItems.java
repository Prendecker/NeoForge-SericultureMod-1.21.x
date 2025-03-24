package net.prendeck.sericulture.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.prendeck.sericulture.Sericulture;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Sericulture.MOD_ID);

    public static final DeferredItem<Item> MULBERRY_LEAVES = ITEMS.register("mulberry_leaves", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WOODEN_HOOkS = ITEMS.register("wooden_hooks", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}