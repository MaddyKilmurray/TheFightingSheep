package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.movie.MoviesEntity;
import com.sparta.thefightingsheep.model.movie.MoviesEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    private MoviesEntityRepository movieRepo;
    @GetMapping("/movie")
    public String findMovie(String id, Model model)
    {
        MoviesEntity result = movieRepo.findById(id).get();
        model.addAttribute("movie",result);
        return "displayMovie";
    }
    @GetMapping("/movie/all")
    public String findAllActors(Model model)
    {
        List<MoviesEntity> all = movieRepo.findAll();
        model.addAttribute("movies",all);
        return "allMovies";
    }

    @GetMapping("/accessDenied")
    public String accessDenied(){
        return "accessDenied";
    }
}
