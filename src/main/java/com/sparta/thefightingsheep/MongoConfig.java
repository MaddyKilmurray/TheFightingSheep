package com.sparta.thefightingsheep;

import com.fasterxml.jackson.core.Version;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.util.SocketUtils;

import java.util.Collection;
import java.util.Collections;

@Configuration
public class MongoConfig {
    @Bean
    public MongoClient mongo() {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://hamza2ali:Zahirs12@thefightingsheep.8nvddvb.mongodb.net/test");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();

        return MongoClients.create(mongoClientSettings);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), "sample_mflix");
    }
}
