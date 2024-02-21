package com.sofiamc.smashack.service;

import com.sofiamc.smashack.entity.Restaurant;
import java.util.List;
import java.util.Optional;

public interface RestaurantService {

    public List<Restaurant> getRestaurants();

    public Optional<Restaurant> getRestaurant(Long id);

    public void saveOrUpdate(Restaurant restaurant);

    public void delete(Long id);
}
