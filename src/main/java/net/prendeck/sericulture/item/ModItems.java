package net.prendeck.sericulture.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.prendeck.sericulture.Sericulture;
import net.prendeck.sericulture.item.custom.ModHooksItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Sericulture.MOD_ID);

    public static final DeferredItem<Item> MULBERRY_LEAF = ITEMS.register("mulberry_leaf", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> WOODEN_HOOkS = ITEMS.register("wooden_hooks", () -> new ModHooksItem(Tiers.WOOD,new Item.Properties().durability(59)));
    public static final DeferredItem<Item>  STONE_HOOKS = ITEMS.register("stone_hooks", () -> new ModHooksItem(Tiers.STONE,new Item.Properties().durability(131)));
    public static final DeferredItem<Item> GOLDEN_HOOkS = ITEMS.register("golden_hooks", () -> new ModHooksItem(Tiers.GOLD,new Item.Properties().durability(32)));
    public static final DeferredItem<Item> IRON_HOOkS = ITEMS.register("iron_hooks", () -> new ModHooksItem(Tiers.IRON,new Item.Properties().durability(250)));
    public static final DeferredItem<Item> DIAMOND_HOOkS = ITEMS.register("diamond_hooks", () -> new ModHooksItem(Tiers.DIAMOND,new Item.Properties().durability(1561)));
    public static final DeferredItem<Item> NETHERITE_HOOkS = ITEMS.register("netherite_hooks", () -> new ModHooksItem(Tiers.NETHERITE,new Item.Properties().durability(2031)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}