package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.movie.Movies;
import com.sparta.thefightingsheep.model.movie.MoviesDAO;
import com.sparta.thefightingsheep.model.movie.MoviesDto;
import com.sparta.thefightingsheep.model.movie.repo.MoviesRepository;
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
    private MoviesRepository movieRepo;

    @Autowired
    private MoviesDAO movieDAO;
    @GetMapping("/movie")
    public String findMovie(String id, Model model)
    {
        Movies result = movieRepo.findById(id).get();
        model.addAttribute("movie",result);
        return "displayMovie";
    }
    @GetMapping("/movie/{id}")
    public MoviesDto getMovieById(@PathVariable int id){
        MoviesDto result = new MoviesDto(String.valueOf(id),null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
        result = movieDAO.findById(new ObjectId(String.valueOf(id)));
        return result;
    }
    @GetMapping("/movie/all")
    public List<Movies> findAllMovies()
    {
        return movieRepo.findAll();
    }

    @GetMapping("/movie/form/create")
    public String movieForm(Model model)
    {
        Movies movie = new Movies();
        model.addAttribute("movie",movie);
        return "movieForm";
    }

    @GetMapping("/accessDenied")
    public String accessDenied(){
        return "accessDenied";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
