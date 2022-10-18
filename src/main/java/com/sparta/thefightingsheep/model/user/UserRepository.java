package com.sparta.thefightingsheep.model.user;

import com.sparta.thefightingsheep.model.entity.UsersEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<UsersEntity, String> {

    Optional<User> findUserByName(String name);
}
