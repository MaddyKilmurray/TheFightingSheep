package com.sparta.thefightingsheep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@SpringBootApplication
@EnableMongoRepositories
public class TheFightingSheepApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheFightingSheepApplication.class, args);
    }

}
