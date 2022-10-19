package com.sparta.thefightingsheep.model.dao;


import com.sparta.thefightingsheep.model.repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheaterDao {

    @Autowired
    private TheaterRepository theaterRepo;

    public TheaterDao(TheaterRepository theaterRepo) { this.theaterRepo = theaterRepo; }
}
