package net.fusemc.core.configuration;

public enum  ConfigurationElements {

    NETWORKSETTINGS("NetworkSettings"),
    SERVERSETTINGS("ServerSettings");

    String elementType;

    ConfigurationElements(String elementType){

    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }
}
