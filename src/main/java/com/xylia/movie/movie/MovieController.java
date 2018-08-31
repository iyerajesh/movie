package com.xylia.movie.movie;


import com.xylia.movie.movie.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public Flux<Movie> getMovies() {
        return this.movieService.getAllMovies();
    }

    @GetMapping("/{id}")
    public Mono<Movie> getMovie(@PathVariable String id) {
        return this.movieService.getMovieById(id);
    }


}
