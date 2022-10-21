package com.sparta.thefightingsheep.model.dao;

import com.sparta.thefightingsheep.model.dto.MovieDto;
import com.sparta.thefightingsheep.model.entity.movie.Movie;
import com.sparta.thefightingsheep.model.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieDao implements Dao<MovieDto> {

    private final MovieRepository repository;
    private final Assembler assembler;

    @Autowired
    public MovieDao(MovieRepository repository, Assembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }


    @Override
    public String insert(MovieDto item) {
        try {
            Movie movie = assembler.disassembleMovie(item);
            repository.insert(movie);
            return movie.getId().toHexString();
        } catch (Exception e) { return null; }
    }

    @Override
    public Optional<MovieDto> findById(String id) {
        try {
            return Optional.of(assembler.assembleMovie(repository.findById(new ObjectId(id)).get()));
        } catch (Exception e) { return Optional.empty(); }
    }

    @Override
    public List<MovieDto> findAll() {
        try {
            return repository.findAll().stream().map(assembler::assembleMovie).toList();
        } catch (Exception e) { return List.of(); }
    }

    @Override
    public boolean update(MovieDto item) {
        try {
            repository.findById(new ObjectId(item.getId())).get();
            repository.save(assembler.disassembleMovie(item));
            return true;
        } catch (Exception e) { return false; }
    }

    @Override
    public boolean delete(String id) {
        try {
            Movie movie = repository.findById(new ObjectId(id)).get();
            repository.delete(movie);
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

    public Optional<MovieDto> findByName(String name) {
        try {
            return Optional.of(assembler.assembleMovie(repository.findByTitle(name).get()));
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
