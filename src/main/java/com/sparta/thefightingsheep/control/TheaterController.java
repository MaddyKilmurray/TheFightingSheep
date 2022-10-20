package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.entity.theater.Theater;
import com.sparta.thefightingsheep.model.repository.TheaterRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/theater")
public class TheaterController {

    @Autowired
    private TheaterRepository theaterRepo;

//    @Autowired
//    private TheaterDao dao;

    @GetMapping("/find/all")
    public List<Theater> getAllTheaters() {
        return theaterRepo.findAll();
    }

    @GetMapping("/find/{id}")
    public Theater getTheaterById(@PathVariable String id) {
        Theater theater = theaterRepo.findById(new ObjectId(id).get()).get();
        return theater;
    }
}
