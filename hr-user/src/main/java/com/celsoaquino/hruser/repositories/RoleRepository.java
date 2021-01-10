package com.celsoaquino.hruser.repositories;

import com.celsoaquino.hruser.entities.Role;
import com.celsoaquino.hruser.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
