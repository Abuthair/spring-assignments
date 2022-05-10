package com.restaurantapp.service;

import com.restaurantapp.model.Category;
import com.restaurantapp.model.Cuisine;
import com.restaurantapp.model.Restaurant;
import com.restaurantapp.model.Type;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IRestaurantService {
    public void addRestaurant(Restaurant restaurant);
    public void updateRestaurant(Restaurant restaurant);
    public  void deleteRestaurant(int restaurantId);
    public List<Restaurant> getAll();

    List<Restaurant> getByItemName(String itemName);
    List<Restaurant> getByItemNameCategory(String itemName,Category category);
    List<Restaurant> getByCategory(Category category);
    List<Restaurant> getByCuisineAndType(Cuisine cuisine, Type type);
    List<Restaurant> getByItemNameLessPrice(String itemName,double price);


}
