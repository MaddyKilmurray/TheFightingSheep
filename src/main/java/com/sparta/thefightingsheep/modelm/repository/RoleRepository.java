package com.sparta.thefightingsheep.modelm.repository;

import com.sparta.thefightingsheep.modelm.entity.role.Role;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, ObjectId> {}
