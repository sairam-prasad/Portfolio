package com.sairam.portfolio.entity;


import jakarta.persistence.*;

@Entity
public class Experience {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String company;
    private String role;
    private String duration;
    private String description;
}
