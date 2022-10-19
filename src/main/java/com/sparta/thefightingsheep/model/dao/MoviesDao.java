package com.sparta.thefightingsheep.model.dao;

import com.sparta.thefightingsheep.model.dto.MovieDto;
import com.sparta.thefightingsheep.model.entity.movie.Movie;
import com.sparta.thefightingsheep.model.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoviesDao {

    private final MovieRepository repository;

    @Autowired
    public MoviesDao(MovieRepository repository) {
        this.repository = repository;
    }

    public MovieDto findById(String id) {
        Movie movie = repository.findById(new ObjectId(id)).get();
        MovieDto result = new MovieDto(
                movie.getId().toString(),
                movie.getAwards(),
                movie.getFullPlot(),
                movie.getNumMflixComments(),
                movie.getPlot(),
                movie.getTitle(),
                movie.getFullPlot(),
                movie.getPoster(),
                movie.getTomatoes(),
                movie.getYear(),
                movie.getImdb(),
                movie.getType(),
                movie.getLastUpdated(),
                movie.getType(),
                movie.getDirectors(),
                movie.getLanguages(),
                movie.getWriters(),
                movie.getGenres(),
                movie.getCountries(),
                movie.getCountries()
        );
        return result;
    }
}
