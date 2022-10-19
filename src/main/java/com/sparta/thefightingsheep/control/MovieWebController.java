package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.entity.movie.Movie;

import com.sparta.thefightingsheep.model.dao.MoviesDao;
import com.sparta.thefightingsheep.model.dto.MovieDto;

import com.sparta.thefightingsheep.model.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Controller
public class MovieWebController {
    @Autowired
    private MovieRepository movieRepo;

    @Autowired
    private MoviesDao movieDAO;
    @GetMapping("/movie")
    public String findMovie(String id, Model model)
    {
        Movie result = movieRepo.findById(new ObjectId(id)).get();
        model.addAttribute("movie",result);
        return "displayMovie";
    }
    @GetMapping("/movie/{id}")
    public MovieDto getMovieById(@PathVariable String id){
        MovieDto result = movieDAO.findById(id);
        return result;
    }
    @GetMapping("/movie/all")
    public List<Movie> findAllMovies()
    {
        return movieRepo.findAll();
    }

    @GetMapping("/movie/form/create")
    public String movieForm(Model model)
    {
        Movie movie = new Movie();
        model.addAttribute("movie",movie);
        return "movieForm";
    }

    @GetMapping("/accessDenied")
    public String accessDenied(){
        return "accessDenied";
    }
//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }
}
