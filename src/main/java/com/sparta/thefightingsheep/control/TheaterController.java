package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.entity.theater.Theater;
import com.sparta.thefightingsheep.model.repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/all")
    public List<Theater> getAllTheaters() {
        return theaterRepo.findAll();
    }
}
