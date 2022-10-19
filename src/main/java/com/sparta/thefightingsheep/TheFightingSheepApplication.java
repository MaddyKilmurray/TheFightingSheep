package com.sparta.thefightingsheep;

import com.sparta.thefightingsheep.modelm.entity.movie.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@SpringBootApplication
@EnableMongoRepositories
public class TheFightingSheepApplication {

    @Bean
    void f() {
        Movie movie = new Movie();
        movie.getCountries();
    }
    public static void main(String[] args) {
        SpringApplication.run(TheFightingSheepApplication.class, args);
    }

}
