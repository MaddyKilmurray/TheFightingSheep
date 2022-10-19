package com.sparta.thefightingsheep.modelm.repository;

import com.sparta.thefightingsheep.modelm.entity.movie.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, ObjectId> {}
