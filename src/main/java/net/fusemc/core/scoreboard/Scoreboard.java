package net.fusemc.core.scoreboard;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Team;

public class Scoreboard {

    public org.bukkit.scoreboard.Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();

    public Scoreboard() {
        Objective objective = this.board.registerNewObjective("dummy", "displayed");

        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.setDisplayName(ScoreboardAPI.getDisplay());
        objective.getScore(ScoreboardAPI.getLine1()).setScore(9);
        objective.getScore(ScoreboardAPI.getLine2()).setScore(8);
        objective.getScore(ScoreboardAPI.getLine3()).setScore(7);
        objective.getScore(ScoreboardAPI.getLine4()).setScore(6);
        objective.getScore(ScoreboardAPI.getLine5()).setScore(5);
        objective.getScore(ScoreboardAPI.getLine6()).setScore(4);
        objective.getScore(ScoreboardAPI.getLine7()).setScore(3);
        objective.getScore(ScoreboardAPI.getLine8()).setScore(2);
        objective.getScore(ScoreboardAPI.getLine9()).setScore(1);

        Team admin = board.registerNewTeam("01admin");
        Team operator = board.registerNewTeam("02operator");
        Team communitymanger = board.registerNewTeam("03communitymanager");
        Team moderator = board.registerNewTeam("05moderator");
        Team supporter = board.registerNewTeam("06supporter");
        Team entwickler = board.registerNewTeam("04entwickler");
        Team builder = board.registerNewTeam("04builder");
        Team trainee = board.registerNewTeam("08Trainee");
        Team user = board.registerNewTeam("09spieler");

        admin.setPrefix("§l§4A §7| §4");
        operator.setPrefix("§l§4O §7| §4");
        communitymanger.setPrefix("§l§4CM §7| §4");
        moderator.setPrefix("§l§cM §7| §c");
        supporter.setPrefix("§l§aS §7| §a");
        entwickler.setPrefix("§l§bE §7| §b");
        builder.setPrefix("§l§6B §7| §6");
        trainee.setPrefix("§l§dT §7| §d");
        user.setPrefix("§l§eU §7| §e");

    }

    public void sendToPlayer(Player p) {
        for (Player a : Bukkit.getOnlinePlayers())
            ScoreboardManager.checkTabPrefix(a, this.board);
        p.setScoreboard(this.board);
        ScoreboardManager.scoreboardHashMap.put(p.getUniqueId(), this);
    }


}
