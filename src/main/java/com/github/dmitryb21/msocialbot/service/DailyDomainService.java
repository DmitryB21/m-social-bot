package com.github.dmitryb21.msocialbot.service;

import com.github.dmitryb21.msocialbot.repository.DailyDomainRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DailyDomainService {

    private final DailyDomainRepository dailyDomainRepository;
}
