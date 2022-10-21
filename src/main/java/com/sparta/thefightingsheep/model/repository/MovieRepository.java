package com.sparta.thefightingsheep.model.repository;

import com.sparta.thefightingsheep.model.entity.movie.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.nio.ByteBuffer;
import java.util.Optional;

public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findByTitle(String name);
}