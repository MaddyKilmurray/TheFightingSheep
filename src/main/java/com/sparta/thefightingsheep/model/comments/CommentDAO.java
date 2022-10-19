package com.sparta.thefightingsheep.model.comments;

import com.sparta.thefightingsheep.model.comments.repository.CommentRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CommentDAO {

    @Autowired
    private CommentRepository commentRepo;

    public CommentDAO(CommentRepository commentRepo) {
        this.commentRepo = commentRepo;
    }


    public List<CommentDTO> findAll() {
        List<CommentDTO> commentDTOList = new ArrayList<>();
        List<Comment> commentList = commentRepo.findAll();
        commentList.forEach(co -> commentDTOList.add(new CommentDTO(co.get_id(),co.getDate(),co.getEmail(),co.getMovie_id(),co.getName(),co.getText())));
        return commentDTOList;
    }

    public CommentDTO findById(ObjectId id) {
        CommentDTO commentDTO = new CommentDTO();
        Comment comment = commentRepo.findById(String.valueOf(commentDTO.getId())).get();
        CommentDTO result = new CommentDTO(comment.get_id(),comment.getDate(),comment.getEmail(),comment.getMovie_id(),comment.getName(),comment.getText());
        return result;
    }


    public CommentDTO update(CommentDTO commentDTO) {
        Optional<Comment> optional = commentRepo.findById(String.valueOf(commentDTO.getId()));
        Comment comment;
        if(optional.isPresent())
            comment = optional.get();
        else
            return new CommentDTO();
        if (commentDTO.getName()!= null)
            comment.setName(commentDTO.getName());
        commentRepo.save(comment);
        comment = commentRepo.findById(String.valueOf(commentDTO.getId())).get();
        return new CommentDTO(comment.get_id(),comment.getDate(),comment.getEmail(),comment.getMovie_id(),comment.getName(),comment.getText());
    }

    public void delete(ObjectId id) {
        commentRepo.deleteById(String.valueOf(id));
    }

}
