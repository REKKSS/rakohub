//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package nl.rako.rakohub;

import nl.rako.rakohub.Events.*;
import nl.rako.rakohub.Functions.Bungee;
import nl.rako.rakohub.Functions.console;
import nl.rako.rakohub.Functions.ipAddress;
import nl.rako.rakohub.Scoreboard.scoreboard;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.util.HashMap;


// TODO: Events each in individual class
// TODO: Each Scoreboard(sidebar and nametag) in individual class

public class main extends JavaPlugin {
    public static main plugin;
    public static HashMap<String, Integer> playerCount = new HashMap<String, Integer>();

    public main() {
    }

    public void onEnable() {
        plugin = this;
        console.sendConsole(ChatColor.GREEN + "RakoHub enabled!");
        Bungee.bungeePluginChannel(this, "BungeeCord");
        Bukkit.getPluginManager().registerEvents(new OnEntitySpawn(), this);
        Bukkit.getPluginManager().registerEvents(new OnInventoryClick(), this);
        Bukkit.getPluginManager().registerEvents(new OnItemDrop(), this);
        Bukkit.getPluginManager().registerEvents(new OnPlayerDamage(), this);
        Bukkit.getPluginManager().registerEvents(new OnPlayerDeath(), this);
        Bukkit.getPluginManager().registerEvents(new OnPlayerEat(), this);
        Bukkit.getPluginManager().registerEvents(new OnPlayerJoin(), this);
        Bukkit.getPluginManager().registerEvents(new OnPlayerLeave(), this);
        Bukkit.getPluginManager().registerEvents(new OnPlayerChat(), this);
        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
            public void run() {
                Bungee.bungeePlayerCount("ALL");
                Bungee.bungeePlayerCount("lobby");
                Bungee.bungeePlayerCount("lobby2");
                Bungee.bungeePlayerCount("dev");

                for( Player player : Bukkit.getOnlinePlayers()) {
                    scoreboard.createScoreboard(player);
                    // console.sendConsole("" + playerCount.get("lobby"));
                }
            }
        }, 60L, 60L);
    }

    public void onDisable() {
        console.sendConsole(ChatColor.RED + "RakoHub disabled!");
    }
}
