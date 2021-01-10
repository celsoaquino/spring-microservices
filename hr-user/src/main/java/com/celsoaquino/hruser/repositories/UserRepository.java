package com.celsoaquino.hruser.repositories;

import com.celsoaquino.hruser.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
