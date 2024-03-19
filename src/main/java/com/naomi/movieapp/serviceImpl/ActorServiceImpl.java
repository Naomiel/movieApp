package com.naomi.movieapp.serviceImpl;

import com.naomi.movieapp.repository.ActorRepository;
import com.naomi.movieapp.service.ActorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor

public class ActorServiceImpl implements ActorService {
    private final ActorRepository actorRepository;
}
