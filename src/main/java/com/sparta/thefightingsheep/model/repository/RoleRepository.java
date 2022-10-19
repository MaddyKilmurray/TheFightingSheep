package com.sparta.thefightingsheep.model.repository;

import com.sparta.thefightingsheep.model.entity.role.Role;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, ObjectId> {}
