package com.github.dmitryb21.msocialbot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false, columnDefinition = "VARCHAR(255)")
    private String request;

    @Column(nullable = false, columnDefinition = "VARCHAR(255)")
    private String response;

}
