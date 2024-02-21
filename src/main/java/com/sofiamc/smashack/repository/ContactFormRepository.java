package com.sofiamc.smashack.repository;

import com.sofiamc.smashack.entity.ContactForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactFormRepository extends JpaRepository <ContactForm, Long> {
}
