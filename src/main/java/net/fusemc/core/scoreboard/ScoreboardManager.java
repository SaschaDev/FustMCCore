package net.fusemc.core.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

import java.util.HashMap;
import java.util.UUID;

public class ScoreboardManager {

    public static HashMap<UUID, net.fusemc.core.scoreboard.Scoreboard> scoreboardHashMap = new HashMap<UUID,net.fusemc.core.scoreboard.Scoreboard>();

    public static void checkTabPrefix(Player player, org.bukkit.scoreboard.Scoreboard sb) {
        if(player.hasPermission("fusemc.admin")) {
            sb.getTeam("01admin").addEntry(player.getName());
        } else if(player.hasPermission("fusemc.operator")) {
            sb.getTeam("02operator").addEntry(player.getName());
        } else if(player.hasPermission("fusemc.communtiymanager")) {
            sb.getTeam("03communitymanager").addEntry(player.getName());
        } else if(player.hasPermission("fusemc.moderator")) {
            sb.getTeam("05moderator").addEntry(player.getName());
        } else if(player.hasPermission("fusemc.supporter")) {
            sb.getTeam("06supporter").addEntry(player.getName());
        } else if(player.hasPermission("fusemc.entwickler")){
            sb.getTeam("04entwickler").addEntry(player.getName());
        } else if(player.hasPermission("fusemc.builder")) {
            sb.getTeam("04builder").addEntry(player.getName());
        } else if(player.hasPermission("fusemc.trainee")) {
            sb.getTeam("08Trainee").addEntry(player.getName());
        } else {
            sb.getTeam("09Spieler").addEntry(player.getName());
        }

    }

    public static void sendTabAndScoreboard(Player p) {
        (new Scoreboard()).sendToPlayer(p);
         if (p.hasPermission("fusemc.admin")) {
            for (Player a : Bukkit.getOnlinePlayers())
                ((Scoreboard)scoreboardHashMap.get(a.getUniqueId())).board.getTeam("01admin").addEntry(p.getName());
        } else if (p.hasPermission("fusemc.operator")) {
            for (Player a : Bukkit.getOnlinePlayers())
                ((Scoreboard)scoreboardHashMap.get(a.getUniqueId())).board.getTeam("02operator").addEntry(p.getName());
        } else if (p.hasPermission("fusemc.communitymanager")) {
            for (Player a : Bukkit.getOnlinePlayers())
                ((Scoreboard)scoreboardHashMap.get(a.getUniqueId())).board.getTeam("03communtiymanager").addEntry(p.getName());
        } else if (p.hasPermission("fusemc.moderator")) {
            for (Player a : Bukkit.getOnlinePlayers())
                ((Scoreboard)scoreboardHashMap.get(a.getUniqueId())).board.getTeam("05moderator").addEntry(p.getName());
         } else if (p.hasPermission("fusemc.supporter")) {
            for (Player a : Bukkit.getOnlinePlayers())
                ((Scoreboard)scoreboardHashMap.get(a.getUniqueId())).board.getTeam("06supporter").addEntry(p.getName());
         } else if (p.hasPermission("fusemc.entwickler")) {
            for (Player a : Bukkit.getOnlinePlayers())
                ((Scoreboard)scoreboardHashMap.get(a.getUniqueId())).board.getTeam("04entwickler").addEntry(p.getName());
         } else if (p.hasPermission("fusemc.builder")) {
            for (Player a : Bukkit.getOnlinePlayers())
                ((Scoreboard)scoreboardHashMap.get(a.getUniqueId())).board.getTeam("04builder").addEntry(p.getName());
         } else if (p.hasPermission("fusemc.trainee")) {
             for (Player a : Bukkit.getOnlinePlayers())
                 ((Scoreboard)scoreboardHashMap.get(a.getUniqueId())).board.getTeam("08Trainee").addEntry(p.getName());
        } else {
            for (Player a : Bukkit.getOnlinePlayers())
                ((Scoreboard)scoreboardHashMap.get(a.getUniqueId())).board.getTeam("09Spieler").addEntry(p.getName());
        }
    }
}

