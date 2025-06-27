package com.sairam.portfolio.repository;

import com.sairam.portfolio.entity.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {}
