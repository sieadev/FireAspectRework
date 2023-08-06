package com.siea.fireaspectrework;

import com.siea.fireaspectrework.listeners.EntityDamageByEntityEvent;
import com.siea.fireaspectrework.listeners.PlayerInteractEvent;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class FireAspectRework extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage("Fire Aspect Rework by Siea is booting...");
        getServer().getPluginManager().registerEvents(new EntityDamageByEntityEvent(), this);
        getServer().getPluginManager().registerEvents(new PlayerInteractEvent(), this);
        getServer().getConsoleSender().sendMessage("Fire Aspect Rework by Siea successfully activated!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("Fire Aspect Rework by Siea successfully deactivated!");
    }
}
