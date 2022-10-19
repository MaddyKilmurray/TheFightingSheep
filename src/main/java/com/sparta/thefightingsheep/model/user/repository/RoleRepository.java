package com.sparta.thefightingsheep.model.user.repository;

import com.sparta.thefightingsheep.model.user.Role;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, ObjectId> {

    Role findByRole(String role);
}
