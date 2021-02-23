package nl.rako.rakohub.events;

import nl.rako.rakohub.inventorys.PlayerJoinInventory;
import nl.rako.rakohub.scoreboard.RakoScoreboardManager;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Iterator;

public class OnPlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {

        Player player = e.getPlayer();
        PlayerJoinInventory.playerJoinInventory(player);
        e.setJoinMessage("");

        player.setHealth(20.0D);
        player.setFoodLevel(20);
        player.teleport(player.getWorld().getSpawnLocation());
        player.setGameMode(GameMode.ADVENTURE);
        RakoScoreboardManager.createScoreboard(player);
        if (player.hasPermission("rako.fly")) {
            player.setAllowFlight(true);
        } else if (player.hasPermission("rako.vanish")) {
            Iterator var3 = Bukkit.getOnlinePlayers().iterator();

            while(var3.hasNext()) {
                Player all = (Player)var3.next();
                player.hidePlayer(all);
            }
        }

    }
}
