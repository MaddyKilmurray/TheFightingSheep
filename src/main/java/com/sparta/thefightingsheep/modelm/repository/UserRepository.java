package com.sparta.thefightingsheep.modelm.repository;

import com.sparta.thefightingsheep.modelm.entity.user.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {}
