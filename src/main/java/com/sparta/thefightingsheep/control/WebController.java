package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.movie.MoviesEntity;
import com.sparta.thefightingsheep.model.movie.MoviesEntityDAO;
import com.sparta.thefightingsheep.model.movie.MoviesEntityDto;
import com.sparta.thefightingsheep.model.movie.MoviesRepository;
import com.sparta.thefightingsheep.model.user.User;
import com.sparta.thefightingsheep.model.user.UserDAO;
import com.sparta.thefightingsheep.model.user.UserDTO;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Controller
public class WebController {
    @Autowired
    private MoviesRepository movieRepo;

    @Autowired
    private MoviesEntityDAO movieDAO;
    @GetMapping("/movie")
    public String findMovie(String id, Model model)
    {
        MoviesEntity result = movieRepo.findById(id).get();
        model.addAttribute("movie",result);
        return "displayMovie";
    }
    @GetMapping("/movie/{id}")
    public MoviesEntityDto getMovieById(@PathVariable int id){
        MoviesEntityDto result = new MoviesEntityDto(String.valueOf(id),null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
        result = movieDAO.findById(new ObjectId(String.valueOf(id)));
        return result;
    }
    @GetMapping("/movie/all")
    public List<MoviesEntity> findAllMovies()
    {
        return movieRepo.findAll();
    }

    @GetMapping("/movie/form/create")
    public String movieForm(Model model)
    {
        MoviesEntity movie = new MoviesEntity();
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
