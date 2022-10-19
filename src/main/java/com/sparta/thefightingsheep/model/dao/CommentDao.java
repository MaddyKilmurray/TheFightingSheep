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

    private CommentRepository repository;

    @Autowired
    public CommentDao(CommentRepository repository) {
        this.repository = repository;
    }


    public List<CommentDto> findAll() {
        List<CommentDto> commentDTOList = new ArrayList<>();
        List<Comment> commentList = repository.findAll();
        commentList.forEach(co -> commentDTOList.add(new CommentDto(co.getId().toHexString(),co.getDate(),co.getEmail(),co.getMovieId().toHexString(),co.getName(),co.getText())));
        return commentDTOList;
    }

    public CommentDto findById(String id) {
        CommentDto commentDTO = new CommentDto();
        Comment comment = repository.findById(new ObjectId(commentDTO.getId())).get();
        CommentDto result = new CommentDto(comment.getId().toHexString(),comment.getDate(),comment.getEmail(),comment.getMovieId().toHexString(),comment.getName(),comment.getText());
        return result;
    }


    public CommentDto update(CommentDto commentDTO) {
        Optional<Comment> optional = repository.findById(new ObjectId(commentDTO.getId()));
        Comment comment;
        if(optional.isPresent())
            comment = optional.get();
        else
            return new CommentDto();
        if (commentDTO.getName()!= null)
            comment.setName(commentDTO.getName());
        repository.save(comment);
        comment = repository.findById(new ObjectId(commentDTO.getId())).get();
        return new CommentDto(comment.getId().toHexString(),comment.getDate(),comment.getEmail(),comment.getMovieId().toHexString(),comment.getName(),comment.getText());
    }

    public void delete(String id) {
        repository.deleteById(new ObjectId(id));
    }

}
