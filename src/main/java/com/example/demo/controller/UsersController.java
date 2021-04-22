package com.example.demo.controller;

import com.example.demo.model.Users;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsersController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public Optional<Users> getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    public List<Users> createUser(@RequestBody Users newUser) {
        userService.addUser(newUser);
        return userService.getAllUsers();
    }

    @DeleteMapping("/user/{id}")
    public List<Users> deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return userService.getAllUsers();
    }
}
