package net.fusemc.core.listener;

import net.fusemc.core.rank.Rank;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class AsyncChat implements Listener {

    @EventHandler
    public void onAsyncChat(AsyncPlayerChatEvent asyncPlayerChatEvent) {
        Rank rank = Rank.getRank(asyncPlayerChatEvent.getPlayer());
        asyncPlayerChatEvent.setFormat(rank.getTag() + " §7| " +
                rank.getColor() + asyncPlayerChatEvent.getPlayer() + " ");
    }
}
