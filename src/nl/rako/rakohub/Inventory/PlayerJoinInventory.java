package nl.rako.rakohub.Inventory;

import nl.rako.rakohub.Functions.InventoryManager;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PlayerJoinInventory {
    public static void playerJoinInventory(Player player) {
        ItemStack lobbySelector = InventoryManager.createItem(Material.NETHER_STAR, (ChatColor.GREEN + "Lobby Selector" + ChatColor.GRAY + " (Click Right)"), "");
        ItemStack compass = InventoryManager.createItem(Material.COMPASS, (ChatColor.GREEN + "Game Selector" + ChatColor.GRAY + " (Click Right)"), "");

        player.getInventory().clear();

        player.getInventory().setItem(8, lobbySelector);
        player.getInventory().setItem(0, compass);
    }
}
