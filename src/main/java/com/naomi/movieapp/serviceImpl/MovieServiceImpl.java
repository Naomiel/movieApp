package com.naomi.movieapp.serviceImpl;

import com.naomi.movieapp.repository.MovieRepository;
import com.naomi.movieapp.service.MovieService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;
}
