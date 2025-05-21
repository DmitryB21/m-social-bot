package com.github.dmitryb21.msocialbot.client;

import org.springframework.beans.factory.annotation.Value;
import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.bots.DefaultBotOptions;

public class TelegramBotClient extends DefaultAbsSender {

    protected TelegramBotClient(@Value("${bot.token}") String botToken) {
        super(new DefaultBotOptions(), botToken);
    }
}
