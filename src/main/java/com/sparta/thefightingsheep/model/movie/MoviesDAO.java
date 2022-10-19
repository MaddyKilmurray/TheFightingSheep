package com.sparta.thefightingsheep.model.movie;

import com.sparta.thefightingsheep.model.movie.repo.MoviesRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoviesDAO {
    @Autowired
    private MoviesRepository moveRepo;

    public MoviesDAO(MoviesRepository moveRepo) {
        this.moveRepo = moveRepo;
    }

    public MoviesDto findById(ObjectId id){
        MoviesDto movieDTO = new MoviesDto(null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
        Movies movie = moveRepo.findById(String.valueOf(movieDTO.getId())).get();
        MoviesDto result = new MoviesDto(movieDTO.getId(), movie.getAwards(),movie.getDirectors(),movie.getFullplot(),movie.getLanguages(),movie.getNumMflixComments(),movie.getPlot(),movie.getTitle(),movie.getWriters(),movie.getGenres(),movie.getLastupdated(),movie.getPoster(),movie.getTomatoes(),movie.getYear(),movie.getImdb(),movie.getRated(),movie.getReleased(),movie.getCast(),movie.getRuntime(),movie.getCountries(),movie.getType());
        return result;
    }
}
