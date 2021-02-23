package nl.rako.rakohub.events;


import nl.rako.rakohub.functions.PrefixManager;
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
        e.setFormat(PrefixManager.getRankname(player) + dispayName + ChatColor.WHITE + ": " + e.getMessage() );
    }

}
