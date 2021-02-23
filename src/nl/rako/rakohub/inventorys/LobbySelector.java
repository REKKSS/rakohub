package nl.rako.rakohub.inventorys;

import nl.rako.rakohub.functions.InventoryManager;
import nl.rako.rakohub.rakohub;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class LobbySelector {
    public static Inventory lobbySelector;
    public static void openLobbySelector(Player player) {

        int lobbyPlayerCount = rakohub.playerCount.get("lobby");
        int lobby2PlayerCount = rakohub.playerCount.get("lobby2");
        int devPlayerCount = rakohub.playerCount.get("dev");

        lobbySelector = Bukkit.createInventory(null, 9, "Lobby Selector");
        lobbySelector.setItem(0, InventoryManager.createItem(Material.QUARTZ_BLOCK, (ChatColor.GREEN + "Lobby 1"), (ChatColor.GRAY + "Players online: " + lobbyPlayerCount)));
        lobbySelector.setItem(1, InventoryManager.createItem(Material.QUARTZ_BLOCK, (ChatColor.GREEN + "Lobby 2"), (ChatColor.GRAY + "Players online: " + lobby2PlayerCount)));
        if(player.hasPermission("rako.server.dev")) {
            lobbySelector.setItem(8, InventoryManager.createItem(Material.QUARTZ_BLOCK, (ChatColor.GREEN + "Dev server"), (ChatColor.GRAY + "Players online: " + devPlayerCount)));
        }
        player.openInventory(lobbySelector);

    }

}
