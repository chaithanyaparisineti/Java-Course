package com.cinema.MovieManagementBooking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cinema.MovieManagementBooking.entity.Movie;
import com.cinema.MovieManagementBooking.repository.MovieRepository;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(Long id) {
        return movieRepository.findById(id);
    }

    public Movie updateMovie(Long id, Movie movie) {

        Movie existingMovie = movieRepository.findById(id).orElse(null);

        if (existingMovie != null) {

            existingMovie.setTitle(movie.getTitle());
            existingMovie.setGenre(movie.getGenre());
            existingMovie.setLanguage(movie.getLanguage());
            existingMovie.setDuration(movie.getDuration());
            existingMovie.setRating(movie.getRating());
            existingMovie.setReleaseYear(movie.getReleaseYear());
            existingMovie.setPrice(movie.getPrice());
            existingMovie.setAvailableSeats(movie.getAvailableSeats());
            existingMovie.setDescription(movie.getDescription());
            existingMovie.setImageUrl(movie.getImageUrl());

            return movieRepository.save(existingMovie);
        }

        return null;
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
}