package com.sairam.portfolio.controller;

import com.sairam.portfolio.entity.Experience;
import com.sairam.portfolio.repository.ExperienceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experience")
public class ExperienceController {
    private final ExperienceRepository experienceRepo;

    public ExperienceController(ExperienceRepository experienceRepo) {
        this.experienceRepo = experienceRepo;
    }

    @GetMapping
    public List<Experience> getAllExperience() {
        return experienceRepo.findAll();
    }
}
