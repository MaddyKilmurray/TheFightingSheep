package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.dao.CommentDao;
import com.sparta.thefightingsheep.model.dto.CommentDto;
import com.sparta.thefightingsheep.model.dto.MovieDto;
import com.sparta.thefightingsheep.model.dto.UserDto;
import com.sparta.thefightingsheep.model.entity.comment.Comment;
import com.sparta.thefightingsheep.model.entity.movie.Movie;
import com.sparta.thefightingsheep.model.repository.CommentRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;

@RestController
public class CommentWebController {

    @Autowired
    private CommentRepository commentRepo;

    @Autowired
    private CommentDao commentDAO;

    @GetMapping("/comment/{id}")
    public CommentDto getCommentById(@PathVariable String id){
        CommentDto result = commentDAO.findById(id);
        return result;
    }

    @GetMapping("/comment/all")
    public List<Comment> getAllComments() {
//        Optional<Comment> optional = commentRepo.findAll(String.valueOf(commentDTO.getText()));

    return commentRepo.findAll();
    }

    @DeleteMapping("/comment/delete/{id}")
    public ObjectId deleteById(@PathVariable String id){
        Comment comment = commentRepo.findById(new ObjectId(id)).get();
        commentRepo.delete(comment);
        return comment.getId();
    }
    /*
    @PostMapping("/comment/add/{id}/{date}/{email}/{movieId}/{name}/{text}")
    public String addComment(@PathVariable Instant id,@PathVariable Instant date, @PathVariable String email, @PathVariable String movieId, @PathVariable String name, @PathVariable String text){
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
*/
    @PatchMapping("/user/{id}/{newdate}/{newtext}")
    public CommentDto editComment(@PathVariable String id, @PathVariable String newtext, @PathVariable String newdate){
        CommentDto commentDto = new CommentDto(id, newdate, null,null,null,newtext);
        commentDAO.update(commentDto);
        return commentDto;
    }


}
