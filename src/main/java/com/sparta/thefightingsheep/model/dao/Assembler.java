package com.sparta.thefightingsheep.model.dao;

import com.sparta.thefightingsheep.model.dto.CommentDto;
import com.sparta.thefightingsheep.model.dto.MovieDto;
import com.sparta.thefightingsheep.model.dto.ShowingDto;
import com.sparta.thefightingsheep.model.dto.TheaterDto;
import com.sparta.thefightingsheep.model.dto.UserDto;
import com.sparta.thefightingsheep.model.entity.comment.Comment;
import com.sparta.thefightingsheep.model.entity.movie.*;
import com.sparta.thefightingsheep.model.entity.showing.Showing;
import com.sparta.thefightingsheep.model.entity.theater.Address;
import com.sparta.thefightingsheep.model.entity.theater.Geo;
import com.sparta.thefightingsheep.model.entity.theater.Location;
import com.sparta.thefightingsheep.model.entity.theater.Theater;
import com.sparta.thefightingsheep.model.entity.user.Role;
import com.sparta.thefightingsheep.model.entity.user.User;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
class Assembler {
    CommentDto assembleComment(Comment comment) {
        return new CommentDto(
                comment.getId()==null?null:comment.getId().toHexString(),
                comment.getDate(),
                comment.getEmail(),
                comment.getMovieId()==null?null:comment.getMovieId().toHexString(),
                comment.getName(),
                comment.getText()
        );
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
        return new ShowingDto(
                showing.getId()==null?null:showing.getId().toHexString(),
                showing.getShowingDate(),
                showing.getMovie()==null?null:this.assembleMovie(showing.getMovie()),
                showing.getTheater()==null?null:this.assembleTheater(showing.getTheater())
        );
    }

    TheaterDto assembleTheater(Theater theater) {
        return new TheaterDto(
                theater.getId()==null?null:theater.getId().toHexString(),
                theater.getTheaterId(),
                theater.getLocation()==null||theater.getLocation().getAddress()==null?null:theater.getLocation().getAddress().getCity(),
                theater.getLocation()==null||theater.getLocation().getAddress()==null?null:theater.getLocation().getAddress().getState(),
                theater.getLocation()==null||theater.getLocation().getAddress()==null?null:theater.getLocation().getAddress().getStreetOne(),
                theater.getLocation()==null||theater.getLocation().getAddress()==null?null:theater.getLocation().getAddress().getZipCode(),
                theater.getLocation()==null||theater.getLocation().getGeo()==null?null:theater.getLocation().getGeo().getCoordinates()
        );
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
        return new Comment(
                comment.getId()==null?null:new ObjectId(comment.getId()),
                comment.getDate(),
                comment.getEmail(),
                comment.getId()==null?null:new ObjectId(comment.getMovieId()),
                comment.getName(),
                comment.getText()
        );
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
                movie.getRating()==null?null: Rating.valueOf(movie.getRating().name()),
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
        return new Showing(
                showing.getId()==null?null:new ObjectId(showing.getId()),
                showing.getShowingDate(),
                showing.getMovie()==null?null:this.disassembleMovie(showing.getMovie()),
                showing.getTheater()==null?null:this.disassembleTheater(showing.getTheater())
        );
    }

    Theater disassembleTheater(TheaterDto theater) {
        return new Theater(
                theater.getId()==null?null:new ObjectId(theater.getId()),
                theater.getTheaterId(),
                theater.getLocation()==null?null:new Location(
                        theater.getLocation().getAddress()==null?null:new Address(
                                theater.getLocation().getAddress().getCity(),
                                theater.getLocation().getAddress().getState(),
                                theater.getLocation().getAddress().getStreetOne(),
                                theater.getLocation().getAddress().getZipCode()
                        ),
                        theater.getLocation().getGeo()==null?null:new Geo(
                                theater.getLocation().getGeo().getCoordinates()
                        )
                )
        );
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
