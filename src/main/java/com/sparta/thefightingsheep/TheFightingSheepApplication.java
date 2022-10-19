package com.sparta.thefightingsheep;

import com.sparta.thefightingsheep.model.entity.user.AuthorisedUser;
import com.sparta.thefightingsheep.model.repository.AuthorisedUserRepository;
import org.bson.types.ObjectId;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class TheFightingSheepApplication {

    @Bean
    CommandLineRunner runner(AuthorisedUserRepository repository) {
        return args -> {
            AuthorisedUser user = repository.findById(new ObjectId("634ff90fc0e81704a3a1626f")).get();
//            System.out.println(user);
        };
    }
    public static void main(String[] args) {
        SpringApplication.run(TheFightingSheepApplication.class, args);
    }

}
