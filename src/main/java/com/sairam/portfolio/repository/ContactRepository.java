package com.sairam.portfolio.repository;

import com.sairam.portfolio.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {}
