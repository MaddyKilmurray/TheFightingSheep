package com.sparta.thefightingsheep.model.theatre;

import com.sparta.thefightingsheep.model.movie.MoviesEntity;
import com.sparta.thefightingsheep.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TheatersRepository extends MongoRepository<TheatersRepository, String> {

    Optional<User> findUserByName(String name);
}