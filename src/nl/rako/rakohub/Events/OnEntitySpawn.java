package nl.rako.rakohub.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

import java.io.IOException;

public class OnEntitySpawn implements Listener {

    @EventHandler
    public void onEntitySpawn(EntitySpawnEvent e) {
        e.setCancelled(true);
    }
}
