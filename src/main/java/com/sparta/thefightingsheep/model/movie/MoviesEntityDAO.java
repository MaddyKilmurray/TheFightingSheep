package com.sparta.thefightingsheep.model.movie;

import com.sparta.thefightingsheep.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MoviesEntityDAO {
    @Autowired
    private MoviesEntityRepository moveRepo;

    public MoviesEntityDAO(MoviesEntityRepository moveRepo) {
        this.moveRepo = moveRepo;
    }
}
