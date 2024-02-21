package com.sofiamc.smashack.repository;

import com.sofiamc.smashack.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository <Restaurant, Long> {
}
