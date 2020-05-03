package net.fusemc.core.listener;

import net.fusemc.core.CorePlugin;
import net.fusemc.core.scoreboard.Scoreboard;
import net.fusemc.core.scoreboard.ScoreboardAPI;
import net.fusemc.core.scoreboard.ScoreboardManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent playerJoinEvent){
        if(!playerJoinEvent.getPlayer().hasPermission(CorePlugin.getFuseServer().getNetworkSettings().getJoinPermissions())) playerJoinEvent.getPlayer().kickPlayer(CorePlugin.getPrefix() + "Du darfst den Server nicht betreten");
        if(!playerJoinEvent.getPlayer().hasPermission("fusenet.development.join") && CorePlugin.getFuseServer().getServerSettings().isDevelopment()){
            playerJoinEvent.getPlayer().kickPlayer(CorePlugin.getPrefix() + "Der Server ist im Development Mode");
        }

        if(ScoreboardAPI.isTeams()) {
            ScoreboardManager.sendTabAndScoreboard(playerJoinEvent.getPlayer());
        }
    }
}
