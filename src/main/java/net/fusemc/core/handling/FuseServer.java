package net.fusemc.core.handling;

import de.dytanic.cloudnet.api.CloudAPI;
import de.dytanic.cloudnet.bridge.CloudServer;
import net.fusemc.core.CorePlugin;
import net.fusemc.core.bots.Chats;
import net.fusemc.core.configuration.Configuration;
import net.fusemc.core.configuration.ConfigurationElements;
import net.fusemc.core.configuration.Configurations;
import net.fusemc.core.server.NetworkSettings;
import net.fusemc.core.server.ServerSettings;
import net.fusemc.core.server.ServerTypes;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;

public class FuseServer {

    String serverName;
    ServerTypes  serverTypes;
    NetworkSettings networkSettings;
    ServerSettings serverSettings;

    public FuseServer(String serverName, ServerTypes serverTypes) {
        setServerName(serverName);
        setServerTypes(serverTypes);
    }

    public void startUp() {

        setNetworkSettings((NetworkSettings) Configuration.getSetting(Configurations.valueOf(getServerTypes().getType()), ConfigurationElements.NETWORKSETTINGS));
        setServerSettings((ServerSettings) Configuration.getSetting(Configurations.valueOf(getServerTypes().getType()), ConfigurationElements.SERVERSETTINGS));
        CorePlugin.getTelegram().sendMessage("Server: " + getServerName() + " StartUp", Chats.FUSENET);

        if(getNetworkSettings() != null && getServerSettings() != null) {

            CloudServer.getInstance().setMaxPlayers(getNetworkSettings().getMaxPlayers());
            CloudAPI.getInstance().getServerInfo(getServerName()).getServerConfig().setHideServer(getNetworkSettings().isHideServer());
            Bukkit.getServer().setWhitelist(getServerSettings().isWhitelist());
            Bukkit.getServer().setDefaultGameMode(GameMode.valueOf(getServerSettings().getGameMode()));

        } else  {
            CorePlugin.getTelegram().sendMessage("Server: " + getServerName() + " Configurations Failed", Chats.FUSENET);
        }


    }

    public ServerTypes getServerTypes() {
        return serverTypes;
    }

    public String getServerName() {
        return serverName;
    }

    public NetworkSettings getNetworkSettings() {
        return networkSettings;
    }

    public ServerSettings getServerSettings() {
        return serverSettings;
    }

    public void setNetworkSettings(NetworkSettings networkSettings) {
        this.networkSettings = networkSettings;
    }

    public void setServerSettings(ServerSettings serverSettings) {
        this.serverSettings = serverSettings;
    }

    public void setServerTypes(ServerTypes serverTypes) {
        this.serverTypes = serverTypes;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
}
