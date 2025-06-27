package com.sairam.portfolio.controller;

import com.sairam.portfolio.entity.Contact;
import com.sairam.portfolio.repository.ContactRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactController {

    private final ContactRepository contactRepository;

    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @PostMapping
    public Contact saveContact(@RequestBody Contact contact) {
        return contactRepository.save(contact);
    }
}
