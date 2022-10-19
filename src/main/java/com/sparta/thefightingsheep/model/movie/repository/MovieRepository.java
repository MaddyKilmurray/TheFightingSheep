package com.sparta.thefightingsheep.model.movie.repository;

import com.sparta.thefightingsheep.model.movie.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, String> {

}
