package net.fusemc.core.bots;


import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;

public class Telegram {

    private TelegramBot telegramBot;

    public Telegram()  {
        setTelegramBot(new TelegramBot("1151012537:AAHA2rbs8O7oVT8WJyUNgAa42IkMtACjIoM"));
        getTelegramBot().setUpdatesListener(updates -> {
          return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });
    }

    public void sendMessage(String message, Chats chats){
        long chatID = chats.getChatId();
        SendResponse response = getTelegramBot().execute(new SendMessage(chatID, message));
        response.message();
    }

    public TelegramBot getTelegramBot() {
        return telegramBot;
    }

    public void setTelegramBot(TelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }
}
