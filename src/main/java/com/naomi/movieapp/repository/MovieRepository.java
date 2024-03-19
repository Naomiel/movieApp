package com.naomi.movieapp.repository;

import com.naomi.movieapp.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long>{
}
