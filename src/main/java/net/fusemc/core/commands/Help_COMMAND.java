package net.fusemc.core.commands;

import net.fusemc.core.CorePlugin;
import net.fusemc.core.listener.PlayerJoin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Help_COMMAND implements CommandExecutor {

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
       if(command.getName().equalsIgnoreCase("help")){
            if(commandSender instanceof Player){
                Player player = (Player) commandSender;
                player.sendMessage(CorePlugin.prefix + "Bitte wende Dich an unseren Support. (TS: FuseMC.net)");
            }
       }
        return false;
    }
}
