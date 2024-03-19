package com.naomi.movieapp.controller;

import com.naomi.movieapp.service.DirectorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/director")
@RequiredArgsConstructor
@Slf4j
public class DirectorController {
    private final DirectorService directorService;
}
