package com.example.jwtauth.demo.services;

import com.example.jwtauth.demo.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "nkp", "nkp@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Shipra", "shipra@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Ashish", "ashish@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Hudhud", "hudhud@gmail.com"));
    }

    public List<User> getUsers() {
        return store;
    }

}
