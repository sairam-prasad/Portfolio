package com.sairam.portfolio.repository;

import com.sairam.portfolio.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
