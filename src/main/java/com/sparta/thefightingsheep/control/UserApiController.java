package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.user.User;
import com.sparta.thefightingsheep.model.user.UserDAO;
import com.sparta.thefightingsheep.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private UserDAO userDAO;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id){
        User result = userRepo.findById(String.valueOf(id)).get();
        return result;
    }
}
