package com.sparta.thefightingsheep.model.repository;

import com.sparta.thefightingsheep.model.entity.showing.Showing;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShowingRepository extends MongoRepository<Showing, ObjectId> {}