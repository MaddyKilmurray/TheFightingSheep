package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.theatre.Theater;
import com.sparta.thefightingsheep.model.theatre.TheaterRepository;
import com.sparta.thefightingsheep.model.user.User;
import com.sparta.thefightingsheep.model.user.UserDAO;
import com.sparta.thefightingsheep.model.user.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserApiController {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private TheaterRepository theaterRepository;

    @GetMapping("/theatre/all")
    public List<Theater> findAll() {
        List<Theater> theaters = theaterRepository.findAll();
        return theaters;
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable String id){
        User result = userRepo.findById(new ObjectId(id)).get();
        return result;
    }
}
