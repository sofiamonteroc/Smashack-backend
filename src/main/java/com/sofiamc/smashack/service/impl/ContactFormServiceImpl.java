package com.sofiamc.smashack.service.impl;

import com.sofiamc.smashack.entity.ContactForm;
import com.sofiamc.smashack.repository.ContactFormRepository;
import com.sofiamc.smashack.service.ContactFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ContactFormServiceImpl implements ContactFormService {

    @Autowired
    ContactFormRepository contactFormRepository;

    @Override
    public List<ContactForm> getContactForms() {
        return contactFormRepository.findAll();
    }

    @Override
    public Optional<ContactForm> getContactForm(Long id) {
        return contactFormRepository.findById(id);
    }

    @Override
    public void saveOrUpdate(ContactForm contactForm) {
        contactFormRepository.save(contactForm);
    }

    @Override
    public void delete(Long id) {
        contactFormRepository.deleteById(id);
    }

}
