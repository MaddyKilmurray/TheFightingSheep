package com.sparta.thefightingsheep.model.dao;

import com.sparta.thefightingsheep.model.dto.CommentDto;
import com.sparta.thefightingsheep.model.entity.comment.Comment;
import com.sparta.thefightingsheep.model.repository.CommentRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentDao implements Dao<CommentDto> {

    private final CommentRepository repository;
    private final Assembler assembler;

    @Autowired
    public CommentDao(CommentRepository repository, Assembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @Override
    public String insert(CommentDto item) {
        try {
            Comment comment = assembler.disassembleComment(item);
            repository.insert(comment);
            return comment.getId().toHexString();
        } catch (Exception e) { return null; }
    }

    @Override
    public Optional<CommentDto> findById(String id) {
        try {
            return Optional.of(assembler.assembleComment(repository.findById(new ObjectId(id)).get()));
        } catch (Exception e) { return Optional.empty(); }
    }

    @Override
    public List<CommentDto> findAll() {
        try {
            return repository.findAll().stream().map(assembler::assembleComment).toList();
        } catch (Exception e) { return List.of(); }
    }

    @Override
    public boolean update(CommentDto item) {
        try {
            repository.findById(new ObjectId(item.getId())).get();
            repository.save(assembler.disassembleComment(item));
            return true;
        } catch (Exception e) { return false; }
    }

    @Override
    public boolean delete(String id) {
        try {
            Comment comment = repository.findById(new ObjectId(id)).get();
            repository.delete(comment);
            return true;
        } catch (Exception e) { return false; }
    }

    @Override
    public boolean deleteAll() {
        try {
            repository.deleteAll();
            return true;
        } catch (Exception e) { return false; }
    }
}
