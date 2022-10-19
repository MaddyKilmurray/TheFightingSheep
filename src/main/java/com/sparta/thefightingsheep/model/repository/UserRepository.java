package com.sparta.thefightingsheep.model.repository;

import com.sparta.thefightingsheep.model.entity.user.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {}
