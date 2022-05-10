package com.restaurantapp;

import com.restaurantapp.model.*;
import com.restaurantapp.service.IRestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class SpringDatajpaOnetomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetomanyApplication.class, args);
	}

	@Autowired
	IRestaurantService iRestaurantService;

	@Override
	public void run(String... args) throws Exception {
		Item item = new Item("Butter Chicken", Category.FASTFOOD, Type.VEG, 30);
		Item item1 = new Item("Chiken Panner Masala", Category.MAINCOURSE, Type.NONVEG, 20);
		Item item2 = new Item(" VEG Fried Rice", Category.FASTFOOD, Type.VEG, 100);
		Item item3 = new Item("Kothu porota", Category.MAINCOURSE, Type.NONVEG, 300);
		Item item4 = new Item("VadaPav",Category.FASTFOOD,Type.VEG,200);

		List<Item> itemList = Arrays.asList(item, item1, item2, item3,item4);
		Set<Item> items = new HashSet<>(itemList);
		Restaurant restaurant = new Restaurant("Paradhise", Type.NONVEG, "Hyderabad", Cuisine.SOUTHINDIAN, 4, items);
    	Restaurant restaurant1 = new Restaurant("Krishna Dhaba", Type.NONVEG, "Delhi", Cuisine.NORTHINDIAN, 4.8, items);
	iRestaurantService.addRestaurant(restaurant1);
//	iRestaurantService.getAll().forEach(System.out::println);
//		iRestaurantService.getByCategory(Category.FASTFOOD).forEach(System.out::println);
//	iRestaurantService.getByItemName("Dosa").forEach(System.out::println);
//	iRestaurantService.getByItemNameCategory("Pizza",Category.MAINCOURSE).forEach(System.out::println);

//	iRestaurantService.getByCuisineAndType(Cuisine.SOUTHINDIAN, Type.NONVEG).forEach(System.out::println);
//	}
	}
}