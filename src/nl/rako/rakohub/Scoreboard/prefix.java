//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package nl.rako.rakohub.Scoreboard;

import nl.rako.rakohub.Scoreboard.scoreboard;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

public class prefix {
    public prefix() {
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
            return scoreboard.board.getTeam("owner") == null ? scoreboard.board.registerNewTeam("owner") : scoreboard.board.getTeam("owner");
        } else if (player.hasPermission("rank.admin")) {
            return scoreboard.board.getTeam("admin") == null ? scoreboard.board.registerNewTeam("admin") : scoreboard.board.getTeam("admin");
        } else if (player.hasPermission("rank.vip")) {
            return scoreboard.board.getTeam("vip") == null ? scoreboard.board.registerNewTeam("vip") : scoreboard.board.getTeam("vip");
        } else {
            return scoreboard.board.getTeam("default") == null ? scoreboard.board.registerNewTeam("default") : scoreboard.board.getTeam("default");
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
