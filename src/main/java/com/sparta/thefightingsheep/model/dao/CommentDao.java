package com.sparta.thefightingsheep.model.dao;

import com.sparta.thefightingsheep.model.dto.CommentDto;
import com.sparta.thefightingsheep.model.entity.comment.Comment;
import com.sparta.thefightingsheep.model.repository.CommentRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CommentDao {

    @Autowired
    private CommentRepository commentRepo;

    public CommentDao(CommentRepository commentRepo) {
        this.commentRepo = commentRepo;
    }


    public List<CommentDto> findAll() {
        List<CommentDto> commentDTOList = new ArrayList<>();
        List<Comment> commentList = commentRepo.findAll();
        commentList.forEach(co -> commentDTOList.add(new CommentDto(co.getId(),co.getDate(),co.getEmail(),co.getMovieId(),co.getName(),co.getText())));
        return commentDTOList;
    }

    public CommentDto findById(ObjectId id) {
        CommentDto commentDTO = new CommentDto();
        Comment comment = commentRepo.findById(commentDTO.getId()).get();
        CommentDto result = new CommentDto(comment.getId(),comment.getDate(),comment.getEmail(),comment.getMovieId(),comment.getName(),comment.getText());
        return result;
    }


    public CommentDto update(CommentDto commentDTO) {
        Optional<Comment> optional = commentRepo.findById(commentDTO.getId());
        Comment comment;
        if(optional.isPresent())
            comment = optional.get();
        else
            return new CommentDto();
        if (commentDTO.getName()!= null)
            comment.setName(commentDTO.getName());
        commentRepo.save(comment);
        comment = commentRepo.findById(commentDTO.getId()).get();
        return new CommentDto(comment.getId(),comment.getDate(),comment.getEmail(),comment.getMovieId(),comment.getName(),comment.getText());
    }

    public void delete(ObjectId id) {
        commentRepo.deleteById(id);
    }

}
