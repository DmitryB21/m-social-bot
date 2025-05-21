package com.github.dmitryb21.msocialbot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "chat_id")
    private long chatId;

    @Column(name = "last_message_at", nullable = false)
    private Instant lastMessageAt;

}
