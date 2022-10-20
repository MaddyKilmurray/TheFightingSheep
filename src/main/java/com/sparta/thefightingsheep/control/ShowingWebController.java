package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.dao.CommentDao;
import com.sparta.thefightingsheep.model.dto.CommentDto;
import com.sparta.thefightingsheep.model.dto.MovieDto;
import com.sparta.thefightingsheep.model.dto.ShowingDto;
import com.sparta.thefightingsheep.model.entity.comment.Comment;
import com.sparta.thefightingsheep.model.entity.movie.Movie;
import com.sparta.thefightingsheep.model.entity.showing.Showing;
import com.sparta.thefightingsheep.model.entity.theater.Theater;
import com.sparta.thefightingsheep.model.repository.CommentRepository;
import com.sparta.thefightingsheep.model.repository.ShowingRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;

@RestController
public class ShowingWebController {
    @Autowired
    private ShowingRepository showingRepo;
/*
    @Autowired
    private ShowingDao showingDAO;

    @GetMapping("/showing/{id}")
    public ShowingDto getShowingById(@PathVariable String id){
        ShowingDto result = showingDAO.findById(id);
        return result;
    }
    @GetMapping("/showing/all")
    public List<Showing> getAllShowings() {
        return showingRepo.findAll();
    }

    @DeleteMapping("/showing/delete/{id}")
    public ObjectId deleteById(@PathVariable String id){
        Showing showing = showingRepo.findById(new ObjectId(id)).get();
        showingRepo.delete(showing);
        return showing.getId();
    }
    @PatchMapping("/showing/{id}/{movie}")
    public MovieDto changeMovie(@PathVariable String id, @PathVariable String newMovie){
        MovieDto movieDto = new MovieDto(id, null,newMovie,null);
        movieDAO.update(movieDto);
        return movieDto;
    }

    @PostMapping("/showing/add/{id}/{showingDate}/{movie}/{theater}")
    public String addShowingID(@PathVariable String id, @PathVariable String showingDate, @PathVariable String movie, @PathVariable String theater){
        ShowingDto showingDto = new ShowingDto(id,showingDate,movie,theater);
        showingDAO.insert(showingDto);
        return showingDAO.insert(showingDto);
    }*/
}