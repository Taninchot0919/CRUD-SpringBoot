package com.example.demo.service;

import com.example.demo.model.Cosmetic;
import com.example.demo.model.Users;
import com.example.demo.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UsersRepository usersRepository;

    public List<Users> getAllUsers(){
        return usersRepository.findAll();
    }

    public void addUser(Users newUser){
        usersRepository.save(newUser);
    }

    public void deleteUser(int id){
        usersRepository.deleteById(id);
    }

    public Optional<Users> getUserById(int id){
        return usersRepository.findById(id);
    }
}
