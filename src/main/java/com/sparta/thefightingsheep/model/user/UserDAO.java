package com.sparta.thefightingsheep.model.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDAO {

    @Autowired
    private UserRepository userRepo;

    public UserDAO(UserRepository userRepo) {
        this.userRepo = userRepo;
    }


}
