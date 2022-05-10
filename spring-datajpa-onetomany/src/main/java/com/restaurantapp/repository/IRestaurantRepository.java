package com.restaurantapp.repository;

import com.restaurantapp.model.Category;
import com.restaurantapp.model.Cuisine;
import com.restaurantapp.model.Restaurant;
import com.restaurantapp.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRestaurantRepository extends JpaRepository<Restaurant,Integer> {

    @Query("from Restaurant r inner join r.items i where i.itemName=?1")
    List<Restaurant> getByItemName(String itemName);
    @Query("from Restaurant r inner join r.items i where i.itemName=?1 and i.category=?2")
    List<Restaurant> getByItemNameCategory(String itemName, Category category);
    @Query("from Restaurant r inner join r.items i where i.category=?1")
    List<Restaurant> getByCategory(Category category);
    @Query("from Resturant r inner join r items i where i.cuisine=?1 and i.type=?2")
    List<Restaurant> getByCuisineAndType(Cuisine cuisine, Type type);
    @Query("from Restaurant r inner join r.items i where i.itemName=?1 and i.price=?2")
    List<Restaurant> getByItemNameLessPrice(String itemName,double price);
}

