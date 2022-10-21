package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.dao.CommentDao;
import com.sparta.thefightingsheep.model.dao.MovieDao;
import com.sparta.thefightingsheep.model.dto.CommentDto;
import com.sparta.thefightingsheep.model.dto.MovieDto;
import com.sparta.thefightingsheep.model.dto.UserDto;
import com.sparta.thefightingsheep.model.entity.comment.Comment;
import com.sparta.thefightingsheep.model.entity.movie.Movie;
import com.sparta.thefightingsheep.model.repository.CommentRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Controller
public class CommentWebController {

    @Autowired
    private CommentRepository commentRepo;

    @Autowired
    private CommentDao commentDAO;
    private CommentDto commentDto;

    @GetMapping("/comment/{movie_id}")
    public Comment getCommentByMovieId(@PathVariable String id, Model model) {
        Comment comment = commentRepo.findById(new ObjectId(commentDto.getMovieId())).get();
        return comment;
    }

    @GetMapping("/comment/all")
    public List<Comment> getAllComments() {
        return commentRepo.findAll();
    }

    @DeleteMapping("/comment/delete/{movie_id}")
    public ObjectId deleteById(@PathVariable String id) {
        Comment comment = commentRepo.findById(new ObjectId(commentDto.getMovieId())).get();
        commentRepo.delete(comment);
        return comment.getId();
    }

    @PostMapping("/comment/add/{id}/{date}/{email}/{movieId}/{name}/{text}")
    public String addComment(@PathVariable Instant id, @PathVariable Instant date, @PathVariable String email, @PathVariable String movieId, @PathVariable String name, @PathVariable String text){
        CommentDto commentDto = new CommentDto(String.valueOf(id),date,email,movieId,name,text);
        commentDAO.insert(commentDto);
        return commentDAO.insert(commentDto);
    }

    @PostMapping("/comment/add/{date}/{email}/{movieId}/{name}/{text}")
    public String addComment(@PathVariable Instant date, @PathVariable String email, @PathVariable String movieId, @PathVariable String name, @PathVariable String text){
        CommentDto commentDto = new CommentDto(date,email,movieId,name,text);
        commentDAO.insert(commentDto);
        return commentDAO.insert(commentDto);
    }

}