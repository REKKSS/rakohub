package nl.rako.rakohub.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class OnPlayerEat implements Listener {

    @EventHandler
    public void onPlayerEat(FoodLevelChangeEvent e) {
        e.setCancelled(true);
    }
}
