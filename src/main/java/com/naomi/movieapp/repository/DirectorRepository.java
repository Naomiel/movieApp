package com.naomi.movieapp.repository;

import com.naomi.movieapp.model.Director;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepository extends JpaRepository<Director, Long> {
}
