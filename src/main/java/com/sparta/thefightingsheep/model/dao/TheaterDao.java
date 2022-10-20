package com.sparta.thefightingsheep.model.dao;

import com.sparta.thefightingsheep.model.dto.TheaterDto;
import com.sparta.thefightingsheep.model.entity.theater.Theater;
import com.sparta.thefightingsheep.model.repository.TheaterRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TheaterDao implements Dao<TheaterDto> {

    private final TheaterRepository repository;
    private final Assembler assembler;

    @Autowired
    public TheaterDao(TheaterRepository repository, Assembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @Override
    public String insert(TheaterDto item) {
        try {
            Theater theater = assembler.disassembleTheater(item);
            repository.insert(theater);
            return theater.getId().toHexString();
        } catch (Exception e){ return null;}
    }

    @Override
    public Optional<TheaterDto> findById(String id) {
        try {
            return Optional.of(assembler.assembleTheater(repository.findById(new ObjectId(id)).get()));
        } catch (Exception e) { return Optional.empty();}
    }

    @Override
    public List<TheaterDto> findAll() {
        try {
            return repository.findAll().stream().map(assembler::assembleTheater).toList();
        } catch (Exception e) { return List.of(); }
    }

    @Override
    public boolean update(TheaterDto item) {
        try {
            repository.findById(new ObjectId(item.getId())).get();
            repository.save(assembler.disassembleTheater(item));
            return true;
        } catch (Exception e) { return false;}
    }

    @Override
    public boolean delete(String id) {
        try {
            Theater theater = repository.findById(new ObjectId(id)).get();
            repository.delete(theater);
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
