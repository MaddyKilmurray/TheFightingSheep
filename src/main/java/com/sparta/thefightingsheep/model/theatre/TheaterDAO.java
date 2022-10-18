package com.sparta.thefightingsheep.model.theatre;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheaterDAO {

    @Autowired
    private TheaterRepository theaterRepo;

    public TheaterDAO(TheaterRepository theaterRepo) { this.theaterRepo = theaterRepo; }
}
