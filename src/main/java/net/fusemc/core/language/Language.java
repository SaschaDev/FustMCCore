package net.fusemc.core.language;

public enum Language {

    GERMAN("Germany", "GER"),
    ENGLISH("Engish", "ENG");

    String name;
    String shotCut;

    Language(String name, String shotCut){
        setName(name);
        setShotCut(shotCut);
    }

    

    public String getName() {
        return name;
    }

    public String getShotCut() {
        return shotCut;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShotCut(String shotCut) {
        this.shotCut = shotCut;
    }
}
