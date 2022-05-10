package com.restaurantapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Restaurant {
    @Id
    @GeneratedValue(generator = "res_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "res_gen",sequenceName = "res_sequence",initialValue = 1,allocationSize = 2)
    private Integer restaurantId;
    @Column(length = 20)
    private String name;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Column(length = 20)
    private  String city;

    @Enumerated(EnumType.STRING)
    private Cuisine cuisine;
    private double rating;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurant_id")
    private Set<Item> items;

    public Restaurant(String name, Type type, String city,Cuisine cuisine, double rating, Set<Item> items) {
        this.name = name;
        this.type = type;
        this.city = city;
        this.cuisine = cuisine;
        this.rating = rating;
        this.items = items;
    }
}
