package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.entity.movie.Movie;

import com.sparta.thefightingsheep.model.dao.MovieDao;
import com.sparta.thefightingsheep.model.dto.MovieDto;

import com.sparta.thefightingsheep.model.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Controller
public class MovieWebController {
    @Autowired
    private MovieRepository movieRepo;

    @Autowired
    private MovieDao movieDAO;
    @GetMapping("/movie/{id}")
    public Optional<MovieDto> getMovieById(@PathVariable String id){
        Optional<MovieDto> result = movieDAO.findById(id);
        return result;
    }
    @GetMapping("/movie/all")
    public List<Movie> findAllMovies()
    {
        return movieRepo.findAll();
    }

    @DeleteMapping("/movie/delete/{id}")
    public ObjectId deleteById(@PathVariable String id){
        Movie movie = movieRepo.findById(new ObjectId(id)).get();
        movieRepo.delete(movie);
        return movie.getId();
    }

    @GetMapping("/movie/form/create")
    public String movieForm(Model model)
    {
        Movie movie = new Movie();
        model.addAttribute("movie",movie);
        return "movieForm";
    }

    @PostMapping("/movie/add/{id}/{awards_nominations}/{awards_text}/{awards_wins}/{directors}/{fullplot}/{languages}/{num_mflix_comments}/{plot}/{title}/{writers}/{genres}/{lastupdated}{poster}/{tomatoes_consensus}/{tomatoes_critic_meter}/{tomatoes_critic_numReviews}/{tomatoes_critic_rating}/{tomatoes_dvd}/{tomatoes_fresh}/{tomatoes_lastUpdated}/{tomatoes_production}/{tomatoes_rotten}/{tomatoes_viewer_meter}/{tomatoes_viewer_numReviews}/{tomatoes_viewer_rating}/{tomatoes_website}/{year}/{imdb_id}/{imdb_rating}/{imdb_votes}/{rated}/{released}/{cast}/{runtime}/{countries}/{type}")
    public String addMovie(@PathVariable String id, @PathVariable Integer awards_nominations, @PathVariable String awards_text, @PathVariable Integer awards_wins, @PathVariable List<String> directors, @PathVariable String fullplot, @PathVariable List<String> languages, @PathVariable Integer num_mflix_comments, @PathVariable String plot, @PathVariable String title, @PathVariable List<String> writers, @PathVariable List<String> genres, @PathVariable Instant lastupdated, @PathVariable String poster, @PathVariable String tomatoes_consensus, @PathVariable Integer tomatoes_critic_meter, @PathVariable Integer tomatoes_critic_numReviews, @PathVariable Double tomatoes_critic_rating, @PathVariable Instant tomatoes_dvd, @PathVariable Integer tomatoes_fresh, @PathVariable Instant tomatoes_lastUpdated, @PathVariable String tomatoes_production, @PathVariable Integer tomatoes_rotten, @PathVariable Integer tomatoes_viewer_meter, @PathVariable Integer tomatoes_viewer_numReviews, @PathVariable Double tomatoes_viewer_rating, @PathVariable String tomatoes_website, @PathVariable Integer imdb_id, @PathVariable Double imdb_rating, @PathVariable Integer imdb_votes, @PathVariable Integer year, @PathVariable String rated, @PathVariable String released, @PathVariable List<String> cast, @PathVariable Integer runtime, @PathVariable List<String> countries, @PathVariable String type){
        MovieDto movieDto = new MovieDto(id,awards_wins,awards_nominations,awards_text,cast,countries,directors,fullplot,genres,imdb_id,imdb_rating,imdb_votes,lastupdated,num_mflix_comments,plot,rated,runtime,tomatoes_consensus,title,tomatoes_critic_meter,tomatoes_critic_numReviews,tomatoes_critic_rating,tomatoes_dvd,tomatoes_fresh,tomatoes_lastUpdated,tomatoes_production,tomatoes_rotten,tomatoes_viewer_meter,tomatoes_viewer_numReviews,tomatoes_viewer_rating,tomatoes_website,type,year,languages,poster,writers);

        movieDAO.insert(movieDto);
        return movieDAO.insert(movieDto);
    }

    @PatchMapping("/movie/{id}/{newimdb}")
    public MovieDto updateName(@PathVariable String id, @PathVariable String newimdbRating, @PathVariable Integer newimdbVotes){
        MovieDto movieDto = new MovieDto(id,null,null,null,null,null,null,null,null,null,newimdbRating,newimdbVotes,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
        movieDAO.update(movieDto);
        return movieDto;
    }
}
