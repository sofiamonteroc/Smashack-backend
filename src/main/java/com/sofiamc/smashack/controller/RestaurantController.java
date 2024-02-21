package com.sofiamc.smashack.controller;

import com.sofiamc.smashack.entity.Restaurant;
import com.sofiamc.smashack.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "api/restaurant")
@CrossOrigin(origins = "http://localhost:3000")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping
    public List<Restaurant> getRestaurants() {
        return restaurantService.getRestaurants();
    }

    @GetMapping(path = "{id}")
    public Optional<Restaurant> getRestaurant(@PathVariable("id") Long id) {
        return restaurantService.getRestaurant(id);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Restaurant restaurant) {
        restaurantService.saveOrUpdate(restaurant);
    }

    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable("id") Long id) {
        restaurantService.delete(id);
    }

    @RequestMapping(method = RequestMethod.OPTIONS)
    public ResponseEntity<?> options() {
        return ResponseEntity.ok().build();
    }


}
