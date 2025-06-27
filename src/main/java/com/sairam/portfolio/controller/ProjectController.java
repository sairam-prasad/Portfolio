package com.sairam.portfolio.controller;

import com.sairam.portfolio.entity.Project;
import com.sairam.portfolio.repository.ProjectRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;


import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // CORS
public class ProjectController {

    private final ProjectRepository repo;

    public ProjectController(ProjectRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/projects")
    public List<Project> getProjects() {
        return repo.findAll();
    }
    
    @DeleteMapping("/projects/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable Long id) {
        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repo.deleteById(id);
    return ResponseEntity.ok().build();
    }
}



