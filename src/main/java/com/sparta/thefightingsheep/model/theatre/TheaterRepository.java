package com.sparta.thefightingsheep.model.theatre;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TheaterRepository extends MongoRepository<Theater, ObjectId> {
    Optional<Theater> findTheaterByTheaterId(ObjectId id);
}
