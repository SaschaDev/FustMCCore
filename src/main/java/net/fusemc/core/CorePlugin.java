package net.fusemc.core;

import de.dytanic.cloudnet.api.CloudAPI;
import de.dytanic.cloudnet.lib.server.info.ServerInfo;
import net.fusemc.core.bots.Chats;
import net.fusemc.core.bots.Telegram;
import net.fusemc.core.commands.ClearChat_COMMAND;
import net.fusemc.core.commands.Help_COMMAND;
import net.fusemc.core.entity.Entity;
import net.fusemc.core.handling.FuseServer;
import net.fusemc.core.listener.PlayerJoin;
import net.fusemc.core.messages.Messages;
import net.fusemc.core.server.ServerTypes;
import net.fusemc.core.sql.MySQL;
import net.fusemc.core.world.World;
import net.fusemc.core.world.WorldAPI;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.event.world.TimeSkipEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class CorePlugin extends JavaPlugin {

    private static CorePlugin instance;
    private static MySQL mySQL;

    private static FuseServer fuseServer;
    private static ServerInfo serverInfo;
    private static Telegram telegram;

    private static String serverid;

    public static String prefix = "§b§lFuseMC.net §7| ";

    @Override
    public void onEnable() {
        setInstance(this);
        setServerid(CloudAPI.getInstance().getServerId());
        setTelegram(new Telegram());
        getTelegram().sendMessage("Server:"  + getServerid() + " Startup", Chats.FUSENET);
        setServerInfo(CloudAPI.getInstance().getServerInfo(CloudAPI.getInstance().getServerId()));
        setFuseServer(new FuseServer(CloudAPI.getInstance().getServerId(), ServerTypes.valueOf(getServerInfo().getTemplate().getName())));
        getFuseServer().startUp();

        //setMySQL(new MySQL("", 3306, "", "", ""));
        //Bukkit.getPluginManager().registerEvents(new World(), this);
        //Bukkit.getPluginManager().registerEvents(new Entity(), this);
        //Bukkit.getPluginManager().registerEvents(new PlayerJoin(), this);
        //Bukkit.getPluginManager().registerEvents(new Messages(), this);

        //getCommand("help").setExecutor(new Help_COMMAND());
        //getCommand("ClearChat").setExecutor(new ClearChat_COMMAND());
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    public static String getPrefix() {
        return prefix;
    }

    public static ServerInfo getServerInfo() {
        return serverInfo;
    }

    public static Telegram getTelegram() {
        return telegram;
    }

    public static void setTelegram(Telegram telegram) {
        CorePlugin.telegram = telegram;
    }

    public static void setServerInfo(ServerInfo serverInfo) {
        CorePlugin.serverInfo = serverInfo;
    }

    public static FuseServer getFuseServer() {
        return fuseServer;
    }

    public static void setFuseServer(FuseServer fuseServer) {
        CorePlugin.fuseServer = fuseServer;
    }

    public static CorePlugin getInstance() {
        return instance;
    }

    public static void setInstance(CorePlugin instance) {
        CorePlugin.instance = instance;
    }

    public static MySQL getMySQL() {
        return mySQL;
    }

    public static void setMySQL(MySQL mySQL) {
        CorePlugin.mySQL = mySQL;
    }

    public static String getServerid() {
        return serverid;
    }

    public static void setServerid(String serverid) {
        CorePlugin.serverid = serverid;
    }
}
