package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.comments.Comment;
import com.sparta.thefightingsheep.model.comments.CommentDAO;
import com.sparta.thefightingsheep.model.comments.CommentDTO;
import com.sparta.thefightingsheep.model.comments.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CommentWebController {

    @Autowired
    private CommentRepository commentRepo;

    @Autowired
    private CommentDAO commentDAO;


    @GetMapping("/comment/all")
    public List<Comment> getAllComments() {
//        Optional<Comment> optional = commentRepo.findAll(String.valueOf(commentDTO.getText()));

    return commentRepo.findAll();
    }


}
