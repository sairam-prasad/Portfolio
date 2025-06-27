package com.sairam.portfolio.controller;

import com.sairam.portfolio.entity.Certification;
import com.sairam.portfolio.repository.CertificationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/certifications")
public class CertificationController {
    private final CertificationRepository certRepo;

    public CertificationController(CertificationRepository certRepo) {
        this.certRepo = certRepo;
    }

    @GetMapping
    public List<Certification> getCertifications() {
        return certRepo.findAll();
    }
}
