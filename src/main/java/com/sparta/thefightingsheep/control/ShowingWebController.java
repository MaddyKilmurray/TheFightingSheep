package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.dao.Dao;
import com.sparta.thefightingsheep.model.dto.MovieDto;
import com.sparta.thefightingsheep.model.dto.ShowingDto;
import com.sparta.thefightingsheep.model.dto.TheaterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Controller
@RequestMapping("/showing")
public class ShowingWebController {
    private final Dao<ShowingDto> showingDao;
    private final Dao<MovieDto> movieDao;
    private final Dao<TheaterDto> theaterDao;

    @Autowired
    public ShowingWebController(Dao<ShowingDto> showingDao, Dao<MovieDto> movieDao, Dao<TheaterDto> theaterDao) {
        this.showingDao = showingDao;
        this.movieDao = movieDao;
        this.theaterDao = theaterDao;
    }

    @GetMapping({"", "/"})
    public String index() {
        return "/showing/index";
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String getAll(Model model) {
        model.addAttribute("showings", showingDao.findAll());
        return "showing/all";
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String getById(@PathVariable String id, Model model) {
        Optional<ShowingDto> result = showingDao.findById(id);
        if (result.isPresent()) model.addAttribute("showing", result.get());
        else throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return "showing/id";
    }
}
