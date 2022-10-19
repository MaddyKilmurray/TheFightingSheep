package com.sparta.thefightingsheep.model.repository;

import com.sparta.thefightingsheep.model.entity.theater.Theater;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TheaterRepository extends MongoRepository<Theater, ObjectId> {}