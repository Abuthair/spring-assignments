package com.restaurantapp.service;

import com.restaurantapp.model.Category;
import com.restaurantapp.model.Cuisine;
import com.restaurantapp.model.Restaurant;
import com.restaurantapp.model.Type;
import com.restaurantapp.repository.IRestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestaurantServiceImpl  implements  IRestaurantService {
    @Autowired
    IRestaurantRepository iRestaurantRepository;

    @Override
    public void addRestaurant(Restaurant restaurant) {
        iRestaurantRepository.save(restaurant);
    }

    @Override
    public void updateRestaurant(Restaurant restaurant) {
        iRestaurantRepository.save(restaurant);
    }

    @Override
    public void deleteRestaurant(int restaurantId) {
        iRestaurantRepository.deleteById(restaurantId);
    }

    @Override
    public List<Restaurant> getAll() {
        return iRestaurantRepository.findAll();
    }

    @Override
    public List<Restaurant> getByItemName(String itemName) {
        return iRestaurantRepository.getByItemName(itemName);
    }

    @Override
    public List<Restaurant> getByItemNameCategory(String itemName, Category category) {
        return iRestaurantRepository.getByItemNameCategory(itemName,category);
    }

    @Override
    public List<Restaurant> getByCategory(Category category) {
        return iRestaurantRepository.getByCategory(category);
    }

    @Override
    public List<Restaurant> getByCuisineAndType(Cuisine cuisine, Type type) {
        return iRestaurantRepository.getByCuisineAndType(cuisine,type);
    }

    @Override
    public List<Restaurant> getByItemNameLessPrice(String itemName, double price) {
        return iRestaurantRepository.getByItemNameLessPrice(itemName,price);
    }
}