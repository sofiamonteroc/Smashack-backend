package com.sofiamc.smashack.controller;

import com.sofiamc.smashack.entity.ContactForm;
import com.sofiamc.smashack.service.ContactFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/contactForm")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactFormController {

    @Autowired
    private ContactFormService contactFormService;

    @GetMapping
    public List<ContactForm> getContactForms() {
        return contactFormService.getContactForms();
    }

    @GetMapping(path = "{id}")
    public Optional<ContactForm> getContactForm(@PathVariable("id") Long id) {
        return contactFormService.getContactForm(id);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody ContactForm contactForm) {
        contactFormService.saveOrUpdate(contactForm);
    }

    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable("id") Long id) {
        contactFormService.delete(id);
    }

    @RequestMapping(method = RequestMethod.OPTIONS)
    public ResponseEntity<?> options() {
        return ResponseEntity.ok().build();
    }

}

