package com.sparta.thefightingsheep.model.movie.repo;

import com.sparta.thefightingsheep.model.movie.Movies;
import com.sparta.thefightingsheep.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface MoviesRepository extends MongoRepository<Movies, String> {
    @Query("{_id:'?0'}")
    Optional<User> findMovieByID(String id);
}