package com.jwt.example.services;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServices {

    private List<User> store = new ArrayList<>();

    public UserServices() {

        store.add(new User(UUID.randomUUID().toString(), "Sanjay", "sanjaigoswami619@gmail.com" ));
        store.add(new User(UUID.randomUUID().toString(), "Anil", "anil@gmail.com" ));
        store.add(new User(UUID.randomUUID().toString(), "Suraj", "suraj@gmail.com" ));
        store.add(new User(UUID.randomUUID().toString(), "Rahool", "Rahool@gmail.com" ));
    }

    public List<User> getStore(){
        return store;
    }
}
