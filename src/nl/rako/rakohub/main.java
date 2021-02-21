
package nl.rako.rakohub;

import nl.rako.rakohub.Events.*;
import nl.rako.rakohub.Functions.Bungee;
import nl.rako.rakohub.Functions.console;
import nl.rako.rakohub.Scoreboard.scoreboard;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.HashMap;


public class main extends JavaPlugin {
    public static main plugin;
    public static HashMap<String, Integer> playerCount = new HashMap<String, Integer>();

    public main() {
    }

    public void onEnable() {
        plugin = this;
        console.sendConsole(ChatColor.GREEN + "RakoHub enabled!");
        Bungee.bungeePluginChannel(this, "BungeeCord");
        EventManager.registerEvents();
        playerCount.put("ALL", 0);
        playerCount.put("lobby", 0);
        playerCount.put("lobby2", 0);
        playerCount.put("dev", 0);
        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
            public void run() {
                Bungee.bungeePlayerCount("ALL");
                Bungee.bungeePlayerCount("lobby");
                Bungee.bungeePlayerCount("lobby2");
                Bungee.bungeePlayerCount("dev");

                for( Player player : Bukkit.getOnlinePlayers()) {
                    scoreboard.createScoreboard(player);
                }
            }
        }, 60L, 60L);
    }

    public void onDisable() {
        console.sendConsole(ChatColor.RED + "RakoHub disabled!");
    }
}
