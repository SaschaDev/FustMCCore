package net.fusemc.core.messages;

public class MessageAPI {

    private static String deathMessage;

    public static String getDeathMessage() {
        return deathMessage;
    }

    public static void setDeathMessage(String deathMessage) {
        MessageAPI.deathMessage = deathMessage;
    }
}
