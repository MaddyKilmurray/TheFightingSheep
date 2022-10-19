package com.sparta.thefightingsheep.model.user;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document(collection = "users")
public class User {
	@Id
	private String id;
	private String name;
	private String email;
	private String password;
}
