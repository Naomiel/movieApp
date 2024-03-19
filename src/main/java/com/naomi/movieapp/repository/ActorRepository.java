package com.naomi.movieapp.repository;

import com.naomi.movieapp.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Long> {
}
