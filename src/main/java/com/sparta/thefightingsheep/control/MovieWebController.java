package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.entity.movie.Movie;
import com.sparta.thefightingsheep.model.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieWebController {

    @Autowired
    private MovieRepository repo;

    @GetMapping("/movies/all")
    public List<Movie> getAlMovies(){
        return repo.findAll();
    }
}
