package com.sparta.thefightingsheep.model.dao;

import com.sparta.thefightingsheep.model.dto.UserDto;
import com.sparta.thefightingsheep.model.entity.user.User;
import com.sparta.thefightingsheep.model.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDao implements Dao<UserDto> {

    private final UserRepository repository;
    private final Assembler assembler;

    @Autowired
    public UserDao(UserRepository repository, Assembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @Override
    public String insert(UserDto item) {
        try {
            User user = assembler.disassembleUser(item);
            repository.insert(user);
            return user.getId().toHexString();
        } catch (Exception e) { return null; }
    }

    @Override
    public Optional<UserDto> findById(String id) {
        try {
            return Optional.of(assembler.assembleUser(repository.findById(new ObjectId(id)).get()));
        } catch (Exception e) { return Optional.empty(); }
    }

    @Override
    public List<UserDto> findAll() {
        try {
            return repository.findAll().stream().map(assembler::assembleUser).toList();
        } catch (Exception e) { return List.of(); }
    }

    @Override
    public boolean update(UserDto item) {
        try {
            repository.findById(new ObjectId(item.getId())).get();
            repository.save(assembler.disassembleUser(item));
            return true;
        } catch (Exception e) { return false; }
    }

    @Override
    public boolean delete(String id) {
        try {
            User user = repository.findById(new ObjectId(id)).get();
            repository.delete(user);
            return true;
        } catch (Exception e) { return false; }
    }

    @Override
    public boolean deleteAll() {
        try {
            repository.deleteAll();
            return true;
        } catch (Exception e) { return false; }
    }
}
