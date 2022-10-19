package com.sparta.thefightingsheep.model.dao;

import com.sparta.thefightingsheep.model.dto.MovieDto;
import com.sparta.thefightingsheep.model.entity.movie.Movie;
import com.sparta.thefightingsheep.model.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieDao {

    private final MovieRepository repository;
    private final Assembler assembler;

    @Autowired
    public MovieDao(MovieRepository repository, Assembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    public MovieDto findById(String id) {
        Movie movie = repository.findById(new ObjectId(id)).get();
        MovieDto result = assembler.assembleMovie(movie);
        return result;
    }
}
