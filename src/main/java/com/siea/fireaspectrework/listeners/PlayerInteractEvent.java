package com.siea.fireaspectrework.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.block.Campfire;
import org.bukkit.block.data.BlockData;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.Objects;

import static com.siea.fireaspectrework.util.isHoldingFireAspect.*;

public class PlayerInteractEvent implements Listener {
    @EventHandler
    public void PlayerInteractEvent (org.bukkit.event.player.PlayerInteractEvent e) {
        Player p = e.getPlayer();

        if (e.getClickedBlock() == null){
            return;
        }
        Block block = e.getClickedBlock();

        if (isHoldingFireAspect(p, 1)) {
            BlockState blockState = block.getState();
            if (block.getType() == Material.CAMPFIRE) {
                block.setType(Material.CAMPFIRE);
            }
        }
    }
}
