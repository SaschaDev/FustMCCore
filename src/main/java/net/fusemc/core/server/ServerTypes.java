package net.fusemc.core.server;

public enum ServerTypes {

    LOBBY("default");

    String type;

    ServerTypes(String type) {
        setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
