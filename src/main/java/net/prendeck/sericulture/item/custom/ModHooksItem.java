package net.prendeck.sericulture.item.custom;

import net.minecraft.core.Holder;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;

public class ModHooksItem extends DiggerItem{

    @Override
    public boolean supportsEnchantment(ItemStack stack, Holder<Enchantment> enchantment) {
        if (enchantment.is(Enchantments.KNOCKBACK)){
            return false;}
        return true;
    }

    public ModHooksItem(Tiers gold, Properties properties) {
        super(tier B, blocks, properties);
    }
}
