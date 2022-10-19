package com.sparta.thefightingsheep.model.user;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document(collection="users")
public
class User {
	@MongoId
	private ObjectId id;
	private String email;
	private String name;
	private String password;

	public User() {
	}
}

