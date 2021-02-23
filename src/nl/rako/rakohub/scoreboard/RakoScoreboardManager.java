//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package nl.rako.rakohub.scoreboard;

import java.util.Iterator;

import nl.rako.rakohub.functions.PrefixManager;
import nl.rako.rakohub.rakohub;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;

public class RakoScoreboardManager {
    public static org.bukkit.scoreboard.Scoreboard board;



    public static void createScoreboard(Player player) {
        org.bukkit.scoreboard.ScoreboardManager manager = Bukkit.getScoreboardManager();
        board = manager.getNewScoreboard();
        Objective objective = board.registerNewObjective("Rakoserver", "Rakoserver");
        objective.setDisplayName(ChatColor.GRAY + "»" + ChatColor.GOLD + "»" + ChatColor.GRAY + "»" + ChatColor.YELLOW + " Rakoserver " + ChatColor.GRAY + "«" + ChatColor.GOLD + "«" + ChatColor.GRAY + "«");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        Score name = objective.getScore(ChatColor.WHITE + "Name: " + ChatColor.GREEN + player.getName());
        name.setScore(5);
        Score rank = objective.getScore(ChatColor.WHITE + "Rank: " + PrefixManager.getRankboard(player));
        rank.setScore(4);
        Score spacer = objective.getScore("§f");
        spacer.setScore(3);
        Integer globalPlayerCount = rakohub.playerCount.get("ALL");
        Score score1 = objective.getScore(ChatColor.WHITE + "Players: " + ChatColor.GREEN + globalPlayerCount);
        score1.setScore(2);
        Iterator var7 = Bukkit.getOnlinePlayers().iterator();

        while(var7.hasNext()) {
            Player all = (Player)var7.next();
            PrefixManager.getPlayerTeam(all).setPrefix(PrefixManager.getRankname(all));
            PrefixManager.getPlayerTeam(all).addEntry(all.getName());
            player.setScoreboard(board);
        }

    }
}
