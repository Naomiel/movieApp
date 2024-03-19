package com.naomi.movieapp.repository;

import com.naomi.movieapp.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Long> {
}
