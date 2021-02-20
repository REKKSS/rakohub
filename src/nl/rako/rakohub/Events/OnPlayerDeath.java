package nl.rako.rakohub.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class OnPlayerDeath implements Listener {

    @EventHandler
    public void onPlayerDeath (PlayerDeathEvent e) {
        if(e.getEntity() instanceof Player) {
            e.setDeathMessage("");
        }


    }
}
