package net.fusemc.core.server;

public class   ServerSettings {

    public boolean whitelist;
    public boolean development;

    public String defaultWorld;
    public String gameMode;
    public String motd;

    public ServerSettings() {

    }

    public boolean isDevelopment() {
        return development;
    }

    public void setDevelopment(boolean development) {
        this.development = development;
    }

    public String getDefaultWorld() {
        return defaultWorld;
    }

    public void setDefaultWorld(String defaultWorld) {
        this.defaultWorld = defaultWorld;
    }

    public String getMotd() {
        return motd;
    }

    public String getGameMode() {
        return gameMode;
    }

    public boolean isWhitelist() {
        return whitelist;
    }

    public void setMotd(String motd) {
        this.motd = motd;
    }

    public void setWhitelist(boolean whitelist) {
        this.whitelist = whitelist;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }
}
