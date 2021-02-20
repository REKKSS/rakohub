package nl.rako.rakohub.Events;


import nl.rako.rakohub.Scoreboard.prefix;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class OnPlayerChat implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e) {
        Player player = e.getPlayer();
        String dispayName = player.getDisplayName();
        e.setFormat(prefix.getRankname(player) + dispayName + ChatColor.WHITE + ": " + e.getMessage() );
    }

}