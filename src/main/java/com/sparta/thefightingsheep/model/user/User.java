package com.sparta.thefightingsheep.model.user;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.persistence.Entity;
import javax.persistence.Table;

public class User {
	private String password;
	private String name;
	private @MongoId ObjectId id;
	private String email;

	public User(String password, String name, ObjectId id, String email) {
		this.password = password;
		this.name = name;
		this.id = id;
		this.email = email;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = new ObjectId(id);
	}

	public ObjectId getId(){
		return id;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"password = '" + password + '\'' + 
			",name = '" + name + '\'' + 
			",_id = '" + id + '\'' + 
			",email = '" + email + '\'' + 
			"}";
		}
}
