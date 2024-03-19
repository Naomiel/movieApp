package com.naomi.movieapp.serviceImpl;

import com.naomi.movieapp.repository.DirectorRepository;
import com.naomi.movieapp.service.DirectorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class DirectorServiceImpl implements DirectorService {
    private final DirectorRepository directorRepository;
}
