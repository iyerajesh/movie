package com.xylia.movie.movie;

import com.xylia.movie.movie.repository.MovieRepository;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import javax.annotation.PostConstruct;

@Component
public class MovieDataLoader {

    private final MovieRepository movieRepository;

    public MovieDataLoader(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @PostConstruct
    private void loadData() {
        this.movieRepository.deleteAll().thenMany(
                Flux.just("Movie 1", "Movie 2", "Movie 3", "Movie 4").map(Movie::new).flatMap(this.movieRepository::save)).subscribe(System.out::println);
    }
}
