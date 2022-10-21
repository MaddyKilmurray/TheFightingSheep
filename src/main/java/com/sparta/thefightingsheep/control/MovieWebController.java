//package com.sparta.thefightingsheep.control;
//
//import com.sparta.thefightingsheep.model.dto.UserDto;
//import com.sparta.thefightingsheep.model.entity.movie.Movie;
//
//import com.sparta.thefightingsheep.model.dao.MovieDao;
//import com.sparta.thefightingsheep.model.dto.MovieDto;
//
//import com.sparta.thefightingsheep.model.entity.user.User;
//import com.sparta.thefightingsheep.model.repository.MovieRepository;
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//@Controller
//public class MovieWebController {
//    @Autowired
//    private MovieRepository movieRepo;
//
//    @Autowired
//    private MovieDao movieDAO;
//    @GetMapping("/movie/{id}")
//    public MovieDto getMovieById(@PathVariable String id){
//        MovieDto result = movieDAO.findById(id);
//        return result;
//    }
//    @GetMapping("/movie/all")
//    public List<Movie> findAllMovies()
//    {
//        return movieRepo.findAll();
//    }
//
//    @DeleteMapping("/movie/delete/{id}")
//    public ObjectId deleteById(@PathVariable String id){
//        Movie movie = movieRepo.findById(new ObjectId(id)).get();
//        movieRepo.delete(movie);
//        return movie.getId();
//    }
//
//    @GetMapping("/movie/form/create")
//    public String movieForm(Model model)
//    {
//        Movie movie = new Movie();
//        model.addAttribute("movie",movie);
//        return "movieForm";
//    }
//
//    @PostMapping("/movie/add/{id}/{awards}/{directors}/{fullplot}/{languages}/{num_mflix_comments}/{plot}/{title}/{writers}/{genres}/{lastupdated}{poster}/{tomatoes}/{year}/{imdb}/{rated}/{released}/{cast}/{runtime}/{countries}/{type}")
//    public String addMovie(@PathVariable String id, @PathVariable String awards, @PathVariable String directors, @PathVariable String fullplot, @PathVariable String languages, @PathVariable String num_mflix_comments, @PathVariable String plot, @PathVariable String title, @PathVariable String writers, @PathVariable String genres, @PathVariable String lastupdated, @PathVariable String poster, @PathVariable String tomatoes, @PathVariable String year, @PathVariable String rated, @PathVariable String released, @PathVariable String cast, @PathVariable String runtime, @PathVariable String countries, @PathVariable String type){
//        MovieDto movieDto = new MovieDto(id,awards,directors,fullplot,languages,num_mflix_comments,plot,title,writers,genres,lastupdated,poster,tomatoes,year,rated,released,cast,runtime,countries,type);
//        movieDAO.insert(movieDto);
//        return movieDAO.insert(movieDto);
//    }
//
//    @PatchMapping("/movie/{id}/{newimdb}")
//    public UserDto updateName(@PathVariable String id, @PathVariable String newimdb){
//        MovieDto movieDto = new MovieDto(id,null,null,null,null,null,null,null,null,null,null,null,null,null,newimdb, null, null,null,null,null,null);
//        movieDAO.update(movieDto);
//        return movieDto;
//    }
//}