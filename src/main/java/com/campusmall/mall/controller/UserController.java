package com.campusmall.mall.controller;

import com.campusmall.mall.entity.User;
import com.campusmall.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    // POST metodi
    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody User user) {
        userService.save(user);
        return ResponseEntity.ok().build();
    }

    // PUT metodi (agar bor bo'lsa)
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);  // Bu qator bo‘lishi shart!
        userService.update(user);
        return ResponseEntity.ok(user);  // yoki ok().build()
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }
}
