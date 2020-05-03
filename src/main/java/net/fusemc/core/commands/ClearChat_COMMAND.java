package net.fusemc.core.commands;

import net.fusemc.core.CorePlugin;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClearChat_COMMAND implements CommandExecutor {

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(command.getName().equalsIgnoreCase("ClearChat")) {
            Player player = (Player) commandSender;

                if(player.hasPermission("fusemc.clearchat")){
                    for (int i = 1; i < 150; i++){
                        Bukkit.broadcastMessage(" ");
                    }

                    Bukkit.broadcastMessage(CorePlugin.prefix + "Der Chat wurde von: " + player.getName() + " geleert.");
                } else {
                    player.sendMessage(CorePlugin.prefix + "§cDu hast keine Berechtigungen für den Befehl.");
                }
        }
        return false;
    }
}
