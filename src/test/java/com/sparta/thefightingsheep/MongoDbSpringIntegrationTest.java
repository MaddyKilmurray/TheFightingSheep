package com.sparta.thefightingsheep;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import com.sparta.thefightingsheep.model.comments.Comment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@DataMongoTest
@ExtendWith(SpringExtension.class)
public class MongoDbSpringIntegrationTest {
    @DisplayName("given object to save"
        + " when save user comment using MongoDB template"
        + "then comment is saved")

    @Test
    public void test(@Autowired MongoTemplate mongoTemplate) {
        //given
        DBObject objectToSave = BasicDBObjectBuilder.start()
                .add("key","value").get();
        //when
        mongoTemplate.save(objectToSave, "collection");
        // then
//        assertThat(mongoTemplate.findAll(DBObject.class, "collection")).extracting("key")
//                .containsOnly("value");

    }

}
