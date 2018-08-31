package com.xylia.movie.movie.repository;

import com.xylia.movie.movie.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {
}
