package com.sofiamc.smashack.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CONTACT_FORM")
public class ContactForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONTACTFORM_ID")
    private Long contactFormId;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "SUBJECT")
    private String subject;

    @Column(name = "MESSAGE")
    private String message;
}
