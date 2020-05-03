package net.fusemc.core.server;

public class NetworkSettings {

    public int maxPlayers;
    public String joinPermissions;
    public boolean hideServer;
    public ServerTypes serverTypes;

    public NetworkSettings() {

    }

    public ServerTypes getServerTypes() {
        return serverTypes;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public String getJoinPermissions() {
        return joinPermissions;
    }

    public void setServerTypes(ServerTypes serverTypes) {
        this.serverTypes = serverTypes;
    }

    public void setHideServer(boolean hideServer) {
        this.hideServer = hideServer;
    }

    public void setJoinPermissions(String joinPermissions) {
        this.joinPermissions = joinPermissions;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public boolean isHideServer() {
        return hideServer;
    }
}
