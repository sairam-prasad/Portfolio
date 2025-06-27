package com.sairam.portfolio.controller;

import org.springframework.web.bind.annotation.RestController; // Importing RestController to handle HTTP requests
import org.springframework.web.bind.annotation.GetMapping; // Importing GetMapping to handle GET requests
import org.springframework.web.bind.annotation.RequestBody; // Importing RequestBody to map request body to
import org.springframework.web.bind.annotation.RequestMapping; // Importing RequestMapping to define the base URL for the controller

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; // Importing Autowired to inject dependencies
import org.springframework.web.bind.annotation.CrossOrigin; // Importing CrossOrigin to handle CORS (Cross-Origin Resource Sharing)
import org.springframework.web.bind.annotation.GetMapping; // Importing GetMapping to handle GET requests
import com.sairam.portfolio.repository.AboutRepository; // Importing AboutRepository to interact with the database
import com.sairam.portfolio.entity.About; // Importing About entity to represent the data model

@RestController // Indicates that this class is a REST controller
@CrossOrigin(origins = "http://localhost:3000") // Allows cross-origin requests from the specified origin
@RequestMapping("/api/about")   // Base URL for this controller
public class AboutController {     

    @Autowired // Automatically injects the AboutRepository bean
    private AboutRepository aboutRepository; // Repository to handle database operations for About entity

    @GetMapping // Maps GET requests to this method
    public About getAbout() {
        List<About> list = aboutRepository.findAll(); // findALl() retrieves all About records from the database
        return list.isEmpty() ? null : list.get(0); // handle empty case
    }
}
