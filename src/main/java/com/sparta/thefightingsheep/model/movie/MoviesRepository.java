package com.sparta.thefightingsheep.model.movie;

import com.sparta.thefightingsheep.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface MoviesRepository extends MongoRepository<MoviesEntity, String> {
    @Query("{id:'?0'}")
    Optional<User> findMovieByID(String id);
}