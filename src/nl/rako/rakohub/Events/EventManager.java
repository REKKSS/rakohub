package nl.rako.rakohub.Events;

import nl.rako.rakohub.main;
import org.bukkit.Bukkit;

public class EventManager {
    public static void registerEvents() {
        Bukkit.getPluginManager().registerEvents(new OnEntitySpawn(), main.plugin);
        Bukkit.getPluginManager().registerEvents(new OnInventoryClick(), main.plugin);
        Bukkit.getPluginManager().registerEvents(new OnItemDrop(), main.plugin);
        Bukkit.getPluginManager().registerEvents(new OnPlayerDamage(), main.plugin);
        Bukkit.getPluginManager().registerEvents(new OnPlayerDeath(), main.plugin);
        Bukkit.getPluginManager().registerEvents(new OnPlayerEat(), main.plugin);
        Bukkit.getPluginManager().registerEvents(new OnPlayerJoin(), main.plugin);
        Bukkit.getPluginManager().registerEvents(new OnPlayerLeave(), main.plugin);
        Bukkit.getPluginManager().registerEvents(new OnPlayerChat(), main.plugin);
    }
}
