//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package nl.rako.rakohub.Functions;

import nl.rako.rakohub.Scoreboard.RakoScoreboardManager;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

public class PrefixManager {
    public PrefixManager() {
    }

    public static String getRankboard(Player player) {
        if (player.hasPermission("rank.owner")) {
            return ChatColor.RED + "Owner";
        } else if (player.hasPermission("rank.admin")) {
            return ChatColor.RED + "Admin";
        } else {
            return player.hasPermission("rank.vip") ? ChatColor.GREEN + "VIP" : ChatColor.DARK_GRAY + "Default";
        }
    }

    public static Team getPlayerTeam(Player player) {
        if (player.hasPermission("rank.owner")) {
            return RakoScoreboardManager.board.getTeam("owner") == null ? RakoScoreboardManager.board.registerNewTeam("owner") : RakoScoreboardManager.board.getTeam("owner");
        } else if (player.hasPermission("rank.admin")) {
            return RakoScoreboardManager.board.getTeam("admin") == null ? RakoScoreboardManager.board.registerNewTeam("admin") : RakoScoreboardManager.board.getTeam("admin");
        } else if (player.hasPermission("rank.vip")) {
            return RakoScoreboardManager.board.getTeam("vip") == null ? RakoScoreboardManager.board.registerNewTeam("vip") : RakoScoreboardManager.board.getTeam("vip");
        } else {
            return RakoScoreboardManager.board.getTeam("default") == null ? RakoScoreboardManager.board.registerNewTeam("default") : RakoScoreboardManager.board.getTeam("default");
        }
    }

    public static String getRankname(Player player) {
        if (player.hasPermission("rank.owner")) {
            return ChatColor.RED + "[Owner] ";
        } else if (player.hasPermission("rank.admin")) {
            return ChatColor.RED + "[Admin] ";
        } else {
            return player.hasPermission("rank.vip") ? ChatColor.GREEN + "[VIP] " : ChatColor.DARK_GRAY + "";
        }
    }
}
