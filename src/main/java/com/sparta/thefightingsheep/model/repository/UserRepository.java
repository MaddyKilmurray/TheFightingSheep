package com.sparta.thefightingsheep.model.repository;

import com.sparta.thefightingsheep.model.entity.user.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    @Query("{ 'email' : '?0' }")
    Optional<User> findByEmail (String email);
}