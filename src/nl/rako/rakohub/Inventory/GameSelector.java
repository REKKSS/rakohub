package nl.rako.rakohub.Inventory;

import nl.rako.rakohub.Functions.InventoryManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class GameSelector {

    public static Inventory gameSelector;


    public static void openGameSelector(Player player) {
        gameSelector = Bukkit.createInventory(null, 54, "Game selector");
        gameSelector.setItem(27, InventoryManager.createItem(Material.FLINT_AND_STEEL, (ChatColor.GREEN + "Survival"), ""));


        player.openInventory(gameSelector);

    }



    }