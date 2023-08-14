package cdl.mxmod.enchant;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class MoreHeartEnchant extends Enchantment {
    public MoreHeartEnchant() {
        super(Rarity.RARE,
              EnchantmentTarget.WEARABLE,
              new EquipmentSlot[]{EquipmentSlot.FEET, EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS});
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public boolean isTreasure() {
        return true;
    }
}