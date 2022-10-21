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

import java.util.List;
import java.util.Optional;

@Controller
public class MovieWebController {
    @Autowired
    private MovieRepository movieRepo;

    @Autowired
    private MovieDao movieDAO;

    @GetMapping("/displaymovie")
    public String displayMovie(Model model) {
        model.addAttribute("foundMovie", new Movie());
        model.addAttribute("movieDeleted",null);
        return "displayMovie";
    }

    @GetMapping("/web/movie/byid")
    public String getMovieById(@RequestParam String id, Model model){
        Optional<MovieDto> result = movieDAO.findById(id);
        if (result.isPresent()) {
            model.addAttribute("foundMovie",result.get());
            return "displayMovie";
        }
        model.addAttribute("foundMovie", new Movie());
        return "displayMovie";
    }

    @GetMapping("/web/movie/byname")
    public String getMovieByName(@RequestParam String name, Model model){
        Optional<MovieDto> result = movieDAO.findByName(name);
        if (result.isPresent()) {
            model.addAttribute("foundMovie",result.get());
            return "displayMovie";
        }
        model.addAttribute("foundMovie", new Movie());
        return "displayMovie";
    }

    @GetMapping("/movies/all")
    public String findAllMovies(Model model)
    {
        List<MovieDto> movies = movieDAO.findAll();
        model.addAttribute("allMovies", movies);
        return "allMovies";
    }

    @DeleteMapping("/displaymovie/delete")
    public String deleteById(@RequestParam String id, Model model){
        Movie movie = movieRepo.findById(new ObjectId(id)).get();
        movieRepo.delete(movie);
        model.addAttribute("foundMovie", new Movie());
        model.addAttribute("movieDeleted",true);
        return "displayMovie";
    }

    @GetMapping("/movie/form")
    public String movieForm(Model model)
    {
        model.addAttribute("createdMovie",new Movie());
        return "movieForm";
    }
    @PostMapping("/movie/form/create")
    public String createMovieForm(@RequestParam MovieDto movie, Model model)
    {
        movieDAO.insert(movie);
        model.addAttribute("createdMovie",movie);
        return "movieForm";
    }

}
