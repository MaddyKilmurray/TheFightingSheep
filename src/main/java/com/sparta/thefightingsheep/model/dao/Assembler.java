package com.sparta.thefightingsheep.model.dao;

import com.sparta.thefightingsheep.model.dto.CommentDto;
import com.sparta.thefightingsheep.model.dto.MovieDto;
import com.sparta.thefightingsheep.model.dto.ShowingDto;
import com.sparta.thefightingsheep.model.dto.TheaterDto;
import com.sparta.thefightingsheep.model.dto.UserDto;
import com.sparta.thefightingsheep.model.entity.comment.Comment;
import com.sparta.thefightingsheep.model.entity.movie.Movie;
import com.sparta.thefightingsheep.model.entity.showing.Showing;
import com.sparta.thefightingsheep.model.entity.theater.Theater;
import com.sparta.thefightingsheep.model.entity.user.Role;
import com.sparta.thefightingsheep.model.entity.user.User;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
class Assembler {
    CommentDto assembleComment(Comment comment) {
        return null;
    }

    MovieDto assembleMovie(Movie movie) {
        return null;
    }

    ShowingDto assembleShowing(Showing showing) {
        return null;
    }

    TheaterDto assembleTheater(Theater theater) {
        return null;
    }

    UserDto assembleUser(User user) {
        return new UserDto(
                user.getId().toHexString(),
                user.getName(),
                user.getEmail(),
                user.getPassword(),
                user.getRole().name()
        );
    }

    Comment disassembleComment(CommentDto comment) {
        return null;
    }

    Movie disassembleMovie(MovieDto movie) {
        return null;
    }

    Showing disassembleShowing(ShowingDto showing) {
        return null;
    }

    Theater disassembleTheater(TheaterDto theater) {
        return null;
    }

    User disassembleUser(UserDto user) {
        return new User(
                new ObjectId(user.getId()),
                user.getName(),
                user.getEmail(),
                user.getPassword(),
                Role.valueOf(user.getRole().name())
        );
    }
}
