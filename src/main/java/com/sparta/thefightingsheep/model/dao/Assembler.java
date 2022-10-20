package com.sparta.thefightingsheep.model.dao;

import com.sparta.thefightingsheep.model.dto.CommentDto;
import com.sparta.thefightingsheep.model.dto.MovieDto;
import com.sparta.thefightingsheep.model.dto.ShowingDto;
import com.sparta.thefightingsheep.model.dto.TheaterDto;
import com.sparta.thefightingsheep.model.dto.UserDto;
import com.sparta.thefightingsheep.model.entity.comment.Comment;
import com.sparta.thefightingsheep.model.entity.movie.*;
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
        return new MovieDto(
                movie.getId()==null?null:movie.getId().toHexString(),
                movie.getAwards().getWins(),
                movie.getAwards().getNominations(),
                movie.getAwards().getText(),
                movie.getCast(),
                movie.getCountries(),
                movie.getDirectors(),
                movie.getFullPlot(),
                movie.getGenres(),
                movie.getImdb().getId(),
                movie.getImdb().getRating(),
                movie.getImdb().getVotes(),
                movie.getLastUpdated(),
                movie.getNumMflixComments(),
                movie.getPlot(),
                movie.getRating()==null?null:movie.getRating().name(),
                movie.getRuntime(),
                movie.getTitle(),
                movie.getTomatoes()==null?null:movie.getTomatoes().getConsensus(),
                movie.getTomatoes()==null||movie.getTomatoes().getCritic()==null?null:movie.getTomatoes().getCritic().getMeter(),
                movie.getTomatoes()==null||movie.getTomatoes().getCritic()==null?null:movie.getTomatoes().getCritic().getNumReviews(),
                movie.getTomatoes()==null||movie.getTomatoes().getCritic()==null?null:movie.getTomatoes().getCritic().getRating(),
                movie.getTomatoes()==null?null:movie.getTomatoes().getDvd(),
                movie.getTomatoes()==null?null:movie.getTomatoes().getFresh(),
                movie.getTomatoes()==null?null:movie.getTomatoes().getLastUpdated(),
                movie.getTomatoes()==null?null:movie.getTomatoes().getProduction(),
                movie.getTomatoes()==null?null:movie.getTomatoes().getRotten(),
                movie.getTomatoes()==null||movie.getTomatoes().getViewer()==null?null:movie.getTomatoes().getViewer().getMeter(),
                movie.getTomatoes()==null||movie.getTomatoes().getViewer()==null?null:movie.getTomatoes().getViewer().getNumReviews(),
                movie.getTomatoes()==null||movie.getTomatoes().getViewer()==null?null:movie.getTomatoes().getViewer().getRating(),
                movie.getTomatoes()==null?null:movie.getTomatoes().getWebsite(),
                movie.getType(),
                movie.getYear(),
                movie.getLanguages(),
                movie.getPoster(),
                movie.getWriters()
        );
    }

    ShowingDto assembleShowing(Showing showing) {
        return null;
    }

    TheaterDto assembleTheater(Theater theater) {
        return null;
    }

    UserDto assembleUser(User user) {
        return new UserDto(
                user.getId()==null?null:user.getId().toHexString(),
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
        return new Movie(
                movie.getId()==null?null:new ObjectId(movie.getId()),
                movie.getAwards()==null?null:new Awards(
                        movie.getAwards().getWins(),
                        movie.getAwards().getNominations(),
                        movie.getAwards().getText()
                ),
                movie.getCast()==null?null:movie.getCast(),
                movie.getCountries()==null?null:movie.getCountries(),
                movie.getDirectors()==null?null:movie.getDirectors(),
                movie.getFullPlot()==null?null:movie.getFullPlot(),
                movie.getGenres()==null?null:movie.getGenres(),
                movie.getImdb()==null?null:new Imdb(
                        movie.getImdb().getId(),
                        movie.getImdb().getRating(),
                        movie.getImdb().getVotes()
                ),
                movie.getLastUpdated()==null?null:movie.getLastUpdated(),
                movie.getNumMflixComments()==null?null:movie.getNumMflixComments(),
                movie.getPlot()==null?null:movie.getPlot(),
                movie.getRating()==null?null:Rating.valueOf(movie.getRating().name()),
                movie.getRuntime()==null?null:movie.getRuntime(),
                movie.getTitle()==null?null:movie.getTitle(),
                movie.getTomatoes()==null?null:new Tomatoes(
                        movie.getTomatoes().getConsensus(),
                        movie.getTomatoes().getCritic()==null?null:new Critic(
                                movie.getTomatoes().getCritic().getMeter(),
                                movie.getTomatoes().getCritic().getNumReviews(),
                                movie.getTomatoes().getCritic().getRating()
                        ),
                        movie.getTomatoes().getDvd(),
                        movie.getTomatoes().getFresh(),
                        movie.getTomatoes().getLastUpdated(),
                        movie.getTomatoes().getProduction(),
                        movie.getTomatoes().getRotten(),
                        movie.getTomatoes().getViewer()==null?null:new Viewer(
                                movie.getTomatoes().getViewer().getMeter(),
                                movie.getTomatoes().getViewer().getNumReviews(),
                                movie.getTomatoes().getViewer().getRating()
                        ),
                        movie.getTomatoes().getWebsite()
                ),
                movie.getType()==null?null:movie.getType(),
                movie.getYear()==null?null:movie.getYear(),
                movie.getLanguages()==null?null:movie.getLanguages(),
                movie.getPoster()==null?null:movie.getPoster(),
                movie.getWriters()==null?null:movie.getWriters()
        );
    }

    Showing disassembleShowing(ShowingDto showing) {
        return null;
    }

    Theater disassembleTheater(TheaterDto theater) {
        return null;
    }

    User disassembleUser(UserDto user) {
        return new User(
                user.getId()==null?null:new ObjectId(user.getId()),
                user.getName(),
                user.getEmail(),
                user.getPassword(),
                Role.valueOf(user.getRole().name())
        );
    }
}
