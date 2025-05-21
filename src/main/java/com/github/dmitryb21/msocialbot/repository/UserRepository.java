package com.github.dmitryb21.msocialbot.repository;

import com.github.dmitryb21.msocialbot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
