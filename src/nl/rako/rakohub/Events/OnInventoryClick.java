package nl.rako.rakohub.Events;

import nl.rako.rakohub.Inventory.GameSelector;
import nl.rako.rakohub.Functions.Bungee;
import nl.rako.rakohub.Functions.console;
import nl.rako.rakohub.Inventory.LobbySelector;
import nl.rako.rakohub.main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class OnInventoryClick implements Listener {

    private static final boolean something = false;

    @EventHandler
    public void onInventoryClick(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        ItemStack clickedItem = e.getItem();
        if (clickedItem.getType().equals(Material.NETHER_STAR)) {
            main.playerCount.put("lobby", main.playerCount.get("lobby"));
            main.playerCount.put("lobby", main.playerCount.get("lobby2"));
            LobbySelector.openLobbySelector(player);
        } else if (clickedItem.getType().equals(Material.COMPASS)) {
            GameSelector.openGameSelector(player);
        }
        else {
            return;
        }
    }

    @EventHandler
    public void onInventoryDrag (InventoryClickEvent e) {
        if (e.getWhoClicked() instanceof Player) {

            Player player = (Player) e.getWhoClicked();
            if(e.getInventory().getName().equals("Lobby Selector")) {


                ItemStack itemClicked = e.getCurrentItem();

                if (itemClicked.getItemMeta().getDisplayName().equals((ChatColor.GREEN + "Lobby 1"))) {
                    Bungee.bungeeSendPlayer(player, "lobby");
                    player.closeInventory();
                } else if (itemClicked.getItemMeta().getDisplayName().equals((ChatColor.GREEN + "Lobby 2"))) {
                    Bungee.bungeeSendPlayer(player, "lobby2");
                    player.closeInventory();
                } else if (itemClicked.getItemMeta().getDisplayName().equals((ChatColor.GREEN + "Dev server"))) {
                    Bungee.bungeeSendPlayer(player, "dev");
                    player.closeInventory();
                }
                else {
                    e.setCancelled(true);
                }
            }
            else if(e.getInventory().getName().equals("Game selector")) {
                ItemStack itemClicked = e.getCurrentItem();
                if(itemClicked.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Survival")) {
                    Bungee.bungeeSendPlayer(player, "survival");
                    player.closeInventory();
                }
                else {
                    e.setCancelled(true);
                }
            }
            else {
                e.setCancelled(true);
            }

        }
    }
}
