package com.github.dmitryb21.msocialbot.service;

import com.github.dmitryb21.msocialbot.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
}
