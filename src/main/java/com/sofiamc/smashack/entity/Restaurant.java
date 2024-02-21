package com.sofiamc.smashack.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "RESTAURANT")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESTAURANT_ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "IMAGE")
    private String image;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "SCHEDULES")
    private String schedules;

    @Column(name = "PHONE")
    private Long phone;
}
