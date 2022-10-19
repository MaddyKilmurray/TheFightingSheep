package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.dao.CommentDao;
import com.sparta.thefightingsheep.model.entity.comment.Comment;
import com.sparta.thefightingsheep.model.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentWebController {

    @Autowired
    private CommentRepository commentRepo;

    @Autowired
    private CommentDao commentDAO;


    @GetMapping("/comment/all")
    public List<Comment> getAllComments() {
//        Optional<Comment> optional = commentRepo.findAll(String.valueOf(commentDTO.getText()));

    return commentRepo.findAll();
    }


}
