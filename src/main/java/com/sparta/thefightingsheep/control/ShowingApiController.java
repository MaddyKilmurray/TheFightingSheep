package com.sparta.thefightingsheep.control;

import com.sparta.thefightingsheep.model.dao.Dao;
import com.sparta.thefightingsheep.model.dto.MovieDto;
import com.sparta.thefightingsheep.model.dto.ShowingDto;
import com.sparta.thefightingsheep.model.dto.TheaterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/showing/")
public class ShowingApiController {
    private final Dao<ShowingDto> showingDao;
    private final Dao<MovieDto> movieDao;
    private final Dao<TheaterDto> theaterDao;

    @Autowired
    public ShowingApiController(Dao<ShowingDto> showingDao, Dao<MovieDto> movieDao, Dao<TheaterDto> theaterDao) {
        this.showingDao = showingDao;
        this.movieDao = movieDao;
        this.theaterDao = theaterDao;
    }

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ShowingDto getById(@PathVariable String id) {
        return showingDao.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/all")
    public List<ShowingDto> getAll() {
        return showingDao.findAll();
    }

    @PatchMapping("/update/{id}")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ShowingDto update(Authentication authentication, @PathVariable String id, @RequestParam Optional<String> newDate, @RequestParam Optional<String> newMovieId, @RequestParam Optional<String> newTheaterId) {
        if (!authentication.getAuthorities().contains(new SimpleGrantedAuthority("ADMIN")))
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED);

        if (newDate.isEmpty() && newMovieId.isEmpty() && newTheaterId.isEmpty())
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);

        String movieId = newMovieId.orElse(null);
        String theaterId = newTheaterId.orElse(null);

        Instant date=null;
        try { if (newDate.isPresent()) date = Instant.parse(newDate.get()); }
        catch (Exception e) { throw new ResponseStatusException(HttpStatus.BAD_REQUEST); }

        ShowingDto showingDto = showingDao.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        MovieDto movieDto = movieId==null?null:movieDao.findById(movieId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        TheaterDto theaterDto = theaterId==null?null:theaterDao.findById(theaterId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        if (date != null)
            showingDto.setShowingDate(date);
        if (movieDto != null)
            showingDto.setMovie(movieDto);
        if (theaterDto != null)
            showingDto.setTheater(theaterDto);

        if (!showingDao.update(showingDto)) throw new ResponseStatusException(HttpStatus.BAD_REQUEST);

        return showingDto;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ShowingDto add(Authentication authentication, @RequestParam String date, @RequestParam String movieId, @RequestParam String theaterId) {
        if (!authentication.getAuthorities().contains(new SimpleGrantedAuthority("ADMIN")))
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED);

        Instant dateInstant;
        try { dateInstant = Instant.parse(date); }
        catch (Exception e) { throw new ResponseStatusException(HttpStatus.BAD_REQUEST); }

        MovieDto movieDto = movieDao.findById(movieId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        TheaterDto theaterDto = theaterDao.findById(theaterId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        ShowingDto showingDto = new ShowingDto(dateInstant, movieDto, theaterDto);

        showingDto.setId(showingDao.insert(showingDto));
        if (showingDto.getId()==null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST);

        return showingDto;
    }

    @DeleteMapping("delete/{id}")
    public ShowingDto deleteById(Authentication authentication, @PathVariable String id) {
        if (!authentication.getAuthorities().contains(new SimpleGrantedAuthority("ADMIN")))
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED);

        ShowingDto showingDto = showingDao.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        if (!showingDao.delete(showingDto.getId())) throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        return showingDto;
    }

    @DeleteMapping("/delete/all")
    @ResponseStatus(HttpStatus.OK)
    public List<ShowingDto> deleteAll(Authentication authentication) {
        if (!authentication.getAuthorities().contains(new SimpleGrantedAuthority("ADMIN")))
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED);

        if (!showingDao.deleteAll())
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);

        return showingDao.findAll();
    }
}
