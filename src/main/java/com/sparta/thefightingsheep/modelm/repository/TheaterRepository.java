package com.sparta.thefightingsheep.modelm.repository;

import com.sparta.thefightingsheep.modelm.entity.theater.Theater;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TheaterRepository extends MongoRepository<Theater, ObjectId> {}
