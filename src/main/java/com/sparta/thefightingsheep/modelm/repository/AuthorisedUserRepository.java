package com.sparta.thefightingsheep.modelm.repository;

import com.sparta.thefightingsheep.modelm.entity.user.AuthorisedUser;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorisedUserRepository extends MongoRepository<AuthorisedUser, ObjectId> {}
