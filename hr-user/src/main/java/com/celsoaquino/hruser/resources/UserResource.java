package com.celsoaquino.hruser.resources;

import com.celsoaquino.hruser.entities.User;
import com.celsoaquino.hruser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User obj = userRepository.findById(id).get();
        return ResponseEntity.ok(obj);
    }

    @GetMapping("/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email) {
        User obj = userRepository.findByEmail(email);
        return ResponseEntity.ok(obj);
    }
}
