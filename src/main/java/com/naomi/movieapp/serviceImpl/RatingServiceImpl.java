package com.naomi.movieapp.serviceImpl;

import com.naomi.movieapp.repository.RatingRepository;
import com.naomi.movieapp.service.RatingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class RatingServiceImpl implements RatingService {
    private final RatingRepository ratingRepository;
}
