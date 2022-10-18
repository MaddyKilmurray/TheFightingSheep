package com.sparta.thefightingsheep.model.theatre;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TheaterRepository extends MongoRepository<Theater, ObjectId> {
    Optional<Theater> findTheatreByById(ObjectId id);
}
