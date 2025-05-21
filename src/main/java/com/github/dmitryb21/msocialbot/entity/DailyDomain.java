package com.github.dmitryb21.msocialbot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DailyDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;



}
