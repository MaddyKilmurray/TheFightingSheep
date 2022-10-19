package com.sparta.thefightingsheep.model.comments;

import com.sparta.thefightingsheep.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CommentsEntityRepository extends MongoRepository<CommentsEntity, String> {

    Optional<User> findUserByName(String name);
}