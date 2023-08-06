package com.siea.fireaspectrework.listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import static com.siea.fireaspectrework.util.isHoldingFireAspect.*;


public class EntityDamageByEntityEvent implements Listener {
    @EventHandler
    public void EntityDamageByEntity(org.bukkit.event.entity.EntityDamageByEntityEvent e){
        if (!(e.getDamager() instanceof Player)){
            return;
        }
        Player p = (Player)e.getDamager();

        if (isHoldingFireAspect(p, 1)){
            if (isHoldingFireAspect(p, 1)){
                e.getEntity().setFireTicks(80);
            }
            if (isHoldingFireAspect(p, 2)){
                e.getEntity().setFireTicks(160);
            }
        }
    }

}
