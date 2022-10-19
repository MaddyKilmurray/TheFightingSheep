package com.sparta.thefightingsheep.model.movie;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoviesEntityDAO {
    @Autowired
    private MoviesRepository moveRepo;

    public MoviesEntityDAO(MoviesRepository moveRepo) {
        this.moveRepo = moveRepo;
    }

    public MoviesEntityDto findById(ObjectId id){
        MoviesEntityDto movieDTO = new MoviesEntityDto(null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
        MoviesEntity movie = moveRepo.findById(String.valueOf(movieDTO.getId())).get();
        MoviesEntityDto result = new MoviesEntityDto(movieDTO.getId(), movie.getAwards(),movie.getDirectors(),movie.getFullplot(),movie.getLanguages(),movie.getNumMflixComments(),movie.getPlot(),movie.getTitle(),movie.getWriters(),movie.getGenres(),movie.getLastupdated(),movie.getPoster(),movie.getTomatoes(),movie.getYear(),movie.getImdb(),movie.getRated(),movie.getReleased(),movie.getCast(),movie.getRuntime(),movie.getCountries(),movie.getType());
        return result;
    }
}
