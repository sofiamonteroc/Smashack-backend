package com.sofiamc.smashack.service;

import com.sofiamc.smashack.entity.ContactForm;
import java.util.List;
import java.util.Optional;

public interface ContactFormService {

    public List<ContactForm> getContactForms();

    public Optional<ContactForm> getContactForm(Long id);

    public void saveOrUpdate(ContactForm contactForm);

    public void delete(Long id);
}
