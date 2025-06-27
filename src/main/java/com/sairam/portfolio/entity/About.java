package com.sairam.portfolio.entity;

import jakarta.persistence.*; // Importing JPA annotations for entity mapping
import lombok.Data; // Importing Lombok annotations for boilerplate code generation

@Data // Lombok will generate getters, setters, toString, equals, and hashCode methods
@Entity // Entity annotation indicates that this class is a JPA entity
@Table(name = "about") // Optional: specify the table name if it differs from the class name
public class About {
    @Id // Primary key for the entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate the ID value
    private Long id;

    private String name;
    private String role;
    private String description;
    private String location;
    @Column(name = "profile_pic_url")
    private String profilePicUrl;
}
