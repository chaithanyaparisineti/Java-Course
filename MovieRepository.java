package com.cinema.MovieManagementBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.MovieManagementBooking.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
