package nl.rako.rakohub.Events;

import nl.rako.rakohub.rakohub;
import org.bukkit.Bukkit;

public class EventManager {
    public static void registerEvents() {
        Bukkit.getPluginManager().registerEvents(new OnEntitySpawn(), rakohub.plugin);
        Bukkit.getPluginManager().registerEvents(new OnInventoryClick(), rakohub.plugin);
        Bukkit.getPluginManager().registerEvents(new OnItemDrop(), rakohub.plugin);
        Bukkit.getPluginManager().registerEvents(new OnPlayerDamage(), rakohub.plugin);
        Bukkit.getPluginManager().registerEvents(new OnPlayerDeath(), rakohub.plugin);
        Bukkit.getPluginManager().registerEvents(new OnPlayerEat(), rakohub.plugin);
        Bukkit.getPluginManager().registerEvents(new OnPlayerJoin(), rakohub.plugin);
        Bukkit.getPluginManager().registerEvents(new OnPlayerLeave(), rakohub.plugin);
        Bukkit.getPluginManager().registerEvents(new OnPlayerChat(), rakohub.plugin);
    }
}
