package net.fusemc.core.configuration;

import net.fusemc.core.server.ServerTypes;

public enum Configurations {

    LOBBY(ServerTypes.LOBBY, "lobby.xml");

    ServerTypes serverTypes;
    String configurationName;

    Configurations(ServerTypes serverTypes, String configurationName) {
        setConfigurationName(configurationName);
        setServerTypes(serverTypes);
    }

    public ServerTypes getServerTypes() {
        return serverTypes;
    }

    public String getConfigurationName() {
        return configurationName;
    }

    public void setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
    }

    public void setServerTypes(ServerTypes serverTypes) {
        this.serverTypes = serverTypes;
    }
}
