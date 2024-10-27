package com.bits.service;

import com.bits.entity.MenuItem;
import com.bits.entity.Restaurant;
import com.bits.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public Restaurant getRestaurantById(Long id) {
        return restaurantRepository.findById(id).orElse(null);
    }

    public Restaurant saveRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }

    public Restaurant updateRestaurant(Long id, Restaurant restaurant) {
        Restaurant restaurantPresent = getRestaurantById(id);
        if (null != restaurantPresent) {
            saveRestaurant(restaurant);
        }
        return restaurant;
    }
    public List<MenuItem> getMenuItems (Long restrauntId){
        Restaurant restaurant= getRestaurantById(restrauntId);
        return restaurant.getMenuItems();
    }
}
