package net.fusemc.core.bots;

public enum  Chats {

    FUSENET("FuseNET", -409766827);

    String chatName;
    int chatId;

    Chats(String chatName, int chatId){
        setChatName(chatName);
        setChatId(chatId);
    }

    public int getChatId() {
        return chatId;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }
}
