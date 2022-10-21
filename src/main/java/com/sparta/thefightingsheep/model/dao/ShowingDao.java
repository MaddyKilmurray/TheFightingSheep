package com.sparta.thefightingsheep.model.dao;

import com.sparta.thefightingsheep.model.dto.ShowingDto;
import com.sparta.thefightingsheep.model.entity.showing.Showing;
import com.sparta.thefightingsheep.model.repository.ShowingRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShowingDao implements Dao<ShowingDto> {

    private final ShowingRepository repository;
    private final Assembler assembler;

    @Autowired
    public ShowingDao(ShowingRepository repository, Assembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @Override
    public String insert(ShowingDto item) {
        try {
            Showing showing = assembler.disassembleShowing(item);
            repository.insert(showing);
            return showing.getId().toHexString();
        } catch (Exception e) { return null; }
    }

    @Override
    public Optional<ShowingDto> findById(String id) {
        try {
            return Optional.of(assembler.assembleShowing(repository.findById(new ObjectId(id)).get()));
        } catch (Exception e) { return Optional.empty(); }
    }

    @Override
    public List<ShowingDto> findAll() {
        try {
            return repository.findAll().stream().map(assembler::assembleShowing).toList();
        } catch (Exception e) { return List.of(); }
    }

    @Override
    public boolean update(ShowingDto item) {
        try {
            repository.findById(new ObjectId(item.getId())).get();
            repository.save(assembler.disassembleShowing(item));
            return true;
        } catch (Exception e) { return false; }
    }

    @Override
    public boolean delete(String id) {
        try {
            Showing showing = repository.findById(new ObjectId(id)).get();
            repository.delete(showing);
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
