package com.github.dmitryb21.msocialbot.service;

import com.github.dmitryb21.msocialbot.repository.MessajeReposiyory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MessageService {

    private final MessajeReposiyory messajeReposiyory;

}
