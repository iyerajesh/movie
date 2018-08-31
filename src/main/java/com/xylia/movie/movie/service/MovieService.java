package com.xylia.movie.movie.service;

import com.xylia.movie.movie.Movie;
import com.xylia.movie.movie.repository.MovieRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Flux<Movie> getAllMovies() {
        return this.movieRepository.findAll();
    }

    public Mono<Movie> getMovieById(String id) {
        return this.movieRepository.findById(id);
    }
}
