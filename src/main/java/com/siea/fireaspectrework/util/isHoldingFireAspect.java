package com.siea.fireaspectrework.util;


import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

public class isHoldingFireAspect {

    public static boolean isHoldingFireAspect(Player p, int level) {
        ItemStack item = p.getInventory().getItemInMainHand();

        if (p.getInventory().getItemInMainHand().containsEnchantment(Enchantment.FIRE_ASPECT)){
            return true;
        }

        if (item.getType() == Material.ENCHANTED_BOOK) {
            EnchantmentStorageMeta enchantMeta = (EnchantmentStorageMeta) item.getItemMeta();
            if (enchantMeta.hasStoredEnchant(Enchantment.FIRE_ASPECT)) {
                int fireAspectLevel = enchantMeta.getStoredEnchantLevel(Enchantment.FIRE_ASPECT);
                return fireAspectLevel >= level;
            }
        }

        return false;
    }
}
