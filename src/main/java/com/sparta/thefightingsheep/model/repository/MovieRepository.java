package com.sparta.thefightingsheep.model.repository;

import com.sparta.thefightingsheep.model.entity.movie.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, ObjectId> {}
