package net.fusemc.core.messages;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class Messages implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event){
        event.setDeathMessage(MessageAPI.getDeathMessage());
    }
}
