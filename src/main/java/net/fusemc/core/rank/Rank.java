package net.fusemc.core.rank;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;

public enum Rank {

    ADMIN("A", ChatColor.DARK_RED),
    OPERATOR("O", ChatColor.DARK_RED),
    COMMUNITYMANAGER("C", ChatColor.DARK_RED),
    MODERATOR("M", ChatColor.RED),
    SUPPORTER("S", ChatColor.GREEN),
    ENTWICKLER("E", ChatColor.AQUA),
    BUILDER("B", ChatColor.GOLD),
    TRAINEE("T", ChatColor.DARK_PURPLE),
    USER("S", ChatColor.YELLOW);

    String tag;
    ChatColor color;

    Rank(String tag, ChatColor color){
        setTag(tag);
        setColor(color);
    }

    public static Rank getRank(Player player) {
        if(player.hasPermission("fusemc.admin")) {
            return Rank.ADMIN;
        } else if(player.hasPermission("fusemc.operator")) {
            return Rank.OPERATOR;
        } else if(player.hasPermission("fusemc.communtiymanager")) {
            return Rank.COMMUNITYMANAGER;
        } else if(player.hasPermission("fusemc.moderator")) {
           return Rank.MODERATOR;
        } else if(player.hasPermission("fusemc.supporter")) {
            return Rank.SUPPORTER;
        } else if(player.hasPermission("fusemc.entwickler")){
            return Rank.ENTWICKLER;
        } else if(player.hasPermission("fusemc.builder")) {
            return Rank.BUILDER;
        } else if(player.hasPermission("fusemc.trainee")) {
            return Rank.TRAINEE;
        } else {
            return Rank.USER;
        }
    }

    public ChatColor getColor() {
        return color;
    }

    public String getTag() {
        return tag;
    }

    public void setColor(ChatColor color) {
        this.color = color;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
